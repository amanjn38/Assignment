package com.example.lifeofgirl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CommentsActivity extends AppCompatActivity {

    String uid, id, type, name;
    int postType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);
    }
}