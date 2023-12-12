package defandroide.arthur.trello_csd.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import defandroide.arthur.trello_csd.Model.Cartas;
import defandroide.arthur.trello_csd.R;
import defandroide.arthur.trello_csd.controller.CartaController;
import defandroide.arthur.trello_csd.controller.CartaSpContrller;

public class MainActivity extends AppCompatActivity {


    Cartas cartas;
    List<String> Listcart;
    CartaSpContrller cartaSpContrller;
    CartaController controller;


    EditText edit_carta;
    EditText edit_raridade;

    Button btn_limpar;
    Button btn_Salvar;
    Button btn_Finalizar;

    Cartas carta;
    Cartas raridade;

    Spinner spinner;

    List<Cartas> dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new CartaController(MainActivity.this);
        controller.toString();

        cartaSpContrller = new CartaSpContrller();

        Listcart = cartaSpContrller.getListcart();

        cartaSpContrller.getListcart();

        cartas = new Cartas();

        controller.buscar(cartas);


        edit_carta = findViewById(R.id.edit_carta);
        edit_raridade = findViewById(R.id.edit_raridade);
        spinner = findViewById(R.id.spinner);

        edit_carta.setText(cartas.getCarta());
        edit_raridade.setText(cartas.getRaridade());

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_Salvar = findViewById(R.id.btn_salvar);
        btn_Finalizar = findViewById(R.id.btn_finalizar);

//ArrayAdapter<String>adapter =
//        new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,cartaSpContrller.dadosSpinner());
//adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
//spinner.setAdapter(adapter);

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
        Log.i("POOAndroid",cartas.toString());
    }
}