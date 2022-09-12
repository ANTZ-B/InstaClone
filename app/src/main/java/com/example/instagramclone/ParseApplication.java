package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3xuj5nmsAIMcSTqQtqYBou9szMznRxgJwCrheTby")
                .clientKey("EQtvHWKyWk8TTb1N10YFMrAFABXpJfD949jEzTJB")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
