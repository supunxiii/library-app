package com.example.library;

import static java.nio.charset.StandardCharsets.UTF_8;

import android.content.Context;

import androidx.annotation.NonNull;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class Book {
    String author;
    String title;
    String ISBN;
    String synopsis;
    String cover;

    public Book(String author, String title, String ISBN, String synopsis, String cover) {
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
        this.synopsis = synopsis;
        this.cover = cover;
    }
     @NonNull
     static ArrayList<Book> getBooks(String filename, Context context){
        ArrayList<Book> booklist = new ArrayList<>();
        try {
            InputStream inputstream = context.getAssets().open(filename);
            byte[] buffer=new byte[inputstream.available()];
            inputstream.read(buffer);
            inputstream.close();

            //JSONObject json=new JSONObject(new String(buffer), StandardCharsets.UTF_8));
            JSONObject json=new JSONObject(new String(buffer,UTF_8));
            JSONArray books=json.getJSONArray("books");

            for(int i=0;i<books.length();i++){
                booklist.add(new Book(books.getJSONObject(i).getString("Author"),
                        books.getJSONObject(i).getString("Title"),
                        books.getJSONObject(i).getString("ISBN"),
                        books.getJSONObject(i).getString("Synopsis"),
                        books.getJSONObject(i).getString("Cover")
                ));
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
         return booklist;
     }
}


