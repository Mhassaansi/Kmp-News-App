package com.compilers.udemylearning


import kotlin.math.round


actual  class Platform(){
    actual val osName: String
        get() = "Android"
    actual val osVersion: String
        get() = ""
    actual val deviceModel: String
        get() = ""
    actual val density: Int
        get() = 0

    actual fun logSystemInfo() {
        ""
       // Log.d("Udemy_Learning", "($osName, $osVersion, $deviceModel, $density)" )
    }
}