package com.example.oguzc.unitconverter;

import android.widget.EditText;
import android.widget.RadioGroup;

public class UserInterface {
    public void controlEditTextView(EditText enteredValue) throws EmptyEditTextException {
        if (enteredValue.getText().toString().isEmpty()) {
            throw new EmptyEditTextException("Please Enter The Value");
        }
    }

    public void controlRadioGroup(RadioGroup enteredGroup) {
    }
}
