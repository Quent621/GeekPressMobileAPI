package com.example.geekpressmobileapi;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.wearable.activity.WearableActivity;
import android.text.Html;

import android.widget.TextView;



public class MainActivity extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titre = (TextView) findViewById(R.id.title);
        TextView auteur = (TextView) findViewById(R.id.author);
        TextView article = (TextView) findViewById(R.id.article);

        DAOArticle daoArticle = new DAOArticle();
        DAOArticle.ObjectTest art = daoArticle.getListArticle().get(1);
        titre.setText(Html.fromHtml(art.getTitre()));
        auteur.setText(Html.fromHtml(art.getAuteur()));
        article.setText(art.getArticle());
        //Enables Always-on
        setAmbientEnabled();
    }



}

