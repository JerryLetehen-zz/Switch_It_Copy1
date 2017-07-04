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

public class GoMedium extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {


    int disabled;
    int disabled_touch;
    int dflt_clr;
    int color_of_touch;
    int color_of_solved;
    int color_of_solved_touch;

    String back_button_text;
    String next_button_text;

    Button back_button;
    Button next_button;

    String choose_level_text;
    String level_medium_text;

    String level_01_text;
    String level_02_text;
    String level_03_text;
    String level_04_text;
    String level_05_text;
    String level_06_text;
    String level_07_text;
    String level_08_text;
    String level_09_text;
    String level_10_text;
    String level_11_text;
    String level_12_text;
    String level_13_text;
    String level_14_text;
    String level_15_text;
    String level_16_text;
    String level_17_text;
    String level_18_text;
    String level_19_text;
    String level_20_text;
    String level_21_text;
    String level_22_text;
    String level_23_text;
    String level_24_text;
    String level_25_text;
    String level_26_text;
    String level_27_text;
    String level_28_text;


    Button level_01;
    Button level_02;
    Button level_03;
    Button level_04;
    Button level_05;
    Button level_06;
    Button level_07;
    Button level_08;
    Button level_09;
    Button level_10;
    Button level_11;
    Button level_12;
    Button level_13;
    Button level_14;
    Button level_15;
    Button level_16;
    Button level_17;
    Button level_18;
    Button level_19;
    Button level_20;
    Button level_21;
    Button level_22;
    Button level_23;
    Button level_24;
    Button level_25;
    Button level_26;
    Button level_27;
    Button level_28;

    TextView choose_level;
    TextView level_medium;


    boolean if_1;
    boolean if_2;
    boolean if_3;
    boolean if_4;
    boolean if_5;
    boolean if_6;
    boolean if_7;
    boolean if_8;
    boolean if_9;
    boolean if_10;
    boolean if_11;
    boolean if_12;
    boolean if_13;
    boolean if_14;
    boolean if_15;
    boolean if_16;
    boolean if_17;
    boolean if_18;
    boolean if_19;
    boolean if_20;
    boolean if_21;
    boolean if_22;
    boolean if_23;
    boolean if_24;
    boolean if_25;
    boolean if_26;
    boolean if_27;
    boolean if_28;


    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    final String IF_MEDIUM_LEVEL_01_SOLVED = "if_medium_level_01_solved";
    final String IF_MEDIUM_LEVEL_02_SOLVED = "if_medium_level_02_solved";
    final String IF_MEDIUM_LEVEL_03_SOLVED = "if_medium_level_03_solved";
    final String IF_MEDIUM_LEVEL_04_SOLVED = "if_medium_level_04_solved";
    final String IF_MEDIUM_LEVEL_05_SOLVED = "if_medium_level_05_solved";
    final String IF_MEDIUM_LEVEL_06_SOLVED = "if_medium_level_06_solved";
    final String IF_MEDIUM_LEVEL_07_SOLVED = "if_medium_level_07_solved";
    final String IF_MEDIUM_LEVEL_08_SOLVED = "if_medium_level_08_solved";
    final String IF_MEDIUM_LEVEL_09_SOLVED = "if_medium_level_09_solved";
    final String IF_MEDIUM_LEVEL_10_SOLVED = "if_medium_level_10_solved";
    final String IF_MEDIUM_LEVEL_11_SOLVED = "if_medium_level_11_solved";
    final String IF_MEDIUM_LEVEL_12_SOLVED = "if_medium_level_12_solved";
    final String IF_MEDIUM_LEVEL_13_SOLVED = "if_medium_level_13_solved";
    final String IF_MEDIUM_LEVEL_14_SOLVED = "if_medium_level_14_solved";
    final String IF_MEDIUM_LEVEL_15_SOLVED = "if_medium_level_15_solved";
    final String IF_MEDIUM_LEVEL_16_SOLVED = "if_medium_level_16_solved";
    final String IF_MEDIUM_LEVEL_17_SOLVED = "if_medium_level_17_solved";
    final String IF_MEDIUM_LEVEL_18_SOLVED = "if_medium_level_18_solved";
    final String IF_MEDIUM_LEVEL_19_SOLVED = "if_medium_level_19_solved";
    final String IF_MEDIUM_LEVEL_20_SOLVED = "if_medium_level_20_solved";
    final String IF_MEDIUM_LEVEL_21_SOLVED = "if_medium_level_21_solved";
    final String IF_MEDIUM_LEVEL_22_SOLVED = "if_medium_level_22_solved";
    final String IF_MEDIUM_LEVEL_23_SOLVED = "if_medium_level_23_solved";
    final String IF_MEDIUM_LEVEL_24_SOLVED = "if_medium_level_24_solved";
    final String IF_MEDIUM_LEVEL_25_SOLVED = "if_medium_level_25_solved";
    final String IF_MEDIUM_LEVEL_26_SOLVED = "if_medium_level_26_solved";
    final String IF_MEDIUM_LEVEL_27_SOLVED = "if_medium_level_27_solved";
    final String IF_MEDIUM_LEVEL_28_SOLVED = "if_medium_level_28_solved";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medium);

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


        next_button_text = getResources().getString(R.string.next_button);
        next_button = (Button) findViewById(R.id.next_button);
        next_button.setText(next_button_text);
        next_button.setTypeface(typeface);
        next_button.setOnClickListener(this);
        next_button.setOnTouchListener(this);
        //next_button.setBackgroundColor(disabled);


        level_01 = (Button) findViewById(R.id.level_01);
        level_01_text = getResources().getString(R.string.level_01);
        level_01.setText(level_01_text);
        level_01.setTypeface(typeface);
        level_01.setOnClickListener(this);
        level_01.setOnTouchListener(this);

        level_02 = (Button) findViewById(R.id.level_02);
        level_02_text = getResources().getString(R.string.level_02);
        level_02.setText(level_02_text);
        level_02.setTypeface(typeface);
        level_02.setOnClickListener(this);
        level_02.setOnTouchListener(this);
        level_02.setBackgroundColor(disabled);


        level_03 = (Button) findViewById(R.id.level_03);
        level_03_text = getResources().getString(R.string.level_03);
        level_03.setText(level_03_text);
        level_03.setTypeface(typeface);
        level_03.setOnTouchListener(this);
        level_03.setOnClickListener(this);
        level_03.setBackgroundColor(disabled);

        level_04 = (Button) findViewById(R.id.level_04);
        level_04_text = getResources().getString(R.string.level_04);
        level_04.setText(level_04_text);
        level_04.setTypeface(typeface);
        level_04.setOnClickListener(this);
        level_04.setOnTouchListener(this);
        level_04.setBackgroundColor(disabled);

        level_05 = (Button) findViewById(R.id.level_05);
        level_05_text = getResources().getString(R.string.level_05);
        level_05.setText(level_05_text);
        level_05.setTypeface(typeface);
        level_05.setOnClickListener(this);
        level_05.setOnTouchListener(this);
        level_05.setBackgroundColor(disabled);

        level_06 = (Button) findViewById(R.id.level_06);
        level_06_text = getResources().getString(R.string.level_06);
        level_06.setText(level_06_text);
        level_06.setTypeface(typeface);
        level_06.setOnClickListener(this);
        level_06.setOnTouchListener(this);
        level_06.setBackgroundColor(disabled);

        level_07 = (Button) findViewById(R.id.level_07);
        level_07_text = getResources().getString(R.string.level_07);
        level_07.setText(level_07_text);
        level_07.setTypeface(typeface);
        level_07.setOnClickListener(this);
        level_07.setOnTouchListener(this);
        level_07.setBackgroundColor(disabled);

        level_08 = (Button) findViewById(R.id.level_08);
        level_08_text = getResources().getString(R.string.level_08);
        level_08.setText(level_08_text);
        level_08.setTypeface(typeface);
        level_08.setOnClickListener(this);
        level_08.setOnTouchListener(this);
        level_08.setBackgroundColor(disabled);

        level_09 = (Button) findViewById(R.id.level_09);
        level_09_text = getResources().getString(R.string.level_09);
        level_09.setText(level_09_text);
        level_09.setTypeface(typeface);
        level_09.setOnClickListener(this);
        level_09.setOnTouchListener(this);
        level_09.setBackgroundColor(disabled);

        level_10 = (Button) findViewById(R.id.level_10);
        level_10_text = getResources().getString(R.string.level_10);
        level_10.setText(level_10_text);
        level_10.setTypeface(typeface);
        level_10.setOnClickListener(this);
        level_10.setOnTouchListener(this);
        level_10.setBackgroundColor(disabled);

        level_11 = (Button) findViewById(R.id.level_11);
        level_11_text = getResources().getString(R.string.level_11);
        level_11.setText(level_11_text);
        level_11.setTypeface(typeface);
        level_11.setOnClickListener(this);
        level_11.setOnTouchListener(this);
        level_11.setBackgroundColor(disabled);

        level_12 = (Button) findViewById(R.id.level_12);
        level_12_text = getResources().getString(R.string.level_12);
        level_12.setText(level_12_text);
        level_12.setTypeface(typeface);
        level_12.setOnClickListener(this);
        level_12.setOnTouchListener(this);
        level_12.setBackgroundColor(disabled);


        level_13 = (Button) findViewById(R.id.level_13);
        level_13_text = getResources().getString(R.string.level_13);
        level_13.setText(level_13_text);
        level_13.setTypeface(typeface);
        level_13.setOnClickListener(this);
        level_13.setOnTouchListener(this);
        level_13.setBackgroundColor(disabled);


        level_14 = (Button) findViewById(R.id.level_14);
        level_14_text = getResources().getString(R.string.level_14);
        level_14.setText(level_14_text);
        level_14.setTypeface(typeface);
        level_14.setOnClickListener(this);
        level_14.setOnTouchListener(this);
        level_14.setBackgroundColor(disabled);


        level_15 = (Button) findViewById(R.id.level_15);
        level_15_text = getResources().getString(R.string.level_15);
        level_15.setText(level_15_text);
        level_15.setTypeface(typeface);
        level_15.setOnClickListener(this);
        level_15.setOnTouchListener(this);
        level_15.setBackgroundColor(disabled);


        level_16 = (Button) findViewById(R.id.level_16);
        level_16_text = getResources().getString(R.string.level_16);
        level_16.setText(level_16_text);
        level_16.setTypeface(typeface);
        level_16.setOnClickListener(this);
        level_16.setOnTouchListener(this);
        level_16.setBackgroundColor(disabled);

        level_17 = (Button) findViewById(R.id.level_17);
        level_17_text = getResources().getString(R.string.level_17);
        level_17.setText(level_17_text);
        level_17.setTypeface(typeface);
        level_17.setOnClickListener(this);
        level_17.setOnTouchListener(this);
        level_17.setBackgroundColor(disabled);


        level_18 = (Button) findViewById(R.id.level_18);
        level_18_text = getResources().getString(R.string.level_18);
        level_18.setText(level_18_text);
        level_18.setTypeface(typeface);
        level_18.setOnClickListener(this);
        level_18.setOnTouchListener(this);
        level_18.setBackgroundColor(disabled);


        level_19 = (Button) findViewById(R.id.level_19);
        level_19_text = getResources().getString(R.string.level_19);
        level_19.setText(level_19_text);
        level_19.setTypeface(typeface);
        level_19.setOnClickListener(this);
        level_19.setOnTouchListener(this);
        level_19.setBackgroundColor(disabled);


        level_20 = (Button) findViewById(R.id.level_20);
        level_20_text = getResources().getString(R.string.level_20);
        level_20.setText(level_20_text);
        level_20.setTypeface(typeface);
        level_20.setOnClickListener(this);
        level_20.setOnTouchListener(this);
        level_20.setBackgroundColor(disabled);


        level_21 = (Button) findViewById(R.id.level_21);
        level_21_text = getResources().getString(R.string.level_21);
        level_21.setText(level_21_text);
        level_21.setTypeface(typeface);
        level_21.setOnClickListener(this);
        level_21.setOnTouchListener(this);
        level_21.setBackgroundColor(disabled);


        level_22 = (Button) findViewById(R.id.level_22);
        level_22_text = getResources().getString(R.string.level_22);
        level_22.setText(level_22_text);
        level_22.setTypeface(typeface);
        level_22.setOnClickListener(this);
        level_22.setOnTouchListener(this);
        level_22.setBackgroundColor(disabled);


        level_23 = (Button) findViewById(R.id.level_23);
        level_23_text = getResources().getString(R.string.level_23);
        level_23.setText(level_23_text);
        level_23.setTypeface(typeface);
        level_23.setOnClickListener(this);
        level_23.setOnTouchListener(this);
        level_23.setBackgroundColor(disabled);


        level_24 = (Button) findViewById(R.id.level_24);
        level_24_text = getResources().getString(R.string.level_24);
        level_24.setText(level_24_text);
        level_24.setTypeface(typeface);
        level_24.setOnClickListener(this);
        level_24.setOnTouchListener(this);
        level_24.setBackgroundColor(disabled);


        level_25 = (Button) findViewById(R.id.level_25);
        level_25_text = getResources().getString(R.string.level_25);
        level_25.setText(level_25_text);
        level_25.setTypeface(typeface);
        level_25.setOnClickListener(this);
        level_25.setOnTouchListener(this);
        level_25.setBackgroundColor(disabled);


        level_26 = (Button) findViewById(R.id.level_26);
        level_26_text = getResources().getString(R.string.level_26);
        level_26.setText(level_26_text);
        level_26.setTypeface(typeface);
        level_26.setOnClickListener(this);
        level_26.setOnTouchListener(this);
        level_26.setBackgroundColor(disabled);


        level_27 = (Button) findViewById(R.id.level_27);
        level_27_text = getResources().getString(R.string.level_27);
        level_27.setText(level_27_text);
        level_27.setTypeface(typeface);
        level_27.setOnClickListener(this);
        level_27.setOnTouchListener(this);
        level_27.setBackgroundColor(disabled);


        level_28 = (Button) findViewById(R.id.level_28);
        level_28_text = getResources().getString(R.string.level_28);
        level_28.setText(level_28_text);
        level_28.setTypeface(typeface);
        level_28.setOnClickListener(this);
        level_28.setOnTouchListener(this);
        level_28.setBackgroundColor(disabled);

        choose_level = (TextView) findViewById(R.id.choose_level_text);
        choose_level_text = getResources().getString(R.string.choose_level);
        choose_level.setText(choose_level_text);
        choose_level.setTypeface(main_typeface);


        level_medium = (TextView) findViewById(R.id.level_medium);
        level_medium_text = getResources().getString(R.string.level_medium);
        level_medium.setText(level_medium_text);
        level_medium.setTypeface(main_typeface);


        Load_it();
    }

    private void Load_it() {

        if_1 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_01_SOLVED, false);
        if_2 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_02_SOLVED, false);
        if_3 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_03_SOLVED, false);
        if_4 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_04_SOLVED, false);
        if_5 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_05_SOLVED, false);
        if_6 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_06_SOLVED, false);
        if_7 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_07_SOLVED, false);
        if_8 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_08_SOLVED, false);
        if_9 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_09_SOLVED, false);
        if_10 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_10_SOLVED, false);
        if_11 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_11_SOLVED, false);
        if_12 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_12_SOLVED, false);
        if_13 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_13_SOLVED, false);
        if_14 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_14_SOLVED, false);
        if_15 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_15_SOLVED, false);
        if_16 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_16_SOLVED, false);
        if_17 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_17_SOLVED, false);
        if_18 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_18_SOLVED, false);
        if_19 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_19_SOLVED, false);
        if_20 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_20_SOLVED, false);
        if_21 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_21_SOLVED, false);
        if_22 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_22_SOLVED, false);
        if_23 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_23_SOLVED, false);
        if_24 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_24_SOLVED, false);
        if_25 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_25_SOLVED, false);
        if_26 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_26_SOLVED, false);
        if_27 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_27_SOLVED, false);
        if_28 = sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_28_SOLVED, false);


        if (if_1) {IsPreviousSolved(1);level_01.setBackgroundColor(color_of_solved); level_01.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_02);}
        if (if_2) {IsPreviousSolved(2);level_02.setBackgroundColor(color_of_solved); level_02.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_03);}
        if (if_3) {IsPreviousSolved(3);level_03.setBackgroundColor(color_of_solved); level_03.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_04);}
        if (if_4) {IsPreviousSolved(4);level_04.setBackgroundColor(color_of_solved); level_04.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_05);}
        if (if_5) {IsPreviousSolved(5);level_05.setBackgroundColor(color_of_solved); level_05.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_06);}
        if (if_6) {IsPreviousSolved(6);level_06.setBackgroundColor(color_of_solved); level_06.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_07);}
        if (if_7) {IsPreviousSolved(7);level_07.setBackgroundColor(color_of_solved); level_07.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_08);}
        if (if_8) {IsPreviousSolved(8);level_08.setBackgroundColor(color_of_solved); level_08.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_09);}
        if (if_9) {IsPreviousSolved(9);level_09.setBackgroundColor(color_of_solved); level_09.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_10);}
        if (if_10) {IsPreviousSolved(10);level_10.setBackgroundColor(color_of_solved); level_10.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_11);}
        if (if_11) {IsPreviousSolved(11);level_11.setBackgroundColor(color_of_solved); level_11.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_12);}
        if (if_12) {IsPreviousSolved(12);level_12.setBackgroundColor(color_of_solved); level_12.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_13);}
        if (if_13) {IsPreviousSolved(13);level_13.setBackgroundColor(color_of_solved); level_13.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_14);}
        if (if_14) {IsPreviousSolved(14);level_14.setBackgroundColor(color_of_solved); level_14.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_15);}
        if (if_15) {IsPreviousSolved(15);level_15.setBackgroundColor(color_of_solved); level_15.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_16);}
        if (if_16) {IsPreviousSolved(16);level_16.setBackgroundColor(color_of_solved); level_16.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_17);}
        if (if_17) {IsPreviousSolved(17);level_17.setBackgroundColor(color_of_solved); level_17.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_18);}
        if (if_18) {IsPreviousSolved(18);level_18.setBackgroundColor(color_of_solved); level_18.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_19);}
        if (if_19) {IsPreviousSolved(19);level_19.setBackgroundColor(color_of_solved); level_19.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_20);}
        if (if_20) {IsPreviousSolved(20);level_20.setBackgroundColor(color_of_solved); level_20.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_21);}
        if (if_21) {IsPreviousSolved(21);level_21.setBackgroundColor(color_of_solved); level_21.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_22);}
        if (if_22) {IsPreviousSolved(22);level_22.setBackgroundColor(color_of_solved); level_22.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_23);}
        if (if_23) {IsPreviousSolved(23);level_23.setBackgroundColor(color_of_solved); level_23.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_24);}
        if (if_24) {IsPreviousSolved(24);level_24.setBackgroundColor(color_of_solved); level_24.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_25);}
        if (if_25) {IsPreviousSolved(25);level_25.setBackgroundColor(color_of_solved); level_25.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_26);}
        if (if_26) {IsPreviousSolved(26);level_26.setBackgroundColor(color_of_solved); level_26.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_27);}
        if (if_27) {IsPreviousSolved(27);level_27.setBackgroundColor(color_of_solved); level_27.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {OnTouchDisabled(level_28);}
        if (if_28) {level_28.setBackgroundColor(color_of_solved); level_28.setOnTouchListener(new View.OnTouchListener() {
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

    private void IsPreviousSolved(int i) {
        switch (i) {
            case 1:
                level_02.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_02);
                break;
            case 2:
                level_03.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_03);
                break;
            case 3:
                level_04.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_04);
                break;
            case 4:
                level_05.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_05);
                break;
            case 5:
                level_06.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_06);
                break;
            case 6:
                level_07.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_07);
                break;
            case 7:
                level_08.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_08);
                break;
            case 8:
                level_09.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_09);
                break;
            case 9:
                level_10.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_10);
                break;
            case 10:
                level_11.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_11);
                break;
            case 11:
                level_12.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_12);
                break;
            case 12:
                level_13.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_13);
                break;
            case 13:
                level_14.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_14);
                break;
            case 14:
                level_15.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_15);
                break;
            case 15:
                level_16.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_16);
                break;
            case 16:
                level_17.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_17);
                break;
            case 17:
                level_18.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_18);
                break;
            case 18:
                level_19.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_19);
                break;
            case 19:
                level_20.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_20);
                break;
            case 20:
                level_21.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_21);
                break;
            case 21:
                level_22.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_22);
                break;
            case 22:
                level_23.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_23);
                break;
            case 23:
                level_24.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_24);
                break;
            case 24:
                level_25.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_25);
                break;
            case 25:
                level_26.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_26);
                break;
            case 26:
                level_27.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_27);
                break;
            case 27:
                level_28.setBackgroundColor(dflt_clr);
                OnOpenLevelTouch(level_28);
                break;
        }
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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.level_01:
                GoToLevel_01();
                break;
            case R.id.level_02:
                if (if_1) {GoToLevel_02();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_03:
                if (if_2) {GoToLevel_03();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_04:
                if (if_3) {GoToLevel_04();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_05:
                if (if_4) {GoToLevel_05();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_06:
                if (if_5) {GoToLevel_06();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_07:
                if (if_6) {GoToLevel_07();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_08:
                if (if_7) {GoToLevel_08();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_09:
                if (if_8) {GoToLevel_09();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_10:
                if (if_9) {GoToLevel_10();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_11:
                if (if_10) {GoToLevel_11();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_12:
                if (if_11) {GoToLevel_12();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_13:
                if (if_12) {GoToLevel_13();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_14:
                if (if_13) {GoToLevel_14();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_15:
                if (if_14) {GoToLevel_15();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_16:
                if (if_15) {GoToLevel_16();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_17:
                if (if_16) {GoToLevel_17();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_18:
                if (if_17) {GoToLevel_18();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_19:
                if (if_18) {GoToLevel_19();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_20:
                if (if_19) {GoToLevel_20();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_21:
                if (if_20) {GoToLevel_21();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_22:
                if (if_21) {GoToLevel_22();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_23:
                if (if_22) {GoToLevel_23();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_24:
                if (if_23) {GoToLevel_24();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_25:
                if (if_24) {GoToLevel_25();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_26:
                if (if_25) {GoToLevel_26();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_27:
                if (if_26) {GoToLevel_27();} else {DidntSolvedPrevious();}
                break;
            case R.id.level_28:
                if (if_27) {GoToLevel_28();} else {DidntSolvedPrevious();}
                break;
            case R.id.next_button:
                GoToNextActivity();
                break;
            case R.id.back_button:
                BackToFrontActivity();
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

    private void GoToNextActivity() {
        Intent intent = new Intent(getApplicationContext(), Medium_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_28() {
        Intent intent = new Intent(getApplicationContext(), Medium_28.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_27() {
        Intent intent = new Intent(getApplicationContext(), Medium_27.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_26() {
        Intent intent = new Intent(getApplicationContext(), Medium_26.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_25() {
        Intent intent = new Intent(getApplicationContext(), Medium_25.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_24() {
        Intent intent = new Intent(getApplicationContext(), Medium_24.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_23() {
        Intent intent = new Intent(getApplicationContext(), Medium_23.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_22() {
        Intent intent = new Intent(getApplicationContext(), Medium_22.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_21() {
        Intent intent = new Intent(getApplicationContext(), Medium_21.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_20() {
        Intent intent = new Intent(getApplicationContext(), Medium_20.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_19() {
        Intent intent = new Intent(getApplicationContext(), Medium_19.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_18() {
        Intent intent = new Intent(getApplicationContext(), Medium_18.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_17() {
        Intent intent = new Intent(getApplicationContext(), Medium_17.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_16() {
        Intent intent = new Intent(getApplicationContext(), Medium_16.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_15() {
        Intent intent = new Intent(getApplicationContext(), Medium_15.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_14() {
        Intent intent = new Intent(getApplicationContext(), Medium_14.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_13() {
        Intent intent = new Intent(getApplicationContext(), Medium_13.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_12() {
        Intent intent = new Intent(getApplicationContext(), Medium_12.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_11() {
        Intent intent = new Intent(getApplicationContext(), Medium_11.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_10() {
        Intent intent = new Intent(getApplicationContext(), Medium_10.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }


    private void GoToLevel_09() {
        Intent intent = new Intent(getApplicationContext(), Medium_09.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_08() {
        Intent intent = new Intent(getApplicationContext(), Medium_08.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_07() {
        Intent intent = new Intent(getApplicationContext(), Medium_07.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_06() {
        Intent intent = new Intent(getApplicationContext(), Medium_06.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_05() {
        Intent intent = new Intent(getApplicationContext(), Medium_05.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_04() {
        Intent intent = new Intent(getApplicationContext(), Medium_04.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_03() {
        Intent intent = new Intent(getApplicationContext(), Medium_03.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_02() {
        Intent intent = new Intent(getApplicationContext(), Medium_02.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void GoToLevel_01() {
        Intent intent = new Intent(getApplicationContext(), Medium_01.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }


    private void BackToFrontActivity() {
        Intent intent = new Intent(getApplicationContext(), FrontActivity.class);
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