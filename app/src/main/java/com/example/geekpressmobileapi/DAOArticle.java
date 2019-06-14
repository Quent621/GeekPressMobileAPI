package com.example.geekpressmobileapi;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.text.Html;
import android.widget.TextView;

public class DAOArticle extends MainActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView titreTextView = (TextView) findViewById(R.id.title);
        TextView contenuTextView = (TextView) findViewById(R.id.article);
        TextView auteurTextView = (TextView) findViewById(R.id.author);

        DAOArticle daoArticle = new DAOArticle();
        Article art = daoArticle.getListArticle().get(0);
        titreTextView.setText(Html.fromHtml(art.getTitre()));
        contenuTextView.setText(Html.fromHtml(art.getContenu()));
        auteurTextView.setText(art.getAuteur());
        // Enables Always-on
        setAmbientEnabled();
    }


}