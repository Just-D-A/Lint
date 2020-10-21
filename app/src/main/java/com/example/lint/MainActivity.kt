package com.example.lint

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lint.very_big_very_very_very_very_very_very_very_very_very_very_very_very_veryvery_very_very_very_very_very_very_very_very_very_very_very_veryvery_very_very_very_very_very_very_very_very_very_very_very_very.BAdclass
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    val s: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val l = "lintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlin" +
                "lintlintlintlintlintlintlintlintlintlintlssntlintlintlintlintlintlinssintlintllintlintlintlintlintintlintlintlint"

        val context: Context = this

        BAdclass()

        val ctx = s

        val list = mutableListOf<Int>()
        list.add(1)
        list.add(1)
        list.add(1)
        list.add(1)
        list.add(1)

        val al = "lint"

        try {
            val s = 2
        } catch (e: Exception) {
            val sa = 2
        }
    }

    private fun sss(a: Int, b: Int, c: Int, d: Int, f: Int, k: Int) {}
}
