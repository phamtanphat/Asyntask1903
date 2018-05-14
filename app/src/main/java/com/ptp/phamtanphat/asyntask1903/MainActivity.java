package com.ptp.phamtanphat.asyntask1903;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    class Thuthiindulieu extends AsyncTask<String,String,Boolean>{

        //Tham so 1 : Gia tri truyen vao
        //Tham so 2 : Gia tri update len cho giao dien khi xu ly logic
        //Tham so 3 : Gia tri sau khi xu ly xong logic se tra ve
        @Override
        protected Boolean doInBackground(String... strings) {
            return null;
        }

        @Override
        protected void onProgressUpdate(String... values) {

            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Boolean aBoolean) {
            super.onPostExecute(aBoolean);
        }
    }
}
