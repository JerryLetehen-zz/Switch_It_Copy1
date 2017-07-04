package com.jprod.jerryletehen.switch_it_free;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Easy_03 extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, View.OnTouchListener  {

    boolean if_after_sw1 = false;
    boolean if_after_sw2 = false;
    boolean if_after_sw3 = false;
    boolean if_after_sw4 = false;
    Button next_button;

    TextView switch_it;
    TextView text_of_level;

    String next_button_text;

    String switch_it_text;
    String level_text;

    String switch_on;
    String switch_off;

    Switch switch1;
    Switch switch2;
    Switch switch3;
    Switch switch4;

    String back_button_text;

    Button back_button;

    int disabled;
    int active;
    int color_of_touch;
    int default_color;
    int dflt_clr;


    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    final String IF_EASY_LEVEL_03_SOLVED = "if_easy_level_03_solved";

//    boolean if_03;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_03);

        String DEFAULT_SP_KEY = "Save_of_solved_levels";
        sharedPreferences = getSharedPreferences(DEFAULT_SP_KEY, Context.MODE_PRIVATE);
        editor = getSharedPreferences(DEFAULT_SP_KEY, Context.MODE_PRIVATE).edit();

        disabled = getResources().getColor(R.color.disabled);
        active = getResources().getColor(R.color.play_button);


        Typeface main_typeface = Typeface.createFromAsset(getAssets(), "fonts/10160.otf");
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/9752.otf");

        back_button_text = getResources().getString(R.string.back_button);
        back_button = (Button) findViewById(R.id.back_button);
        back_button.setText(back_button_text);
        back_button.setTypeface(typeface);
        back_button.setOnClickListener(this);
        back_button.setOnTouchListener(this);




        next_button_text = getResources().getString(R.string.next_button);
        switch_it_text = getResources().getString(R.string.switch_it);
        switch_on = getResources().getString(R.string.on);
        switch_off = getResources().getString(R.string.off);
        level_text = getResources().getString(R.string.text_of_level_03);

        switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setTextOn(switch_on);
        switch1.setTextOff(switch_off);
        switch1.toggle();
        switch1.setOnCheckedChangeListener(this);

        switch2 = (Switch) findViewById(R.id.switch2);
        switch2.setTextOn(switch_on);
        switch2.setTextOff(switch_off);
        switch2.setOnCheckedChangeListener(this);
        switch2.setOnTouchListener(this);

        switch3 = (Switch) findViewById(R.id.switch3);
        switch3.setTextOn(switch_on);
        switch3.setTextOff(switch_off);
        switch3.toggle();
        switch3.setOnCheckedChangeListener(this);
        switch3.setOnTouchListener(this);

        switch4 = (Switch) findViewById(R.id.switch4);
        switch4.setTextOn(switch_on);
        switch4.setTextOff(switch_off);
        switch4.toggle();
        switch4.setOnCheckedChangeListener(this);

        switch_it = (TextView) findViewById(R.id.switch_it);
        switch_it.setText(switch_it_text);
        switch_it.setTypeface(main_typeface);

        text_of_level = (TextView)findViewById(R.id.level_03);
        text_of_level.setText(level_text);
        text_of_level.setTypeface(main_typeface);

        next_button = (Button) findViewById(R.id.next_button);
        next_button.setText(next_button_text);
        next_button.setTypeface(typeface);
        next_button.setOnClickListener(this);
        next_button.setOnTouchListener(this);
        next_button.setBackgroundColor(disabled);

        color_of_touch = getResources().getColor(R.color.touch_color);
        default_color = switch1.getDrawingCacheBackgroundColor();

        dflt_clr = getResources().getColor(R.color.play_button);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next_button:
                check_it();
                break;
            case R.id.back_button:
                BackToPreviousActivity();
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.switch1:
                if (if_after_sw2) {
                    if_after_sw2 = true;
                } else if (if_after_sw3) {
                    if_after_sw3 = true;
                }
                check_it_all();
                break;
            case R.id.switch2:
                    if_after_sw2 = true;
                    switch1.toggle();
                    switch3.toggle();
                check_it_all();
                break;
            case R.id.switch3:
                if (if_after_sw2) {
                    if_after_sw2 = false;
                } else {
                    if_after_sw3 = true;
                    switch1.toggle();
                    switch4.toggle();
                }
                check_it_all();
                break;
            case R.id.switch4:
                if (if_after_sw3) {
                    if_after_sw3 = false;
                }
                check_it_all();
                break;
        }
    }

    private void check_it(){
        if(switch1.isChecked() && switch2.isChecked() && switch3.isChecked() && switch4.isChecked()){
            Toast toast = Toast.makeText(this, "Complete", Toast.LENGTH_SHORT);
            toast.show();
            GoToNextActivity();
        } else {
            Toast toast = Toast.makeText(this, "Do not complete", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    private boolean check_it_all() {
        boolean is_checked;
        if (switch1.isChecked() && switch2.isChecked() && switch3.isChecked() && switch4.isChecked()){
            next_button.setBackgroundColor(active);
            is_checked = true;
            Save_it(true);
        } else {
            next_button.setBackgroundColor(disabled);
            is_checked = false;
        }
        return is_checked;
    }

    private void Save_it(boolean b) {
        editor.putBoolean(IF_EASY_LEVEL_03_SOLVED, b);
        editor.apply();
    }


    private void GoToNextActivity() {
        Intent intent = new Intent(getApplicationContext(), Easy_04.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
        /*Intent intent = new Intent(getApplicationContext(), GoEasy.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromright, R.anim.toleft);*/
    }

    private void BackToPreviousActivity() {
        Intent intent = new Intent(getApplicationContext(), GoEasy.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromright, R.anim.toleft);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()){
            case R.id.switch2:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch1.setBackgroundColor(color_of_touch);
                        switch3.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch1.setBackgroundColor(default_color);
                        switch3.setBackgroundColor(default_color);
                        break;
                }
                break;
            case R.id.switch3:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch1.setBackgroundColor(color_of_touch);
                        switch4.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch1.setBackgroundColor(default_color);
                        switch4.setBackgroundColor(default_color);
                        break;
                }
                break;
            case R.id.back_button:
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(dflt_clr);
                        break;
                }
                break;
            case R.id.next_button:
                if (just_check()){
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            v.setBackgroundColor(color_of_touch);
                            break;
                        case MotionEvent.ACTION_UP:
                            v.setBackgroundColor(dflt_clr);
                            break;
                    }
                }
                break;
        }
        return false;
    }

    private boolean just_check() {
        boolean is_true;
        if (switch1.isChecked() && switch2.isChecked() && switch3.isChecked() && switch4.isChecked()) {
            is_true = true;
        } else {
            is_true = false;
        }
        return is_true;
    }
}
