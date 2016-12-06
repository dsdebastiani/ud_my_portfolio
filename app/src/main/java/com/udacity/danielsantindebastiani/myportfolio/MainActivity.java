package com.udacity.danielsantindebastiani.myportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by daniel on 06/12/16.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnPopularMovies = (Button) findViewById(R.id.btn_popular_movies);
        btnPopularMovies.setOnClickListener(new OnClickButtonToast(this, getString(R.string.btn_popular_movies)));

        Button btnStockHawk = (Button) findViewById(R.id.btn_stock_hawk);
        btnStockHawk.setOnClickListener(new OnClickButtonToast(this, getString(R.string.btn_stock_hawk)));

        Button btnBuildItBigger = (Button) findViewById(R.id.btn_build_it_bigger);
        btnBuildItBigger.setOnClickListener(new OnClickButtonToast(this, getString(R.string.btn_build_it_bigger)));

        Button btnMakeAppMaterial = (Button) findViewById(R.id.btn_make_app_material);
        btnMakeAppMaterial.setOnClickListener(new OnClickButtonToast(this, getString(R.string.btn_make_app_material)));

        Button btnGoUbiquitous = (Button) findViewById(R.id.btn_go_ubiquitous);
        btnGoUbiquitous.setOnClickListener(new OnClickButtonToast(this, getString(R.string.btn_go_ubiquitous)));

        Button btnCapstone = (Button) findViewById(R.id.btn_capstone);
        btnCapstone.setOnClickListener(new OnClickButtonToast(this, getString(R.string.btn_capstone)));
    }

}
