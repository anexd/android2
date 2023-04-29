package br.edu.icomp.appplaintext;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
    public void entrarClicado(View view) {
        EditText editText;
        editText = findViewById(R.id.editLogin);
        String login = editText.getText().toString();
        String msg = "Olá " + login + " !!";
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}

