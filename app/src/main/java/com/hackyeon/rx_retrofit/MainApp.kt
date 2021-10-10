package com.hackyeon.rx_retrofit

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class MainApp: Application() {
    override fun onCreate() {
        super.onCreate()

        realmInit()
    }

    private fun realmInit(){
        Realm.init(this)
        val config = RealmConfiguration.Builder()
            .name("main.realm")
            .schemaVersion(0)
            .build()

        Realm.setDefaultConfiguration(config)

    }
}