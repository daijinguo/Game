package pro.android.game.chap4;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.dai.android.game.R;

public class AsteroidsActivity extends Activity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.pro_android_game_chap4_activity_asteroids);

        LayoutInflater factory = LayoutInflater.from(this);
        view = factory.inflate(R.layout.pro_android_game_chap4_activity_asteroids, null);
        setContentView(view);

        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
    }

    @Override
    protected void onStop() {
        super.onStop();
        ((ArcadeGame) view).halt();
    }

    @Override
    protected void onPause() {
        super.onPause();
        onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        ((ArcadeGame) view).resume();
    }
}
