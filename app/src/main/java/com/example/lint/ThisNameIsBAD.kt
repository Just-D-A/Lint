package com.example.lint

import android.content.Context
import javax.security.auth.callback.Callback

class ThisNameIsBAD(ctx: Context, some: Int) {
    fun so(callback: Callback, a: Int) {
        callback
    }
}