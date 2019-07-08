package com.example.activities;

import android.app.Application;

import com.orm.SchemaGenerator;
import com.orm.SugarContext;
import com.orm.SugarDb;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

//        Utils.handleSSLHandshake();

        SugarContext.init(this);

        // create table if not exists
        SchemaGenerator schemaGenerator = SchemaGenerator.getInstance();
        schemaGenerator.createDatabase(SugarDb.getInstance().getDB());
    }
}
