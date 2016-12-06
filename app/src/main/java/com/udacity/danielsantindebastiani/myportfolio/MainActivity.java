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

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickButtonToast(getString(R.string.btn_popular_movies)));

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickButtonToast(getString(R.string.btn_stock_hawk)));

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickButtonToast(getString(R.string.btn_build_it_bigger)));

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new OnClickButtonToast(getString(R.string.btn_make_app_material)));

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new OnClickButtonToast(getString(R.string.btn_go_ubiquitous)));

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new OnClickButtonToast(getString(R.string.btn_capstone)));
    }

    /**
     * Custom onClickListener for my buttons.
     */
    public static class OnClickButtonToast implements View.OnClickListener {

        private String app;

        OnClickButtonToast(String app) {
            this.app = app;
        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), view.getContext().getString(R.string.toast_message, app),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
