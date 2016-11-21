package com.dai.android.game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dai.android.game.opengles.verysimple.VerySimpleActivity;
import com.dai.android.game.other.SimpleJniActivity;

import pro.android.game.chap4.AsteroidsActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.GoToFirstJni).setOnClickListener(this);
        findViewById(R.id.GoToOpenglesVerySimple).setOnClickListener(this);
        findViewById(R.id.GoToProAndroidGameChap4_Asteroid).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.GoToFirstJni: {
                startActivity(new Intent(MainActivity.this, SimpleJniActivity.class));
                break;
            }

            case R.id.GoToOpenglesVerySimple: {
                startActivity(new Intent(MainActivity.this, VerySimpleActivity.class));
                break;
            }

            case R.id.GoToProAndroidGameChap4_Asteroid: {
                startActivity(new Intent(MainActivity.this, AsteroidsActivity.class));
                break;
            }
        }
    }
}
