package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==200&&resultCode==RESULT_OK){
            String returnData =data.getStringExtra("return data");
            Log.d("return data",returnData);
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);
        Log.d("onCreate","onCreate:正在执行");
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式intent
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//                intent.putExtra("extra data","SecondActivity");
//                Bundle bundle = new Bundle();
////                bundle.putString("stringData","NiHao");
////                bundle.putInt("intData",100000);
////                intent.putExtras(bundle);
////                startActivity(intent);
                startActivityForResult(intent,200);

//                隐式intent
//                Intent intent = new Intent(Intent.ACTION_MAIN);
//                intent.addCategory(Intent.CATEGORY_HOME);
//                startActivity(intent);
                //自定义
//                Intent intent = new Intent("com.example.myapplication.ACTIVITY_START");
//                intent.addCategory("com.example.myapplication.MYCATEGORY");
//                startActivity(intent);
                //DATA属性
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.baidu.com/"));
//                startActivity(intent);
                //
//                Intent intent =new Intent();
//                intent.setAction(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);
            }
        });
    }
}
