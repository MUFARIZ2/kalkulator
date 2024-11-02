package com.example.kalkulator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText angka1 = findViewById(R.id.angka1);
        EditText angka2 = findViewById(R.id.angka2);
        EditText Hasil = findViewById(R.id.hasil);

        Button buttonTambah = findViewById(R.id.buttonTambah);
        Button buttonKurang = findViewById(R.id.buttonKurang);
        Button buttonBagi   = findViewById(R.id.buttonBagi);
        Button buttonKali   = findViewById(R.id.buttonKali);

        buttonTambah.setOnClickListener(v -> {
            String Angka1S = angka1.getText().toString();
            String Angka2S = angka2.getText().toString();
            int bil1 = Integer.parseInt(Angka1S);
            int bil2 = Integer.parseInt((Angka2S));
            int hasil = bil1 + bil2 ;
            String jawaban = Integer.toString(hasil);
            Hasil.setText(jawaban);

        });
        buttonKurang.setOnClickListener(v -> {
            String Angka1S = angka1.getText().toString();
            String Angka2S = angka2.getText().toString();
            int bil1 = Integer.parseInt(Angka1S);
            int bil2 = Integer.parseInt(Angka2S);
            int hasil = bil1 - bil2;
            String jawaban = Integer.toString(hasil);
            Hasil.setText(jawaban);
        });

        buttonBagi.setOnClickListener(v -> {
            String Angka1S = angka1.getText().toString();
            String Angka2S = angka2.getText().toString();
            double bil1    = Double.parseDouble(Angka1S);
            double bil2    = Double.parseDouble(Angka2S);
            double hasil   = bil1 / bil2;
            String jawaban = String.valueOf(hasil);
            Hasil.setText(jawaban);
        });

        buttonKali.setOnClickListener(v -> {
            String Angka1S = angka1.getText().toString();
            String Angka2S = angka2.getText().toString();
            int bil1 =  Integer.parseInt(Angka1S);
            int bil2 = Integer.parseInt(Angka2S);
            int hasil = bil1 * bil2;
            String jawaban = Integer.toString(hasil);
            Hasil.setText(jawaban);
        });
    }
}