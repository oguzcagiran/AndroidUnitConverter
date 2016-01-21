package com.example.oguzc.unitconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup currentUnit;
    private RadioGroup intendedUnit;
    private Button convertButton;
    private TextView resultTextView;
    private EditText valueEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentUnit = (RadioGroup)findViewById(R.id.currentUnit);
        intendedUnit = (RadioGroup)findViewById(R.id.intendedUnit);
        convertButton = (Button)findViewById(R.id.convertButton);
        resultTextView = (TextView)findViewById(R.id.resultTextView);
        valueEditText = (EditText)findViewById(R.id.valueEdittext);

        convertButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                try {
                    Converter converter = new Converter();
                    int idCurr = currentUnit.getCheckedRadioButtonId();
                    int idIntended = intendedUnit.getCheckedRadioButtonId();
                    String currUnit = ((RadioButton) findViewById(idCurr)).getText().toString();
                    String intendedUnit = ((RadioButton) findViewById(idIntended)).getText().toString();
                    double amount = Double.parseDouble(valueEditText.getText().toString());
                    checkEnteredValue(amount);
                    double result = converter.calculateResult(currUnit, intendedUnit, amount);
                    resultTextView.setText(String.valueOf(result));
                } catch(Exception e) {
                    Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }

        });

    }

    private void checkEnteredValue(double amount) {
        if(amount < 0) {
            throw new RuntimeException("Value must be greater than 0");
        }
    }
}