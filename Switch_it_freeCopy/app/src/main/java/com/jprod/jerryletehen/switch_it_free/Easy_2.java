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
import android.widget.TextView;
import android.widget.Toast;

public class Easy_2 extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    int disabled;
    int disabled_touch;
    int dflt_clr;
    int color_of_touch;
    int color_of_solved;
    int color_of_solved_touch;

    String back_button_text;

    Button back_button;

    String choose_level_text;
    String level_easy_text;

    String level_29_text;
    String level_30_text;
    String level_31_text;
    String level_32_text;
    String level_33_text;
    String level_34_text;
    String level_35_text;
    String level_36_text;
    String level_37_text;
    String level_38_text;
    String level_39_text;
    String level_40_text;
    String level_41_text;
    String level_42_text;
    String level_43_text;
    String level_44_text;
    String level_45_text;
    String level_46_text;
    String level_47_text;
    String level_48_text;
    String level_49_text;
    String level_50_text;


    Button level_29;
    Button level_30;
    Button level_31;
    Button level_32;
    Button level_33;
    Button level_34;
    Button level_35;
    Button level_36;
    Button level_37;
    Button level_38;
    Button level_39;
    Button level_40;
    Button level_41;
    Button level_42;
    Button level_43;
    Button level_44;
    Button level_45;
    Button level_46;
    Button level_47;
    Button level_48;
    Button level_49;
    Button level_50;

    TextView choose_level;
    TextView level_easy;


    boolean if_28;
    boolean if_29;
    boolean if_30;
    boolean if_31;
    boolean if_32;
    boolean if_33;
    boolean if_34;
    boolean if_35;
    boolean if_36;
    boolean if_37;
    boolean if_38;
    boolean if_39;
    boolean if_40;
    boolean if_41;
    boolean if_42;
    boolean if_43;
    boolean if_44;
    boolean if_45;
    boolean if_46;
    boolean if_47;
    boolean if_48;
    boolean if_49;
    boolean if_50;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    final String IF_EASY_LEVEL_28_SOLVED = "if_easy_level_28_solved";
    final String IF_EASY_LEVEL_29_SOLVED = "if_easy_level_29_solved";
    final String IF_EASY_LEVEL_30_SOLVED = "if_easy_level_30_solved";
    final String IF_EASY_LEVEL_31_SOLVED = "if_easy_level_31_solved";
    final String IF_EASY_LEVEL_32_SOLVED = "if_easy_level_32_solved";
    final String IF_EASY_LEVEL_33_SOLVED = "if_easy_level_33_solved";
    final String IF_EASY_LEVEL_34_SOLVED = "if_easy_level_34_solved";
    final String IF_EASY_LEVEL_35_SOLVED = "if_easy_level_35_solved";
    final String IF_EASY_LEVEL_36_SOLVED = "if_easy_level_36_solved";
    final String IF_EASY_LEVEL_37_SOLVED = "if_easy_level_37_solved";
    final String IF_EASY_LEVEL_38_SOLVED = "if_easy_level_38_solved";
    final String IF_EASY_LEVEL_39_SOLVED = "if_easy_level_39_solved";
    final String IF_EASY_LEVEL_40_SOLVED = "if_easy_level_40_solved";
    final String IF_EASY_LEVEL_41_SOLVED = "if_easy_level_41_solved";
    final String IF_EASY_LEVEL_42_SOLVED = "if_easy_level_42_solved";
    final String IF_EASY_LEVEL_43_SOLVED = "if_easy_level_43_solved";
    final String IF_EASY_LEVEL_44_SOLVED = "if_easy_level_44_solved";
    final String IF_EASY_LEVEL_45_SOLVED = "if_easy_level_45_solved";
    final String IF_EASY_LEVEL_46_SOLVED = "if_easy_level_46_solved";
    final String IF_EASY_LEVEL_47_SOLVED = "if_easy_level_47_solved";
    final String IF_EASY_LEVEL_48_SOLVED = "if_easy_level_48_solved";
    final String IF_EASY_LEVEL_49_SOLVED = "if_easy_level_49_solved";
    final String IF_EASY_LEVEL_50_SOLVED = "if_easy_level_50_solved";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_2);


        String DEFAULT_SP_KEY = "Save_of_solved_levels";
        sharedPreferences = getSharedPreferences(DEFAULT_SP_KEY, Context.MODE_PRIVATE);

        disabled = getResources().getColor(R.color.disabled);
        disabled_touch = getResources().getColor(R.color.disabled_touch);
        dflt_clr = getResources().getColor(R.color.play_button);
        color_of_touch = getResources().getColor(R.color.touch_color);
        color_of_solved = getResources().getColor(R.color.solved);
        color_of_solved_touch = getResources().getColor(R.color.color_of_solved_touch);


        Typeface main_typeface = Typeface.createFromAsset(getAssets(), "fonts/10160.otf");
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/9752.otf");

        back_button_text = getResources().getString(R.string.back_button);
        back_button = (Button) findViewById(R.id.back_button);
        back_button.setText(back_button_text);
        back_button.setTypeface(typeface);
        back_button.setOnClickListener(this);
        back_button.setOnTouchListener(this);



        level_29 = (Button) findViewById(R.id.level_29);
        level_29_text = getResources().getString(R.string.level_29);
        level_29.setText(level_29_text);
        level_29.setTypeface(typeface);
        level_29.setOnClickListener(this);
        level_29.setOnTouchListener(this);
        level_29.setBackgroundColor(disabled);

        level_30 = (Button) findViewById(R.id.level_30);
        level_30_text = getResources().getString(R.string.level_30);
        level_30.setText(level_30_text);
        level_30.setTypeface(typeface);
        level_30.setOnClickListener(this);
        level_30.setOnTouchListener(this);
        level_30.setBackgroundColor(disabled);

        level_31 = (Button) findViewById(R.id.level_31);
        level_31_text = getResources().getString(R.string.level_31);
        level_31.setText(level_31_text);
        level_31.setTypeface(typeface);
        level_31.setOnClickListener(this);
        level_31.setOnTouchListener(this);
        level_31.setBackgroundColor(disabled);

        level_32 = (Button) findViewById(R.id.level_32);
        level_32_text = getResources().getString(R.string.level_32);
        level_32.setText(level_32_text);
        level_32.setTypeface(typeface);
        level_32.setOnClickListener(this);
        level_32.setOnTouchListener(this);
        level_32.setBackgroundColor(disabled);

        level_33 = (Button) findViewById(R.id.level_33);
        level_33_text = getResources().getString(R.string.level_33);
        level_33.setText(level_33_text);
        level_33.setTypeface(typeface);
        level_33.setOnClickListener(this);
        level_33.setOnTouchListener(this);
        level_33.setBackgroundColor(disabled);

        level_34 = (Button) findViewById(R.id.level_34);
        level_34_text = getResources().getString(R.string.level_34);
        level_34.setText(level_34_text);
        level_34.setTypeface(typeface);
        level_34.setOnClickListener(this);
        level_34.setOnTouchListener(this);
        level_34.setBackgroundColor(disabled);

        level_35 = (Button) findViewById(R.id.level_35);
        level_35_text = getResources().getString(R.string.level_35);
        level_35.setText(level_35_text);
        level_35.setTypeface(typeface);
        level_35.setOnClickListener(this);
        level_35.setOnTouchListener(this);
        level_35.setBackgroundColor(disabled);

        level_36 = (Button) findViewById(R.id.level_36);
        level_36_text = getResources().getString(R.string.level_36);
        level_36.setText(level_36_text);
        level_36.setTypeface(typeface);
        level_36.setOnClickListener(this);
        level_36.setOnTouchListener(this);
        level_36.setBackgroundColor(disabled);

        level_37 = (Button) findViewById(R.id.level_37);
        level_37_text = getResources().getString(R.string.level_37);
        level_37.setText(level_37_text);
        level_37.setTypeface(typeface);
        level_37.setOnClickListener(this);
        level_37.setOnTouchListener(this);
        level_37.setBackgroundColor(disabled);

        level_38 = (Button) findViewById(R.id.level_38);
        level_38_text = getResources().getString(R.string.level_38);
        level_38.setText(level_38_text);
        level_38.setTypeface(typeface);
        level_38.setOnClickListener(this);
        level_38.setOnTouchListener(this);
        level_38.setBackgroundColor(disabled);

        level_39 = (Button) findViewById(R.id.level_39);
        level_39_text = getResources().getString(R.string.level_39);
        level_39.setText(level_39_text);
        level_39.setTypeface(typeface);
        level_39.setOnClickListener(this);
        level_39.setOnTouchListener(this);
        level_39.setBackgroundColor(disabled);

        level_40 = (Button) findViewById(R.id.level_40);
        level_40_text = getResources().getString(R.string.level_40);
        level_40.setText(level_40_text);
        level_40.setTypeface(typeface);
        level_40.setOnClickListener(this);
        level_40.setOnTouchListener(this);
        level_40.setBackgroundColor(disabled);


        level_41 = (Button) findViewById(R.id.level_41);
        level_41_text = getResources().getString(R.string.level_41);
        level_41.setText(level_41_text);
        level_41.setTypeface(typeface);
        level_41.setOnClickListener(this);
        level_41.setOnTouchListener(this);
        level_41.setBackgroundColor(disabled);


        level_42 = (Button) findViewById(R.id.level_42);
        level_42_text = getResources().getString(R.string.level_42);
        level_42.setText(level_42_text);
        level_42.setTypeface(typeface);
        level_42.setOnClickListener(this);
        level_42.setOnTouchListener(this);
        level_42.setBackgroundColor(disabled);


        level_43 = (Button) findViewById(R.id.level_43);
        level_43_text = getResources().getString(R.string.level_43);
        level_43.setText(level_43_text);
        level_43.setTypeface(typeface);
        level_43.setOnClickListener(this);
        level_43.setOnTouchListener(this);
        level_43.setBackgroundColor(disabled);


        level_44 = (Button) findViewById(R.id.level_44);
        level_44_text = getResources().getString(R.string.level_44);
        level_44.setText(level_44_text);
        level_44.setTypeface(typeface);
        level_44.setOnClickListener(this);
        level_44.setOnTouchListener(this);
        level_44.setBackgroundColor(disabled);

        level_45 = (Button) findViewById(R.id.level_45);
        level_45_text = getResources().getString(R.string.level_45);
        level_45.setText(level_45_text);
        level_45.setTypeface(typeface);
        level_45.setOnClickListener(this);
        level_45.setOnTouchListener(this);
        level_45.setBackgroundColor(disabled);


        level_46 = (Button) findViewById(R.id.level_46);
        level_46_text = getResources().getString(R.string.level_46);
        level_46.setText(level_46_text);
        level_46.setTypeface(typeface);
        level_46.setOnClickListener(this);
        level_46.setOnTouchListener(this);
        level_46.setBackgroundColor(disabled);


        level_47 = (Button) findViewById(R.id.level_47);
        level_47_text = getResources().getString(R.string.level_47);
        level_47.setText(level_47_text);
        level_47.setTypeface(typeface);
        level_47.setOnClickListener(this);
        level_47.setOnTouchListener(this);
        level_47.setBackgroundColor(disabled);


        level_48 = (Button) findViewById(R.id.level_48);
        level_48_text = getResources().getString(R.string.level_48);
        level_48.setText(level_48_text);
        level_48.setTypeface(typeface);
        level_48.setOnClickListener(this);
        level_48.setOnTouchListener(this);
        level_48.setBackgroundColor(disabled);


        level_49 = (Button) findViewById(R.id.level_49);
        level_49_text = getResources().getString(R.string.level_49);
        level_49.setText(level_49_text);
        level_49.setTypeface(typeface);
        level_49.setOnClickListener(this);
        level_49.setOnTouchListener(this);
        level_49.setBackgroundColor(disabled);


        level_50 = (Button) findViewById(R.id.level_50);
        level_50_text = getResources().getString(R.string.level_50);
        level_50.setText(level_50_text);
        level_50.setTypeface(typeface);
        level_50.setOnClickListener(this);
        level_50.setOnTouchListener(this);
        level_50.setBackgroundColor(disabled);

        choose_level = (TextView) findViewById(R.id.choose_level_text);
        choose_level_text = getResources().getString(R.string.choose_level);
        choose_level.setText(choose_level_text);
        choose_level.setTypeface(main_typeface);


        level_easy = (TextView) findViewById(R.id.level_easy);
        level_easy_text = getResources().getString(R.string.level_easy);
        level_easy.setText(level_easy_text);
        level_easy.setTypeface(main_typeface);


        Load_it();
    }

    private void Load_it() {

        if_28 = sharedPreferences.getBoolean(IF_EASY_LEVEL_28_SOLVED, false);
        if_29 = sharedPreferences.getBoolean(IF_EASY_LEVEL_29_SOLVED, false);
        if_30 = sharedPreferences.getBoolean(IF_EASY_LEVEL_30_SOLVED, false);
        if_31 = sharedPreferences.getBoolean(IF_EASY_LEVEL_31_SOLVED, false);
        if_32 = sharedPreferences.getBoolean(IF_EASY_LEVEL_32_SOLVED, false);
        if_33 = sharedPreferences.getBoolean(IF_EASY_LEVEL_33_SOLVED, false);
        if_34 = sharedPreferences.getBoolean(IF_EASY_LEVEL_34_SOLVED, false);
        if_35 = sharedPreferences.getBoolean(IF_EASY_LEVEL_35_SOLVED, false);
        if_36 = sharedPreferences.getBoolean(IF_EASY_LEVEL_36_SOLVED, false);
        if_37 = sharedPreferences.getBoolean(IF_EASY_LEVEL_37_SOLVED, false);
        if_38 = sharedPreferences.getBoolean(IF_EASY_LEVEL_38_SOLVED, false);
        if_39 = sharedPreferences.getBoolean(IF_EASY_LEVEL_39_SOLVED, false);
        if_40 = sharedPreferences.getBoolean(IF_EASY_LEVEL_40_SOLVED, false);
        if_41 = sharedPreferences.getBoolean(IF_EASY_LEVEL_41_SOLVED, false);
        if_42 = sharedPreferences.getBoolean(IF_EASY_LEVEL_42_SOLVED, false);
        if_43 = sharedPreferences.getBoolean(IF_EASY_LEVEL_43_SOLVED, false);
        if_44 = sharedPreferences.getBoolean(IF_EASY_LEVEL_44_SOLVED, false);
        if_45 = sharedPreferences.getBoolean(IF_EASY_LEVEL_45_SOLVED, false);
        if_46 = sharedPreferences.getBoolean(IF_EASY_LEVEL_46_SOLVED, false);
        if_47 = sharedPreferences.getBoolean(IF_EASY_LEVEL_47_SOLVED, false);
        if_48 = sharedPreferences.getBoolean(IF_EASY_LEVEL_48_SOLVED, false);
        if_49 = sharedPreferences.getBoolean(IF_EASY_LEVEL_49_SOLVED, false);
        if_50 = sharedPreferences.getBoolean(IF_EASY_LEVEL_50_SOLVED, false);

        if (if_28) {IsPreviousSolved(28);} else {OnTouchDisabled(level_29);}
        if (if_29) {IsPreviousSolved(29);level_29.setBackgroundColor(color_of_solved); level_29.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_30);}
        if (if_30) {IsPreviousSolved(30);level_30.setBackgroundColor(color_of_solved); level_30.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_31);}
        if (if_31) {IsPreviousSolved(31);level_31.setBackgroundColor(color_of_solved); level_31.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_32);}
        if (if_32) {IsPreviousSolved(32);level_32.setBackgroundColor(color_of_solved); level_32.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_33);}
        if (if_33) {IsPreviousSolved(33);level_33.setBackgroundColor(color_of_solved); level_33.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_34);}
        if (if_34) {IsPreviousSolved(34);level_34.setBackgroundColor(color_of_solved); level_34.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_35);}
        if (if_35) {IsPreviousSolved(35);level_35.setBackgroundColor(color_of_solved); level_35.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_36);}
        if (if_36) {IsPreviousSolved(36);level_36.setBackgroundColor(color_of_solved); level_36.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_37);}
        if (if_37) {IsPreviousSolved(37);level_37.setBackgroundColor(color_of_solved); level_37.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_38);}
        if (if_38) {IsPreviousSolved(38);level_38.setBackgroundColor(color_of_solved); level_38.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_39);}
        if (if_39) {IsPreviousSolved(39);level_39.setBackgroundColor(color_of_solved); level_39.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_40);}
        if (if_40) {IsPreviousSolved(40);level_40.setBackgroundColor(color_of_solved); level_40.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_41);}
        if (if_41) {IsPreviousSolved(41);level_41.setBackgroundColor(color_of_solved); level_41.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_42);}
        if (if_42) {IsPreviousSolved(42);level_42.setBackgroundColor(color_of_solved); level_42.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_43);}
        if (if_43) {IsPreviousSolved(43);level_43.setBackgroundColor(color_of_solved); level_43.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_44);}
        if (if_44) {IsPreviousSolved(44);level_44.setBackgroundColor(color_of_solved); level_44.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_45);}
        if (if_45) {IsPreviousSolved(45);level_45.setBackgroundColor(color_of_solved); level_45.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_46);}
        if (if_46) {IsPreviousSolved(46);level_46.setBackgroundColor(color_of_solved); level_46.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_47);}
        if (if_47) {IsPreviousSolved(47);level_47.setBackgroundColor(color_of_solved); level_47.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_48);}
        if (if_48) {IsPreviousSolved(48);level_48.setBackgroundColor(color_of_solved); level_48.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_49);}
        if (if_49) {IsPreviousSolved(49);level_49.setBackgroundColor(color_of_solved); level_49.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });} else {OnTouchDisabled(level_50);}
        if (if_50) {IsPreviousSolved(50);level_50.setBackgroundColor(color_of_solved); level_50.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_solved_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(color_of_solved);
                        break;
                }
                return false;
            }
        });}
    }

    private void OnTouchDisabled(Button level) {
        level.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(disabled_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(disabled);
                        break;
                }
                return false;
            }
        });
    }


    private void IsPreviousSolved(int i) {
        switch (i) {
            case 28:
                level_29.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_29);
                break;
            case 29:
                level_30.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_30);
                break;
            case 30:
                level_31.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_31);
                break;
            case 31:
                level_32.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_32);
                break;
            case 32:
                level_33.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_33);
                break;
            case 33:
                level_34.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_34);
                break;
            case 34:
                level_35.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_35);
                break;
            case 35:
                level_36.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_36);
                break;
            case 36:
                level_37.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_37);
                break;
            case 37:
                level_38.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_38);
                break;
            case 38:
                level_39.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_39);
                break;
            case 39:
                level_40.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_40);
                break;
            case 40:
                level_41.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_41);
                break;
            case 41:
                level_42.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_42);
                break;
            case 42:
                level_43.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_43);
                break;
            case 43:
                level_44.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_44);
                break;
            case 44:
                level_45.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_45);
                break;
            case 45:
                level_46.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_46);
                break;
            case 46:
                level_47.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_47);
                break;
            case 47:
                level_48.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_48);
                break;
            case 48:
                level_49.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_49);
                break;
            case 49:
                level_50.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_50);
                break;
        }
    }


    private void OnOpenLevelTouch(Button level) {
        level.setOnTouchListener(new View.OnTouchListener() {
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
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.level_29:
                if (if_28) {GoToLevel_29();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_30:
                if (if_29) {GoToLevel_30();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_31:
                if (if_30) {GoToLevel_31();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_32:
                if (if_31) {GoToLevel_32();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_33:
                if (if_32) {GoToLevel_33();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_34:
                if (if_33) {GoToLevel_34();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_35:
                if (if_34) {GoToLevel_35();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_36:
                if (if_35) {GoToLevel_36();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_37:
                if (if_36) {GoToLevel_37();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_38:
                if (if_37) {GoToLevel_38();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_39:
                if (if_38) {GoToLevel_39();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_40:
                if (if_39) {GoToLevel_40();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_41:
                if (if_40) {GoToLevel_41();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_42:
                if (if_41) {GoToLevel_42();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_43:
                if (if_42) {GoToLevel_43();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_44:
                if (if_43) {GoToLevel_44();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_45:
                if (if_44) {GoToLevel_45();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_46:
                if (if_45) {GoToLevel_46();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_47:
                if (if_46) {GoToLevel_47();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_48:
                if (if_47) {GoToLevel_48();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_49:
                if (if_48) {GoToLevel_49();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_50:
                if (if_49) {GoToLevel_50();} else {DidntSolvedPrevious();}
                break;
            case R.id.back_button:
                BackToFrontActivity();
                break;
        }
    }

    private void GoToLevel_50() {
        Intent intent = new Intent(getApplicationContext(), Easy_50.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_49() {
        Intent intent = new Intent(getApplicationContext(), Easy_49.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_48() {
        Intent intent = new Intent(getApplicationContext(), Easy_48.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_47() {
        Intent intent = new Intent(getApplicationContext(), Easy_47.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_46() {
        Intent intent = new Intent(getApplicationContext(), Easy_46.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_45() {
        Intent intent = new Intent(getApplicationContext(), Easy_45.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_44() {
        Intent intent = new Intent(getApplicationContext(), Easy_44.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_43() {
        Intent intent = new Intent(getApplicationContext(), Easy_43.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_42() {
        Intent intent = new Intent(getApplicationContext(), Easy_42.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_41() {
        Intent intent = new Intent(getApplicationContext(), Easy_41.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_40() {
        Intent intent = new Intent(getApplicationContext(), Easy_40.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_39() {
        Intent intent = new Intent(getApplicationContext(), Easy_39.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_38() {
        Intent intent = new Intent(getApplicationContext(), Easy_38.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_37() {
        Intent intent = new Intent(getApplicationContext(), Easy_37.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_36() {
        Intent intent = new Intent(getApplicationContext(), Easy_36.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_35() {
        Intent intent = new Intent(getApplicationContext(), Easy_35.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_34() {
        Intent intent = new Intent(getApplicationContext(), Easy_34.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_33() {
        Intent intent = new Intent(getApplicationContext(), Easy_33.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_32() {
        Intent intent = new Intent(getApplicationContext(), Easy_32.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_31() {
        Intent intent = new Intent(getApplicationContext(), Easy_31.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_30() {
        Intent intent = new Intent(getApplicationContext(), Easy_30.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_29() {
        Intent intent = new Intent(getApplicationContext(), Easy_29.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }




    private void BackToFrontActivity() {
        Intent intent = new Intent(getApplicationContext(), GoEasy.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromright, R.anim.toleft);
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


    private void DidntSolvedPrevious() {
        Toast toast = Toast.makeText(this, R.string.didnt_solved_previous, Toast.LENGTH_LONG);
        toast.show();
    }
}