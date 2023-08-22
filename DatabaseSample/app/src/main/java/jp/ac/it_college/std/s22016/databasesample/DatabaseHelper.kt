package jp.ac.it_college.std.s22016.databasesample

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context): SQLiteOpenHelper(
    context, DATABASE_NAME, null, DATABASE_VERSION
){
    companion object {
        private const val DATABASE_NAME = "cocktail_memo.db"
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val sql = """|
            |CREATE TABLE cocktail_memos (
            |   _id INTEGER PRIMRY KEY,
            |   name TEXT,
            |   note YEXT
            |);
        """.trimMargin()
        db?.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }
}