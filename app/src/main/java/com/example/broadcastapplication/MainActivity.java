package com.example.broadcastapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.example.broadcastapplication.MyBroadcastReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowBroadcast(View view){

        Log.i("G", "GG - Appli send");

        EditText st = (EditText)findViewById(R.id.txtMsg);
        Intent intent = new Intent();
        intent.putExtra("msg",(CharSequence)st.getText().toString());
        intent.setClass(this, MyBroadcastReceiver.class);
        intent.setAction("com.example.broadcastapplication.CUSTOM_INTENT");
        sendBroadcast(intent);
    }
}