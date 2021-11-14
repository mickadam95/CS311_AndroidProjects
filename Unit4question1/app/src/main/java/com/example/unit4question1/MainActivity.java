package com.example.unit4question1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    EditText text2;
    TextView output;
    Button addStrings;
    Button compareStrings;
    Button countChars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        output = findViewById(R.id.output1);
        addStrings = findViewById(R.id.addStringsBttn);
        compareStrings = findViewById(R.id.compareBttn);
        countChars = findViewById(R.id.charCountBttn);

        /*The addStings button takes both strings and concatenates them into one variable then displays it as the output*/
        addStrings.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String str1 = text1.getText().toString();
                String str2 = text2.getText().toString();

                String completeStr = str1 + str2;
                output.setText(completeStr);
            }
        });

        /*This button compare strings uses the compareTo method in the string library
        * to determine if both strings being passed are equal or not and updates the text shown in output accordingly*/
        compareStrings.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String str1 = text1.getText().toString();
                String str2 = text2.getText().toString();

               if(str1.compareTo(str2) == 0){
                   output.setText("The strings are equal");
                }
               else{
                   output.setText("The strings are not equal");
                }
            }
        });

        countChars.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String str1 = text1.getText().toString();
                String str2 = text2.getText().toString();
                String completeStr = str1 + str2;
                int count = 0;

                for(int i = 0; i < completeStr.length(); i ++) {

                    if (completeStr.charAt(i) == 'a') {
                        count = count + 1;
                    } else if (completeStr.charAt(i) == 'e') {
                        count = count + 1;
                    } else if (completeStr.charAt(i) == 'i')
                        count = count + 1;
                    else if (completeStr.charAt(i) == 'o') {
                        count = count + 1;
                    } else if (completeStr.charAt(i) == 'u') {
                        count = count + 1;
                    }

                }

                output.setText(Integer.toString(count));
            }
        });

    }
}
