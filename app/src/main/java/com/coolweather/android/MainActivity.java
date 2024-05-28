package com.coolweather.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.coolweather.android.db.Book;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Book book=new Book();
        book.setId(1);
        book.setName("ArtKs开发");
        book.save();
    }
}