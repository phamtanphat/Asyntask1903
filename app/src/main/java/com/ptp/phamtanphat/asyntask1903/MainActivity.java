package com.ptp.phamtanphat.asyntask1903;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.textview);
        new Thucthiindulieu().execute("Cong viec");
    }
    //Tham so 1 : Gia tri truyen vao
    //Tham so 2 : Gia tri update len cho giao dien khi xu ly logic
    //Tham so 3 : Gia tri sau khi xu ly xong logic se tra ve
    class Thucthiindulieu extends AsyncTask<String,String,String>{

        @Override
        protected void onPreExecute() {
            txt.setText("Bat dau cong viec" + "\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            super.onPreExecute();
        }

        //Xu ly logic khong cap nhat truc tiep len view
        @Override
        protected String doInBackground(String... strings) {
            for (int i = 0 ; i <4 ; i++){
                //Cong viec thu 1
                //Cong viec thu 2
                //Cong viec thu 3
                String chuoi = strings[0] + " thu : " + i + "\n";
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress(chuoi);
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {
            txt.append(values[0]);
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }


    }
}
