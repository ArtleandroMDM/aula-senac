package defandroide.arthur.applistaaluno.view;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import defandroide.arthur.applistaaluno.R;
import defandroide.arthur.applistaaluno.controller.CombustivelController;
import defandroide.arthur.applistaaluno.model.Combustivel;
import defandroide.arthur.applistaaluno.util.UtilGasEta;

public class GasEtaActivity extends AppCompatActivity{

    CombustivelController controller;
    Combustivel combustivel;

    EditText editGasolina;
    EditText editEtanol;

    TextView textReslutado;

    Button btn_calcular;
    Button btn_limpar;
    Button btn_Salvar;
    Button btn_Finalizar;

    double precoEtanol;
    double precoGasolina;

    String recomendacao;

    Combustivel combustivelEtanol;
    Combustivel combustivelGasolina;

    List<Combustivel> dados;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaseta);
        controller = new CombustivelController(this);






//        Combustivel objAlteracao = dados.get(5);
//        objAlteracao.setNomeCombustivel("Gasolina Adulterada");
//       objAlteracao.setPrecoCombustivel(8.99);
//      objAlteracao.setRecomendacao("sai fora que é fria");
//
//       controller.alterar(objAlteracao);
//      controller.deletarObjeto(1);



        editEtanol = findViewById(R.id.editEtanol);
        editGasolina = findViewById(R.id.editGasolina);

        textReslutado = findViewById(R.id.textResultado);

        btn_calcular = findViewById(R.id.btn_Calcular);
        btn_limpar = findViewById(R.id.btn_limpar);
        btn_Salvar = findViewById(R.id.btn_Salvar);
        btn_Finalizar = findViewById(R.id.btn_Finalizar);

        CombustivelController controller = new CombustivelController(GasEtaActivity.this);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isDadosOK = true;

                if (TextUtils.isEmpty(editEtanol.getText())) {

                    editEtanol.setError("Obrigatório");
                    editEtanol.requestFocus();
                    isDadosOK = false;
                }
                if (TextUtils.isEmpty(editGasolina.getText())) {
                    editGasolina.setError("Obrigatório");
                    editGasolina.requestFocus();
                    isDadosOK = false;
                }
                if (isDadosOK) {
                    precoGasolina = Double.parseDouble(editGasolina.getText().toString());
                    precoEtanol = Double.parseDouble(editEtanol.getText().toString());
                    recomendacao = UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol);
                    textReslutado.setText(recomendacao);

                    btn_Salvar.setEnabled(true);

                } else {
                    Toast.makeText(GasEtaActivity.this, "Dados Obrigatórios!!!", Toast.LENGTH_SHORT).show();
                    btn_Salvar.setEnabled(false);
                }
            }
        });
        btn_Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GasEtaActivity.this, "Aplicativo Finalizado", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editEtanol.setText("");
                editGasolina.setText("");
                textReslutado.setText("");

                btn_Salvar.setEnabled(false);

                controller.limpar();

            }
        });


        btn_Salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                combustivelEtanol = new Combustivel();
                combustivelGasolina = new Combustivel();

                combustivelGasolina.setNomeCombustivel("Gasolina");
                combustivelGasolina.setPrecoCombustivel(precoGasolina);

                combustivelEtanol.setNomeCombustivel("Etanol");
                combustivelEtanol.setPrecoCombustivel(precoEtanol);

                combustivelGasolina.setRecomendacao(UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol));
                combustivelEtanol.setRecomendacao(UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol));

                controller.salvar(combustivelGasolina);
                controller.salvar(combustivelEtanol);

            }
        });

        Toast.makeText(GasEtaActivity.this, UtilGasEta.calcularMelhorOpcao(5.12, 3.19),
                Toast.LENGTH_SHORT).show();

    }
}
