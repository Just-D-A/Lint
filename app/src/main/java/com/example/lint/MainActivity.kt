package com.example.lint

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Exception
class MainActivity : AppCompatActivity() {
    val s: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val l = "lintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlintlint"

        val context: Context = this


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
