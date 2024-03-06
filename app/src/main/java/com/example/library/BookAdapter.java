package com.example.library;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {
    ArrayList<Book> book;

    public BookAdapter(ArrayList<Book> book) {
        this.book = book;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.book_layout,parent,false));
    }


    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book theBook=book.get(position);
        holder.txtAuthour.setText(book.get(position).author);
        holder.txtTitle.setText(book.get(position).title);
        holder.txtSynopsis.setText(book.get(position).synopsis);
        holder.txtISBN.setText(book.get(position).ISBN);


        Resources res=holder.itemView.getContext().getResources();
        int id=res.getIdentifier("@drawable/"+theBook.cover,"drawable", "com.example.library");
        holder.imgcover.setImageResource(id);


    }


    @Override
    public int getItemCount() {
        return book.size();
    }


    public class BookViewHolder extends RecyclerView.ViewHolder {

        TextView txtAuthour, txtISBN,txtSynopsis, txtTitle;
        ImageView imgcover;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            txtAuthour=itemView.findViewById(R.id.txtAuthor);
            txtISBN=itemView.findViewById(R.id.txtISBN);
            txtSynopsis=itemView.findViewById(R.id.txtSynopsis);
            txtTitle=itemView.findViewById(R.id.txtTitle);
            imgcover=itemView.findViewById(R.id.imgCover);

        }
    }
}