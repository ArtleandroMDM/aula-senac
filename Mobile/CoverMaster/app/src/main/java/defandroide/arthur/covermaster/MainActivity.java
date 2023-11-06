    package defandroide.arthur.covermaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {
        Button btnReais;
        Button btnDoler;
        Button btnEuro;
        Button btnSalvar;
        Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReais = findViewById(R.id.idReais);
        btnDoler = findViewById(R.id.idDolar);
        btnEuro = findViewById(R.id.idEuro);
        btnSalvar = findViewById(R.id.idSalvar);
        btnFinalizar = findViewById(R.id.idFinalizar);
    }
}