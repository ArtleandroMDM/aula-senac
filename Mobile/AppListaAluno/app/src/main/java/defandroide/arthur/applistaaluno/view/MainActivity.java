package defandroide.arthur.applistaaluno.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import defandroide.arthur.applistaaluno.R;
import defandroide.arthur.applistaaluno.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa OutraPessoa;

    String DadosPessoas;
    String DadosOutraPessoa;

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

        pessoa =  new Pessoa();
        pessoa.setPrimeiroNome("Batman");
        pessoa.setSobrenome("Heroi");
        pessoa.setMatricula("10101010");
        pessoa.setCPF("99999999999");

        OutraPessoa = new Pessoa();
        /*OutraPessoa.setPrimeiroNome("Coringa");
        OutraPessoa.setSobreNome("Vilão");
        OutraPessoa.setMatricula("11111111");
        OutraPessoa.setCpf("11111111111");*/

        id_nome = findViewById(R.id.editprimeironome);
        id_sobrenome = findViewById(R.id.editsobrenome);
        id_matricula = findViewById(R.id.editMatricula);
        id_cpf = findViewById(R.id.editCPF);

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_Salvar = findViewById(R.id.btn_Salvar);
        btn_Finalizar = findViewById(R.id.btn_Finalizar);

        id_nome.setText(pessoa.getPrimeiroNome());
        id_sobrenome.setText(pessoa.getSobrenome());
        id_matricula.setText(pessoa.getMatricula());
        id_cpf.setText(pessoa.getCPF());

        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                id_nome.setText("");
                id_sobrenome.setText("");
                id_matricula.setText("");
                id_cpf.setText("");

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
                OutraPessoa.setPrimeiroNome(id_nome.getText().toString());
                OutraPessoa.setSobrenome(id_sobrenome.getText().toString());
                OutraPessoa.setMatricula(id_matricula.getText().toString());
                OutraPessoa.setCPF(id_cpf.getText().toString());

                Toast.makeText(MainActivity.this, "Dados Salvos" + OutraPessoa.toString(), Toast.LENGTH_LONG).show();
            }
        });

         /* DadosPessoas = "Primeiro nome: ";
        DadosPessoas += pessoa.getPrimeiroNome();
        DadosPessoas += "Sobrenome: ";
        DadosPessoas += pessoa.getSobreNome();
        DadosPessoas += "Matrícula: ";
        DadosPessoas += pessoa.getMatricula();
        DadosPessoas += "CPF: ";
        DadosPessoas += pessoa.getCpf();

        DadosOutraPessoa = "Primeiro nome: ";
        DadosOutraPessoa += pessoa.getPrimeiroNome();
        DadosOutraPessoa += "Sobrenome: ";
        DadosOutraPessoa += pessoa.getSobreNome();
        DadosOutraPessoa += "Matrícula: ";
        DadosOutraPessoa += pessoa.getMatricula();
        DadosOutraPessoa += "CPF: ";
        DadosOutraPessoa += pessoa.getCpf();*/

        Log.i("POOAndroid",pessoa.toString());
        Log.i("POOAndroid",OutraPessoa.toString());

    }
}