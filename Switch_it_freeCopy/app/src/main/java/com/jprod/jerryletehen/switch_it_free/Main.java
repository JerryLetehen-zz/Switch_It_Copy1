package com.jprod.jerryletehen.switch_it_free;


import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    TextView main_text;

    String play_text;

    Button play_button;

    int dflt_clr;
    int color_of_touch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        dflt_clr = getResources().getColor(R.color.play_button);
        color_of_touch = getResources().getColor(R.color.touch_color);

        main_text = (TextView) findViewById(R.id.main_text);
        Typeface main_typeface = Typeface.createFromAsset(getAssets(), "fonts/10160.otf");
        main_text.setTypeface(main_typeface);

        play_text = getResources().getString(R.string.play_button);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/9752.otf");

        play_button = (Button) findViewById(R.id.play_button);
        play_button.setText(play_text);
        play_button.setTypeface(typeface);

        play_button.setOnClickListener(this);
        play_button.setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.play_button:
                GoToFrontActivity();
                break;
        }
    }

    private void GoToFrontActivity() {
        Intent intent = new Intent(getApplicationContext(), FrontActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                v.setBackgroundColor(color_of_touch);
                break;
            case MotionEvent.ACTION_UP:
                v.setBackgroundColor(dflt_clr);
                break;
        }
        return false;
    }
}
