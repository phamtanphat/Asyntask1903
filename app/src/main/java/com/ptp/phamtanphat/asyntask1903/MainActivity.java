package com.ptp.phamtanphat.asyntask1903;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnDownload;
    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDownload = findViewById(R.id.button);
        seekBar = findViewById(R.id.seekbar);

        seekBar.setVisibility(View.GONE);

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thucthidownload().execute();
            }
        });

    }
    //Tham so 1 : Gia tri truyen vao
    //Tham so 2 : Gia tri update len cho giao dien khi xu ly logic
    //Tham so 3 : Gia tri sau khi xu ly xong logic se tra ve
    class Thucthidownload extends AsyncTask<Void,Integer,String>{

        @Override
        protected void onPreExecute() {
            btnDownload.setVisibility(View.INVISIBLE);
            seekBar.setVisibility(View.VISIBLE);
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Void... voids) {
            for (int i = 0 ; i < 5 ; i++){
                publishProgress(20 );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                publishProgress((i + 1) * 20);
            }
            return "Down load ket thuc";
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            seekBar.setProgress(seekBar.getProgress() + values[0]);
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {
            seekBar.setVisibility(View.GONE);
            btnDownload.setVisibility(View.VISIBLE);
            Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            super.onPostExecute(s);
        }
    }
}
