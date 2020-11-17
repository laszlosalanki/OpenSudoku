package com.example.opensudoku;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PopupActivity extends AppCompatActivity {

    DisplayMetrics dm;
    int pubWidth, pubHeight;
    Button button_cancel, button_ok;
    int number_to_set;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        init();

    }

    private void init() {
        number_to_set = 0;
        dm = new DisplayMetrics();

        setTitle("Add meg a számot!");

        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.9), (int) (height*.3));

        pubWidth = (int) (width*.9);
        pubHeight = (int) (height*.3) - 40;

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;

        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);

        editText = findViewById(R.id.editText);
        button_ok = findViewById(R.id.buttonPopupOk);
        button_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_to_set = Integer.parseInt(editText.getText().toString());
                Intent intent = getIntent();
                intent.putExtra(Constant.INTENT_NUMBER_TO_SET, number_to_set);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
        button_cancel = findViewById(R.id.buttonPopupCancel);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}