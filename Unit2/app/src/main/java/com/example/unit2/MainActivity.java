package com.example.unit2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.net.IDN;

public class MainActivity extends AppCompatActivity {


    EditText customerName;
    EditText customerID;
    EditText customerAddress;
    Button submit1;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customerName = findViewById(R.id.customerNameText);
        customerID = findViewById(R.id.customerIdText);
        customerAddress = findViewById(R.id.customerAddressText);
        submit1 = findViewById(R.id.submitButton1);
        display = findViewById(R.id.displayText);

        submit1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String name = customerName.getText().toString();
                String address = customerAddress.getText().toString();
                String ID = customerID.getText().toString();
                int IDNum = Integer.parseInt(ID);
                boolean flag = false;
                String errorMsg = "";

                if(IDNum > 1000 || IDNum < 0){
                    flag = true;
                    errorMsg =  errorMsg + " Invalid ID";
                }

                if (flag == false) {
                    for (int i = 0; i < name.length(); i++) {

                        if (name.charAt(i) == ' ') {//if a space appears between first and last names skip the line
                            i++;
                        }

                        if (Character.isLetter(name.charAt(i)) == false) { //if the letter at the index is not a letter throw an error
                            errorMsg = errorMsg + " Invalid Name";
                        }
                    }
                }

                if (errorMsg == ""){
                    display.setText("Entry Accepted");
                }
                else
                    display.setText(errorMsg);
            }
        });

    }
}

