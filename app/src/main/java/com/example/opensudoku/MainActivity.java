package com.example.opensudoku;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Intent;
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
    button_77, button_78, button_79, button_80, button_81, button_new_game;

    int id, number_to_set;
    public static final int RESULT_REQUEST = 1;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        id = 0;

        button_1 = findViewById(R.id.button1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 1;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_2 = findViewById(R.id.button2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 2;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_3 = findViewById(R.id.button3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 3;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_4 = findViewById(R.id.button4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 4;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_5 = findViewById(R.id.button5);
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 5;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_6 = findViewById(R.id.button6);
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 6;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_7 = findViewById(R.id.button7);
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 7;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_8 = findViewById(R.id.button8);
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 8;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_9 = findViewById(R.id.button9);
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 9;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_10 = findViewById(R.id.button10);
        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 10;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_11 = findViewById(R.id.button11);
        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 11;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_12 = findViewById(R.id.button12);
        button_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 12;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_13 = findViewById(R.id.button13);
        button_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 13;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_14 = findViewById(R.id.button14);
        button_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 14;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_15 = findViewById(R.id.button15);
        button_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 15;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_16 = findViewById(R.id.button16);
        button_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 16;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_17 = findViewById(R.id.button17);
        button_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 17;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_18 = findViewById(R.id.button18);
        button_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 18;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_19 = findViewById(R.id.button19);
        button_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 19;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_20 = findViewById(R.id.button20);
        button_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 20;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_21 = findViewById(R.id.button21);
        button_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 21;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_22 = findViewById(R.id.button22);
        button_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 22;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_23 = findViewById(R.id.button23);
        button_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 23;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_24 = findViewById(R.id.button24);
        button_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 24;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_25 = findViewById(R.id.button25);
        button_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 25;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_26 = findViewById(R.id.button26);
        button_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 26;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_27 = findViewById(R.id.button27);
        button_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 27;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_28 = findViewById(R.id.button28);
        button_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 28;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_29 = findViewById(R.id.button29);
        button_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 29;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_30 = findViewById(R.id.button30);
        button_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 30;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_31 = findViewById(R.id.button31);
        button_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 31;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_32 = findViewById(R.id.button32);
        button_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 32;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_33 = findViewById(R.id.button33);
        button_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 33;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_34 = findViewById(R.id.button34);
        button_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 34;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_35 = findViewById(R.id.button35);
        button_35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 35;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_36 = findViewById(R.id.button36);
        button_36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 36;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_37 = findViewById(R.id.button37);
        button_37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 37;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_38 = findViewById(R.id.button38);
        button_38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 38;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_39 = findViewById(R.id.button39);
        button_39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 39;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_40 = findViewById(R.id.button40);
        button_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 40;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_41 = findViewById(R.id.button41);
        button_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 41;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_42 = findViewById(R.id.button42);
        button_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 42;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_43 = findViewById(R.id.button43);
        button_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 43;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_44 = findViewById(R.id.button44);
        button_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 44;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_45 = findViewById(R.id.button45);
        button_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 45;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_46 = findViewById(R.id.button46);
        button_46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 46;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_47 = findViewById(R.id.button47);
        button_47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 47;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_48 = findViewById(R.id.button48);
        button_48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 48;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_49 = findViewById(R.id.button49);
        button_49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 49;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_50 = findViewById(R.id.button50);
        button_50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 50;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_51 = findViewById(R.id.button51);
        button_51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 51;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_52 = findViewById(R.id.button52);
        button_52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 52;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_53 = findViewById(R.id.button53);
        button_53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 53;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_54 = findViewById(R.id.button54);
        button_54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 54;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_55 = findViewById(R.id.button55);
        button_55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 55;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_56 = findViewById(R.id.button56);
        button_56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 56;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_57 = findViewById(R.id.button57);
        button_57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 57;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_58 = findViewById(R.id.button58);
        button_58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 58;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_59 = findViewById(R.id.button59);
        button_59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 59;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_60 = findViewById(R.id.button60);
        button_60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 60;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_61 = findViewById(R.id.button61);
        button_61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 61;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_62 = findViewById(R.id.button62);
        button_62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 62;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_63 = findViewById(R.id.button63);
        button_63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 63;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_64 = findViewById(R.id.button64);
        button_64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 64;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_65 = findViewById(R.id.button65);
        button_65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 65;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_66 = findViewById(R.id.button66);
        button_66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 66;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_67 = findViewById(R.id.button67);
        button_67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 67;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_68 = findViewById(R.id.button68);
        button_68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 68;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_69 = findViewById(R.id.button69);
        button_69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 68;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_70 = findViewById(R.id.button70);
        button_70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 70;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_71 = findViewById(R.id.button71);
        button_71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 71;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_72 = findViewById(R.id.button72);
        button_72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 72;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_73 = findViewById(R.id.button73);
        button_73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 73;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_74 = findViewById(R.id.button74);
        button_74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 74;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_75 = findViewById(R.id.button75);
        button_75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 75;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_76 = findViewById(R.id.button76);
        button_76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 76;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_77 = findViewById(R.id.button77);
        button_77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 77;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_78 = findViewById(R.id.button78);
        button_78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 78;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_79 = findViewById(R.id.button79);
        button_79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 79;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_80 = findViewById(R.id.button80);
        button_80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 80;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_81 = findViewById(R.id.button81);
        button_81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 81;
                Intent intent = new Intent(MainActivity.this, PopupActivity.class);
                startActivityForResult(intent, RESULT_REQUEST);
            }
        });
        button_new_game = findViewById(R.id.buttonNewGame);
        button_new_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TaskGenerator tg = new TaskGenerator(9, 20);
                int[][] proba = tg.getLevel();
                for (int i = 0; i < 9; ++i)
                    for(int j = 0; j < 9; ++j)
                        Log.d(TAG, "proba" + String.valueOf(proba[i][j]));
            }
        });
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