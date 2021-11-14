package com.example.unit1submission1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setupBtn(View v){

        //Ensure previous views are not visible
        TextView txt = (TextView) findViewById(R.id.prjCreate);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.createStep1);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.createStep2);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.createStep3);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.compile);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.compileStep1);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.compileStep2);
        txt.setVisibility(View.INVISIBLE);

        //display the correct text on screen
        txt = (TextView) findViewById(R.id.setUp);
        txt.setText(R.string.setting_up_android_studio);
        txt.setVisibility(View.VISIBLE);

        txt = (TextView) findViewById((R.id.setupStep1));
        txt.setText(R.string._1_download_the_java_development_kit);
        txt.setVisibility(View.VISIBLE);

        txt = (TextView) findViewById((R.id.setupStep2));
        txt.setText(R.string._2_download_java_runtime);
        txt.setVisibility(View.VISIBLE);

        txt = (TextView) findViewById(R.id.setupStep3);
        txt.setText(R.string._3_download_android_studio);
        txt.setVisibility(View.VISIBLE);

    }

    public void createBtn(View v){
        TextView txt = (TextView) findViewById(R.id.setUp);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.setupStep1);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.setupStep2);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.setupStep3);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.compile);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.compileStep1);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.compileStep2);
        txt.setVisibility(View.INVISIBLE);

        //display the correct text on screen
        txt = (TextView) findViewById(R.id.setUp);
        txt.setText(R.string.create_a_project);
        txt.setVisibility(View.VISIBLE);

        txt = (TextView) findViewById((R.id.setupStep1));
        txt.setText(R.string.open_android_studio);
        txt.setVisibility(View.VISIBLE);

        txt = (TextView) findViewById((R.id.setupStep2));
        txt.setText(R.string.press_create_new_project);
        txt.setVisibility(View.VISIBLE);

        txt = (TextView) findViewById(R.id.setupStep3);
        txt.setText(R.string.select_project_template);
        txt.setVisibility(View.VISIBLE);

    }

    public void compileBtn(View v){
        TextView txt = (TextView) findViewById(R.id.setUp);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.setupStep1);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.setupStep2);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.setupStep3);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.prjCreate);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.createStep1);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.createStep2);
        txt.setVisibility(View.INVISIBLE);

        txt = (TextView) findViewById(R.id.createStep3);
        txt.setVisibility(View.INVISIBLE);


        //display the correct text on screen
        txt = (TextView) findViewById(R.id.setUp);
        txt.setText(R.string.compile);
        txt.setVisibility(View.VISIBLE);

        txt = (TextView) findViewById((R.id.setupStep2));
        txt.setText(R.string.press_ctrl_f9_to_build);
        txt.setVisibility(View.VISIBLE);

        txt = (TextView) findViewById((R.id.setupStep3));
        txt.setText(R.string.press_shift_f10_to_run);
        txt.setVisibility(View.VISIBLE);

    }

}