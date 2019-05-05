package com.example.sameerbudhwani.contacts2018;

import android.app.Application;
import android.provider.ContactsContract;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;

import java.util.List;

public class ApplicationClass extends Application {

    public static final String APPLICATION_ID = "58FDCABE-6B16-FDCF-FF89-5FE375622200";
    public static final String API_KEY = "D0ACD2B2-7AD6-68EC-FFB3-AD648F60E700";
    public static final String SERVER_URL = "https://api.backendless.com";

    public static BackendlessUser user;
    public static List<Contact> contacts;

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(), APPLICATION_ID, API_KEY );
    }
}
