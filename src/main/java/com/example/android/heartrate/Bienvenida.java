package com.example.android.heartrate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;

public class Bienvenida extends AppCompatActivity {
    int MY_PERMISSIONS_REQUEST_CAMERA=0;
    int MY_PERMISSIONS_REQUEST_RECORD_AUDIO=0;
    int MY_PERMISSIONS_REQUEST_WRITE_EXTERNAL_STORAGE=0;
    int MY_PERMISSIONS_REQUEST_READ_EXTERNAL_STORAGE=0;
    int MY_PERMISSIONS_REQUEST_READ_WAKE_LOCK=0;
    static final int REQUEST_CODE=123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        defineButtons();

    }

    public void defineButtons(){
        findViewById(R.id.button_hrt).setOnClickListener(buttonClickListener);
        findViewById(R.id.button_lng).setOnClickListener(buttonClickListener);

    }
    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button_hrt:
                    Intent irParCar=new Intent(Bienvenida.this, ParametrosCardiacos.class);
                    startActivity(irParCar);
                    break;
                case R.id.button_lng:
                    Intent irParResp=new Intent(Bienvenida.this, ParametrosRespiratorios.class);
                    startActivity(irParResp);
                    break;
            }
        }
    };


}