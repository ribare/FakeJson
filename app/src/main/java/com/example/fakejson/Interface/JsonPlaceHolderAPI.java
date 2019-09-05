package com.example.fakejson.Interface;

import com.example.fakejson.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {

    @GET("posts")
    Call<List<Posts>> getPosts();
}
