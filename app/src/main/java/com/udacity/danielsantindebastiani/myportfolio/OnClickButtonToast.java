package com.udacity.danielsantindebastiani.myportfolio;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Custom onClickListener for my buttons.
 */
public class OnClickButtonToast implements View.OnClickListener {

    private Context context;
    private String app;

    OnClickButtonToast(Context context, String app) {
        this.context = context;
        this.app = app;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, context.getString(R.string.toast_message, app), Toast.LENGTH_SHORT).show();
    }
}
