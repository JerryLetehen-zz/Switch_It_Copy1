package com.jprod.jerryletehen.switch_it_free;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Administration extends AppCompatActivity implements View.OnClickListener{

    AlertDialog.Builder alertDialog;


    Button solve_easy;
    Button solve_medium;
    Button solve_hard;
    Button solve;
    Button unsolve_easy;
    Button unsolve_medium;
    Button unsolve_hard;
    Button unsolve;
    Button back_button;

    Button solve_01_easy;
    Button solve_02_easy;
    Button solve_03_easy;
    Button solve_04_easy;
    Button solve_05_easy;
    Button solve_06_easy;
    Button solve_07_easy;
    Button solve_08_easy;

    Button unsolve_01_easy;
    Button unsolve_02_easy;
    Button unsolve_03_easy;
    Button unsolve_04_easy;
    Button unsolve_05_easy;
    Button unsolve_06_easy;
    Button unsolve_07_easy;
    Button unsolve_08_easy;

    Button solve_01_medium;
    Button solve_02_medium;
    Button solve_03_medium;
    Button solve_04_medium;
    Button solve_05_medium;
    Button solve_06_medium;
    Button solve_07_medium;
    Button solve_08_medium;


    Button unsolve_01_medium;
    Button unsolve_02_medium;
    Button unsolve_03_medium;
    Button unsolve_04_medium;
    Button unsolve_05_medium;
    Button unsolve_06_medium;
    Button unsolve_07_medium;
    Button unsolve_08_medium;






    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    final String IF_EASY_SOLVED = "if_the_easy_level_solved";
    final String IF_MEDIUM_SOLVED = "if_the_medium_level_solved";
    final String IF_HARD_SOLVED = "if_the_hard_level_solved";

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

    final String IF_HARD_LEVEL_01_SOLVED = "if_hard_level_01_solved";
    final String IF_HARD_LEVEL_02_SOLVED = "if_hard_level_02_solved";
    final String IF_HARD_LEVEL_03_SOLVED = "if_hard_level_03_solved";
    final String IF_HARD_LEVEL_04_SOLVED = "if_hard_level_04_solved";
    final String IF_HARD_LEVEL_05_SOLVED = "if_hard_level_05_solved";
    final String IF_HARD_LEVEL_06_SOLVED = "if_hard_level_06_solved";
    final String IF_HARD_LEVEL_07_SOLVED = "if_hard_level_07_solved";
    final String IF_HARD_LEVEL_08_SOLVED = "if_hard_level_08_solved";
    final String IF_HARD_LEVEL_09_SOLVED = "if_hard_level_09_solved";
    final String IF_HARD_LEVEL_10_SOLVED = "if_hard_level_10_solved";
    final String IF_HARD_LEVEL_11_SOLVED = "if_hard_level_11_solved";
    final String IF_HARD_LEVEL_12_SOLVED = "if_hard_level_12_solved";
    final String IF_HARD_LEVEL_13_SOLVED = "if_hard_level_13_solved";
    final String IF_HARD_LEVEL_14_SOLVED = "if_hard_level_14_solved";
    final String IF_HARD_LEVEL_15_SOLVED = "if_hard_level_15_solved";
    final String IF_HARD_LEVEL_16_SOLVED = "if_hard_level_16_solved";
    final String IF_HARD_LEVEL_17_SOLVED = "if_hard_level_17_solved";
    final String IF_HARD_LEVEL_18_SOLVED = "if_hard_level_18_solved";
    final String IF_HARD_LEVEL_19_SOLVED = "if_hard_level_19_solved";
    final String IF_HARD_LEVEL_20_SOLVED = "if_hard_level_20_solved";
    final String IF_HARD_LEVEL_21_SOLVED = "if_hard_level_21_solved";
    final String IF_HARD_LEVEL_22_SOLVED = "if_hard_level_22_solved";
    final String IF_HARD_LEVEL_23_SOLVED = "if_hard_level_23_solved";
    final String IF_HARD_LEVEL_24_SOLVED = "if_hard_level_24_solved";
    final String IF_HARD_LEVEL_25_SOLVED = "if_hard_level_25_solved";
    final String IF_HARD_LEVEL_26_SOLVED = "if_hard_level_26_solved";
    final String IF_HARD_LEVEL_27_SOLVED = "if_hard_level_27_solved";
    final String IF_HARD_LEVEL_28_SOLVED = "if_hard_level_28_solved";
    final String IF_HARD_LEVEL_29_SOLVED = "if_hard_level_29_solved";
    final String IF_HARD_LEVEL_30_SOLVED = "if_hard_level_30_solved";
    final String IF_HARD_LEVEL_31_SOLVED = "if_hard_level_31_solved";
    final String IF_HARD_LEVEL_32_SOLVED = "if_hard_level_32_solved";
    final String IF_HARD_LEVEL_33_SOLVED = "if_hard_level_33_solved";
    final String IF_HARD_LEVEL_34_SOLVED = "if_hard_level_34_solved";
    final String IF_HARD_LEVEL_35_SOLVED = "if_hard_level_35_solved";
    final String IF_HARD_LEVEL_36_SOLVED = "if_hard_level_36_solved";
    final String IF_HARD_LEVEL_37_SOLVED = "if_hard_level_37_solved";
    final String IF_HARD_LEVEL_38_SOLVED = "if_hard_level_38_solved";
    final String IF_HARD_LEVEL_39_SOLVED = "if_hard_level_39_solved";
    final String IF_HARD_LEVEL_40_SOLVED = "if_hard_level_40_solved";
    final String IF_HARD_LEVEL_41_SOLVED = "if_hard_level_41_solved";
    final String IF_HARD_LEVEL_42_SOLVED = "if_hard_level_42_solved";
    final String IF_HARD_LEVEL_43_SOLVED = "if_hard_level_43_solved";
    final String IF_HARD_LEVEL_44_SOLVED = "if_hard_level_44_solved";
    final String IF_HARD_LEVEL_45_SOLVED = "if_hard_level_45_solved";
    final String IF_HARD_LEVEL_46_SOLVED = "if_hard_level_46_solved";
    final String IF_HARD_LEVEL_47_SOLVED = "if_hard_level_47_solved";
    final String IF_HARD_LEVEL_48_SOLVED = "if_hard_level_48_solved";
    final String IF_HARD_LEVEL_49_SOLVED = "if_hard_level_49_solved";
    final String IF_HARD_LEVEL_50_SOLVED = "if_hard_level_50_solved";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.administration);

//        Check_admin();

        String DEFAULT_SP_KEY = "Save_of_solved_levels";
        sharedPreferences = getSharedPreferences(DEFAULT_SP_KEY, Context.MODE_PRIVATE);
        editor = getSharedPreferences(DEFAULT_SP_KEY, Context.MODE_PRIVATE).edit();

        solve_easy = (Button) findViewById(R.id.solve_easy);
        solve_easy.setOnClickListener(this);

        solve_medium = (Button) findViewById(R.id.solve_medium);
        solve_medium.setOnClickListener(this);

        solve_hard = (Button) findViewById(R.id.solve_hard);
        solve_hard.setOnClickListener(this);

        solve = (Button) findViewById(R.id.solve);
        solve.setOnClickListener(this);

        unsolve_easy = (Button) findViewById(R.id.unsolve_easy);
        unsolve_easy.setOnClickListener(this);

        unsolve_medium = (Button) findViewById(R.id.unsolve_medium);
        unsolve_medium.setOnClickListener(this);

        unsolve_hard = (Button) findViewById(R.id.unsolve_hard);
        unsolve_hard.setOnClickListener(this);

        unsolve = (Button) findViewById(R.id.unsolve);
        unsolve.setOnClickListener(this);

        back_button = (Button) findViewById(R.id.back_button);
        back_button.setOnClickListener(this);

        solve_01_easy = (Button) findViewById(R.id.solve_1_easy);
        solve_02_easy = (Button) findViewById(R.id.solve_2_easy);
        solve_03_easy = (Button) findViewById(R.id.solve_3_easy);
        solve_04_easy = (Button) findViewById(R.id.solve_4_easy);
        solve_05_easy = (Button) findViewById(R.id.solve_5_easy);
        solve_06_easy = (Button) findViewById(R.id.solve_6_easy);
        solve_07_easy = (Button) findViewById(R.id.solve_7_easy);
        solve_08_easy = (Button) findViewById(R.id.solve_8_easy);


        solve_01_easy.setOnClickListener(this);
        solve_02_easy.setOnClickListener(this);
        solve_03_easy.setOnClickListener(this);
        solve_04_easy.setOnClickListener(this);
        solve_05_easy.setOnClickListener(this);
        solve_06_easy.setOnClickListener(this);
        solve_07_easy.setOnClickListener(this);
        solve_08_easy.setOnClickListener(this);

        unsolve_01_easy = (Button) findViewById(R.id.unsolve_1_easy);
        unsolve_02_easy = (Button) findViewById(R.id.unsolve_2_easy);
        unsolve_03_easy = (Button) findViewById(R.id.unsolve_3_easy);
        unsolve_04_easy = (Button) findViewById(R.id.unsolve_4_easy);
        unsolve_05_easy = (Button) findViewById(R.id.unsolve_5_easy);
        unsolve_06_easy = (Button) findViewById(R.id.unsolve_6_easy);
        unsolve_07_easy = (Button) findViewById(R.id.unsolve_7_easy);
        unsolve_08_easy = (Button) findViewById(R.id.unsolve_8_easy);


        unsolve_01_easy.setOnClickListener(this);
        unsolve_02_easy.setOnClickListener(this);
        unsolve_03_easy.setOnClickListener(this);
        unsolve_04_easy.setOnClickListener(this);
        unsolve_05_easy.setOnClickListener(this);
        unsolve_06_easy.setOnClickListener(this);
        unsolve_07_easy.setOnClickListener(this);
        unsolve_08_easy.setOnClickListener(this);


        solve_01_medium = (Button) findViewById(R.id.solve_1_medium);
        solve_02_medium = (Button) findViewById(R.id.solve_2_medium);
        solve_03_medium = (Button) findViewById(R.id.solve_3_medium);
        solve_04_medium = (Button) findViewById(R.id.solve_4_medium);
        solve_05_medium = (Button) findViewById(R.id.solve_5_medium);
        solve_06_medium = (Button) findViewById(R.id.solve_6_medium);
        solve_07_medium = (Button) findViewById(R.id.solve_7_medium);
        solve_08_medium = (Button) findViewById(R.id.solve_8_medium);


        solve_01_medium.setOnClickListener(this);
        solve_02_medium.setOnClickListener(this);
        solve_03_medium.setOnClickListener(this);
        solve_04_medium.setOnClickListener(this);
        solve_05_medium.setOnClickListener(this);
        solve_06_medium.setOnClickListener(this);
        solve_07_medium.setOnClickListener(this);
        solve_08_medium.setOnClickListener(this);

        unsolve_01_medium = (Button) findViewById(R.id.unsolve_1_medium);
        unsolve_02_medium = (Button) findViewById(R.id.unsolve_2_medium);
        unsolve_03_medium = (Button) findViewById(R.id.unsolve_3_medium);
        unsolve_04_medium = (Button) findViewById(R.id.unsolve_4_medium);
        unsolve_05_medium = (Button) findViewById(R.id.unsolve_5_medium);
        unsolve_06_medium = (Button) findViewById(R.id.unsolve_6_medium);
        unsolve_07_medium = (Button) findViewById(R.id.unsolve_7_medium);
        unsolve_08_medium = (Button) findViewById(R.id.unsolve_8_medium);


        unsolve_01_medium.setOnClickListener(this);
        unsolve_02_medium.setOnClickListener(this);
        unsolve_03_medium.setOnClickListener(this);
        unsolve_04_medium.setOnClickListener(this);
        unsolve_05_medium.setOnClickListener(this);
        unsolve_06_medium.setOnClickListener(this);
        unsolve_07_medium.setOnClickListener(this);
        unsolve_08_medium.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {
        Toast toast;
        switch (v.getId()) {
            case R.id.solve_easy:
                SolveEasy();
                toast = Toast.makeText(this, "Easy solved", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.solve_medium:
                SolveMedium();
                toast = Toast.makeText(this, "Medium solved", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.solve_hard:
                SolveHard();
                toast = Toast.makeText(this, "Hard solved", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.solve:
                Solve();
                toast = Toast.makeText(this, "All solved", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.unsolve_easy:
                UnsolveEasy();
                toast = Toast.makeText(this, "Easy unsolved", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.unsolve_medium:
                UnsolveMedium();
                toast = Toast.makeText(this, "Medium unsolved", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.unsolve_hard:
                UnsolveHard();
                toast = Toast.makeText(this, "Hard unsolved", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.unsolve:
                Unsolve();
                toast = Toast.makeText(this, "All unsolved", Toast.LENGTH_LONG);
                toast.show();
                break;
            case R.id.back_button:
                BackToMainActivity();
                break;
            case R.id.solve_1_easy:
                EditSaveLevels("easy", "solve", 1);
                break;
            case R.id.solve_2_easy:
                EditSaveLevels("easy", "solve", 2);
                break;
            case R.id.solve_3_easy:
                EditSaveLevels("easy", "solve", 3);
                break;
            case R.id.solve_4_easy:
                EditSaveLevels("easy", "solve", 4);
                break;
            case R.id.solve_5_easy:
                EditSaveLevels("easy", "solve", 5);
                break;
            case R.id.solve_6_easy:
                EditSaveLevels("easy", "solve", 6);
                break;
            case R.id.solve_7_easy:
                EditSaveLevels("easy", "solve", 7);
                break;
            case R.id.solve_8_easy:
                EditSaveLevels("easy", "solve", 8);
                break;
            case R.id.unsolve_1_easy:
                EditSaveLevels("easy", "unsolve", 1);
                break;
            case R.id.unsolve_2_easy:
                EditSaveLevels("easy", "unsolve", 2);
                break;
            case R.id.unsolve_3_easy:
                EditSaveLevels("easy", "unsolve", 3);
                break;
            case R.id.unsolve_4_easy:
                EditSaveLevels("easy", "unsolve", 4);
                break;
            case R.id.unsolve_5_easy:
                EditSaveLevels("easy", "unsolve", 5);
                break;
            case R.id.unsolve_6_easy:
                EditSaveLevels("easy", "unsolve", 6);
                break;
            case R.id.unsolve_7_easy:
                EditSaveLevels("easy", "unsolve", 7);
                break;
            case R.id.unsolve_8_easy:
                EditSaveLevels("easy", "unsolve", 8);
                break;
            case R.id.solve_1_medium:
                EditSaveLevels("medium", "solve", 1);
                break;
            case R.id.solve_2_medium:
                EditSaveLevels("medium", "solve", 2);
                break;
            case R.id.solve_3_medium:
                EditSaveLevels("medium", "solve", 3);
                break;
            case R.id.solve_4_medium:
                EditSaveLevels("medium", "solve", 4);
                break;
            case R.id.solve_5_medium:
                EditSaveLevels("medium", "solve", 5);
                break;
            case R.id.solve_6_medium:
                EditSaveLevels("medium", "solve", 6);
                break;
            case R.id.solve_7_medium:
                EditSaveLevels("medium", "solve", 7);
                break;
            case R.id.solve_8_medium:
                EditSaveLevels("medium", "solve", 8);
                break;
            case R.id.unsolve_1_medium:
                EditSaveLevels("medium", "unsolve", 1);
                break;
            case R.id.unsolve_2_medium:
                EditSaveLevels("medium", "unsolve", 2);
                break;
            case R.id.unsolve_3_medium:
                EditSaveLevels("medium", "unsolve", 3);
                break;
            case R.id.unsolve_4_medium:
                EditSaveLevels("medium", "unsolve", 4);
                break;
            case R.id.unsolve_5_medium:
                EditSaveLevels("medium", "unsolve", 5);
                break;
            case R.id.unsolve_6_medium:
                EditSaveLevels("medium", "unsolve", 6);
                break;
            case R.id.unsolve_7_medium:
                EditSaveLevels("medium", "unsolve", 7);
                break;
            case R.id.unsolve_8_medium:
                EditSaveLevels("medium", "unsolve", 8);
                break;
        }
    }

    private void EditSaveLevels(String difficulty, String solve_or_unsolve, int i) {
        switch (difficulty) {
            case "easy":
                switch (solve_or_unsolve){
                    case "solve":
                        switch (i){
                            case 1:
                                editor.putBoolean(IF_EASY_LEVEL_28_SOLVED, true);
                                editor.apply();
                                Toast_it("easy 28 solved");
                                break;
                            case 2:
                                editor.putBoolean(IF_EASY_LEVEL_02_SOLVED, true);
                                editor.apply();
                                Toast_it("easy 2 solved");
                                break;
                            case 3:
                                editor.putBoolean(IF_EASY_LEVEL_03_SOLVED, true);
                                editor.apply();
                                Toast_it("easy 3 solved");
                                break;
                            case 4:
                                editor.putBoolean(IF_EASY_LEVEL_04_SOLVED, true);
                                editor.apply();
                                Toast_it("easy 4 solved");
                                break;
                            case 5:
                                editor.putBoolean(IF_EASY_LEVEL_05_SOLVED, true);
                                editor.apply();
                                Toast_it("easy 5 solved");
                                break;
                            case 6:
                                editor.putBoolean(IF_EASY_LEVEL_06_SOLVED, true);
                                editor.apply();
                                Toast_it("easy 6 solved");
                                break;
                            case 7:
                                editor.putBoolean(IF_EASY_LEVEL_07_SOLVED, true);
                                editor.apply();
                                Toast_it("easy 7 solved");
                                break;
                            case 8:
                                editor.putBoolean(IF_EASY_LEVEL_08_SOLVED, true);
                                editor.apply();
                                Toast_it("easy 8 solved");
                                break;
                        }
                        break;
                    case "unsolve":
                        switch (i) {
                            case 1:
                                editor.putBoolean(IF_EASY_LEVEL_28_SOLVED, false);
                                editor.apply();
                                Toast_it("easy 28 unsolved");
                                break;
                            case 2:
                                editor.putBoolean(IF_EASY_LEVEL_02_SOLVED, false);
                                editor.apply();
                                Toast_it("easy 2 unsolved");
                                break;
                            case 3:
                                editor.putBoolean(IF_EASY_LEVEL_03_SOLVED, false);
                                editor.apply();
                                Toast_it("easy 3 unsolved");
                                break;
                            case 4:
                                editor.putBoolean(IF_EASY_LEVEL_04_SOLVED, false);
                                editor.apply();
                                Toast_it("easy 4 unsolved");
                                break;
                            case 5:
                                editor.putBoolean(IF_EASY_LEVEL_05_SOLVED, false);
                                editor.apply();
                                Toast_it("easy 5 unsolved");
                                break;
                            case 6:
                                editor.putBoolean(IF_EASY_LEVEL_06_SOLVED, false);
                                editor.apply();
                                Toast_it("easy 6 unsolved");
                                break;
                            case 7:
                                editor.putBoolean(IF_EASY_LEVEL_07_SOLVED, false);
                                editor.apply();
                                Toast_it("easy 7 unsolved");
                                break;
                            case 8:
                                editor.putBoolean(IF_EASY_LEVEL_08_SOLVED, false);
                                editor.apply();
                                Toast_it("easy 8 unsolved");
                                break;
                        }
                        break;
                }
                break;
            case "medium":
                switch (solve_or_unsolve){
                    case "solve":
                        switch (i){
                            case 1:
                                editor.putBoolean(IF_MEDIUM_LEVEL_28_SOLVED, true);
                                editor.apply();
                                Toast_it("medium 28 solved");
                                break;
                            case 2:
                                editor.putBoolean(IF_MEDIUM_LEVEL_29_SOLVED, true);
                                editor.apply();
                                Toast_it("medium 29 solved");
                                break;
                            case 3:
                                editor.putBoolean(IF_MEDIUM_LEVEL_30_SOLVED, true);
                                editor.apply();
                                Toast_it("medium 30 solved");
                                break;
                            case 4:
                                editor.putBoolean(IF_MEDIUM_LEVEL_31_SOLVED, true);
                                editor.apply();
                                Toast_it("medium 31 solved");
                                break;
                            case 5:
                                editor.putBoolean(IF_MEDIUM_LEVEL_32_SOLVED, true);
                                editor.apply();
                                Toast_it("medium 32 solved");
                                break;
                            case 6:
                                editor.putBoolean(IF_MEDIUM_LEVEL_33_SOLVED, true);
                                editor.apply();
                                Toast_it("medium 33 solved");
                                break;
                            case 7:
                                editor.putBoolean(IF_MEDIUM_LEVEL_34_SOLVED, true);
                                editor.apply();
                                Toast_it("medium 34 solved");
                                break;
                            case 8:
                                editor.putBoolean(IF_MEDIUM_LEVEL_35_SOLVED, true);
                                editor.apply();
                                Toast_it("medium 35 solved");
                                break;
                        }
                        break;
                    case "unsolve":
                        switch (i) {
                            case 1:
                                editor.putBoolean(IF_MEDIUM_LEVEL_28_SOLVED, false);
                                editor.apply();
                                Toast_it("medium 28 unsolved");
                                break;
                            case 2:
                                editor.putBoolean(IF_MEDIUM_LEVEL_29_SOLVED, false);
                                editor.apply();
                                Toast_it("medium 29 unsolved");
                                break;
                            case 3:
                                editor.putBoolean(IF_MEDIUM_LEVEL_30_SOLVED, false);
                                editor.apply();
                                Toast_it("medium 30 unsolved");
                                break;
                            case 4:
                                editor.putBoolean(IF_MEDIUM_LEVEL_31_SOLVED, false);
                                editor.apply();
                                Toast_it("medium 31 unsolved");
                                break;
                            case 5:
                                editor.putBoolean(IF_MEDIUM_LEVEL_32_SOLVED, false);
                                editor.apply();
                                Toast_it("medium 32 unsolved");
                                break;
                            case 6:
                                editor.putBoolean(IF_MEDIUM_LEVEL_33_SOLVED, false);
                                editor.apply();
                                Toast_it("medium 33 unsolved");
                                break;
                            case 7:
                                editor.putBoolean(IF_MEDIUM_LEVEL_34_SOLVED, false);
                                editor.apply();
                                Toast_it("medium 34 unsolved");
                                break;
                            case 8:
                                editor.putBoolean(IF_MEDIUM_LEVEL_35_SOLVED, false);
                                editor.apply();
                                Toast_it("medium 35 unsolved");
                                break;
                        }
                        break;
                }
                break;
        }
    }

    private void Toast_it(String s) {
        Toast toast = Toast.makeText(this, s, Toast.LENGTH_LONG);
        toast.show();
    }

    private void Unsolve() {
        UnsolveEasy();
        UnsolveMedium();
        UnsolveHard();
        Toast toast = Toast.makeText(this, "All unsolved", Toast.LENGTH_LONG);
        toast.show();
    }

    private void UnsolveHard() {
        editor.putBoolean(IF_HARD_LEVEL_01_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_02_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_03_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_04_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_05_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_06_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_07_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_08_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_09_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_10_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_11_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_12_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_13_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_14_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_15_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_16_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_17_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_18_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_19_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_20_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_21_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_22_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_23_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_24_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_25_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_26_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_27_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_28_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_29_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_30_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_31_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_32_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_33_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_34_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_35_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_36_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_37_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_38_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_39_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_40_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_41_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_42_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_43_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_44_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_45_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_46_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_47_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_48_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_49_SOLVED, false);
        editor.putBoolean(IF_HARD_LEVEL_50_SOLVED, false);
        editor.apply();
    }

    private void UnsolveMedium() {
        editor.putBoolean(IF_MEDIUM_LEVEL_01_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_02_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_03_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_04_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_05_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_06_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_07_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_08_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_09_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_10_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_11_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_12_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_13_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_14_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_15_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_16_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_17_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_18_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_19_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_20_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_21_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_22_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_23_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_24_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_25_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_26_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_27_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_28_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_29_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_30_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_31_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_32_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_33_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_34_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_35_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_36_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_37_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_38_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_39_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_40_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_41_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_42_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_43_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_44_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_45_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_46_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_47_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_48_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_49_SOLVED, false);
        editor.putBoolean(IF_MEDIUM_LEVEL_50_SOLVED, false);
        editor.apply();
    }

    private void Solve() {
        SolveEasy();
        SolveMedium();
        SolveHard();
    }

    private void SolveHard() {
        editor.putBoolean(IF_HARD_LEVEL_01_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_02_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_03_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_04_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_05_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_06_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_07_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_08_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_09_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_10_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_11_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_12_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_13_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_14_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_15_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_16_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_17_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_18_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_19_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_20_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_21_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_22_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_23_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_24_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_25_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_26_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_27_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_28_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_29_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_30_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_31_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_32_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_33_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_34_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_35_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_36_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_37_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_38_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_39_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_40_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_41_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_42_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_43_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_44_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_45_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_46_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_47_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_48_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_49_SOLVED, true);
        editor.putBoolean(IF_HARD_LEVEL_50_SOLVED, true);
        editor.apply();
    }

    private void SolveMedium() {
        editor.putBoolean(IF_MEDIUM_LEVEL_01_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_02_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_03_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_04_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_05_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_06_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_07_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_08_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_09_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_10_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_11_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_12_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_13_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_14_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_15_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_16_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_17_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_18_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_19_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_20_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_21_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_22_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_23_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_24_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_25_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_26_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_27_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_28_SOLVED, true);
        /*editor.putBoolean(IF_MEDIUM_LEVEL_29_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_30_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_31_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_32_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_33_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_34_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_35_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_36_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_37_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_38_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_39_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_40_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_41_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_42_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_43_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_44_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_45_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_46_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_47_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_48_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_49_SOLVED, true);
        editor.putBoolean(IF_MEDIUM_LEVEL_50_SOLVED, true);*/
        editor.apply();
    }

    private void UnsolveEasy() {
        editor.putBoolean(IF_EASY_LEVEL_01_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_02_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_03_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_04_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_05_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_06_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_07_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_08_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_09_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_10_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_11_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_12_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_13_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_14_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_15_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_16_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_17_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_18_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_19_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_20_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_21_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_22_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_23_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_24_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_25_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_26_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_27_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_28_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_29_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_30_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_31_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_32_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_33_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_34_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_35_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_36_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_37_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_38_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_39_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_40_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_41_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_42_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_43_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_44_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_45_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_46_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_47_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_48_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_49_SOLVED, false);
        editor.putBoolean(IF_EASY_LEVEL_50_SOLVED, false);
        editor.apply();
    }

    private void SolveEasy() {
                editor.putBoolean(IF_EASY_LEVEL_01_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_02_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_03_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_04_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_05_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_06_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_07_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_08_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_09_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_10_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_11_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_12_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_13_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_14_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_15_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_16_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_17_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_18_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_19_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_20_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_21_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_22_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_23_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_24_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_25_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_26_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_27_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_28_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_29_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_30_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_31_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_32_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_33_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_34_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_35_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_36_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_37_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_38_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_39_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_40_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_41_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_42_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_43_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_44_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_45_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_46_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_47_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_48_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_49_SOLVED, true);
                editor.putBoolean(IF_EASY_LEVEL_50_SOLVED, true);
                editor.apply();
    }

    private void BackToMainActivity() {
        Intent intent = new Intent(getApplicationContext(), FrontActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.fromright, R.anim.toleft);
    }
}
