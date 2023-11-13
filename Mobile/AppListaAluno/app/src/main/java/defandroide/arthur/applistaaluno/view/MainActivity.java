package defandroide.arthur.applistaaluno.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import defandroide.arthur.applistaaluno.R;
import defandroide.arthur.applistaaluno.controller.PessoaController;
import defandroide.arthur.applistaaluno.model.Pessoa;

public class MainActivity extends AppCompatActivity {



    Pessoa pessoa;
    PessoaController controller;



    EditText id_nome;
    EditText id_sobrenome;
    EditText id_matricula;
    EditText id_cpf;
    Button btn_limpar;
    Button btn_Salvar;
    Button btn_Finalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        controller = new PessoaController(MainActivity.this);
        controller.toString();

        pessoa =  new Pessoa();
        controller.buscar(pessoa);



        id_nome = findViewById(R.id.editprimeironome);
        id_sobrenome = findViewById(R.id.editsobrenome);
        id_matricula = findViewById(R.id.editMatricula);
        id_cpf = findViewById(R.id.editCPF);

        id_sobrenome.setText(pessoa.getSobrenome());
        id_matricula.setText(pessoa.getMatricula());
        id_cpf.setText(pessoa.getCPF());

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_Salvar = findViewById(R.id.btn_Salvar);
        btn_Finalizar = findViewById(R.id.btn_Finalizar);



        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id_nome.setText("");
                id_sobrenome.setText("");
                id_matricula.setText("");
                id_cpf.setText("");

             controller.limpar();

            }
        });

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
                pessoa.setPrimeiroNome(id_nome.getText().toString());
                pessoa.setSobrenome(id_sobrenome.getText().toString());
                pessoa.setMatricula(id_matricula.getText().toString());
                pessoa.setCPF(id_cpf.getText().toString());

                Toast.makeText(MainActivity.this, "Dados Salvos com sucesso" + pessoa.toString(),Toast.LENGTH_LONG).show();



                controller.Salvar(pessoa);

            }
        });
        Log.i("POOAndroid",pessoa.toString());

    }
}