package tn.esprit.nascar.utils

import androidx.room.Room
import androidx.room.RoomDatabase

//TODO 10 Change this class to an abstract class that inherit from ROOMDatabase
@Database(entities = [Events::class], version =1 )
abstract class AppDatabase:RoomDatabase{

    abstract fun eventDao(): EventDao


    companion object{
        //TODO 11 Apply the Design Pattern singleton
    priavte lateint var instance : appDatabase
    fun getInstance(contexte: context): AppDataBase{
        if(instance == null)
            instance = Room
                .databaseBuilder(context, AppDatabase:: class , "nascarDB")
                .build
        return instance
    }

    }
}