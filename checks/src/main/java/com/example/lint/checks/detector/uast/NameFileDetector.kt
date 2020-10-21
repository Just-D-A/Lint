package com.example.lint.checks.detector.uast

import com.android.tools.lint.client.api.UElementHandler
import com.android.tools.lint.detector.api.*
import org.jetbrains.uast.UClass
import org.jetbrains.uast.UElement

@Suppress("UnstableApiUsage")
class NameFileDetector : Detector(), Detector.UastScanner {
    companion object {
        /** Issue describing the problem and pointing to the detector implementation */
        @JvmField
        val ISSUE: Issue = Issue.create(
            // ID: used in @SuppressLint warnings etc
            id = "FileName",
            // Title -- shown in the IDE's preference dialog, as category headers in the
            // Analysis results window, etc
            briefDescription = "The file name does not match the coding convention",
            // Full explanation of the issue; you can use some markdown markup such as
            // `monospace`, *italic*, and **bold**.
            explanation = """
                  Class names are recorded in UpperCamelCase.
                    """,
            category = Category.CORRECTNESS,
            priority = 6,
            severity = Severity.INFORMATIONAL,
            implementation = Implementation(
                NameFileDetector::class.java,
                Scope.JAVA_FILE_SCOPE
            )
        )
    }

    override fun getApplicableUastTypes(): List<Class<out UElement?>>? {
        return listOf(UClass::class.java)
    }

    override fun createUastHandler(context: JavaContext): UElementHandler? {
        // Note: Visiting UAST nodes is a pretty general purpose mechanism;
        // Lint has specialized support to do common things like "visit every class
        // that extends a given super class or implements a given interface", and
        // "visit every call site that calls a method by a given name" etc.
        // Take a careful look at UastScanner and the various existing lint check
        // implementations before doing things the "hard way".
        // Also be aware of context.getJavaEvaluator() which provides a lot of
        // utility functionality.
        return object : UElementHandler() {
            override fun visitClass(node: UClass) {
                val string = node.name ?: return
                val l = node.parent
                if (string.contains(Regex("[A-Z][A-Z]")))
                    context.report(
                        ISSUE, node, context.getNameLocation(node),
                        "Rename this file. File name should match UpperCamelCase.",
                        createFix(string)
                    )

               /* val some = node.uastSuperTypes ?: return

                val part = some[0].type.presentableText
                if (string.matches(Regex(".*${part}"))) { // this if doesn't work
                    context.report(
                        ISSUE, node, context.getNameLocation(node),
                        some[0].type.presentableText,
                        createFix(string)
                    )
                }*/

            }

            private fun createFix(string: String): LintFix? {
                return fix().replace().text(string).build()
            }
        }
    }
}


/*
for interfaces
context.report(
ISSUE, node, context.getNameLocation(node),
some[0].type.presentableText,
createFix(string)
)
*/

