package com.dai.android.game.other;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SimpleJniActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView helloText = new TextView(this);
        helloText.setAllCaps(false);
        helloText.setText(stringFromJNI());


        setContentView(helloText);
    }


    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}
