package com.adventuredeveloper.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.adventuredeveloper.quiz.R.id.rb_image_view;

public class MainActivity extends AppCompatActivity {

    //Q1
    CheckBox cbIniAyam, cbIniSapi, cbIniKucing;
    //Q2
    RadioButton rbImageView;
    //Q3
    EditText edtDzaky;
    //Q4
    CheckBox cbDzakdzak, cbTitan, cbDoe;
    //Q5
    RadioButton rbJava;
    //Q6
    EditText edtIAK;
    //String untuk menampilkan hasil
    String cekSatu, cekDua, cekTiga, cekEmpat, cekLima, cekEnam;
    int nilai = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Q1
        cbIniAyam = (CheckBox) findViewById(R.id.cb_ini_ayam);
        cbIniKucing = (CheckBox) findViewById(R.id.cb_ini_kucing);
        cbIniSapi = (CheckBox) findViewById(R.id.cb_ini_sapi);
        //Q2
        rbImageView = (RadioButton) findViewById(rb_image_view);
        //Q3
        edtDzaky = (EditText) findViewById(R.id.edt_mdr);
        //Q4
        cbDzakdzak = (CheckBox) findViewById(R.id.cb_dzakdzak);
        cbTitan = (CheckBox) findViewById(R.id.cb_titan);
        cbDoe = (CheckBox) findViewById(R.id.cb_doe);
        //Q5
        rbJava = (RadioButton)findViewById(R.id.rb_java);
        //Q6
        edtIAK = (EditText)findViewById(R.id.edt_iak);
    }

    public void logic (View view){
        if (cbIniAyam.isChecked() && cbIniKucing.isChecked() && !cbIniSapi.isChecked()) {
            nilai = nilai + 1;
        } else {
            cekSatu = "1.Salah\n";
        }

        if (rbImageView.isChecked()) {
            nilai = nilai + 1;
        } else {
            cekDua = "2.Salah\n";
        }
        if (edtDzaky.getText().toString().equalsIgnoreCase("Muhammad Dzaky Rahmanto")) {
            nilai = nilai + 1;
        } else {
            cekTiga = "3.Salah\n";
        }
        if (cbDzakdzak.isChecked() && cbTitan.isChecked() && !cbDoe.isChecked()) {
            nilai = nilai + 1;
        } else {
            cekEmpat = "4.Salah\n";
        }
        if (rbJava.isChecked()){
            nilai = nilai + 1;
        } else {
            cekLima = "5.Salah\n";
        } if (edtIAK.getText().toString().equalsIgnoreCase("Indonesia Android Kejar")){
            nilai = nilai + 1;
        } else {
            cekEnam = "6.Salah\n";
        }
        Toast.makeText(MainActivity.this, "Nilai anda adalah = " + nilai + "\n" + cekSatu + cekDua + cekTiga + cekEmpat + cekLima + cekEnam, Toast.LENGTH_LONG).show();
        cekSatu = "1.benar\n";
        cekDua = "2.benar\n";
        cekTiga = "3.benar\n";
        cekEmpat = "4.benar\n";
        cekLima = "5.benar\n";
        cekEnam = "6.benar\n";
        nilai = 0;
    }
}
