package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);

        setListeners();
    }

    private void setListeners(){
        OnClick onClick = new OnClick();
        mBtnButton.setOnClickListener(onClick);
        mBtnTextView.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    //跳转到TextView演示界面
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    //跳转到Button演示界面
                    intent = new Intent(MainActivity.this, ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    //跳转到EditText演示界面
                    intent = new Intent(MainActivity.this, EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    //跳转到RadioButton演示界面
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
            }
            startActivity(intent);

        }
    }
}
