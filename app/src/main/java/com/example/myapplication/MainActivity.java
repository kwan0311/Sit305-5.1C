package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<NewsModel> newsModels = new ArrayList<>();
    int[] Topimages = {R.drawable.ff, R.drawable.mm, R.drawable.jeeny,
            R.drawable.fire, R.drawable.country_detail_pokemon};
    ConstraintLayout content;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton9news = findViewById(R.id.News_9news);
        ImageButton imageButton7news = findViewById(R.id.News_7news);
        ImageButton imageButtonABCnews = findViewById(R.id.News_ABCnews);
        ImageButton imageButtonTHEAGEnews = findViewById(R.id.News_THEAGE);
        content = findViewById(R.id.Total);







        RecyclerView recyclerView = findViewById(R.id.TopStoriesRecycler);
        setnewstopmodels();
        TopNewsAdapter adapter = new TopNewsAdapter(this, newsModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));


        imageButton9news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new nineNewsFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentFrameLayout, fragment).commit();
                content.setVisibility(view.INVISIBLE);
            }
        });

        imageButtonABCnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new abcnewsFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentFrameLayout, fragment).commit();
                content.setVisibility(view.INVISIBLE);
            }
        });

        imageButtonTHEAGEnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new theageFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentFrameLayout, fragment).commit();
                content.setVisibility(view.INVISIBLE);
            }
        });

        imageButton7news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = new sevennewsFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentFrameLayout, fragment).commit();
                content.setVisibility(view.INVISIBLE);
            }
        });



    }

        private void setnewstopmodels(){

            for(int i =0; i <Topimages.length; i++)
            {
                newsModels.add(new NewsModel( Topimages[i]));
            }
        }






}