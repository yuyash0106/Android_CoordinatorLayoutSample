package com.websarva.wigs.android.coordinatorlayoutsample;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbarを取得。
        Toolbar toolbar = findViewById(R.id.toolbar);
        //ツールバーにロゴを設定。
        toolbar.setLogo(R.mipmap.ic_launcher);
        //アクションバーにツールバーを設定。
        setActionBar(toolbar);
        //CollapsingToolBarLayoutを取得。
        CollapsingToolbarLayout toolbarLayout = findViewById(R.id.toolbarLayout);
        //タイトルを設定。
        toolbarLayout.setTitle(getString(R.string.toolbar_title));
        //通常サイズ時の文字色を設定。
        toolbarLayout.setExpandedTitleColor(Color.WHITE);
        //縮小時の文字色を設定。
        toolbarLayout.setCollapsedTitleTextColor(Color.LTGRAY);
    }
}