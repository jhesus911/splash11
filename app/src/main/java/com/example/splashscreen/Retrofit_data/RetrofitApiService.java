package com.example.splashscreen.Retrofit_data;

import android.content.ClipData;

import com.google.android.gms.common.api.Batch;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitApiService {

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @GET("10.0.2.2/v1/Personas")
    Call<Batch> getBatch(@Path("id") int batch_id);



    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @POST("batch/{id}/add-item")
    Call<Batch> addItem(@Path("id") int batch_id, @Body ClipData.Item item);

    Retrofit Builder();
}
