package com.jprod.jerryletehen.switch_it_free;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Medium_45 extends AppCompatActivity implements View.OnClickListener, Switch.OnCheckedChangeListener, View.OnTouchListener  {

    private InterstitialAd interstitial;

    AlertDialog.Builder alertDialog;
    int times_left;
    TextView left;
    TextView timesPicker;
    String left_text;
    String timesPicker_text;

    boolean if_after_sw1 = false;
    boolean if_after_sw2 = false;
    boolean if_after_sw3 = false;
    boolean if_after_sw4 = false;
    boolean if_after_sw5 = false;
    boolean if_after_sw6 = false;
    boolean if_after_sw7 = false;
    boolean if_after_sw8 = false;
    boolean if_after_sw9 = false;


//    boolean if_after_start = false;

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
    Switch switch5;
    Switch switch6;
    Switch switch7;
    Switch switch8;
    Switch switch9;

    String back_button_text;

    Button back_button;

    int disabled;
    int active;
    int color_of_touch;
    int default_color;
    int dflt_clr;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    final String IF_MEDIUM_LEVEL_45_SOLVED = "if_medium_level_45_solved";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medium_45);

        MobileAds.initialize(this, "ca-app-pub-5134434367178362~8377318136");


        AdRequest adRequest = new AdRequest.Builder().build();
        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId(getString(R.string.admob_interstitial_id));
        interstitial.loadAd(adRequest);
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                if (interstitial.isLoaded()) {interstitial.show();}
            }
        });


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


        left_text = getResources().getString(R.string.left);
        left = (TextView)findViewById(R.id.left_text);
        left.setText(left_text);
        left.setTypeface(typeface);


        times_left = 31;

        timesPicker = (TextView)findViewById(R.id.timesPicker);
        timesPicker_text = Integer.toString(times_left);
        timesPicker.setText(timesPicker_text);
        timesPicker.setTypeface(typeface);




        next_button_text = getResources().getString(R.string.next_button);
        switch_it_text = getResources().getString(R.string.switch_it);
        switch_on = getResources().getString(R.string.on);
        switch_off = getResources().getString(R.string.off);
        level_text = getResources().getString(R.string.text_of_level_45);

        switch1 = (Switch) findViewById(R.id.switch1);
        switch1.setTextOn(switch_on);
        switch1.setTextOff(switch_off);
        /*switch1.setOnCheckedChangeListener(this);
        switch1.setOnTouchListener(this);*/
        switch1.setClickable(false);
        switch1.setBackgroundColor(disabled);

        switch2 = (Switch) findViewById(R.id.switch2);
        switch2.setTextOn(switch_on);
        switch2.setTextOff(switch_off);
        switch2.setOnCheckedChangeListener(this);
        switch2.setOnTouchListener(this);

        switch3 = (Switch) findViewById(R.id.switch3);
        switch3.setTextOn(switch_on);
        switch3.setTextOff(switch_off);
        switch3.setOnCheckedChangeListener(this);
        switch3.setOnTouchListener(this);

        switch4 = (Switch) findViewById(R.id.switch4);
        switch4.setTextOn(switch_on);
        switch4.setTextOff(switch_off);
        switch4.setOnCheckedChangeListener(this);
        switch4.setOnTouchListener(this);

        switch5 = (Switch) findViewById(R.id.switch5);
        switch5.setTextOn(switch_on);
        switch5.setTextOff(switch_off);
        switch5.setOnCheckedChangeListener(this);
        switch5.setOnTouchListener(this);

        switch6 = (Switch) findViewById(R.id.switch6);
        switch6.setTextOn(switch_on);
        switch6.setTextOff(switch_off);
        switch6.setOnCheckedChangeListener(this);
        switch6.setOnTouchListener(this);

        switch7 = (Switch) findViewById(R.id.switch7);
        switch7.setTextOn(switch_on);
        switch7.setTextOff(switch_off);
        switch7.setOnCheckedChangeListener(this);
        switch7.setOnTouchListener(this);

        switch8 = (Switch) findViewById(R.id.switch8);
        switch8.setTextOn(switch_on);
        switch8.setTextOff(switch_off);
        switch8.setOnCheckedChangeListener(this);
        switch8.setOnTouchListener(this);


        switch9 = (Switch) findViewById(R.id.switch9);
        switch9.setTextOn(switch_on);
        switch9.setTextOff(switch_off);
        /*switch9.setOnCheckedChangeListener(this);
        switch9.setOnTouchListener(this);*/
        switch9.setClickable(false);
        switch9.setBackgroundColor(disabled);

        switch_it = (TextView) findViewById(R.id.switch_it);
        switch_it.setText(switch_it_text);
        switch_it.setTypeface(main_typeface);

        text_of_level = (TextView)findViewById(R.id.level_45);
        text_of_level.setText(level_text);
        text_of_level.setTypeface(main_typeface);

//        if_after_start = true;
//        switch1.setChecked(true);
//        switch2.setChecked(true);
//        switch3.setChecked(true);
//        switch4.setChecked(true);
//        switch5.setChecked(true);
//        switch6.setChecked(true);
//        switch7.setChecked(true);
//        switch8.setChecked(true);
//        switch9.setChecked(true);


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
                /*if (if_after_sw2) {
                    if_after_sw2 = true;
                } else if (if_after_sw3) {
                    if_after_sw3 = true;
                } else if (if_after_sw4) {
                    if_after_sw4 = true;
                } else if (if_after_sw5) {
                    if_after_sw5 = true;
                } else if (if_after_sw6) {
                    if_after_sw6 = true;
                } else if (if_after_sw7) {
                    if_after_sw7 = true;
                } else if (if_after_sw8) {
                    if_after_sw8 = true;
                } else if (if_after_sw9) {
                    if_after_sw9 = true;
                } else {
                    if (checkTimes()) {
                        if_after_sw1 = true;
                        switch2.toggle();
                        switch3.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch8.toggle();
                        switch9.toggle();
                    } else {
                        if_after_sw1 = true;
                        switch2.toggle();
                        switch3.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch8.toggle();
                        switch9.toggle();
                        if (check_it_all()) {activate_next_button(true);
                        } else {DoThisAgain();}
                    }
                }*/
                check_it_all();
                break;
            case R.id.switch2:
                if (if_after_sw1) {
                    if_after_sw1 = true;
                } else if (if_after_sw3) {
                    if_after_sw3 = true;
                } else if (if_after_sw4) {
                    if_after_sw4 = true;
                } else if (if_after_sw5) {
                    if_after_sw5 = true;
                } else if (if_after_sw6) {
                    if_after_sw6 = true;
                } else if (if_after_sw7) {
                    if_after_sw7 = true;
                } else if (if_after_sw8) {
                    if_after_sw8 = true;
                } else if (if_after_sw9) {
                    if_after_sw9 = true;
                } else {
                    if (checkTimes()) {
                        if_after_sw2 = true;
                        switch1.toggle();
                        switch3.toggle();
                        switch4.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch9.toggle();
                    } else {
                        if_after_sw2 = true;
                        switch1.toggle();
                        switch3.toggle();
                        switch4.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch9.toggle();
                        if (check_it_all()) {activate_next_button(true);
                        } else {DoThisAgain();}
                    }
                }
                check_it_all();
                break;
            case R.id.switch3:
                if (if_after_sw2) {
                    if_after_sw2 = true;
                } else if (if_after_sw1) {
                    if_after_sw1 = true;
                } else if (if_after_sw4) {
                    if_after_sw4 = true;
                } else if (if_after_sw5) {
                    if_after_sw5 = true;
                } else if (if_after_sw6) {
                    if_after_sw6 = true;
                } else if (if_after_sw7) {
                    if_after_sw7 = true;
                } else if (if_after_sw8) {
                    if_after_sw8 = true;
                } else if (if_after_sw9) {
                    if_after_sw9 = true;
                } else {
                    if (checkTimes()) {
                        if_after_sw3 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch4.toggle();
                        switch7.toggle();
                        switch8.toggle();
                        switch9.toggle();
                    } else {
                        if_after_sw3 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch4.toggle();
                        switch7.toggle();
                        switch8.toggle();
                        switch9.toggle();
                        if (check_it_all()) {activate_next_button(true);
                        } else {DoThisAgain();}
                    }
                }
                check_it_all();
                break;
            case R.id.switch4:
                if (if_after_sw2) {
                    if_after_sw2 = true;
                } else if (if_after_sw3) {
                    if_after_sw3 = true;
                } else if (if_after_sw1) {
                    if_after_sw1 = true;
                } else if (if_after_sw5) {
                    if_after_sw5 = true;
                } else if (if_after_sw6) {
                    if_after_sw6 = true;
                } else if (if_after_sw7) {
                    if_after_sw7 = true;
                } else if (if_after_sw8) {
                    if_after_sw8 = true;
                } else if (if_after_sw9) {
                    if_after_sw9 = true;
                } else {
                    if (checkTimes()) {
                        if_after_sw4 = true;
                        switch1.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch7.toggle();
                        switch8.toggle();
                        switch9.toggle();
                    } else {
                        if_after_sw4 = true;
                        switch1.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch7.toggle();
                        switch8.toggle();
                        switch9.toggle();
                        if (check_it_all()) {activate_next_button(true);
                        } else {DoThisAgain();}
                    }
                }
                check_it_all();
                break;
            case R.id.switch5:
                if (if_after_sw2) {
                    if_after_sw2 = true;
                } else if (if_after_sw3) {
                    if_after_sw3 = true;
                } else if (if_after_sw4) {
                    if_after_sw4 = true;
                } else if (if_after_sw1) {
                    if_after_sw1 = true;
                } else if (if_after_sw6) {
                    if_after_sw6 = true;
                } else if (if_after_sw7) {
                    if_after_sw7 = false;
                } else if (if_after_sw8) {
                    if_after_sw8 = true;
                } else if (if_after_sw9) {
                    if_after_sw9 = true;
                } else {
                    if (checkTimes()) {
                        if_after_sw5 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch4.toggle();
                        switch7.toggle();
                        switch8.toggle();
                        switch9.toggle();
                    } else {
                        if_after_sw5 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch4.toggle();
                        switch7.toggle();
                        switch8.toggle();
                        switch9.toggle();
                        if (check_it_all()) {activate_next_button(true);
                        } else {DoThisAgain();}
                    }
                }
                check_it_all();
                break;
            case R.id.switch6:
                if (if_after_sw2) {
                    if_after_sw2 = false;
                } else if (if_after_sw3) {
                    if_after_sw3 = true;
                } else if (if_after_sw4) {
                    if_after_sw4 = true;
                } else if (if_after_sw5) {
                    if_after_sw5 = true;
                } else if (if_after_sw1) {
                    if_after_sw1 = true;
                } else if (if_after_sw7) {
                    if_after_sw7 = true;
                } else if (if_after_sw8) {
                    if_after_sw8 = false;
                } else if (if_after_sw9) {
                    if_after_sw9 = true;
                } else {
                    if (checkTimes()) {
                        if_after_sw6 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch3.toggle();
                        switch7.toggle();
                        switch8.toggle();
                        switch9.toggle();
                    } else {
                        if_after_sw6 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch3.toggle();
                        switch7.toggle();
                        switch8.toggle();
                        switch9.toggle();
                        if (check_it_all()) {activate_next_button(true);
                        } else {DoThisAgain();}
                    }
                }
                check_it_all();
                break;
            case R.id.switch7:
                if (if_after_sw2) {
                    if_after_sw2 = true;
                } else if (if_after_sw3) {
                    if_after_sw3 = true;
                } else if (if_after_sw4) {
                    if_after_sw4 = true;
                } else if (if_after_sw5) {
                    if_after_sw5 = true;
                } else if (if_after_sw6) {
                    if_after_sw6 = true;
                } else if (if_after_sw1) {
                    if_after_sw1 = true;
                } else if (if_after_sw8) {
                    if_after_sw8 = true;
                } else if (if_after_sw9) {
                    if_after_sw9 = true;
                } else {
                    if (checkTimes()) {
                        if_after_sw7 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch3.toggle();
                        switch4.toggle();
                        switch5.toggle();
                        switch9.toggle();
                    } else {
                        if_after_sw7 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch3.toggle();
                        switch4.toggle();
                        switch5.toggle();
                        switch9.toggle();
                        if (check_it_all()) {activate_next_button(true);
                        } else {DoThisAgain();}
                    }
                }
                check_it_all();
                break;
            case R.id.switch8:
                if (if_after_sw2) {
                    if_after_sw2 = true;
                } else if (if_after_sw3) {
                    if_after_sw3 = false;
                } else if (if_after_sw4) {
                    if_after_sw4 = false;
                } else if (if_after_sw5) {
                    if_after_sw5 = false;
                } else if (if_after_sw6) {
                    if_after_sw6 = false;
                } else if (if_after_sw7) {
                    if_after_sw7 = true;
                } else if (if_after_sw1) {
                    if_after_sw1 = true;
                } else if (if_after_sw9) {
                    if_after_sw9 = true;
                } else {
                    if (checkTimes()) {
                        if_after_sw8 = true;
                        switch1.toggle();
                        switch3.toggle();
                        switch4.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch9.toggle();
                    } else {
                        if_after_sw8 = true;
                        switch1.toggle();
                        switch3.toggle();
                        switch4.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch9.toggle();
                        if (check_it_all()) {activate_next_button(true);
                        } else {DoThisAgain();}
                    }
                }
                check_it_all();
                break;
            case R.id.switch9:
                /*if (if_after_sw2) {
                    if_after_sw2 = false;
                } else if (if_after_sw3) {
                    if_after_sw3 = false;
                } else if (if_after_sw4) {
                    if_after_sw4 = false;
                } else if (if_after_sw5) {
                    if_after_sw5 = false;
                } else if (if_after_sw6) {
                    if_after_sw6 = false;
                } else if (if_after_sw7) {
                    if_after_sw7 = false;
                } else if (if_after_sw8) {
                    if_after_sw8 = false;
                } else if (if_after_sw1) {
                    if_after_sw1 = false;
                } else {
                    if (checkTimes()) {
                        if_after_sw9 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch3.toggle();
                        switch4.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch7.toggle();
                    } else {
                        if_after_sw9 = true;
                        switch1.toggle();
                        switch2.toggle();
                        switch3.toggle();
                        switch4.toggle();
                        switch5.toggle();
                        switch6.toggle();
                        switch7.toggle();
                        if (check_it_all()) {activate_next_button(true);
                        } else {DoThisAgain();}
                    }
                }*/
                check_it_all();
                break;
        }
    }

    private void Save_it() {
        editor.putBoolean(IF_MEDIUM_LEVEL_45_SOLVED, true);
        editor.apply();
    }

    private void activate_next_button(boolean b) {
        if (b){
            next_button.setBackgroundColor(active);
        } else {
            next_button.setBackgroundColor(disabled);
        }
    }

    private boolean check_it_all() {
        boolean is_checked;
        if (switch1.isChecked() && switch2.isChecked() && switch3.isChecked() && switch4.isChecked() && switch5.isChecked() && switch6.isChecked() && switch7.isChecked() && switch8.isChecked() && switch9.isChecked()){
            next_button.setBackgroundColor(active);
            is_checked = true;
            Save_it();
        } else {
            next_button.setBackgroundColor(disabled);
            is_checked = false;
        }
        return is_checked;
    }

    private void DoThisAgain() {
        Typeface main_typeface = Typeface.createFromAsset(getAssets(), "fonts/10160.otf");
        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/9752.otf");

        alertDialog = new AlertDialog.Builder(this);

        String title = getResources().getString(R.string.do_not_complete);
        String msg = getResources().getString(R.string.you_have_not_turns);
        String cancel = getResources().getString(R.string.cancel);
        String again = getResources().getString(R.string.again);

        View custom_dialog = getLayoutInflater().inflate(R.layout.custom_alert_dlg, null);
        final TextView do_not_complete = (TextView) custom_dialog.findViewById(R.id.do_not_complete_text);
        final TextView you_have_not_turns = (TextView) custom_dialog.findViewById(R.id.you_have_not_turns_text);
        final Button button_again = (Button) custom_dialog.findViewById(R.id.button_again);
        final Button button_cancel = (Button) custom_dialog.findViewById(R.id.button_cancel);

        do_not_complete.setText(title);
        do_not_complete.setTypeface(main_typeface);

        you_have_not_turns.setText(msg);
        you_have_not_turns.setTypeface(typeface);

        button_again.setText(again);
        button_again.setTypeface(typeface);

        button_cancel.setText(cancel);
        button_cancel.setTypeface(typeface);

        button_again.setOnTouchListener(this);
        button_cancel.setOnTouchListener(this);

        button_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Again();
            }
        });

        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToPreviousActivity();
            }
        });
        alertDialog.setView(custom_dialog);
        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    private void Again() {
        Intent intent = new Intent(getApplicationContext(), this.getClass());
        startActivity(intent);
        overridePendingTransition(R.anim.fromup, R.anim.todown);
    }

    private boolean checkTimes() {
        boolean if_times_not_zero;
        --times_left;
        timesPicker_text = Integer.toString(times_left);
        timesPicker.setText(timesPicker_text);
        if (times_left == 0) {
            if_times_not_zero = false;
        } else {
            if_times_not_zero = true;
        }
        if (times_left < 0) {
            DoThisAgain();
        }
        return if_times_not_zero;
    }


    private void check_it(){
        if(switch1.isChecked() && switch2.isChecked() && switch3.isChecked() && switch4.isChecked() && switch5.isChecked() && switch6.isChecked() && switch7.isChecked() && switch8.isChecked() && switch9.isChecked()){
            Toast toast = Toast.makeText(this, "Complete", Toast.LENGTH_SHORT);
            toast.show();
            GoToNextActivity();
        } else {
            Toast toast = Toast.makeText(this, "Do not complete", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    private void GoToNextActivity() {
        Intent intent = new Intent(getApplicationContext(), Medium_46.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromleft, R.anim.toright);
        /*Intent intent = new Intent(getApplicationContext(), Medium_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromright, R.anim.toleft);*/
    }

    private void BackToPreviousActivity() {
        Intent intent = new Intent(getApplicationContext(), Medium_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromright, R.anim.toleft);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()){
            /*case R.id.switch1:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch2.setBackgroundColor(color_of_touch);
                        switch3.setBackgroundColor(color_of_touch);
                        switch5.setBackgroundColor(color_of_touch);
                        switch6.setBackgroundColor(color_of_touch);
                        switch8.setBackgroundColor(color_of_touch);
                        switch9.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch2.setBackgroundColor(default_color);
                        switch3.setBackgroundColor(default_color);
                        switch5.setBackgroundColor(default_color);
                        switch6.setBackgroundColor(default_color);
                        switch8.setBackgroundColor(default_color);
                        switch9.setBackgroundColor(default_color);
                        break;
                }
                break;*/
            case R.id.switch2:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch3.setBackgroundColor(color_of_touch);
                        switch4.setBackgroundColor(color_of_touch);
                        switch5.setBackgroundColor(color_of_touch);
                        switch6.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch3.setBackgroundColor(default_color);
                        switch4.setBackgroundColor(default_color);
                        switch5.setBackgroundColor(default_color);
                        switch6.setBackgroundColor(default_color);
                        break;
                }
                break;
            case R.id.switch3:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch2.setBackgroundColor(color_of_touch);
                        switch4.setBackgroundColor(color_of_touch);
                        switch7.setBackgroundColor(color_of_touch);
                        switch8.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch2.setBackgroundColor(default_color);
                        switch4.setBackgroundColor(default_color);
                        switch7.setBackgroundColor(default_color);
                        switch8.setBackgroundColor(default_color);
                        break;
                }
                break;
            case R.id.switch4:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch5.setBackgroundColor(color_of_touch);
                        switch6.setBackgroundColor(color_of_touch);
                        switch7.setBackgroundColor(color_of_touch);
                        switch8.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch5.setBackgroundColor(default_color);
                        switch6.setBackgroundColor(default_color);
                        switch7.setBackgroundColor(default_color);
                        switch8.setBackgroundColor(default_color);
                        break;
                }
                break;
            case R.id.switch5:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch2.setBackgroundColor(color_of_touch);
                        switch4.setBackgroundColor(color_of_touch);
                        switch7.setBackgroundColor(color_of_touch);
                        switch8.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch2.setBackgroundColor(default_color);
                        switch4.setBackgroundColor(default_color);
                        switch7.setBackgroundColor(default_color);
                        switch8.setBackgroundColor(default_color);
                        break;
                }
                break;
            case R.id.switch6:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch2.setBackgroundColor(color_of_touch);
                        switch3.setBackgroundColor(color_of_touch);
                        switch7.setBackgroundColor(color_of_touch);
                        switch8.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch2.setBackgroundColor(default_color);
                        switch3.setBackgroundColor(default_color);
                        switch7.setBackgroundColor(default_color);
                        switch8.setBackgroundColor(default_color);
                        break;
                }
                break;
            case R.id.switch7:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch2.setBackgroundColor(color_of_touch);
                        switch3.setBackgroundColor(color_of_touch);
                        switch4.setBackgroundColor(color_of_touch);
                        switch5.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch2.setBackgroundColor(default_color);
                        switch3.setBackgroundColor(default_color);
                        switch4.setBackgroundColor(default_color);
                        switch5.setBackgroundColor(default_color);
                        break;
                }
                break;
            case R.id.switch8:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch3.setBackgroundColor(color_of_touch);
                        switch4.setBackgroundColor(color_of_touch);
                        switch5.setBackgroundColor(color_of_touch);
                        switch6.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch3.setBackgroundColor(default_color);
                        switch4.setBackgroundColor(default_color);
                        switch5.setBackgroundColor(default_color);
                        switch6.setBackgroundColor(default_color);
                        break;
                }
                break;
            /*case R.id.switch9:
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        switch1.setBackgroundColor(color_of_touch);
                        switch2.setBackgroundColor(color_of_touch);
                        switch3.setBackgroundColor(color_of_touch);
                        switch4.setBackgroundColor(color_of_touch);
                        switch5.setBackgroundColor(color_of_touch);
                        switch6.setBackgroundColor(color_of_touch);
                        switch7.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        switch1.setBackgroundColor(default_color);
                        switch2.setBackgroundColor(default_color);
                        switch3.setBackgroundColor(default_color);
                        switch4.setBackgroundColor(default_color);
                        switch5.setBackgroundColor(default_color);
                        switch6.setBackgroundColor(default_color);
                        switch7.setBackgroundColor(default_color);
                        break;
                }
                break;*/
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
            case R.id.button_again:
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(dflt_clr);
                        break;
                }
                break;
            case R.id.button_cancel:
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        v.setBackgroundColor(color_of_touch);
                        break;
                    case MotionEvent.ACTION_UP:
                        v.setBackgroundColor(dflt_clr);
                        break;
                }
                break;
        }
        return false;
    }

    private boolean just_check() {
        boolean is_true;
        if (switch1.isChecked() && switch2.isChecked() && switch3.isChecked() && switch4.isChecked() && switch5.isChecked() && switch6.isChecked() && switch7.isChecked() && switch8.isChecked() && switch9.isChecked()) {
            is_true = true;
        } else {
            is_true = false;
        }
        return is_true;
    }
}
