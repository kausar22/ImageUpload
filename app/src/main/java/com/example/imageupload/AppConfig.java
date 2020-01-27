package com.example.imageupload;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class AppConfig {


    // url er nam er shesh e / takbe retrofit er belai
    private static String BASE_URL = "https://nkrit.com/";

    static Retrofit getRetrofit() {

        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}