package defandroide.arthur.trello_csd.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import defandroide.arthur.trello_csd.Model.Cartas;
import defandroide.arthur.trello_csd.R;
import defandroide.arthur.trello_csd.controller.CartaController;

public class MainActivity extends AppCompatActivity {

    CartaController controller;

    Cartas cartas;

    EditText edit_carta;
    EditText edit_raridade;

    Button btn_limpar;
    Button btn_Salvar;
    Button btn_Finalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controller = new CartaController(MainActivity.this);
        controller.toString();

        cartas = new Cartas();
        controller.buscar(cartas);


        edit_carta = findViewById(R.id.edit_carta);
        edit_raridade = findViewById(R.id.edit_raridade);

        edit_carta.setText(cartas.getCarta());
        edit_raridade.setText(cartas.getRaridade());

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_Salvar = findViewById(R.id.btn_salvar);
        btn_Finalizar = findViewById(R.id.btn_finalizar);

        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edit_carta.setText("");
                edit_raridade.setText("");

                controller.limpar();

            }
        });
        btn_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Aplicativo Finalizado", Toast.LENGTH_LONG).show();
                finish();

            }
        });

        btn_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            cartas.setCarta(edit_carta.getText().toString());
            cartas.setRaridade(edit_raridade.getText().toString());

            Toast.makeText(MainActivity.this, "Dados Salvos com sucesso" + cartas.toString(),Toast.LENGTH_LONG).show();

            controller.salvar(cartas);

            }
        });

    }
}