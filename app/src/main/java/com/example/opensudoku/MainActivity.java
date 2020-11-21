package com.example.opensudoku;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button_1, button_2, button_3, button_4, button_5, button_6,
    button_7, button_8, button_9, button_10, button_11, button_12, button_13,
    button_14, button_15, button_16, button_17, button_18, button_19, button_20,
    button_21, button_22, button_23, button_24, button_25, button_26, button_27,
    button_28, button_29, button_30, button_31, button_32, button_33, button_34,
    button_35, button_36, button_37, button_38, button_39, button_40, button_41,
    button_42, button_43, button_44, button_45, button_46, button_47, button_48,
    button_49, button_50, button_51, button_52, button_53, button_54, button_55,
    button_56, button_57, button_58, button_59, button_60, button_61, button_62,
    button_63, button_64, button_65, button_66, button_67, button_68, button_69,
    button_70, button_71, button_72, button_73, button_74, button_75, button_76,
    button_77, button_78, button_79, button_80, button_81, button_new_game,
    button_check, button_solution;

    int id, number_to_set;
    public static final int RESULT_REQUEST = 1;
    int[][] palya;
    int[][] solution;
    int[][] playersSolution;
    boolean firstGame = true;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        id = 0;
        playersSolution = new int[9][9];

        button_1 = findViewById(R.id.button1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_1.getText().toString().equals("0") || button_1.getText().toString().equals("")) {
                    id = 1;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_2 = findViewById(R.id.button2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_2.getText().toString().equals("0") || button_2.getText().toString().equals("")) {
                    id = 2;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_3 = findViewById(R.id.button3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_3.getText().toString().equals("0") || button_3.getText().toString().equals("")) {
                    id = 3;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_4 = findViewById(R.id.button4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_4.getText().toString().equals("0") || button_4.getText().toString().equals("")) {
                    id = 4;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_5 = findViewById(R.id.button5);
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_5.getText().toString().equals("0") || button_5.getText().toString().equals("")) {
                    id = 0;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_6 = findViewById(R.id.button6);
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_6.getText().toString().equals("0") || button_6.getText().toString().equals("")) {
                    id = 6;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_7 = findViewById(R.id.button7);
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_7.getText().toString().equals("0") || button_7.getText().toString().equals("")) {
                    id = 7;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_8 = findViewById(R.id.button8);
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_8.getText().toString().equals("0") || button_8.getText().toString().equals("")) {
                    id = 8;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_9 = findViewById(R.id.button9);
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_9.getText().toString().equals("0") || button_9.getText().toString().equals("")) {
                    id = 9;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_10 = findViewById(R.id.button10);
        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_10.getText().toString().equals("0") || button_10.getText().toString().equals("")) {
                    id = 10;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_11 = findViewById(R.id.button11);
        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_11.getText().toString().equals("0") || button_11.getText().toString().equals("")) {
                    id = 11;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_12 = findViewById(R.id.button12);
        button_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_12.getText().toString().equals("0") || button_12.getText().toString().equals("")) {
                    id = 12;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_13 = findViewById(R.id.button13);
        button_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_13.getText().toString().equals("0") || button_13.getText().toString().equals("")) {
                    id = 13;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_14 = findViewById(R.id.button14);
        button_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_14.getText().toString().equals("0") || button_14.getText().toString().equals("")) {
                    id = 14;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_15 = findViewById(R.id.button15);
        button_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_15.getText().toString().equals("0") || button_15.getText().toString().equals("")) {
                    id = 15;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_16 = findViewById(R.id.button16);
        button_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_16.getText().toString().equals("0") || button_16.getText().toString().equals("")) {
                    id = 16;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_17 = findViewById(R.id.button17);
        button_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_17.getText().toString().equals("0") || button_17.getText().toString().equals("")) {
                    id = 17;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_18 = findViewById(R.id.button18);
        button_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_18.getText().toString().equals("0") || button_18.getText().toString().equals("")) {
                    id = 18;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_19 = findViewById(R.id.button19);
        button_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_19.getText().toString().equals("0") || button_19.getText().toString().equals("")) {
                    id = 19;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_20 = findViewById(R.id.button20);
        button_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_20.getText().toString().equals("0") || button_20.getText().toString().equals("")) {
                    id = 20;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_21 = findViewById(R.id.button21);
        button_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_21.getText().toString().equals("0") || button_21.getText().toString().equals("")) {
                    id = 21;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_22 = findViewById(R.id.button22);
        button_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_22.getText().toString().equals("0") || button_22.getText().toString().equals("")) {
                    id = 22;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_23 = findViewById(R.id.button23);
        button_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_23.getText().toString().equals("0") || button_23.getText().toString().equals("")) {
                    id = 23;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_24 = findViewById(R.id.button24);
        button_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_24.getText().toString().equals("0") || button_24.getText().toString().equals("")) {
                    id = 24;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_25 = findViewById(R.id.button25);
        button_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_25.getText().toString().equals("0") || button_25.getText().toString().equals("")) {
                    id = 25;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_26 = findViewById(R.id.button26);
        button_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_26.getText().toString().equals("0") || button_26.getText().toString().equals("")) {
                    id = 26;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_27 = findViewById(R.id.button27);
        button_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_27.getText().toString().equals("0") || button_27.getText().toString().equals("")) {
                    id = 27;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_28 = findViewById(R.id.button28);
        button_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_28.getText().toString().equals("0") || button_28.getText().toString().equals("")) {
                    id = 28;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_29 = findViewById(R.id.button29);
        button_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_29.getText().toString().equals("0") || button_29.getText().toString().equals("")) {
                    id = 29;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_30 = findViewById(R.id.button30);
        button_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_30.getText().toString().equals("0") || button_30.getText().toString().equals("")) {
                    id = 30;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_31 = findViewById(R.id.button31);
        button_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_31.getText().toString().equals("0") || button_31.getText().toString().equals("")) {
                    id = 31;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_32 = findViewById(R.id.button32);
        button_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_32.getText().toString().equals("0") || button_32.getText().toString().equals("")) {
                    id = 32;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_33 = findViewById(R.id.button33);
        button_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_33.getText().toString().equals("0") || button_33.getText().toString().equals("")) {
                    id = 33;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_34 = findViewById(R.id.button34);
        button_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_34.getText().toString().equals("0") || button_34.getText().toString().equals("")) {
                    id = 34;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_35 = findViewById(R.id.button35);
        button_35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_35.getText().toString().equals("0") || button_35.getText().toString().equals("")) {
                    id = 35;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_36 = findViewById(R.id.button36);
        button_36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_36.getText().toString().equals("0") || button_36.getText().toString().equals("")) {
                    id = 36;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_37 = findViewById(R.id.button37);
        button_37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_37.getText().toString().equals("0") || button_37.getText().toString().equals("")) {
                    id = 37;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_38 = findViewById(R.id.button38);
        button_38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_38.getText().toString().equals("0") || button_38.getText().toString().equals("")) {
                    id = 38;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_39 = findViewById(R.id.button39);
        button_39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_39.getText().toString().equals("0") || button_39.getText().toString().equals("")) {
                    id = 39;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_40 = findViewById(R.id.button40);
        button_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_40.getText().toString().equals("0") || button_40.getText().toString().equals("")) {
                    id = 40;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_41 = findViewById(R.id.button41);
        button_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_41.getText().toString().equals("0") || button_41.getText().toString().equals("")) {
                    id = 41;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_42 = findViewById(R.id.button42);
        button_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_42.getText().toString().equals("0") || button_42.getText().toString().equals("")) {
                    id = 42;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_43 = findViewById(R.id.button43);
        button_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_43.getText().toString().equals("0") || button_43.getText().toString().equals("")) {
                    id = 43;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_44 = findViewById(R.id.button44);
        button_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_44.getText().toString().equals("0") || button_44.getText().toString().equals("")) {
                    id = 44;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_45 = findViewById(R.id.button45);
        button_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_45.getText().toString().equals("0") || button_45.getText().toString().equals("")) {
                    id = 45;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_46 = findViewById(R.id.button46);
        button_46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_46.getText().toString().equals("0") || button_46.getText().toString().equals("")) {
                    id = 46;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_47 = findViewById(R.id.button47);
        button_47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_47.getText().toString().equals("0") || button_47.getText().toString().equals("")) {
                    id = 47;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_48 = findViewById(R.id.button48);
        button_48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_48.getText().toString().equals("0") || button_48.getText().toString().equals("")) {
                    id = 48;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_49 = findViewById(R.id.button49);
        button_49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_49.getText().toString().equals("0") || button_49.getText().toString().equals("")) {
                    id = 49;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_50 = findViewById(R.id.button50);
        button_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_50.getText().toString().equals("0") || button_50.getText().toString().equals("")) {
                    id = 50;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_51 = findViewById(R.id.button51);
        button_51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_51.getText().toString().equals("0") || button_51.getText().toString().equals("")) {
                    id = 51;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_52 = findViewById(R.id.button52);
        button_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_52.getText().toString().equals("0") || button_52.getText().toString().equals("")) {
                    id = 52;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_53 = findViewById(R.id.button53);
        button_53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_53.getText().toString().equals("0") || button_53.getText().toString().equals("")) {
                    id = 53;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_54 = findViewById(R.id.button54);
        button_54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_54.getText().toString().equals("0") || button_54.getText().toString().equals("")) {
                    id = 54;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_55 = findViewById(R.id.button55);
        button_55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_55.getText().toString().equals("0") || button_55.getText().toString().equals("")) {
                    id = 55;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_56 = findViewById(R.id.button56);
        button_56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_56.getText().toString().equals("0") || button_56.getText().toString().equals("")) {
                    id = 56;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_57 = findViewById(R.id.button57);
        button_57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_57.getText().toString().equals("0") || button_57.getText().toString().equals("")) {
                    id = 57;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_58 = findViewById(R.id.button58);
        button_58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_58.getText().toString().equals("0") || button_58.getText().toString().equals("")) {
                    id = 58;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_59 = findViewById(R.id.button59);
        button_59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_59.getText().toString().equals("0") || button_59.getText().toString().equals("")) {
                    id = 59;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_60 = findViewById(R.id.button60);
        button_60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_60.getText().toString().equals("0") || button_60.getText().toString().equals("")) {
                    id = 60;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_61 = findViewById(R.id.button61);
        button_61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_61.getText().toString().equals("0") || button_61.getText().toString().equals("")) {
                    id = 61;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_62 = findViewById(R.id.button62);
        button_62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_62.getText().toString().equals("0") || button_62.getText().toString().equals("")) {
                    id = 62;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_63 = findViewById(R.id.button63);
        button_63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_63.getText().toString().equals("0") || button_63.getText().toString().equals("")) {
                    id = 63;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_64 = findViewById(R.id.button64);
        button_64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_64.getText().toString().equals("0") || button_64.getText().toString().equals("")) {
                    id = 64;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_65 = findViewById(R.id.button65);
        button_65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_65.getText().toString().equals("0") || button_65.getText().toString().equals("")) {
                    id = 65;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_66 = findViewById(R.id.button66);
        button_66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_66.getText().toString().equals("0") || button_66.getText().toString().equals("")) {
                    id = 66;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_67 = findViewById(R.id.button67);
        button_67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_67.getText().toString().equals("0") || button_67.getText().toString().equals("")) {
                    id = 67;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_68 = findViewById(R.id.button68);
        button_68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_68.getText().toString().equals("0") || button_68.getText().toString().equals("")) {
                    id = 68;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_69 = findViewById(R.id.button69);
        button_69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_69.getText().toString().equals("0") || button_69.getText().toString().equals("")) {
                    id = 69;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_70 = findViewById(R.id.button70);
        button_70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_70.getText().toString().equals("0") || button_70.getText().toString().equals("")) {
                    id = 70;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_71 = findViewById(R.id.button71);
        button_71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_71.getText().toString().equals("0") || button_71.getText().toString().equals("")) {
                    id = 71;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_72 = findViewById(R.id.button72);
        button_72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_72.getText().toString().equals("0") || button_72.getText().toString().equals("")) {
                    id = 72;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_73 = findViewById(R.id.button73);
        button_73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_73.getText().toString().equals("0") || button_73.getText().toString().equals("")) {
                    id = 73;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_74 = findViewById(R.id.button74);
        button_74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_74.getText().toString().equals("0") || button_74.getText().toString().equals("")) {
                    id = 74;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_75 = findViewById(R.id.button75);
        button_75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_75.getText().toString().equals("0") || button_75.getText().toString().equals("")) {
                    id = 75;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_76 = findViewById(R.id.button76);
        button_76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_76.getText().toString().equals("0") || button_76.getText().toString().equals("")) {
                    id = 76;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_77 = findViewById(R.id.button77);
        button_77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_77.getText().toString().equals("0") || button_77.getText().toString().equals("")) {
                    id = 77;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_78 = findViewById(R.id.button78);
        button_78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_78.getText().toString().equals("0") || button_78.getText().toString().equals("")) {
                    id = 78;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_79 = findViewById(R.id.button79);
        button_79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_79.getText().toString().equals("0") || button_79.getText().toString().equals("")) {
                    id = 79;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_80 = findViewById(R.id.button80);
        button_80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_80.getText().toString().equals("0") || button_80.getText().toString().equals("")) {
                    id = 80;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_81 = findViewById(R.id.button81);
        button_81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_81.getText().toString().equals("0") || button_81.getText().toString().equals("")) {
                    id = 81;
                    Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                    startActivityForResult(intent, RESULT_REQUEST);
                }
            }
        });
        button_new_game = findViewById(R.id.buttonNewGame);
        button_new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!firstGame)
                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("Új játék indítása")
                            .setMessage("Biztosan új játékot akarsz kezdeni?")
                            .setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    TaskGenerator tg = new TaskGenerator(9, 20);
                                    tg.init();
                                    tg.fillValues();
                                    palya = tg.getLevel();

                                    solution = tg.getRemovedNumbers();

                                    button_1.setText("");
                                    button_2.setText("");
                                    button_3.setText("");
                                    button_4.setText("");
                                    button_5.setText("");
                                    button_6.setText("");
                                    button_7.setText("");
                                    button_8.setText("");
                                    button_9.setText("");
                                    button_10.setText("");
                                    button_11.setText("");
                                    button_12.setText("");
                                    button_13.setText("");
                                    button_14.setText("");
                                    button_15.setText("");
                                    button_16.setText("");
                                    button_17.setText("");
                                    button_18.setText("");
                                    button_19.setText("");
                                    button_20.setText("");
                                    button_21.setText("");
                                    button_22.setText("");
                                    button_23.setText("");
                                    button_24.setText("");
                                    button_25.setText("");
                                    button_26.setText("");
                                    button_27.setText("");
                                    button_28.setText("");
                                    button_29.setText("");
                                    button_30.setText("");
                                    button_31.setText("");
                                    button_32.setText("");
                                    button_33.setText("");
                                    button_34.setText("");
                                    button_35.setText("");
                                    button_36.setText("");
                                    button_37.setText("");
                                    button_38.setText("");
                                    button_39.setText("");
                                    button_40.setText("");
                                    button_41.setText("");
                                    button_42.setText("");
                                    button_43.setText("");
                                    button_44.setText("");
                                    button_45.setText("");
                                    button_46.setText("");
                                    button_47.setText("");
                                    button_48.setText("");
                                    button_49.setText("");
                                    button_50.setText("");
                                    button_51.setText("");
                                    button_52.setText("");
                                    button_53.setText("");
                                    button_54.setText("");
                                    button_55.setText("");
                                    button_56.setText("");
                                    button_57.setText("");
                                    button_58.setText("");
                                    button_59.setText("");
                                    button_60.setText("");
                                    button_61.setText("");
                                    button_62.setText("");
                                    button_63.setText("");
                                    button_64.setText("");
                                    button_65.setText("");
                                    button_66.setText("");
                                    button_67.setText("");
                                    button_68.setText("");
                                    button_69.setText("");
                                    button_70.setText("");
                                    button_71.setText("");
                                    button_72.setText("");
                                    button_73.setText("");
                                    button_74.setText("");
                                    button_75.setText("");
                                    button_76.setText("");
                                    button_77.setText("");
                                    button_78.setText("");
                                    button_79.setText("");
                                    button_80.setText("");
                                    button_81.setText("");


                                    button_1.setTextColor(Color.BLACK);
                                    button_2.setTextColor(Color.BLACK);
                                    button_3.setTextColor(Color.BLACK);
                                    button_4.setTextColor(Color.BLACK);
                                    button_5.setTextColor(Color.BLACK);
                                    button_6.setTextColor(Color.BLACK);
                                    button_7.setTextColor(Color.BLACK);
                                    button_8.setTextColor(Color.BLACK);
                                    button_9.setTextColor(Color.BLACK);
                                    button_10.setTextColor(Color.BLACK);
                                    button_11.setTextColor(Color.BLACK);
                                    button_12.setTextColor(Color.BLACK);
                                    button_13.setTextColor(Color.BLACK);
                                    button_14.setTextColor(Color.BLACK);
                                    button_15.setTextColor(Color.BLACK);
                                    button_16.setTextColor(Color.BLACK);
                                    button_17.setTextColor(Color.BLACK);
                                    button_18.setTextColor(Color.BLACK);
                                    button_19.setTextColor(Color.BLACK);
                                    button_20.setTextColor(Color.BLACK);
                                    button_21.setTextColor(Color.BLACK);
                                    button_22.setTextColor(Color.BLACK);
                                    button_23.setTextColor(Color.BLACK);
                                    button_24.setTextColor(Color.BLACK);
                                    button_25.setTextColor(Color.BLACK);
                                    button_26.setTextColor(Color.BLACK);
                                    button_27.setTextColor(Color.BLACK);
                                    button_28.setTextColor(Color.BLACK);
                                    button_29.setTextColor(Color.BLACK);
                                    button_30.setTextColor(Color.BLACK);
                                    button_31.setTextColor(Color.BLACK);
                                    button_32.setTextColor(Color.BLACK);
                                    button_33.setTextColor(Color.BLACK);
                                    button_34.setTextColor(Color.BLACK);
                                    button_35.setTextColor(Color.BLACK);
                                    button_36.setTextColor(Color.BLACK);
                                    button_37.setTextColor(Color.BLACK);
                                    button_38.setTextColor(Color.BLACK);
                                    button_39.setTextColor(Color.BLACK);
                                    button_40.setTextColor(Color.BLACK);
                                    button_41.setTextColor(Color.BLACK);
                                    button_42.setTextColor(Color.BLACK);
                                    button_43.setTextColor(Color.BLACK);
                                    button_44.setTextColor(Color.BLACK);
                                    button_45.setTextColor(Color.BLACK);
                                    button_46.setTextColor(Color.BLACK);
                                    button_47.setTextColor(Color.BLACK);
                                    button_48.setTextColor(Color.BLACK);
                                    button_49.setTextColor(Color.BLACK);
                                    button_50.setTextColor(Color.BLACK);
                                    button_51.setTextColor(Color.BLACK);
                                    button_52.setTextColor(Color.BLACK);
                                    button_53.setTextColor(Color.BLACK);
                                    button_54.setTextColor(Color.BLACK);
                                    button_55.setTextColor(Color.BLACK);
                                    button_56.setTextColor(Color.BLACK);
                                    button_57.setTextColor(Color.BLACK);
                                    button_58.setTextColor(Color.BLACK);
                                    button_59.setTextColor(Color.BLACK);
                                    button_60.setTextColor(Color.BLACK);
                                    button_61.setTextColor(Color.BLACK);
                                    button_62.setTextColor(Color.BLACK);
                                    button_63.setTextColor(Color.BLACK);
                                    button_64.setTextColor(Color.BLACK);
                                    button_65.setTextColor(Color.BLACK);
                                    button_66.setTextColor(Color.BLACK);
                                    button_67.setTextColor(Color.BLACK);
                                    button_68.setTextColor(Color.BLACK);
                                    button_69.setTextColor(Color.BLACK);
                                    button_70.setTextColor(Color.BLACK);
                                    button_71.setTextColor(Color.BLACK);
                                    button_72.setTextColor(Color.BLACK);
                                    button_73.setTextColor(Color.BLACK);
                                    button_74.setTextColor(Color.BLACK);
                                    button_75.setTextColor(Color.BLACK);
                                    button_76.setTextColor(Color.BLACK);
                                    button_77.setTextColor(Color.BLACK);
                                    button_78.setTextColor(Color.BLACK);
                                    button_79.setTextColor(Color.BLACK);
                                    button_80.setTextColor(Color.BLACK);
                                    button_81.setTextColor(Color.BLACK);


                                    //Elso sor
                                    if(palya[0][0] != 0) {
                                        button_1.setText("");
                                        button_1.setText(String.valueOf(palya[0][0]));
                                    }

                                    if(palya[0][1] != 0) {
                                        button_2.setText("");
                                        button_2.setText(String.valueOf(palya[0][1]));
                                    }

                                    if(palya[0][2] != 0) {
                                        button_3.setText("");
                                        button_3.setText(String.valueOf(palya[0][2]));
                                    }

                                    if(palya[0][3] != 0) {
                                        button_4.setText("");
                                        button_4.setText(String.valueOf(palya[0][3]));
                                    }

                                    if(palya[0][4] != 0) {
                                        button_5.setText("");
                                        button_5.setText(String.valueOf(palya[0][4]));
                                    }

                                    if(palya[0][5] != 0) {
                                        button_6.setText("");
                                        button_6.setText(String.valueOf(palya[0][5]));
                                    }

                                    if(palya[0][6] != 0) {
                                        button_7.setText("");
                                        button_7.setText(String.valueOf(palya[0][6]));
                                    }

                                    if(palya[0][7] != 0) {
                                        button_8.setText("");
                                        button_8.setText(String.valueOf(palya[0][7]));
                                    }

                                    if(palya[0][8] != 0) {
                                        button_9.setText("");
                                        button_9.setText(String.valueOf(palya[0][8]));
                                    }

                                    //Masodik sor
                                    if(palya[1][0] != 0) {
                                        button_10.setText("");
                                        button_10.setText(String.valueOf(palya[1][0]));
                                    }
                                    if(palya[1][1] != 0) {
                                        button_11.setText("");
                                        button_11.setText(String.valueOf(palya[1][1]));
                                    }
                                    if(palya[1][2] != 0) {
                                        button_12.setText("");
                                        button_12.setText(String.valueOf(palya[1][2]));
                                    }
                                    if(palya[1][3] != 0) {
                                        button_13.setText("");
                                        button_13.setText(String.valueOf(palya[1][3]));
                                    }
                                    if(palya[1][4] != 0) {
                                        button_14.setText("");
                                        button_14.setText(String.valueOf(palya[1][4]));
                                    }
                                    if(palya[1][5] != 0) {
                                        button_15.setText("");
                                        button_15.setText(String.valueOf(palya[1][5]));
                                    }
                                    if(palya[1][6] != 0) {
                                        button_16.setText("");
                                        button_16.setText(String.valueOf(palya[1][6]));
                                    }
                                    if(palya[1][7] != 0) {
                                        button_17.setText("");
                                        button_17.setText(String.valueOf(palya[1][7]));
                                    }
                                    if(palya[1][8] != 0) {
                                        button_18.setText("");
                                        button_18.setText(String.valueOf(palya[1][8]));
                                    }

                                    //Harmadik sor
                                    if(palya[2][0] != 0) {
                                        button_19.setText("");
                                        button_19.setText(String.valueOf(palya[2][0]));
                                    }
                                    if(palya[2][1] != 0) {
                                        button_20.setText("");
                                        button_20.setText(String.valueOf(palya[2][1]));
                                    }
                                    if(palya[2][2] != 0) {
                                        button_21.setText("");
                                        button_21.setText(String.valueOf(palya[2][2]));
                                    }
                                    if(palya[2][3] != 0) {
                                        button_22.setText("");
                                        button_22.setText(String.valueOf(palya[2][3]));
                                    }
                                    if(palya[2][4] != 0) {
                                        button_23.setText("");
                                        button_23.setText(String.valueOf(palya[2][4]));
                                    }
                                    if(palya[2][5] != 0) {
                                        button_24.setText("");
                                        button_24.setText(String.valueOf(palya[2][5]));
                                    }
                                    if(palya[2][6] != 0) {
                                        button_25.setText("");
                                        button_25.setText(String.valueOf(palya[2][6]));
                                    }
                                    if(palya[2][7] != 0) {
                                        button_26.setText("");
                                        button_26.setText(String.valueOf(palya[2][7]));
                                    }
                                    if(palya[2][8] != 0) {
                                        button_27.setText("");
                                        button_27.setText(String.valueOf(palya[2][8]));
                                    }

                                    //Negyedik sor
                                    if(palya[3][0] != 0) {
                                        button_28.setText("");
                                        button_28.setText(String.valueOf(palya[3][0]));
                                    }
                                    if(palya[3][1] != 0) {
                                        button_29.setText("");
                                        button_29.setText(String.valueOf(palya[3][1]));
                                    }
                                    if(palya[3][2] != 0) {
                                        button_30.setText("");
                                        button_30.setText(String.valueOf(palya[3][2]));
                                    }
                                    if(palya[3][3] != 0) {
                                        button_31.setText("");
                                        button_31.setText(String.valueOf(palya[3][3]));
                                    }
                                    if(palya[3][4] != 0) {
                                        button_32.setText("");
                                        button_32.setText(String.valueOf(palya[3][4]));
                                    }
                                    if(palya[3][5] != 0) {
                                        button_33.setText("");
                                        button_33.setText(String.valueOf(palya[3][5]));
                                    }
                                    if(palya[3][6] != 0) {
                                        button_34.setText("");
                                        button_34.setText(String.valueOf(palya[3][6]));
                                    }
                                    if(palya[3][7] != 0) {
                                        button_35.setText("");
                                        button_35.setText(String.valueOf(palya[3][7]));
                                    }
                                    if(palya[3][8] != 0) {
                                        button_36.setText("");
                                        button_36.setText(String.valueOf(palya[3][8]));
                                    }

                                    //Ötödik sor
                                    if(palya[4][0] != 0) {
                                        button_37.setText("");
                                        button_37.setText(String.valueOf(palya[4][0]));
                                    }
                                    if(palya[4][1] != 0) {
                                        button_38.setText("");
                                        button_38.setText(String.valueOf(palya[4][1]));
                                    }
                                    if(palya[4][2] != 0) {
                                        button_39.setText("");
                                        button_39.setText(String.valueOf(palya[4][2]));
                                    }
                                    if(palya[4][3] != 0) {
                                        button_40.setText("");
                                        button_40.setText(String.valueOf(palya[4][3]));
                                    }
                                    if(palya[4][4] != 0) {
                                        button_41.setText("");
                                        button_41.setText(String.valueOf(palya[4][4]));
                                    }
                                    if(palya[4][5] != 0) {
                                        button_42.setText("");
                                        button_42.setText(String.valueOf(palya[4][5]));
                                    }
                                    if(palya[4][6] != 0) {
                                        button_43.setText("");
                                        button_43.setText(String.valueOf(palya[4][6]));
                                    }
                                    if(palya[4][7] != 0) {
                                        button_44.setText("");
                                        button_44.setText(String.valueOf(palya[4][7]));
                                    }
                                    if(palya[4][8] != 0) {
                                        button_45.setText("");
                                        button_45.setText(String.valueOf(palya[4][8]));
                                    }

                                    //Hatodik sor
                                    if(palya[5][0] != 0) {
                                        button_46.setText("");
                                        button_46.setText(String.valueOf(palya[5][0]));
                                    }
                                    if(palya[5][1] != 0) {
                                        button_47.setText("");
                                        button_47.setText(String.valueOf(palya[5][1]));
                                    }
                                    if(palya[5][2] != 0) {
                                        button_48.setText("");
                                        button_48.setText(String.valueOf(palya[5][2]));
                                    }
                                    if(palya[5][3] != 0) {
                                        button_49.setText("");
                                        button_49.setText(String.valueOf(palya[5][3]));
                                    }
                                    if(palya[5][4] != 0) {
                                        button_50.setText("");
                                        button_50.setText(String.valueOf(palya[5][4]));
                                    }
                                    if(palya[5][5] != 0) {
                                        button_51.setText("");
                                        button_51.setText(String.valueOf(palya[5][5]));
                                    }
                                    if(palya[5][6] != 0) {
                                        button_52.setText("");
                                        button_52.setText(String.valueOf(palya[5][6]));
                                    }
                                    if(palya[5][7] != 0) {
                                        button_53.setText("");
                                        button_53.setText(String.valueOf(palya[5][7]));
                                    }
                                    if(palya[5][8] != 0) {
                                        button_54.setText("");
                                        button_54.setText(String.valueOf(palya[5][8]));
                                    }

                                    //Hetedik sor
                                    if(palya[6][0] != 0) {
                                        button_55.setText("");
                                        button_55.setText(String.valueOf(palya[6][0]));
                                    }
                                    if(palya[6][1] != 0) {
                                        button_56.setText("");
                                        button_56.setText(String.valueOf(palya[6][1]));
                                    }
                                    if(palya[6][2] != 0) {
                                        button_57.setText("");
                                        button_57.setText(String.valueOf(palya[6][2]));
                                    }
                                    if(palya[6][3] != 0) {
                                        button_58.setText("");
                                        button_58.setText(String.valueOf(palya[6][3]));
                                    }
                                    if(palya[6][4] != 0) {
                                        button_59.setText("");
                                        button_59.setText(String.valueOf(palya[6][4]));
                                    }
                                    if(palya[6][5] != 0) {
                                        button_60.setText("");
                                        button_60.setText(String.valueOf(palya[6][5]));
                                    }
                                    if(palya[6][6] != 0) {
                                        button_61.setText("");
                                        button_61.setText(String.valueOf(palya[6][6]));
                                    }
                                    if(palya[6][7] != 0) {
                                        button_62.setText("");
                                        button_62.setText(String.valueOf(palya[6][7]));
                                    }
                                    if(palya[6][8] != 0) {
                                        button_63.setText("");
                                        button_63.setText(String.valueOf(palya[6][8]));
                                    }

                                    //Nyolcadik sor
                                    if(palya[7][0] != 0) {
                                        button_64.setText("");
                                        button_64.setText(String.valueOf(palya[2][0]));
                                    }
                                    if(palya[7][1] != 0) {
                                        button_65.setText("");
                                        button_65.setText(String.valueOf(palya[7][1]));
                                    }
                                    if(palya[7][2] != 0) {
                                        button_66.setText("");
                                        button_66.setText(String.valueOf(palya[7][2]));
                                    }
                                    if(palya[7][3] != 0) {
                                        button_67.setText("");
                                        button_67.setText(String.valueOf(palya[7][3]));
                                    }
                                    if(palya[7][4] != 0) {
                                        button_68.setText("");
                                        button_68.setText(String.valueOf(palya[7][4]));
                                    }
                                    if(palya[7][5] != 0) {
                                        button_69.setText("");
                                        button_69.setText(String.valueOf(palya[7][5]));
                                    }
                                    if(palya[7][6] != 0) {
                                        button_70.setText("");
                                        button_70.setText(String.valueOf(palya[7][6]));
                                    }
                                    if(palya[7][7] != 0) {
                                        button_71.setText("");
                                        button_71.setText(String.valueOf(palya[7][7]));
                                    }
                                    if(palya[7][8] != 0) {
                                        button_72.setText("");
                                        button_72.setText(String.valueOf(palya[7][8]));
                                    }

                                    //Kilencedik sor
                                    if(palya[8][0] != 0) {
                                        button_73.setText("");
                                        button_73.setText(String.valueOf(palya[8][0]));
                                    }
                                    if(palya[8][1] != 0) {
                                        button_74.setText("");
                                        button_74.setText(String.valueOf(palya[8][1]));
                                    }
                                    if(palya[8][2] != 0) {
                                        button_75.setText("");
                                        button_75.setText(String.valueOf(palya[8][2]));
                                    }
                                    if(palya[8][3] != 0) {
                                        button_76.setText("");
                                        button_76.setText(String.valueOf(palya[8][3]));
                                    }
                                    if(palya[8][4] != 0) {
                                        button_77.setText("");
                                        button_77.setText(String.valueOf(palya[8][4]));
                                    }
                                    if(palya[8][5] != 0) {
                                        button_78.setText("");
                                        button_78.setText(String.valueOf(palya[8][5]));
                                    }
                                    if(palya[8][6] != 0) {
                                        button_79.setText("");
                                        button_79.setText(String.valueOf(palya[8][6]));
                                    }
                                    if(palya[8][7] != 0) {
                                        button_80.setText("");
                                        button_80.setText(String.valueOf(palya[8][7]));
                                    }
                                    if(palya[8][8] != 0) {
                                        button_81.setText("");
                                        button_81.setText(String.valueOf(palya[8][8]));
                                    }
                                }
                            })
                            .setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            })
                            .show();

                if(firstGame) {
                    TaskGenerator tg = new TaskGenerator(9, 20);
                    tg.init();
                    tg.fillValues();
                    palya = tg.getLevel();

                    solution = tg.getRemovedNumbers();

                    button_1.setText("");
                    button_2.setText("");
                    button_3.setText("");
                    button_4.setText("");
                    button_5.setText("");
                    button_6.setText("");
                    button_7.setText("");
                    button_8.setText("");
                    button_9.setText("");
                    button_10.setText("");
                    button_11.setText("");
                    button_12.setText("");
                    button_13.setText("");
                    button_14.setText("");
                    button_15.setText("");
                    button_16.setText("");
                    button_17.setText("");
                    button_18.setText("");
                    button_19.setText("");
                    button_20.setText("");
                    button_21.setText("");
                    button_22.setText("");
                    button_23.setText("");
                    button_24.setText("");
                    button_25.setText("");
                    button_26.setText("");
                    button_27.setText("");
                    button_28.setText("");
                    button_29.setText("");
                    button_30.setText("");
                    button_31.setText("");
                    button_32.setText("");
                    button_33.setText("");
                    button_34.setText("");
                    button_35.setText("");
                    button_36.setText("");
                    button_37.setText("");
                    button_38.setText("");
                    button_39.setText("");
                    button_40.setText("");
                    button_41.setText("");
                    button_42.setText("");
                    button_43.setText("");
                    button_44.setText("");
                    button_45.setText("");
                    button_46.setText("");
                    button_47.setText("");
                    button_48.setText("");
                    button_49.setText("");
                    button_50.setText("");
                    button_51.setText("");
                    button_52.setText("");
                    button_53.setText("");
                    button_54.setText("");
                    button_55.setText("");
                    button_56.setText("");
                    button_57.setText("");
                    button_58.setText("");
                    button_59.setText("");
                    button_60.setText("");
                    button_61.setText("");
                    button_62.setText("");
                    button_63.setText("");
                    button_64.setText("");
                    button_65.setText("");
                    button_66.setText("");
                    button_67.setText("");
                    button_68.setText("");
                    button_69.setText("");
                    button_70.setText("");
                    button_71.setText("");
                    button_72.setText("");
                    button_73.setText("");
                    button_74.setText("");
                    button_75.setText("");
                    button_76.setText("");
                    button_77.setText("");
                    button_78.setText("");
                    button_79.setText("");
                    button_80.setText("");
                    button_81.setText("");


                    button_1.setTextColor(Color.BLACK);
                    button_2.setTextColor(Color.BLACK);
                    button_3.setTextColor(Color.BLACK);
                    button_4.setTextColor(Color.BLACK);
                    button_5.setTextColor(Color.BLACK);
                    button_6.setTextColor(Color.BLACK);
                    button_7.setTextColor(Color.BLACK);
                    button_8.setTextColor(Color.BLACK);
                    button_9.setTextColor(Color.BLACK);
                    button_10.setTextColor(Color.BLACK);
                    button_11.setTextColor(Color.BLACK);
                    button_12.setTextColor(Color.BLACK);
                    button_13.setTextColor(Color.BLACK);
                    button_14.setTextColor(Color.BLACK);
                    button_15.setTextColor(Color.BLACK);
                    button_16.setTextColor(Color.BLACK);
                    button_17.setTextColor(Color.BLACK);
                    button_18.setTextColor(Color.BLACK);
                    button_19.setTextColor(Color.BLACK);
                    button_20.setTextColor(Color.BLACK);
                    button_21.setTextColor(Color.BLACK);
                    button_22.setTextColor(Color.BLACK);
                    button_23.setTextColor(Color.BLACK);
                    button_24.setTextColor(Color.BLACK);
                    button_25.setTextColor(Color.BLACK);
                    button_26.setTextColor(Color.BLACK);
                    button_27.setTextColor(Color.BLACK);
                    button_28.setTextColor(Color.BLACK);
                    button_29.setTextColor(Color.BLACK);
                    button_30.setTextColor(Color.BLACK);
                    button_31.setTextColor(Color.BLACK);
                    button_32.setTextColor(Color.BLACK);
                    button_33.setTextColor(Color.BLACK);
                    button_34.setTextColor(Color.BLACK);
                    button_35.setTextColor(Color.BLACK);
                    button_36.setTextColor(Color.BLACK);
                    button_37.setTextColor(Color.BLACK);
                    button_38.setTextColor(Color.BLACK);
                    button_39.setTextColor(Color.BLACK);
                    button_40.setTextColor(Color.BLACK);
                    button_41.setTextColor(Color.BLACK);
                    button_42.setTextColor(Color.BLACK);
                    button_43.setTextColor(Color.BLACK);
                    button_44.setTextColor(Color.BLACK);
                    button_45.setTextColor(Color.BLACK);
                    button_46.setTextColor(Color.BLACK);
                    button_47.setTextColor(Color.BLACK);
                    button_48.setTextColor(Color.BLACK);
                    button_49.setTextColor(Color.BLACK);
                    button_50.setTextColor(Color.BLACK);
                    button_51.setTextColor(Color.BLACK);
                    button_52.setTextColor(Color.BLACK);
                    button_53.setTextColor(Color.BLACK);
                    button_54.setTextColor(Color.BLACK);
                    button_55.setTextColor(Color.BLACK);
                    button_56.setTextColor(Color.BLACK);
                    button_57.setTextColor(Color.BLACK);
                    button_58.setTextColor(Color.BLACK);
                    button_59.setTextColor(Color.BLACK);
                    button_60.setTextColor(Color.BLACK);
                    button_61.setTextColor(Color.BLACK);
                    button_62.setTextColor(Color.BLACK);
                    button_63.setTextColor(Color.BLACK);
                    button_64.setTextColor(Color.BLACK);
                    button_65.setTextColor(Color.BLACK);
                    button_66.setTextColor(Color.BLACK);
                    button_67.setTextColor(Color.BLACK);
                    button_68.setTextColor(Color.BLACK);
                    button_69.setTextColor(Color.BLACK);
                    button_70.setTextColor(Color.BLACK);
                    button_71.setTextColor(Color.BLACK);
                    button_72.setTextColor(Color.BLACK);
                    button_73.setTextColor(Color.BLACK);
                    button_74.setTextColor(Color.BLACK);
                    button_75.setTextColor(Color.BLACK);
                    button_76.setTextColor(Color.BLACK);
                    button_77.setTextColor(Color.BLACK);
                    button_78.setTextColor(Color.BLACK);
                    button_79.setTextColor(Color.BLACK);
                    button_80.setTextColor(Color.BLACK);
                    button_81.setTextColor(Color.BLACK);


                    //Elso sor
                    if(palya[0][0] != 0) {
                        button_1.setText("");
                        button_1.setText(String.valueOf(palya[0][0]));
                    }

                    if(palya[0][1] != 0) {
                        button_2.setText("");
                        button_2.setText(String.valueOf(palya[0][1]));
                    }

                    if(palya[0][2] != 0) {
                        button_3.setText("");
                        button_3.setText(String.valueOf(palya[0][2]));
                    }

                    if(palya[0][3] != 0) {
                        button_4.setText("");
                        button_4.setText(String.valueOf(palya[0][3]));
                    }

                    if(palya[0][4] != 0) {
                        button_5.setText("");
                        button_5.setText(String.valueOf(palya[0][4]));
                    }

                    if(palya[0][5] != 0) {
                        button_6.setText("");
                        button_6.setText(String.valueOf(palya[0][5]));
                    }

                    if(palya[0][6] != 0) {
                        button_7.setText("");
                        button_7.setText(String.valueOf(palya[0][6]));
                    }

                    if(palya[0][7] != 0) {
                        button_8.setText("");
                        button_8.setText(String.valueOf(palya[0][7]));
                    }

                    if(palya[0][8] != 0) {
                        button_9.setText("");
                        button_9.setText(String.valueOf(palya[0][8]));
                    }

                    //Masodik sor
                    if(palya[1][0] != 0) {
                        button_10.setText("");
                        button_10.setText(String.valueOf(palya[1][0]));
                    }
                    if(palya[1][1] != 0) {
                        button_11.setText("");
                        button_11.setText(String.valueOf(palya[1][1]));
                    }
                    if(palya[1][2] != 0) {
                        button_12.setText("");
                        button_12.setText(String.valueOf(palya[1][2]));
                    }
                    if(palya[1][3] != 0) {
                        button_13.setText("");
                        button_13.setText(String.valueOf(palya[1][3]));
                    }
                    if(palya[1][4] != 0) {
                        button_14.setText("");
                        button_14.setText(String.valueOf(palya[1][4]));
                    }
                    if(palya[1][5] != 0) {
                        button_15.setText("");
                        button_15.setText(String.valueOf(palya[1][5]));
                    }
                    if(palya[1][6] != 0) {
                        button_16.setText("");
                        button_16.setText(String.valueOf(palya[1][6]));
                    }
                    if(palya[1][7] != 0) {
                        button_17.setText("");
                        button_17.setText(String.valueOf(palya[1][7]));
                    }
                    if(palya[1][8] != 0) {
                        button_18.setText("");
                        button_18.setText(String.valueOf(palya[1][8]));
                    }

                    //Harmadik sor
                    if(palya[2][0] != 0) {
                        button_19.setText("");
                        button_19.setText(String.valueOf(palya[2][0]));
                    }
                    if(palya[2][1] != 0) {
                        button_20.setText("");
                        button_20.setText(String.valueOf(palya[2][1]));
                    }
                    if(palya[2][2] != 0) {
                        button_21.setText("");
                        button_21.setText(String.valueOf(palya[2][2]));
                    }
                    if(palya[2][3] != 0) {
                        button_22.setText("");
                        button_22.setText(String.valueOf(palya[2][3]));
                    }
                    if(palya[2][4] != 0) {
                        button_23.setText("");
                        button_23.setText(String.valueOf(palya[2][4]));
                    }
                    if(palya[2][5] != 0) {
                        button_24.setText("");
                        button_24.setText(String.valueOf(palya[2][5]));
                    }
                    if(palya[2][6] != 0) {
                        button_25.setText("");
                        button_25.setText(String.valueOf(palya[2][6]));
                    }
                    if(palya[2][7] != 0) {
                        button_26.setText("");
                        button_26.setText(String.valueOf(palya[2][7]));
                    }
                    if(palya[2][8] != 0) {
                        button_27.setText("");
                        button_27.setText(String.valueOf(palya[2][8]));
                    }

                    //Negyedik sor
                    if(palya[3][0] != 0) {
                        button_28.setText("");
                        button_28.setText(String.valueOf(palya[3][0]));
                    }
                    if(palya[3][1] != 0) {
                        button_29.setText("");
                        button_29.setText(String.valueOf(palya[3][1]));
                    }
                    if(palya[3][2] != 0) {
                        button_30.setText("");
                        button_30.setText(String.valueOf(palya[3][2]));
                    }
                    if(palya[3][3] != 0) {
                        button_31.setText("");
                        button_31.setText(String.valueOf(palya[3][3]));
                    }
                    if(palya[3][4] != 0) {
                        button_32.setText("");
                        button_32.setText(String.valueOf(palya[3][4]));
                    }
                    if(palya[3][5] != 0) {
                        button_33.setText("");
                        button_33.setText(String.valueOf(palya[3][5]));
                    }
                    if(palya[3][6] != 0) {
                        button_34.setText("");
                        button_34.setText(String.valueOf(palya[3][6]));
                    }
                    if(palya[3][7] != 0) {
                        button_35.setText("");
                        button_35.setText(String.valueOf(palya[3][7]));
                    }
                    if(palya[3][8] != 0) {
                        button_36.setText("");
                        button_36.setText(String.valueOf(palya[3][8]));
                    }

                    //Ötödik sor
                    if(palya[4][0] != 0) {
                        button_37.setText("");
                        button_37.setText(String.valueOf(palya[4][0]));
                    }
                    if(palya[4][1] != 0) {
                        button_38.setText("");
                        button_38.setText(String.valueOf(palya[4][1]));
                    }
                    if(palya[4][2] != 0) {
                        button_39.setText("");
                        button_39.setText(String.valueOf(palya[4][2]));
                    }
                    if(palya[4][3] != 0) {
                        button_40.setText("");
                        button_40.setText(String.valueOf(palya[4][3]));
                    }
                    if(palya[4][4] != 0) {
                        button_41.setText("");
                        button_41.setText(String.valueOf(palya[4][4]));
                    }
                    if(palya[4][5] != 0) {
                        button_42.setText("");
                        button_42.setText(String.valueOf(palya[4][5]));
                    }
                    if(palya[4][6] != 0) {
                        button_43.setText("");
                        button_43.setText(String.valueOf(palya[4][6]));
                    }
                    if(palya[4][7] != 0) {
                        button_44.setText("");
                        button_44.setText(String.valueOf(palya[4][7]));
                    }
                    if(palya[4][8] != 0) {
                        button_45.setText("");
                        button_45.setText(String.valueOf(palya[4][8]));
                    }

                    //Hatodik sor
                    if(palya[5][0] != 0) {
                        button_46.setText("");
                        button_46.setText(String.valueOf(palya[5][0]));
                    }
                    if(palya[5][1] != 0) {
                        button_47.setText("");
                        button_47.setText(String.valueOf(palya[5][1]));
                    }
                    if(palya[5][2] != 0) {
                        button_48.setText("");
                        button_48.setText(String.valueOf(palya[5][2]));
                    }
                    if(palya[5][3] != 0) {
                        button_49.setText("");
                        button_49.setText(String.valueOf(palya[5][3]));
                    }
                    if(palya[5][4] != 0) {
                        button_50.setText("");
                        button_50.setText(String.valueOf(palya[5][4]));
                    }
                    if(palya[5][5] != 0) {
                        button_51.setText("");
                        button_51.setText(String.valueOf(palya[5][5]));
                    }
                    if(palya[5][6] != 0) {
                        button_52.setText("");
                        button_52.setText(String.valueOf(palya[5][6]));
                    }
                    if(palya[5][7] != 0) {
                        button_53.setText("");
                        button_53.setText(String.valueOf(palya[5][7]));
                    }
                    if(palya[5][8] != 0) {
                        button_54.setText("");
                        button_54.setText(String.valueOf(palya[5][8]));
                    }

                    //Hetedik sor
                    if(palya[6][0] != 0) {
                        button_55.setText("");
                        button_55.setText(String.valueOf(palya[6][0]));
                    }
                    if(palya[6][1] != 0) {
                        button_56.setText("");
                        button_56.setText(String.valueOf(palya[6][1]));
                    }
                    if(palya[6][2] != 0) {
                        button_57.setText("");
                        button_57.setText(String.valueOf(palya[6][2]));
                    }
                    if(palya[6][3] != 0) {
                        button_58.setText("");
                        button_58.setText(String.valueOf(palya[6][3]));
                    }
                    if(palya[6][4] != 0) {
                        button_59.setText("");
                        button_59.setText(String.valueOf(palya[6][4]));
                    }
                    if(palya[6][5] != 0) {
                        button_60.setText("");
                        button_60.setText(String.valueOf(palya[6][5]));
                    }
                    if(palya[6][6] != 0) {
                        button_61.setText("");
                        button_61.setText(String.valueOf(palya[6][6]));
                    }
                    if(palya[6][7] != 0) {
                        button_62.setText("");
                        button_62.setText(String.valueOf(palya[6][7]));
                    }
                    if(palya[6][8] != 0) {
                        button_63.setText("");
                        button_63.setText(String.valueOf(palya[6][8]));
                    }

                    //Nyolcadik sor
                    if(palya[7][0] != 0) {
                        button_64.setText("");
                        button_64.setText(String.valueOf(palya[2][0]));
                    }
                    if(palya[7][1] != 0) {
                        button_65.setText("");
                        button_65.setText(String.valueOf(palya[7][1]));
                    }
                    if(palya[7][2] != 0) {
                        button_66.setText("");
                        button_66.setText(String.valueOf(palya[7][2]));
                    }
                    if(palya[7][3] != 0) {
                        button_67.setText("");
                        button_67.setText(String.valueOf(palya[7][3]));
                    }
                    if(palya[7][4] != 0) {
                        button_68.setText("");
                        button_68.setText(String.valueOf(palya[7][4]));
                    }
                    if(palya[7][5] != 0) {
                        button_69.setText("");
                        button_69.setText(String.valueOf(palya[7][5]));
                    }
                    if(palya[7][6] != 0) {
                        button_70.setText("");
                        button_70.setText(String.valueOf(palya[7][6]));
                    }
                    if(palya[7][7] != 0) {
                        button_71.setText("");
                        button_71.setText(String.valueOf(palya[7][7]));
                    }
                    if(palya[7][8] != 0) {
                        button_72.setText("");
                        button_72.setText(String.valueOf(palya[7][8]));
                    }

                    //Kilencedik sor
                    if(palya[2][0] != 0) {
                        button_73.setText("");
                        button_73.setText(String.valueOf(palya[8][0]));
                    }
                    if(palya[8][1] != 0) {
                        button_74.setText("");
                        button_74.setText(String.valueOf(palya[8][1]));
                    }
                    if(palya[8][2] != 0) {
                        button_75.setText("");
                        button_75.setText(String.valueOf(palya[8][2]));
                    }
                    if(palya[8][3] != 0) {
                        button_76.setText("");
                        button_76.setText(String.valueOf(palya[8][3]));
                    }
                    if(palya[8][4] != 0) {
                        button_77.setText("");
                        button_77.setText(String.valueOf(palya[8][4]));
                    }
                    if(palya[8][5] != 0) {
                        button_78.setText("");
                        button_78.setText(String.valueOf(palya[8][5]));
                    }
                    if(palya[8][6] != 0) {
                        button_79.setText("");
                        button_79.setText(String.valueOf(palya[8][6]));
                    }
                    if(palya[8][7] != 0) {
                        button_80.setText("");
                        button_80.setText(String.valueOf(palya[8][7]));
                    }
                    if(palya[8][8] != 0) {
                        button_81.setText("");
                        button_81.setText(String.valueOf(palya[8][8]));
                    }
                }


                firstGame = false;
            }
        });
        button_check = findViewById(R.id.buttonCheck);
        button_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getPlayersSolution();
                int p[][] = checkPlayersSolution(solution, playersSolution);

                //Elso sor
                if(p[0][0] == 0)
                    button_1.setTextColor(Color.GREEN);
                else
                    button_1.setTextColor(Color.RED);

                if(p[0][1] == 0)
                    button_2.setTextColor(Color.GREEN);
                else
                    button_2.setTextColor(Color.RED);

                if(p[0][2] == 0)
                    button_3.setTextColor(Color.GREEN);
                else
                    button_3.setTextColor(Color.RED);

                if(p[0][3] == 0)
                    button_4.setTextColor(Color.GREEN);
                else
                    button_4.setTextColor(Color.RED);

                if(p[0][4] == 0)
                    button_5.setTextColor(Color.GREEN);
                else
                    button_5.setTextColor(Color.RED);

                if(p[0][5] == 0)
                    button_6.setTextColor(Color.GREEN);
                else
                    button_6.setTextColor(Color.RED);

                if(p[0][6] == 0)
                    button_7.setTextColor(Color.GREEN);
                else
                    button_7.setTextColor(Color.RED);

                if(p[0][7] == 0)
                    button_8.setTextColor(Color.GREEN);
                else
                    button_8.setTextColor(Color.RED);

                if(p[0][8] == 0)
                    button_9.setTextColor(Color.GREEN);
                else
                    button_9.setTextColor(Color.RED);

                //Masodik sor
                if(p[1][0] == 0)
                    button_10.setTextColor(Color.GREEN);
                else
                    button_10.setTextColor(Color.RED);

                if(p[1][1] == 0)
                    button_11.setTextColor(Color.GREEN);
                else
                    button_11.setTextColor(Color.RED);

                if(p[1][2] == 0)
                    button_12.setTextColor(Color.GREEN);
                else
                    button_12.setTextColor(Color.RED);

                if(p[1][3] == 0)
                    button_13.setTextColor(Color.GREEN);
                else
                    button_13.setTextColor(Color.RED);

                if(p[1][4] == 0)
                    button_14.setTextColor(Color.GREEN);
                else
                    button_14.setTextColor(Color.RED);

                if(p[1][5] == 0)
                    button_15.setTextColor(Color.GREEN);
                else
                    button_15.setTextColor(Color.RED);

                if(p[1][6] == 0)
                    button_16.setTextColor(Color.GREEN);
                else
                    button_16.setTextColor(Color.RED);

                if(p[1][7] == 0)
                    button_17.setTextColor(Color.GREEN);
                else
                    button_17.setTextColor(Color.RED);

                if(p[1][8] == 0)
                    button_18.setTextColor(Color.GREEN);
                else
                    button_18.setTextColor(Color.RED);

                //Harmadik sor
                if(p[2][0] == 0)
                    button_19.setTextColor(Color.GREEN);
                else
                    button_19.setTextColor(Color.RED);

                if(p[2][1] == 0)
                    button_20.setTextColor(Color.GREEN);
                else
                    button_20.setTextColor(Color.RED);

                if(p[2][2] == 0)
                    button_21.setTextColor(Color.GREEN);
                else
                    button_21.setTextColor(Color.RED);

                if(p[2][3] == 0)
                    button_22.setTextColor(Color.GREEN);
                else
                    button_22.setTextColor(Color.RED);

                if(p[2][4] == 0)
                    button_23.setTextColor(Color.GREEN);
                else
                    button_23.setTextColor(Color.RED);

                if(p[2][5] == 0)
                    button_24.setTextColor(Color.GREEN);
                else
                    button_24.setTextColor(Color.RED);

                if(p[2][6] == 0)
                    button_25.setTextColor(Color.GREEN);
                else
                    button_25.setTextColor(Color.RED);

                if(p[2][7] == 0)
                    button_26.setTextColor(Color.GREEN);
                else
                    button_26.setTextColor(Color.RED);

                if(p[2][8] == 0)
                    button_27.setTextColor(Color.GREEN);
                else
                    button_27.setTextColor(Color.RED);

                //Negyedik sor
                if(p[3][0] == 0)
                    button_28.setTextColor(Color.GREEN);
                else
                    button_28.setTextColor(Color.RED);

                if(p[3][1] == 0)
                    button_29.setTextColor(Color.GREEN);
                else
                    button_29.setTextColor(Color.RED);

                if(p[3][2] == 0)
                    button_30.setTextColor(Color.GREEN);
                else
                    button_30.setTextColor(Color.RED);

                if(p[3][3] == 0)
                    button_31.setTextColor(Color.GREEN);
                else
                    button_31.setTextColor(Color.RED);

                if(p[3][4] == 0)
                    button_32.setTextColor(Color.GREEN);
                else
                    button_32.setTextColor(Color.RED);

                if(p[3][5] == 0)
                    button_33.setTextColor(Color.GREEN);
                else
                    button_33.setTextColor(Color.RED);

                if(p[3][6] == 0)
                    button_34.setTextColor(Color.GREEN);
                else
                    button_34.setTextColor(Color.RED);

                if(p[3][7] == 0)
                    button_35.setTextColor(Color.GREEN);
                else
                    button_35.setTextColor(Color.RED);

                if(p[3][8] == 0)
                    button_36.setTextColor(Color.GREEN);
                else
                    button_36.setTextColor(Color.RED);

                //Otodik sor
                if(p[4][0] == 0)
                    button_37.setTextColor(Color.GREEN);
                else
                    button_37.setTextColor(Color.RED);

                if(p[4][1] == 0)
                    button_38.setTextColor(Color.GREEN);
                else
                    button_38.setTextColor(Color.RED);

                if(p[4][2] == 0)
                    button_39.setTextColor(Color.GREEN);
                else
                    button_39.setTextColor(Color.RED);

                if(p[4][3] == 0)
                    button_40.setTextColor(Color.GREEN);
                else
                    button_40.setTextColor(Color.RED);

                if(p[4][4] == 0)
                    button_41.setTextColor(Color.GREEN);
                else
                    button_41.setTextColor(Color.RED);

                if(p[4][5] == 0)
                    button_42.setTextColor(Color.GREEN);
                else
                    button_42.setTextColor(Color.RED);

                if(p[4][6] == 0)
                    button_43.setTextColor(Color.GREEN);
                else
                    button_43.setTextColor(Color.RED);

                if(p[4][7] == 0)
                    button_44.setTextColor(Color.GREEN);
                else
                    button_44.setTextColor(Color.RED);

                if(p[4][8] == 0)
                    button_45.setTextColor(Color.GREEN);
                else
                    button_45.setTextColor(Color.RED);

                //Hatodik sor
                if(p[5][0] == 0)
                    button_46.setTextColor(Color.GREEN);
                else
                    button_46.setTextColor(Color.RED);

                if(p[5][1] == 0)
                    button_47.setTextColor(Color.GREEN);
                else
                    button_47.setTextColor(Color.RED);

                if(p[5][2] == 0)
                    button_48.setTextColor(Color.GREEN);
                else
                    button_48.setTextColor(Color.RED);

                if(p[5][3] == 0)
                    button_49.setTextColor(Color.GREEN);
                else
                    button_49.setTextColor(Color.RED);

                if(p[5][4] == 0)
                    button_50.setTextColor(Color.GREEN);
                else
                    button_50.setTextColor(Color.RED);

                if(p[5][5] == 0)
                    button_51.setTextColor(Color.GREEN);
                else
                    button_51.setTextColor(Color.RED);

                if(p[5][6] == 0)
                    button_52.setTextColor(Color.GREEN);
                else
                    button_52.setTextColor(Color.RED);

                if(p[5][7] == 0)
                    button_53.setTextColor(Color.GREEN);
                else
                    button_53.setTextColor(Color.RED);

                if(p[5][8] == 0)
                    button_54.setTextColor(Color.GREEN);
                else
                    button_54.setTextColor(Color.RED);

                //Hetedik sor
                if(p[6][0] == 0)
                    button_55.setTextColor(Color.GREEN);
                else
                    button_55.setTextColor(Color.RED);

                if(p[6][1] == 0)
                    button_56.setTextColor(Color.GREEN);
                else
                    button_56.setTextColor(Color.RED);

                if(p[6][2] == 0)
                    button_57.setTextColor(Color.GREEN);
                else
                    button_57.setTextColor(Color.RED);

                if(p[6][3] == 0)
                    button_58.setTextColor(Color.GREEN);
                else
                    button_58.setTextColor(Color.RED);

                if(p[6][4] == 0)
                    button_59.setTextColor(Color.GREEN);
                else
                    button_59.setTextColor(Color.RED);

                if(p[6][5] == 0)
                    button_60.setTextColor(Color.GREEN);
                else
                    button_60.setTextColor(Color.RED);

                if(p[6][6] == 0)
                    button_61.setTextColor(Color.GREEN);
                else
                    button_61.setTextColor(Color.RED);

                if(p[6][7] == 0)
                    button_62.setTextColor(Color.GREEN);
                else
                    button_62.setTextColor(Color.RED);

                if(p[6][8] == 0)
                    button_63.setTextColor(Color.GREEN);
                else
                    button_63.setTextColor(Color.RED);

                //Nyolcadik sor
                if(p[7][0] == 0)
                    button_64.setTextColor(Color.GREEN);
                else
                    button_64.setTextColor(Color.RED);

                if(p[7][1] == 0)
                    button_65.setTextColor(Color.GREEN);
                else
                    button_65.setTextColor(Color.RED);

                if(p[7][2] == 0)
                    button_66.setTextColor(Color.GREEN);
                else
                    button_66.setTextColor(Color.RED);

                if(p[7][3] == 0)
                    button_67.setTextColor(Color.GREEN);
                else
                    button_67.setTextColor(Color.RED);

                if(p[7][4] == 0)
                    button_68.setTextColor(Color.GREEN);
                else
                    button_68.setTextColor(Color.RED);

                if(p[7][5] == 0)
                    button_69.setTextColor(Color.GREEN);
                else
                    button_69.setTextColor(Color.RED);

                if(p[7][6] == 0)
                    button_70.setTextColor(Color.GREEN);
                else
                    button_70.setTextColor(Color.RED);

                if(p[7][7] == 0)
                    button_71.setTextColor(Color.GREEN);
                else
                    button_71.setTextColor(Color.RED);

                if(p[7][8] == 0)
                    button_72.setTextColor(Color.GREEN);
                else
                    button_72.setTextColor(Color.RED);

                //Kilencedik sor
                if(p[8][0] == 0)
                    button_73.setTextColor(Color.GREEN);
                else
                    button_73.setTextColor(Color.RED);

                if(p[8][1] == 0)
                    button_74.setTextColor(Color.GREEN);
                else
                    button_74.setTextColor(Color.RED);

                if(p[8][2] == 0)
                    button_75.setTextColor(Color.GREEN);
                else
                    button_75.setTextColor(Color.RED);

                if(p[8][3] == 0)
                    button_76.setTextColor(Color.GREEN);
                else
                    button_76.setTextColor(Color.RED);

                if(p[8][4] == 0)
                    button_77.setTextColor(Color.GREEN);
                else
                    button_77.setTextColor(Color.RED);

                if(p[8][5] == 0)
                    button_78.setTextColor(Color.GREEN);
                else
                    button_78.setTextColor(Color.RED);

                if(p[8][6] == 0)
                    button_79.setTextColor(Color.GREEN);
                else
                    button_79.setTextColor(Color.RED);

                if(p[8][7] == 0)
                    button_80.setTextColor(Color.GREEN);
                else
                    button_80.setTextColor(Color.RED);

                if(p[8][8] == 0)
                    button_81.setTextColor(Color.GREEN);
                else
                    button_81.setTextColor(Color.RED);
            }
        });
        button_solution = findViewById(R.id.buttonSolution);
        button_solution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSolution();
            }
        });
    }

    private void getPlayersSolution() {

        //Elso sor
        if(!button_1.getText().toString().equals("") && !button_1.getText().toString().equals(""))
            playersSolution[0][0] = Integer.parseInt(button_1.getText().toString());

        if(!button_2.getText().toString().equals("") && !button_2.getText().toString().equals(""))
            playersSolution[0][1] = Integer.parseInt(button_2.getText().toString());

        if(!button_3.getText().toString().equals("") && !button_3.getText().toString().equals(""))
            playersSolution[0][2] = Integer.parseInt(button_3.getText().toString());

        if(!button_4.getText().toString().equals("") && !button_4.getText().toString().equals(""))
            playersSolution[0][3] = Integer.parseInt(button_4.getText().toString());

        if(!button_5.getText().toString().equals("") && !button_5.getText().toString().equals(""))
            playersSolution[0][4] = Integer.parseInt(button_5.getText().toString());

        if(!button_6.getText().toString().equals("") && !button_6.getText().toString().equals(""))
            playersSolution[0][5] = Integer.parseInt(button_6.getText().toString());

        if(!button_7.getText().toString().equals("") && !button_7.getText().toString().equals(""))
            playersSolution[0][6] = Integer.parseInt(button_7.getText().toString());

        if(!button_8.getText().toString().equals("") && !button_8.getText().toString().equals(""))
            playersSolution[0][7] = Integer.parseInt(button_8.getText().toString());

        if(!button_9.getText().toString().equals("") && !button_9.getText().toString().equals(""))
            playersSolution[0][8] = Integer.parseInt(button_9.getText().toString());

        //Masodik sor
        if(!button_10.getText().toString().equals("") && !button_10.getText().toString().equals(""))
            playersSolution[1][0] = Integer.parseInt(button_10.getText().toString());

        if(!button_11.getText().toString().equals("") && !button_11.getText().toString().equals(""))
            playersSolution[1][1] = Integer.parseInt(button_11.getText().toString());

        if(!button_12.getText().toString().equals("") && !button_12.getText().toString().equals(""))
            playersSolution[1][2] = Integer.parseInt(button_12.getText().toString());

        if(!button_13.getText().toString().equals("") && !button_13.getText().toString().equals(""))
            playersSolution[1][3] = Integer.parseInt(button_13.getText().toString());

        if(!button_14.getText().toString().equals("") && !button_14.getText().toString().equals(""))
            playersSolution[1][4] = Integer.parseInt(button_14.getText().toString());

        if(!button_15.getText().toString().equals("") && !button_15.getText().toString().equals(""))
            playersSolution[1][5] = Integer.parseInt(button_15.getText().toString());

        if(!button_16.getText().toString().equals("") && !button_16.getText().toString().equals(""))
            playersSolution[1][6] = Integer.parseInt(button_16.getText().toString());

        if(!button_17.getText().toString().equals("") && !button_17.getText().toString().equals(""))
            playersSolution[1][7] = Integer.parseInt(button_17.getText().toString());

        if(!button_18.getText().toString().equals("") && !button_18.getText().toString().equals(""))
            playersSolution[1][8] = Integer.parseInt(button_18.getText().toString());

        //Harmadik sor
        if(!button_19.getText().toString().equals("") && !button_19.getText().toString().equals(""))
            playersSolution[2][0] = Integer.parseInt(button_19.getText().toString());

        if(!button_20.getText().toString().equals("") && !button_20.getText().toString().equals(""))
            playersSolution[2][1] = Integer.parseInt(button_20.getText().toString());

        if(!button_21.getText().toString().equals("") && !button_21.getText().toString().equals(""))
            playersSolution[2][2] = Integer.parseInt(button_21.getText().toString());

        if(!button_22.getText().toString().equals("") && !button_22.getText().toString().equals(""))
            playersSolution[2][3] = Integer.parseInt(button_22.getText().toString());

        if(!button_23.getText().toString().equals("") && !button_23.getText().toString().equals(""))
            playersSolution[2][4] = Integer.parseInt(button_23.getText().toString());

        if(!button_24.getText().toString().equals("") && !button_24.getText().toString().equals(""))
            playersSolution[2][5] = Integer.parseInt(button_24.getText().toString());

        if(!button_25.getText().toString().equals("") && !button_25.getText().toString().equals(""))
            playersSolution[2][6] = Integer.parseInt(button_25.getText().toString());

        if(!button_26.getText().toString().equals("") && !button_26.getText().toString().equals(""))
            playersSolution[2][7] = Integer.parseInt(button_26.getText().toString());

        if(!button_27.getText().toString().equals("") && !button_27.getText().toString().equals(""))
            playersSolution[2][8] = Integer.parseInt(button_27.getText().toString());

        //Negyedik sor
        if(!button_28.getText().toString().equals("") && !button_28.getText().toString().equals(""))
            playersSolution[3][0] = Integer.parseInt(button_28.getText().toString());

        if(!button_29.getText().toString().equals("") && !button_29.getText().toString().equals(""))
            playersSolution[3][1] = Integer.parseInt(button_29.getText().toString());

        if(!button_30.getText().toString().equals("") && !button_30.getText().toString().equals(""))
            playersSolution[3][2] = Integer.parseInt(button_30.getText().toString());

        if(!button_31.getText().toString().equals("") && !button_31.getText().toString().equals(""))
            playersSolution[3][3] = Integer.parseInt(button_31.getText().toString());

        if(!button_32.getText().toString().equals("") && !button_32.getText().toString().equals(""))
            playersSolution[3][4] = Integer.parseInt(button_32.getText().toString());

        if(!button_33.getText().toString().equals("") && !button_33.getText().toString().equals(""))
            playersSolution[3][5] = Integer.parseInt(button_33.getText().toString());

        if(!button_34.getText().toString().equals("") && !button_34.getText().toString().equals(""))
            playersSolution[3][6] = Integer.parseInt(button_34.getText().toString());

        if(!button_35.getText().toString().equals("") && !button_35.getText().toString().equals(""))
            playersSolution[3][7] = Integer.parseInt(button_35.getText().toString());

        if(!button_36.getText().toString().equals("") && !button_36.getText().toString().equals(""))
            playersSolution[3][8] = Integer.parseInt(button_36.getText().toString());

        //Otodik sor
        if(!button_37.getText().toString().equals("") && !button_37.getText().toString().equals(""))
            playersSolution[4][0] = Integer.parseInt(button_37.getText().toString());

        if(!button_38.getText().toString().equals("") && !button_38.getText().toString().equals(""))
            playersSolution[4][1] = Integer.parseInt(button_38.getText().toString());

        if(!button_39.getText().toString().equals("") && !button_39.getText().toString().equals(""))
            playersSolution[4][2] = Integer.parseInt(button_39.getText().toString());

        if(!button_40.getText().toString().equals("") && !button_40.getText().toString().equals(""))
            playersSolution[4][3] = Integer.parseInt(button_40.getText().toString());

        if(!button_41.getText().toString().equals("") && !button_41.getText().toString().equals(""))
            playersSolution[4][4] = Integer.parseInt(button_41.getText().toString());

        if(!button_42.getText().toString().equals("") && !button_42.getText().toString().equals(""))
            playersSolution[4][5] = Integer.parseInt(button_42.getText().toString());

        if(!button_43.getText().toString().equals("") && !button_43.getText().toString().equals(""))
            playersSolution[4][6] = Integer.parseInt(button_43.getText().toString());

        if(!button_44.getText().toString().equals("") && !button_44.getText().toString().equals(""))
            playersSolution[4][7] = Integer.parseInt(button_44.getText().toString());

        if(!button_45.getText().toString().equals("") && !button_45.getText().toString().equals(""))
            playersSolution[4][8] = Integer.parseInt(button_45.getText().toString());

        //Hatodik sor
        if(!button_46.getText().toString().equals("") && !button_46.getText().toString().equals(""))
            playersSolution[5][0] = Integer.parseInt(button_46.getText().toString());

        if(!button_47.getText().toString().equals("") && !button_47.getText().toString().equals(""))
            playersSolution[5][1] = Integer.parseInt(button_47.getText().toString());

        if(!button_48.getText().toString().equals("") && !button_48.getText().toString().equals(""))
            playersSolution[5][2] = Integer.parseInt(button_48.getText().toString());

        if(!button_49.getText().toString().equals("") && !button_49.getText().toString().equals(""))
            playersSolution[5][3] = Integer.parseInt(button_49.getText().toString());

        if(!button_50.getText().toString().equals("") && !button_50.getText().toString().equals(""))
            playersSolution[5][4] = Integer.parseInt(button_50.getText().toString());

        if(!button_51.getText().toString().equals("") && !button_51.getText().toString().equals(""))
            playersSolution[5][5] = Integer.parseInt(button_51.getText().toString());

        if(!button_52.getText().toString().equals("") && !button_52.getText().toString().equals(""))
            playersSolution[5][6] = Integer.parseInt(button_52.getText().toString());

        if(!button_53.getText().toString().equals("") && !button_53.getText().toString().equals(""))
            playersSolution[5][7] = Integer.parseInt(button_53.getText().toString());

        if(!button_54.getText().toString().equals("") && !button_54.getText().toString().equals(""))
            playersSolution[5][8] = Integer.parseInt(button_54.getText().toString());

        //Hetedik sor
        if(!button_55.getText().toString().equals("") && !button_55.getText().toString().equals(""))
            playersSolution[6][0] = Integer.parseInt(button_55.getText().toString());

        if(!button_56.getText().toString().equals("") && !button_56.getText().toString().equals(""))
            playersSolution[6][1] = Integer.parseInt(button_56.getText().toString());

        if(!button_57.getText().toString().equals("") && !button_57.getText().toString().equals(""))
            playersSolution[6][2] = Integer.parseInt(button_57.getText().toString());

        if(!button_58.getText().toString().equals("") && !button_58.getText().toString().equals(""))
            playersSolution[6][3] = Integer.parseInt(button_58.getText().toString());

        if(!button_59.getText().toString().equals("") && !button_59.getText().toString().equals(""))
            playersSolution[6][4] = Integer.parseInt(button_59.getText().toString());

        if(!button_60.getText().toString().equals("") && !button_60.getText().toString().equals(""))
            playersSolution[6][5] = Integer.parseInt(button_60.getText().toString());

        if(!button_61.getText().toString().equals("") && !button_61.getText().toString().equals(""))
            playersSolution[6][6] = Integer.parseInt(button_61.getText().toString());

        if(!button_62.getText().toString().equals("") && !button_62.getText().toString().equals(""))
            playersSolution[6][7] = Integer.parseInt(button_62.getText().toString());

        if(!button_63.getText().toString().equals("") && !button_63.getText().toString().equals(""))
            playersSolution[6][8] = Integer.parseInt(button_63.getText().toString());

        //Nyolcadik sor
        if(!button_64.getText().toString().equals("") && !button_64.getText().toString().equals(""))
            playersSolution[7][0] = Integer.parseInt(button_64.getText().toString());

        if(!button_65.getText().toString().equals("") && !button_65.getText().toString().equals(""))
            playersSolution[7][1] = Integer.parseInt(button_65.getText().toString());

        if(!button_66.getText().toString().equals("") && !button_66.getText().toString().equals(""))
            playersSolution[7][2] = Integer.parseInt(button_66.getText().toString());

        if(!button_67.getText().toString().equals("") && !button_67.getText().toString().equals(""))
            playersSolution[7][3] = Integer.parseInt(button_67.getText().toString());

        if(!button_68.getText().toString().equals("") && !button_68.getText().toString().equals(""))
            playersSolution[7][4] = Integer.parseInt(button_68.getText().toString());

        if(!button_69.getText().toString().equals("") && !button_69.getText().toString().equals(""))
            playersSolution[7][5] = Integer.parseInt(button_69.getText().toString());

        if(!button_70.getText().toString().equals("") && !button_70.getText().toString().equals(""))
            playersSolution[7][6] = Integer.parseInt(button_70.getText().toString());

        if(!button_71.getText().toString().equals("") && !button_71.getText().toString().equals(""))
            playersSolution[7][7] = Integer.parseInt(button_71.getText().toString());

        if(!button_72.getText().toString().equals("") && !button_72.getText().toString().equals(""))
            playersSolution[7][8] = Integer.parseInt(button_72.getText().toString());

        //Kilencedik sor
        if(!button_73.getText().toString().equals("") && !button_73.getText().toString().equals(""))
            playersSolution[8][0] = Integer.parseInt(button_73.getText().toString());

        if(!button_74.getText().toString().equals("") && !button_74.getText().toString().equals(""))
            playersSolution[8][1] = Integer.parseInt(button_74.getText().toString());

        if(!button_75.getText().toString().equals("") && !button_75.getText().toString().equals(""))
            playersSolution[8][2] = Integer.parseInt(button_75.getText().toString());

        if(!button_76.getText().toString().equals("") && !button_76.getText().toString().equals(""))
            playersSolution[8][3] = Integer.parseInt(button_76.getText().toString());

        if(!button_77.getText().toString().equals("") && !button_77.getText().toString().equals(""))
            playersSolution[8][4] = Integer.parseInt(button_77.getText().toString());

        if(!button_78.getText().toString().equals("") && !button_78.getText().toString().equals(""))
            playersSolution[8][5] = Integer.parseInt(button_78.getText().toString());

        if(!button_79.getText().toString().equals("") && !button_79.getText().toString().equals(""))
            playersSolution[8][6] = Integer.parseInt(button_79.getText().toString());

        if(!button_80.getText().toString().equals("") && !button_80.getText().toString().equals(""))
            playersSolution[8][7] = Integer.parseInt(button_80.getText().toString());

        if(!button_81.getText().toString().equals("") && !button_81.getText().toString().equals(""))
            playersSolution[8][8] = Integer.parseInt(button_81.getText().toString());
    }

    private int[][] checkPlayersSolution(int[][] s, int[][] ps) {

        int[][] pattern = new int[9][9];
        for(int i = 0; i < 9; ++i) {
            for(int j = 0; j < 9; ++j) {
                if(s[i][j] == ps[i][j])
                    pattern[i][j] = 0;
                else
                    pattern[i][j] = 1;
            }
        }

        return pattern;
    }

    private void showSolution() {

        if(button_1.getText().toString().equals("")) {
            button_1.setText("");
            button_1.setText(String.valueOf(solution[0][0]));
            button_1.setTextColor(Color.GREEN);
        }

        if(button_2.getText().toString().equals("")) {
            button_2.setText("");
            button_2.setText(String.valueOf(solution[0][1]));
            button_2.setTextColor(Color.GREEN);
        }

        if(button_3.getText().toString().equals("")) {
            button_3.setText("");
            button_3.setText(String.valueOf(solution[0][2]));
            button_3.setTextColor(Color.GREEN);
        }

        if(button_4.getText().toString().equals("")) {
            button_4.setText("");
            button_4.setText(String.valueOf(solution[0][3]));
            button_4.setTextColor(Color.GREEN);
        }

        if(button_5.getText().toString().equals("")) {
            button_5.setText("");
            button_5.setText(String.valueOf(solution[0][4]));
            button_5.setTextColor(Color.GREEN);
        }

        if(button_6.getText().toString().equals("")) {
            button_6.setText("");
            button_6.setText(String.valueOf(solution[0][5]));
            button_6.setTextColor(Color.GREEN);
        }

        if(button_7.getText().toString().equals("")) {
            button_7.setText("");
            button_7.setText(String.valueOf(solution[0][6]));
            button_7.setTextColor(Color.GREEN);
        }

        if(button_8.getText().toString().equals("")) {
            button_8.setText("");
            button_8.setText(String.valueOf(solution[0][7]));
            button_8.setTextColor(Color.GREEN);
        }

        if(button_9.getText().toString().equals("")) {
            button_9.setText("");
            button_9.setText(String.valueOf(solution[0][8]));
            button_9.setTextColor(Color.GREEN);
        }

        //Masodik sor
        if(button_10.getText().toString().equals("")) {
            button_10.setText("");
            button_10.setText(String.valueOf(solution[1][0]));
            button_10.setTextColor(Color.GREEN);
        }
        if(button_11.getText().toString().equals("")) {
            button_11.setText("");
            button_11.setText(String.valueOf(solution[1][1]));
            button_11.setTextColor(Color.GREEN);
        }
        if(button_12.getText().toString().equals("")) {
            button_12.setText("");
            button_12.setText(String.valueOf(solution[1][2]));
            button_12.setTextColor(Color.GREEN);
        }
        if(button_13.getText().toString().equals("")) {
            button_13.setText("");
            button_13.setText(String.valueOf(solution[1][3]));
            button_13.setTextColor(Color.GREEN);
        }
        if(button_14.getText().toString().equals("")) {
            button_14.setText("");
            button_14.setText(String.valueOf(solution[1][4]));
            button_14.setTextColor(Color.GREEN);
        }
        if(button_15.getText().toString().equals("")) {
            button_15.setText("");
            button_15.setText(String.valueOf(solution[1][5]));
            button_15.setTextColor(Color.GREEN);
        }
        if(button_16.getText().toString().equals("")) {
            button_16.setText("");
            button_16.setText(String.valueOf(solution[1][6]));
            button_16.setTextColor(Color.GREEN);
        }
        if(button_17.getText().toString().equals("")) {
            button_17.setText("");
            button_17.setText(String.valueOf(solution[1][7]));
            button_17.setTextColor(Color.GREEN);
        }
        if(button_18.getText().toString().equals("")) {
            button_18.setText("");
            button_18.setText(String.valueOf(solution[1][8]));
            button_18.setTextColor(Color.GREEN);
        }

        //Harmadik sor
        if(button_19.getText().toString().equals("")) {
            button_19.setText("");
            button_19.setText(String.valueOf(solution[2][0]));
            button_19.setTextColor(Color.GREEN);
        }
        if(button_20.getText().toString().equals("")) {
            button_20.setText("");
            button_20.setText(String.valueOf(solution[2][1]));
            button_20.setTextColor(Color.GREEN);
        }
        if(button_21.getText().toString().equals("")) {
            button_21.setText("");
            button_21.setText(String.valueOf(solution[2][2]));
            button_21.setTextColor(Color.GREEN);
        }
        if(button_22.getText().toString().equals("")) {
            button_22.setText("");
            button_22.setText(String.valueOf(solution[2][3]));
            button_22.setTextColor(Color.GREEN);
        }
        if(button_23.getText().toString().equals("")) {
            button_23.setText("");
            button_23.setText(String.valueOf(solution[2][4]));
            button_23.setTextColor(Color.GREEN);
        }
        if(button_24.getText().toString().equals("")) {
            button_24.setText("");
            button_24.setText(String.valueOf(solution[2][5]));
            button_24.setTextColor(Color.GREEN);
        }
        if(button_25.getText().toString().equals("")) {
            button_25.setText("");
            button_25.setText(String.valueOf(solution[2][6]));
            button_25.setTextColor(Color.GREEN);
        }
        if(button_26.getText().toString().equals("")) {
            button_26.setText("");
            button_26.setText(String.valueOf(solution[2][7]));
            button_26.setTextColor(Color.GREEN);
        }
        if(button_27.getText().toString().equals("")) {
            button_27.setText("");
            button_27.setText(String.valueOf(solution[2][8]));
            button_27.setTextColor(Color.GREEN);
        }

        //Negyedik sor
        if(button_28.getText().toString().equals("")) {
            button_28.setText("");
            button_28.setText(String.valueOf(solution[3][0]));
            button_28.setTextColor(Color.GREEN);
        }
        if(button_29.getText().toString().equals("")) {
            button_29.setText("");
            button_29.setText(String.valueOf(solution[3][1]));
            button_29.setTextColor(Color.GREEN);
        }
        if(button_30.getText().toString().equals("")) {
            button_30.setText("");
            button_30.setText(String.valueOf(solution[3][2]));
            button_30.setTextColor(Color.GREEN);
        }
        if(button_31.getText().toString().equals("")) {
            button_31.setText("");
            button_31.setText(String.valueOf(solution[3][3]));
            button_31.setTextColor(Color.GREEN);
        }
        if(button_32.getText().toString().equals("")) {
            button_32.setText("");
            button_32.setText(String.valueOf(solution[3][4]));
            button_32.setTextColor(Color.GREEN);
        }
        if(button_33.getText().toString().equals("")) {
            button_33.setText("");
            button_33.setText(String.valueOf(solution[3][5]));
            button_33.setTextColor(Color.GREEN);
        }
        if(button_34.getText().toString().equals("")) {
            button_34.setText("");
            button_34.setText(String.valueOf(solution[3][6]));
            button_34.setTextColor(Color.GREEN);
        }
        if(button_35.getText().toString().equals("")) {
            button_35.setText("");
            button_35.setText(String.valueOf(solution[3][7]));
            button_35.setTextColor(Color.GREEN);
        }
        if(button_36.getText().toString().equals("")) {
            button_36.setText("");
            button_36.setText(String.valueOf(solution[3][8]));
            button_36.setTextColor(Color.GREEN);
        }

        //Ötödik sor
        if(button_37.getText().toString().equals("")) {
            button_37.setText("");
            button_37.setText(String.valueOf(solution[4][0]));
            button_37.setTextColor(Color.GREEN);
        }
        if(button_38.getText().toString().equals("")) {
            button_38.setText("");
            button_38.setText(String.valueOf(solution[4][1]));
            button_38.setTextColor(Color.GREEN);
        }
        if(button_39.getText().toString().equals("")) {
            button_39.setText("");
            button_39.setText(String.valueOf(solution[4][2]));
            button_39.setTextColor(Color.GREEN);
        }
        if(button_40.getText().toString().equals("")) {
            button_40.setText("");
            button_40.setText(String.valueOf(solution[4][3]));
            button_40.setTextColor(Color.GREEN);
        }
        if(button_41.getText().toString().equals("")) {
            button_41.setText("");
            button_41.setText(String.valueOf(solution[4][4]));
            button_41.setTextColor(Color.GREEN);
        }
        if(button_42.getText().toString().equals("")) {
            button_42.setText("");
            button_42.setText(String.valueOf(solution[4][5]));
            button_42.setTextColor(Color.GREEN);
        }
        if(button_43.getText().toString().equals("")) {
            button_43.setText("");
            button_43.setText(String.valueOf(solution[4][6]));
            button_43.setTextColor(Color.GREEN);
        }
        if(button_34.getText().toString().equals("")) {
            button_44.setText("");
            button_44.setText(String.valueOf(solution[4][7]));
            button_44.setTextColor(Color.GREEN);
        }
        if(button_45.getText().toString().equals("")) {
            button_45.setText("");
            button_45.setText(String.valueOf(solution[4][8]));
            button_45.setTextColor(Color.GREEN);
        }

        //Hatodik sor
        if(button_46.getText().toString().equals("")) {
            button_46.setText("");
            button_46.setText(String.valueOf(solution[5][0]));
            button_46.setTextColor(Color.GREEN);
        }
        if(button_47.getText().toString().equals("")) {
            button_47.setText("");
            button_47.setText(String.valueOf(solution[5][1]));
        }
        if(button_48.getText().toString().equals("")) {
            button_48.setText("");
            button_48.setText(String.valueOf(solution[5][2]));
            button_48.setTextColor(Color.GREEN);
        }
        if(button_49.getText().toString().equals("")) {
            button_49.setText("");
            button_49.setText(String.valueOf(solution[5][3]));
            button_49.setTextColor(Color.GREEN);
        }
        if(button_50.getText().toString().equals("")) {
            button_50.setText("");
            button_50.setText(String.valueOf(solution[5][4]));
            button_50.setTextColor(Color.GREEN);
        }
        if(button_51.getText().toString().equals("")) {
            button_51.setText("");
            button_51.setText(String.valueOf(solution[5][5]));
            button_51.setTextColor(Color.GREEN);
        }
        if(button_52.getText().toString().equals("")) {
            button_52.setText("");
            button_52.setText(String.valueOf(solution[5][6]));
            button_52.setTextColor(Color.GREEN);
        }
        if(button_53.getText().toString().equals("")) {
            button_53.setText("");
            button_53.setText(String.valueOf(solution[5][7]));
            button_53.setTextColor(Color.GREEN);
        }
        if(button_54.getText().toString().equals("")) {
            button_54.setText("");
            button_54.setText(String.valueOf(solution[5][8]));
            button_54.setTextColor(Color.GREEN);
        }

        //Hetedik sor
        if(button_55.getText().toString().equals("")) {
            button_55.setText("");
            button_55.setText(String.valueOf(solution[6][0]));
            button_55.setTextColor(Color.GREEN);
        }
        if(button_56.getText().toString().equals("")) {
            button_56.setText("");
            button_56.setText(String.valueOf(solution[6][1]));
            button_56.setTextColor(Color.GREEN);
        }
        if(button_57.getText().toString().equals("")) {
            button_57.setText("");
            button_57.setText(String.valueOf(solution[6][2]));
            button_57.setTextColor(Color.GREEN);
        }
        if(button_58.getText().toString().equals("")) {
            button_58.setText("");
            button_58.setText(String.valueOf(solution[6][3]));
            button_58.setTextColor(Color.GREEN);
        }
        if(button_59.getText().toString().equals("")) {
            button_59.setText("");
            button_59.setText(String.valueOf(solution[6][4]));
            button_59.setTextColor(Color.GREEN);
        }
        if(button_60.getText().toString().equals("")) {
            button_60.setText("");
            button_60.setText(String.valueOf(solution[6][5]));
            button_60.setTextColor(Color.GREEN);
        }
        if(button_61.getText().toString().equals("")) {
            button_61.setText("");
            button_61.setText(String.valueOf(solution[6][6]));
            button_61.setTextColor(Color.GREEN);
        }
        if(button_62.getText().toString().equals("")) {
            button_62.setText("");
            button_62.setText(String.valueOf(solution[6][7]));
            button_62.setTextColor(Color.GREEN);
        }
        if(button_63.getText().toString().equals("")) {
            button_63.setText("");
            button_63.setText(String.valueOf(solution[6][8]));
            button_63.setTextColor(Color.GREEN);
        }

        //Nyolcadik sor
        if(button_64.getText().toString().equals("")) {
            button_64.setText("");
            button_64.setText(String.valueOf(solution[2][0]));
            button_64.setTextColor(Color.GREEN);
        }
        if(button_65.getText().toString().equals("")) {
            button_65.setText("");
            button_65.setText(String.valueOf(solution[7][1]));
            button_65.setTextColor(Color.GREEN);
        }
        if(button_66.getText().toString().equals("")) {
            button_66.setText("");
            button_66.setText(String.valueOf(solution[7][2]));
            button_66.setTextColor(Color.GREEN);
        }
        if(button_67.getText().toString().equals("")) {
            button_67.setText("");
            button_67.setText(String.valueOf(solution[7][3]));
            button_68.setTextColor(Color.GREEN);
        }
        if(button_68.getText().toString().equals("")) {
            button_68.setText("");
            button_68.setText(String.valueOf(solution[7][4]));
            button_68.setTextColor(Color.GREEN);
        }
        if(button_69.getText().toString().equals("")) {
            button_69.setText("");
            button_69.setText(String.valueOf(solution[7][5]));
            button_69.setTextColor(Color.GREEN);
        }
        if(button_70.getText().toString().equals("")) {
            button_70.setText("");
            button_70.setText(String.valueOf(solution[7][6]));
            button_70.setTextColor(Color.GREEN);
        }
        if(button_71.getText().toString().equals("")) {
            button_71.setText("");
            button_71.setText(String.valueOf(solution[7][7]));
            button_71.setTextColor(Color.GREEN);
        }
        if(button_72.getText().toString().equals("")) {
            button_72.setText("");
            button_72.setText(String.valueOf(solution[7][8]));
            button_72.setTextColor(Color.GREEN);
        }

        //Kilencedik sor
        if(button_73.getText().toString().equals("")) {
            button_73.setText("");
            button_73.setText(String.valueOf(solution[8][0]));
            button_73.setTextColor(Color.GREEN);
        }
        if(button_74.getText().toString().equals("")) {
            button_74.setText("");
            button_74.setText(String.valueOf(solution[8][1]));
            button_74.setTextColor(Color.GREEN);
        }
        if(button_75.getText().toString().equals("")) {
            button_75.setText("");
            button_75.setText(String.valueOf(solution[8][2]));
            button_75.setTextColor(Color.GREEN);
        }
        if(button_76.getText().toString().equals("")) {
            button_76.setText("");
            button_76.setText(String.valueOf(solution[8][3]));
            button_76.setTextColor(Color.GREEN);
        }
        if(button_77.getText().toString().equals("")) {
            button_77.setText("");
            button_77.setText(String.valueOf(solution[8][4]));
            button_77.setTextColor(Color.GREEN);
        }
        if(button_78.getText().toString().equals("")) {
            button_78.setText("");
            button_78.setText(String.valueOf(solution[8][5]));
            button_78.setTextColor(Color.GREEN);
        }
        if(button_79.getText().toString().equals("")) {
            button_79.setText("");
            button_79.setText(String.valueOf(solution[8][6]));
            button_79.setTextColor(Color.GREEN);
        }
        if(button_80.getText().toString().equals("")) {
            button_80.setText("");
            button_80.setText(String.valueOf(solution[8][7]));
            button_80.setTextColor(Color.GREEN);
        }
        if(button_81.getText().toString().equals("")) {
            button_81.setText("");
            button_81.setText(String.valueOf(solution[8][8]));
            button_81.setTextColor(Color.GREEN);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_REQUEST) {
            if (resultCode == Activity.RESULT_OK) {

                number_to_set = data.getIntExtra(Constant.INTENT_NUMBER_TO_SET, 0);

                switch (id) {
                    case 1:
                        button_1.setText(String.valueOf(number_to_set));
                        break;
                    case 2:
                        button_2.setText(String.valueOf(number_to_set));
                        break;
                    case 3:
                        button_3.setText(String.valueOf(number_to_set));
                        break;
                    case 4:
                        button_4.setText(String.valueOf(number_to_set));
                        break;
                    case 5:
                        button_5.setText(String.valueOf(number_to_set));
                        break;
                    case 6:
                        button_6.setText(String.valueOf(number_to_set));
                        break;
                    case 7:
                        button_7.setText(String.valueOf(number_to_set));
                        break;
                    case 8:
                        button_8.setText(String.valueOf(number_to_set));
                        break;
                    case 9:
                        button_9.setText(String.valueOf(number_to_set));
                        break;
                    case 10:
                        button_10.setText(String.valueOf(number_to_set));
                        break;
                    case 11:
                        button_11.setText(String.valueOf(number_to_set));
                        break;
                    case 12:
                        button_12.setText(String.valueOf(number_to_set));
                        break;
                    case 13:
                        button_13.setText(String.valueOf(number_to_set));
                        break;
                    case 14:
                        button_14.setText(String.valueOf(number_to_set));
                        break;
                    case 15:
                        button_15.setText(String.valueOf(number_to_set));
                        break;
                    case 16:
                        button_16.setText(String.valueOf(number_to_set));
                        break;
                    case 17:
                        button_17.setText(String.valueOf(number_to_set));
                        break;
                    case 18:
                        button_18.setText(String.valueOf(number_to_set));
                        break;
                    case 19:
                        button_19.setText(String.valueOf(number_to_set));
                        break;
                    case 20:
                        button_20.setText(String.valueOf(number_to_set));
                        break;
                    case 21:
                        button_21.setText(String.valueOf(number_to_set));
                        break;
                    case 22:
                        button_22.setText(String.valueOf(number_to_set));
                        break;
                    case 23:
                        button_23.setText(String.valueOf(number_to_set));
                        break;
                    case 24:
                        button_24.setText(String.valueOf(number_to_set));
                        break;
                    case 25:
                        button_25.setText(String.valueOf(number_to_set));
                        break;
                    case 26:
                        button_26.setText(String.valueOf(number_to_set));
                        break;
                    case 27:
                        button_27.setText(String.valueOf(number_to_set));
                        break;
                    case 28:
                        button_28.setText(String.valueOf(number_to_set));
                        break;
                    case 29:
                        button_29.setText(String.valueOf(number_to_set));
                        break;
                    case 30:
                        button_30.setText(String.valueOf(number_to_set));
                        break;
                    case 31:
                        button_31.setText(String.valueOf(number_to_set));
                        break;
                    case 32:
                        button_32.setText(String.valueOf(number_to_set));
                        break;
                    case 33:
                        button_33.setText(String.valueOf(number_to_set));
                        break;
                    case 34:
                        button_34.setText(String.valueOf(number_to_set));
                        break;
                    case 35:
                        button_35.setText(String.valueOf(number_to_set));
                        break;
                    case 36:
                        button_36.setText(String.valueOf(number_to_set));
                        break;
                    case 37:
                        button_37.setText(String.valueOf(number_to_set));
                        break;
                    case 38:
                        button_38.setText(String.valueOf(number_to_set));
                        break;
                    case 39:
                        button_39.setText(String.valueOf(number_to_set));
                        break;
                    case 40:
                        button_40.setText(String.valueOf(number_to_set));
                        break;
                    case 41:
                        button_41.setText(String.valueOf(number_to_set));
                        break;
                    case 42:
                        button_42.setText(String.valueOf(number_to_set));
                        break;
                    case 43:
                        button_43.setText(String.valueOf(number_to_set));
                        break;
                    case 44:
                        button_44.setText(String.valueOf(number_to_set));
                        break;
                    case 45:
                        button_45.setText(String.valueOf(number_to_set));
                        break;
                    case 46:
                        button_46.setText(String.valueOf(number_to_set));
                        break;
                    case 47:
                        button_47.setText(String.valueOf(number_to_set));
                        break;
                    case 48:
                        button_48.setText(String.valueOf(number_to_set));
                        break;
                    case 49:
                        button_49.setText(String.valueOf(number_to_set));
                        break;
                    case 50:
                        button_50.setText(String.valueOf(number_to_set));
                        break;
                    case 51:
                        button_51.setText(String.valueOf(number_to_set));
                        break;
                    case 52:
                        button_52.setText(String.valueOf(number_to_set));
                        break;
                    case 53:
                        button_53.setText(String.valueOf(number_to_set));
                        break;
                    case 54:
                        button_54.setText(String.valueOf(number_to_set));
                        break;
                    case 55:
                        button_55.setText(String.valueOf(number_to_set));
                        break;
                    case 56:
                        button_56.setText(String.valueOf(number_to_set));
                        break;
                    case 57:
                        button_57.setText(String.valueOf(number_to_set));
                        break;
                    case 58:
                        button_58.setText(String.valueOf(number_to_set));
                        break;
                    case 59:
                        button_59.setText(String.valueOf(number_to_set));
                        break;
                    case 60:
                        button_60.setText(String.valueOf(number_to_set));
                        break;
                    case 61:
                        button_61.setText(String.valueOf(number_to_set));
                        break;
                    case 62:
                        button_62.setText(String.valueOf(number_to_set));
                        break;
                    case 63:
                        button_63.setText(String.valueOf(number_to_set));
                        break;
                    case 64:
                        button_64.setText(String.valueOf(number_to_set));
                        break;
                    case 65:
                        button_65.setText(String.valueOf(number_to_set));
                        break;
                    case 66:
                        button_66.setText(String.valueOf(number_to_set));
                        break;
                    case 67:
                        button_67.setText(String.valueOf(number_to_set));
                        break;
                    case 68:
                        button_68.setText(String.valueOf(number_to_set));
                        break;
                    case 69:
                        button_69.setText(String.valueOf(number_to_set));
                        break;
                    case 70:
                        button_70.setText(String.valueOf(number_to_set));
                        break;
                    case 71:
                        button_71.setText(String.valueOf(number_to_set));
                        break;
                    case 72:
                        button_72.setText(String.valueOf(number_to_set));
                        break;
                    case 73:
                        button_73.setText(String.valueOf(number_to_set));
                        break;
                    case 74:
                        button_74.setText(String.valueOf(number_to_set));
                        break;
                    case 75:
                        button_75.setText(String.valueOf(number_to_set));
                        break;
                    case 76:
                        button_76.setText(String.valueOf(number_to_set));
                        break;
                    case 77:
                        button_77.setText(String.valueOf(number_to_set));
                        break;
                    case 78:
                        button_78.setText(String.valueOf(number_to_set));
                        break;
                    case 79:
                        button_79.setText(String.valueOf(number_to_set));
                        break;
                    case 80:
                        button_80.setText(String.valueOf(number_to_set));
                        break;
                    case 81:
                        button_81.setText(String.valueOf(number_to_set));
                        break;
                    default:
                        break;
                }
            }
        }
    }
}