package com.androidgrouplearning.mypetsapp.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Benard Musau on 18-10-2021.
 */

// This class servers as the retrofit instance class used to send requests to the api

public class ApiClient {

    private static final String BASE_URL = "https://benitohintech.000webhostapp.com/android-group-learning/api/v1/pets/";
    private static Retrofit retrofit;

    public static Retrofit getApiClient(){

        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }

}
