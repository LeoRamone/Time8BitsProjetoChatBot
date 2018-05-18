package com.leonardo_soares_santos.time8bitsprojetochatbot.DAO;

import com.google.firebase.database.FirebaseDatabase;

public class FireBaseApp extends android.app.Application {


    //PEGANDO INSTANCIA DO BD

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
