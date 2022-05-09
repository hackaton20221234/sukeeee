package com.example.myapplication.utils

import android.content.Context
import androidx.room.*
import com.example.myapplication.localdb.models.KeyValuePair
import com.example.myapplication.localdb.repositories.KeyValuePairsRepository

@Database(entities = [KeyValuePair::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract val keyValuePairsRepository: KeyValuePairsRepository

    companion object {

        @Volatile
        private var _instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            synchronized(this) {
                var instance = _instance

                if (instance == null) {

                    instance = Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "app_database"
                    ).fallbackToDestructiveMigration().build()

                    _instance = instance
                }

                return instance
            }
        }
    }

}