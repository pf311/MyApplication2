package fr.wildcodeschool.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;


public class    MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstN = findViewById(R.id.First);
        final EditText lastN = findViewById(R.id.Last);
        Button accept = findViewById(R.id.button2);
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String firstnameValue = firstN.getText().toString();
                String lastnameValue = lastN.getText().toString();


                if (firstnameValue.isEmpty() || lastnameValue.isEmpty()) {

                    Toast.makeText(MainActivity.this, "Please fill your FirstName and LastName" + firstnameValue + lastnameValue, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Congratulations " + firstN.getText().toString() + " " + lastN.getText().toString(), Toast.LENGTH_LONG).show();


                }


            } });

            CheckBox iWant = findViewById(R.id.wilder);
        iWant.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                EditText  editFirstName = findViewById(R.id.First);
                EditText editLastName = findViewById(R.id.Last);
                if (isChecked) {
                    editFirstName.setEnabled(true);
                    editLastName.setEnabled(true);

                } else {
                        editFirstName.setEnabled(false);
                        editLastName.setEnabled(false);

                    }

                }

        });





}}

