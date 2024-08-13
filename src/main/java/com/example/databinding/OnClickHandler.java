package com.example.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class OnClickHandler {
    Context context;

    public OnClickHandler(Context context) {
        this.context = context;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void ToastMaker(View view){
        Toast.makeText(context, "Button Clicker", Toast.LENGTH_SHORT).show();
    }
}
