package com.compilers.udemylearning.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.udemylearning.UdemyLearningDatabase

actual class DatabaseDriverFactory {

actual fun createDriver(): SqlDriver = NativeSqliteDriver(
    schema =  UdemyLearningDatabase.Schema,
    name = "UdemyLearningDatabase.db"
)


}

