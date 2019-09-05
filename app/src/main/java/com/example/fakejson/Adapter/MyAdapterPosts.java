package com.example.fakejson.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fakejson.Model.PostsData;
import com.example.fakejson.R;
import java.util.ArrayList;

public class MyAdapterPosts extends RecyclerView.Adapter<MyAdapterPosts.MyViewHolder> {

    private ArrayList<PostsData> myPostsList;

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public TextView txtId;
        public TextView txtTitle;
        public TextView txtBody;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.imageView);
            txtId = itemView.findViewById(R.id.txt_id);
            txtTitle = itemView.findViewById(R.id.txt_title);
            txtBody = itemView.findViewById(R.id.txt_body);
        }
    }

    public MyAdapterPosts(ArrayList<PostsData> postsList){
        myPostsList = postsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.posts_view, viewGroup, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        PostsData posts = myPostsList.get(i);

        myViewHolder.mImageView.setImageResource(posts.getmImageResourse());
        myViewHolder.txtId.setText(posts.getmText1());
        myViewHolder.txtTitle.setText(posts.getmText2());
        myViewHolder.txtBody.setText(posts.getmText3());
    }

    @Override
    public int getItemCount() {
        return myPostsList.size();
    }
}
