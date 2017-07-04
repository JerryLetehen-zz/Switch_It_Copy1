package com.jprod.jerryletehen.switch_it_free;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import android.content.DialogInterface;
import android.widget.EditText;


public class FrontActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener{


    /*InterstitialAd mInterstitialAd;
    private InterstitialAd interstitial;*/

//    final String my_psw = "1824";

    AlertDialog.Builder alertDialog;

    Button back_button;
    Button reset_button;
    Button easy;
    Button medium;
    Button hard;
//    Button admin_button;

    TextView select_difficulty;

    String back_button_text;
    String reset_button_text;
    String select_difficulty_text;
    String easy_text;
    String medium_text;
    String hard_text;

    int disabled;
    int disabled_touch;
    int dflt_clr;
    int color_of_touch;
    int color_of_solved;
    int color_of_solved_touch;




    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    final String IF_EASY_SOLVED = "if_the_easy_level_solved";
    final String IF_MEDIUM_SOLVED = "if_the_medium_level_solved";

    final String IF_EASY_LEVEL_01_SOLVED = "if_easy_level_01_solved";
    final String IF_EASY_LEVEL_02_SOLVED = "if_easy_level_02_solved";
    final String IF_EASY_LEVEL_03_SOLVED = "if_easy_level_03_solved";
    final String IF_EASY_LEVEL_04_SOLVED = "if_easy_level_04_solved";
    final String IF_EASY_LEVEL_05_SOLVED = "if_easy_level_05_solved";
    final String IF_EASY_LEVEL_06_SOLVED = "if_easy_level_06_solved";
    final String IF_EASY_LEVEL_07_SOLVED = "if_easy_level_07_solved";
    final String IF_EASY_LEVEL_08_SOLVED = "if_easy_level_08_solved";
    final String IF_EASY_LEVEL_09_SOLVED = "if_easy_level_09_solved";
    final String IF_EASY_LEVEL_10_SOLVED = "if_easy_level_10_solved";
    final String IF_EASY_LEVEL_11_SOLVED = "if_easy_level_11_solved";
    final String IF_EASY_LEVEL_12_SOLVED = "if_easy_level_12_solved";
    final String IF_EASY_LEVEL_13_SOLVED = "if_easy_level_13_solved";
    final String IF_EASY_LEVEL_14_SOLVED = "if_easy_level_14_solved";
    final String IF_EASY_LEVEL_15_SOLVED = "if_easy_level_15_solved";
    final String IF_EASY_LEVEL_16_SOLVED = "if_easy_level_16_solved";
    final String IF_EASY_LEVEL_17_SOLVED = "if_easy_level_17_solved";
    final String IF_EASY_LEVEL_18_SOLVED = "if_easy_level_18_solved";
    final String IF_EASY_LEVEL_19_SOLVED = "if_easy_level_19_solved";
    final String IF_EASY_LEVEL_20_SOLVED = "if_easy_level_20_solved";
    final String IF_EASY_LEVEL_21_SOLVED = "if_easy_level_21_solved";
    final String IF_EASY_LEVEL_22_SOLVED = "if_easy_level_22_solved";
    final String IF_EASY_LEVEL_23_SOLVED = "if_easy_level_23_solved";
    final String IF_EASY_LEVEL_24_SOLVED = "if_easy_level_24_solved";
    final String IF_EASY_LEVEL_25_SOLVED = "if_easy_level_25_solved";
    final String IF_EASY_LEVEL_26_SOLVED = "if_easy_level_26_solved";
    final String IF_EASY_LEVEL_27_SOLVED = "if_easy_level_27_solved";
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
    final String IF_MEDIUM_LEVEL_29_SOLVED = "if_medium_level_29_solved";
    final String IF_MEDIUM_LEVEL_30_SOLVED = "if_medium_level_30_solved";
    final String IF_MEDIUM_LEVEL_31_SOLVED = "if_medium_level_31_solved";
    final String IF_MEDIUM_LEVEL_32_SOLVED = "if_medium_level_32_solved";
    final String IF_MEDIUM_LEVEL_33_SOLVED = "if_medium_level_33_solved";
    final String IF_MEDIUM_LEVEL_34_SOLVED = "if_medium_level_34_solved";
    final String IF_MEDIUM_LEVEL_35_SOLVED = "if_medium_level_35_solved";
    final String IF_MEDIUM_LEVEL_36_SOLVED = "if_medium_level_36_solved";
    final String IF_MEDIUM_LEVEL_37_SOLVED = "if_medium_level_37_solved";
    final String IF_MEDIUM_LEVEL_38_SOLVED = "if_medium_level_38_solved";
    final String IF_MEDIUM_LEVEL_39_SOLVED = "if_medium_level_39_solved";
    final String IF_MEDIUM_LEVEL_40_SOLVED = "if_medium_level_40_solved";
    final String IF_MEDIUM_LEVEL_41_SOLVED = "if_medium_level_41_solved";
    final String IF_MEDIUM_LEVEL_42_SOLVED = "if_medium_level_42_solved";
    final String IF_MEDIUM_LEVEL_43_SOLVED = "if_medium_level_43_solved";
    final String IF_MEDIUM_LEVEL_44_SOLVED = "if_medium_level_44_solved";
    final String IF_MEDIUM_LEVEL_45_SOLVED = "if_medium_level_45_solved";
    final String IF_MEDIUM_LEVEL_46_SOLVED = "if_medium_level_46_solved";
    final String IF_MEDIUM_LEVEL_47_SOLVED = "if_medium_level_47_solved";
    final String IF_MEDIUM_LEVEL_48_SOLVED = "if_medium_level_48_solved";
    final String IF_MEDIUM_LEVEL_49_SOLVED = "if_medium_level_49_solved";
    final String IF_MEDIUM_LEVEL_50_SOLVED = "if_medium_level_50_solved";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_activity);

        /*AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
        interstitial.loadAd(adRequest);
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                displayInterstitial();
            }
        });*/

        String DEFAULT_SP_KEY = "Save_of_solved_levels";
        sharedPreferences = getSharedPreferences(DEFAULT_SP_KEY, Context.MODE_PRIVATE);
        editor = getSharedPreferences(DEFAULT_SP_KEY, Context.MODE_PRIVATE).edit();

        disabled = getResources().getColor(R.color.disabled);
        disabled_touch = getResources().getColor(R.color.disabled_touch);
        color_of_solved = getResources().getColor(R.color.solved);
        color_of_solved_touch = getResources().getColor(R.color.color_of_solved_touch);

        dflt_clr = getResources().getColor(R.color.play_button);
        color_of_touch = getResources().getColor(R.color.touch_color);


        Typeface main_typeface = Typeface.createFromAsset(getAssets(), "fonts/10160.otf");
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/9752.otf");

        back_button_text = getResources().getString(R.string.back_button);
        reset_button_text = getResources().getString(R.string.reset_button);
        select_difficulty_text = getResources().getString(R.string.select_difficulty);
        easy_text = getResources().getString(R.string.easy);
        medium_text = getResources().getString(R.string.medium);
        hard_text = getResources().getString(R.string.hard);

        easy = (Button) findViewById(R.id.easy);
        easy.setText(easy_text);
        easy.setTypeface(typeface);
        easy.setOnClickListener(this);
        easy.setOnTouchListener(this);

        medium = (Button) findViewById(R.id.medium);
        medium.setText(medium_text);
        medium.setTypeface(typeface);
        medium.setOnClickListener(this);
        medium.setOnTouchListener(this);
        medium.setBackgroundColor(disabled);

        hard = (Button) findViewById(R.id.hard);
        hard.setText(hard_text);
        hard.setTypeface(typeface);
        hard.setOnClickListener(this);
        hard.setOnTouchListener(new View.OnTouchListener() {
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
        hard.setBackgroundColor(disabled);

        select_difficulty = (TextView) findViewById(R.id.select_difficulty);
        select_difficulty.setText(select_difficulty_text);
        select_difficulty.setTypeface(main_typeface);

        back_button = (Button) findViewById(R.id.back_button);
        back_button.setText(back_button_text);
        back_button.setTypeface(typeface);
        back_button.setOnClickListener(this);
        back_button.setOnTouchListener(this);


        reset_button = (Button) findViewById(R.id.reset_button);
        reset_button.setText(reset_button_text);
        reset_button.setTypeface(typeface);
        reset_button.setOnClickListener(this);
        reset_button.setOnTouchListener(this);


        /*admin_button = (Button) findViewById(R.id.admin_button);
        admin_button.setOnClickListener(this);
        admin_button.setOnTouchListener(this);*/


        Load_it();
    }

    /*private void displayInterstitial() {
        if (interstitial.isLoaded()) {
            interstitial.show();
        }
    }*/

    private void Load_it() {

        If_Easy_Solved();
        If_Medium_Solved();

        boolean easy_level = sharedPreferences.getBoolean(IF_EASY_SOLVED, false);
        boolean medium_level = sharedPreferences.getBoolean(IF_MEDIUM_SOLVED, false);

        if (easy_level) {easy.setBackgroundColor(color_of_solved); easy.setOnTouchListener(new View.OnTouchListener() {
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
        });} else {easy.setBackgroundColor(dflt_clr); easy.setOnTouchListener(this);}
        if (medium_level) {medium.setBackgroundColor(color_of_solved); medium.setOnTouchListener(new View.OnTouchListener() {
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
        });} else if (easy_level) {
            medium.setBackgroundColor(dflt_clr); medium.setOnTouchListener(this);
        } else {medium.setBackgroundColor(disabled); medium.setOnTouchListener(new View.OnTouchListener() {
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
        });}
    }



    private void If_Medium_Solved() {
        if (    sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_01_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_02_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_03_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_04_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_05_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_06_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_07_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_08_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_09_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_10_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_11_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_12_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_13_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_14_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_15_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_16_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_17_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_18_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_19_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_20_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_21_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_22_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_23_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_24_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_25_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_26_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_27_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_28_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_29_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_30_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_31_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_32_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_33_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_34_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_35_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_36_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_37_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_38_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_39_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_40_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_41_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_42_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_43_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_44_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_45_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_46_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_47_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_48_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_49_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_MEDIUM_LEVEL_50_SOLVED, false)
                ) {editor.putBoolean(IF_MEDIUM_SOLVED, true); editor.apply();} else {editor.putBoolean(IF_MEDIUM_SOLVED, false).apply();}
    }

    private void If_Easy_Solved() {
        if (    sharedPreferences.getBoolean(IF_EASY_LEVEL_01_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_02_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_03_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_04_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_05_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_06_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_07_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_08_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_09_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_10_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_11_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_12_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_13_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_14_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_15_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_16_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_17_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_18_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_19_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_20_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_21_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_22_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_23_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_24_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_25_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_26_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_27_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_28_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_29_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_30_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_31_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_32_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_33_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_34_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_35_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_36_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_37_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_38_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_39_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_40_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_41_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_42_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_43_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_44_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_45_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_46_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_47_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_48_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_49_SOLVED, false) &&
                sharedPreferences.getBoolean(IF_EASY_LEVEL_50_SOLVED, false)
                ) {editor.putBoolean(IF_EASY_SOLVED, true); editor.apply();} else {editor.putBoolean(IF_EASY_SOLVED, false).apply();}
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back_button:
                BackToMainActivity();
                break;
            case R.id.reset_button:
                Reset_progress();
                break;
            case R.id.easy:
                GoEasy();
                break;
            case R.id.medium:
                GoMedium();
                break;
            case R.id.hard:
                BuyHard();
                break;
            /*case R.id.admin_button:
                Administration();
                break;*/
        }
    }

    private void BuyHard() {
        Typeface main_typeface = Typeface.createFromAsset(getAssets(), "fonts/10160.otf");
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/9752.otf");

        alertDialog = new AlertDialog.Builder(this);

        String title = getResources().getString(R.string.buy);
        String msg = getResources().getString(R.string.buy_hard);
        String cancel = getResources().getString(R.string.cancel);
        String buy = getResources().getString(R.string.buy);

        View custom_dialog = getLayoutInflater().inflate(R.layout.custom_alert_dlg, null);
        final TextView do_not_complete = (TextView) custom_dialog.findViewById(R.id.do_not_complete_text);
        final TextView you_have_not_turns = (TextView) custom_dialog.findViewById(R.id.you_have_not_turns_text);
        final Button button_buy = (Button) custom_dialog.findViewById(R.id.button_again);
        final Button button_cancel = (Button) custom_dialog.findViewById(R.id.button_cancel);

        do_not_complete.setText(title);
        do_not_complete.setTypeface(main_typeface);

        you_have_not_turns.setText(msg);
        you_have_not_turns.setTypeface(typeface);

        button_buy.setText(buy);
        button_buy.setTypeface(typeface);

        button_cancel.setText(cancel);
        button_cancel.setTypeface(typeface);

        button_buy.setOnTouchListener(this);
        button_cancel.setOnTouchListener(this);

        final AlertDialog Dial = alertDialog.create();

        button_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=com.jprod.jerryletehen.switch_it"));
                startActivity(intent);
            }
        });

        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dial.cancel();
            }
        });

        Dial.setView(custom_dialog);
        Dial.setCancelable(false);
        Dial.show();
    }

    /*private void Administration() {
        CheckAdmin();
    }

    private void CheckAdmin() {
        alertDialog = new AlertDialog.Builder(this);
        final EditText password = new EditText(this);
        alertDialog.setView(password);
        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alertDialog.setPositiveButton("Login", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (password.getText().toString().equalsIgnoreCase(my_psw)){
                    dialog.cancel();
                    Intent intent = new Intent(getApplicationContext(), Administration.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fromleft, R.anim.toright);
                } else {
                    dialog.cancel();
                }
            }
        });
        alertDialog.setCancelable(false);
        alertDialog.setTitle("Login");
        alertDialog.show();
    }*/

    private void Reset_progress() {
        Typeface main_typeface = Typeface.createFromAsset(getAssets(), "fonts/10160.otf");
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/9752.otf");

        alertDialog = new AlertDialog.Builder(this);

        String title = getResources().getString(R.string.reset_progress);
        String msg = getResources().getString(R.string.reset_confirmation);
        String cancel = getResources().getString(R.string.cancel);
        String reset = getResources().getString(R.string.reset);

        final View reset_alert_dlg = getLayoutInflater().inflate(R.layout.reset_alert_dlg, null);
        final TextView reset_progress = (TextView) reset_alert_dlg.findViewById(R.id.reset_progress_text);
        final TextView you_have_not_turns = (TextView) reset_alert_dlg.findViewById(R.id.reset_confirmation_text);
        final Button button_reset = (Button) reset_alert_dlg.findViewById(R.id.button_reset);
        final Button button_cancel = (Button) reset_alert_dlg.findViewById(R.id.button_cancel);

        reset_progress.setText(title);
        you_have_not_turns.setTypeface(main_typeface);

        you_have_not_turns.setText(msg);
        you_have_not_turns.setTypeface(typeface);

        button_reset.setText(reset);
        button_reset.setTypeface(typeface);

        button_cancel.setText(cancel);
        button_cancel.setTypeface(typeface);

        button_reset.setOnTouchListener(this);
        button_cancel.setOnTouchListener(this);

        final AlertDialog Dial = alertDialog.create();

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResetTheProgress();
                Dial.cancel();
                Load_it();
                Toast toast = Toast.makeText(FrontActivity.this, R.string.complete, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dial.cancel();
                Load_it();
            }
        });

        Dial.setView(reset_alert_dlg);
        Dial.setCancelable(false);
        Dial.show();
    }

    private void ResetTheProgress() {
        editor.clear().apply();
        Load_it();
    }

    /*private void GoHard() {
        Intent intent = new Intent(getApplicationContext(), GoHard.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }*/

    private void GoMedium() {
        if (            sharedPreferences.getBoolean(IF_EASY_LEVEL_01_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_02_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_03_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_04_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_05_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_06_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_07_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_08_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_09_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_10_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_11_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_12_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_13_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_14_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_15_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_16_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_17_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_18_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_19_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_20_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_21_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_22_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_23_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_24_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_25_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_26_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_27_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_28_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_29_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_30_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_31_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_32_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_33_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_34_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_35_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_36_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_37_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_38_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_39_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_40_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_41_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_42_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_43_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_44_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_45_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_46_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_47_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_48_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_49_SOLVED, false) &&
                        sharedPreferences.getBoolean(IF_EASY_LEVEL_50_SOLVED, false)
                ){

            Intent intent = new Intent(getApplicationContext(), GoMedium.class);
            startActivity(intent);
            overridePendingTransition(R.anim.fromleft, R.anim.toright);
            } else {
            DidntSolvedPrevious();
        }
    }

    private void DidntSolvedPrevious() {
        Toast toast = Toast.makeText(this, R.string.didnt_solved_previous, Toast.LENGTH_LONG);
        toast.show();
    }

    private void GoEasy() {
        Intent intent = new Intent(getApplicationContext(), GoEasy.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
    }

    private void BackToMainActivity() {
        Intent intent = new Intent(getApplicationContext(), Main.class);
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
}
