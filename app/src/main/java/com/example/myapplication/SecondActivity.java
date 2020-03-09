package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
//        getExtra();
//        Intent intent = getIntent();
//        String extraData = intent.getStringExtra("extra data");
//        Log.d("extra data",extraData);
        //Bundle
//        Bundle bundle = this.getIntent().getExtras();
//        String str1 =bundle.getString("stringData");
//        int int1 = bundle.getInt("intData");
//        Log.d("stringData","str1");
//        Log.d("intData",String.valueOf(int1));
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Intent intent = new Intent();
        intent.putExtra("return data","hello world");
        setResult(RESULT_OK,intent);
        finish();
    }
}
