    package defandroide.arthur.covermaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {
        Button btn_Reais;
        Button btn_Doler;
        Button btn_Euro;
        Button btn_Salvar;
        Button btn_Finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Reais = findViewById(R.id.btn_Reais);
        btn_Doler = findViewById(R.id.btn_Dolar);
        btn_Euro = findViewById(R.id.btn_Euro);
        btn_Salvar = findViewById(R.id.btn_Salvar);
        btn_Finalizar = findViewById(R.id.btn_Finalizar);

        btn_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Aplicativo Finalizado", Toast.LENGTH_LONG).show();
                finish();



                }
        });
        btn_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Dados Salvos com sucesso", Toast.LENGTH_LONG).show();
            }
        });
        btn_Doler.setOnClickListener(new View.OnClickListener() {
          @Override
            public void onClick(View view){

              Toast.makeText(MainActivity.this, "Você Mudou Para Dolar", Toast.LENGTH_LONG).show();
          }
        });
    }
}