package com.compilers.udemylearning.db

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.udemylearning.UdemyLearningDatabase

actual class DatabaseDriverFactory(private val context: Context)  {

    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(
           schema =  UdemyLearningDatabase.Schema,
           context = context,
            name = "UdemyLearning.Database.db")

    }

}

