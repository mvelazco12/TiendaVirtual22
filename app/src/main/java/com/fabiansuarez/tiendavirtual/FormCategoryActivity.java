package com.fabiansuarez.tiendavirtual;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputLayout;

import yuku.ambilwarna.AmbilWarnaDialog;

public class FormCategoryActivity extends AppCompatActivity {

    private Button btnOk, btnColorPicker;
    private TextInputLayout nameTextField;
    private MaterialToolbar topBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_category);


        topBar = findViewById(R.id.toppBar_form_activity);
        topBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();//cierrra el activity

            }
        });//detecta el click en el icono




        btnOk = findViewById(R.id.btnOK);
        btnColorPicker = findViewById(R.id.btn_color_new_category);
        nameTextField = findViewById(R.id.til_name_new_category);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateForm()) {
                    Toast.makeText(FormCategoryActivity.this, "SE GUARDO LA INFORMACION", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnColorPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AmbilWarnaDialog dialog = new AmbilWarnaDialog(FormCategoryActivity.this, Color.BLUE, new AmbilWarnaDialog.OnAmbilWarnaListener() {
                    @Override
                    public void onCancel(AmbilWarnaDialog dialog) {

                    }

                    @Override
                    public void onOk(AmbilWarnaDialog dialog, int color) {

                    }
                });
                dialog.show();
            }
        });

    }

    private boolean validateForm() {
        nameTextField.setError(null);
        String name = nameTextField.getEditText().getText().toString().trim();
        if (name.isEmpty()) {
            nameTextField.setError(getString(R.string.por_favor_ingrese_el_nombre));
            return false;
        }
        return true;
    }
}