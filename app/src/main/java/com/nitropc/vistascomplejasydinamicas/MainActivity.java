package com.nitropc.vistascomplejasydinamicas;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    private TextInputLayout userNameInputLayout;
    private TextInputLayout userNameInputText;
    private MaterialButton buttonConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        listeners();
    }

    private void bindViews() {
        userNameInputLayout = findViewById(R.id.text_input_email);
        userNameInputText = findViewById(R.id.text_input_password);
        buttonConfirm = findViewById(R.id.mainButtonConfirm);

    }


    private void listeners() {
        buttonConfirm.setOnClickListener(view -> {
            if (userNameInputText.getEditText() != null
                    && userNameInputText.getEditText().length() > 1
                    && userNameInputText.getEditText().toString().equalsIgnoreCase("1234")) {
                userNameInputLayout.setError(null);
                Toast.makeText(MainActivity.this, "En Hora Buena", Toast.LENGTH_SHORT).show();
            } else {
                userNameInputLayout.setError("Algo Anda Mal");
            }
        });
    }

}





