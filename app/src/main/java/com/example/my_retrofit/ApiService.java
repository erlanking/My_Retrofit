package com.example.my_retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("books")  // Замените на правильный endpoint для получения списка книг
    Call<List<Book>> getBooks();
}
