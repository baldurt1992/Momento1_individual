package com.example.momento1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText branch, model, color;

    TextView searchResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        branch = findViewById(R.id.branch);
        model = findViewById(R.id.model);
        color = findViewById(R.id.color);
        searchResult = findViewById(R.id.searchResult);

    }

        public void sendData (View view) {
            String inputBranch = branch.getText().toString();
            String inputModel = model.getText().toString();
            String inputColor = color.getText().toString();

            laptop searchLaptop = new laptop(inputBranch, inputModel, inputColor);
            Toast.makeText(this, "successfully", Toast.LENGTH_LONG).show();
            String txtResult =searchLaptop.branch + " " + searchLaptop.model + " " + searchLaptop.color;
            searchResult.setText(txtResult);
            searchResult.setTextColor(Color.parseColor("#FFCCDD1E"));

        }
    }
