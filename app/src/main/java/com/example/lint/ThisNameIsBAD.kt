package com.example.lint

import android.annotation.SuppressLint
import android.content.Context
import javax.security.auth.callback.Callback

@SuppressLint("MaxLineLength")
class ThisNameIsBAD(context: Context, some: Int) {
    fun so(callback: Callback, a: Int) {
        callback
    }

    fun sss(a: Int, b: Int, c: Int, d: Int, f: Int, k: Int) {}

    val str =
        "some_words_some_words_some_words_some_words_some_words_some_words_some_words_some_words_some_words_" +
                "some_words_some_words_some_words_some_words_some_words_some_words_some_words_some_words_some_words_"

}