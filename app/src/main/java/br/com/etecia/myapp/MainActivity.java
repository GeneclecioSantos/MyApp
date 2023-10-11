package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button meuBotao;
    EditText meuCampoDeTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meuBotao = findViewById(R.id.containedButton);
        meuCampoDeTexto = findViewById(R.id.textValor);

        meuBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoDigitado = meuCampoDeTexto.getText().toString();
                // Aqui você pode armazenar 'textoDigitado' ou fazer o que desejar com ele.
            }
        });
    }
}
