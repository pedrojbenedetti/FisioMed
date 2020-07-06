package com.example.android.heartrate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;

public class ResultadosFC extends AppCompatActivity {
    int HR;
    ImageButton volver_inicio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados_f_c);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TextView RHR = (TextView) this.findViewById(R.id.calculateText);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            HR = bundle.getInt("bpm");
            RHR.setText(String.valueOf(HR));
        }
        volver_inicio=(ImageButton) findViewById(R.id.volver_inicio);
        volver_inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volverinicio = new Intent(ResultadosFC.this,Bienvenida.class);
                startActivity(volverinicio);
            }
        });
    }
}