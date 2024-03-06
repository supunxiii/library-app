package com.example.library;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerview;
    ArrayList<Book> bookList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookList=Book.getBooks("books.json",this);
        mRecyclerview=findViewById(R.id.recyclerView);
        BookAdapter adapter=new BookAdapter(bookList);
        mRecyclerview.setAdapter(adapter);
        //mRecyclerview.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        mRecyclerview.setLayoutManager(new LinearLayoutManager(this));


    }
}
