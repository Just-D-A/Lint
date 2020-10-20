package com.example.lint.checks

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API
import com.android.tools.lint.detector.api.Issue
import com.example.lint.checks.abbreviation.AbbreviationDetector
import com.example.lint.checks.context_argument.PossitionArgumentDetector
import com.example.lint.checks.name_file.NameFileDetector
import com.example.lint.checks.sample.SampleCodeDetector

class LintIssueRegistry : IssueRegistry() {

    var listOfIssues = mutableListOf<Issue>()

    init {
        listOfIssues.add(SampleCodeDetector.ISSUE)
        listOfIssues.add(NameFileDetector.ISSUE)
        listOfIssues.add(AbbreviationDetector.ISSUE)
        listOfIssues.add(PossitionArgumentDetector.ISSUE)
    }

    override val issues = listOfIssues

    override val api: Int
        get() = CURRENT_API
}