package com.dai.android.game.opengles.verysimple;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class VerySimpleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SimpleRenderer renderer = new SimpleRenderer();
        GLSurfaceView glSurfaceView = new GLSurfaceView(this);
        glSurfaceView.setRenderer(renderer);

        setContentView(glSurfaceView);
    }
}
