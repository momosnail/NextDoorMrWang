package com.base.nextdoormrwang.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.base.nextdoormrwang.R;

/**
 * Created by wgl on 2018/4/9.
 */

public class ThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_thread);
        RecyclerView recycle = findViewById (R.id.recycle);
    }
}
