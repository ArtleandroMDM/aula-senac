package defandroide.arthur.applistaaluno.view;

import static android.app.ProgressDialog.show;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import defandroide.arthur.applistaaluno.R;
import defandroide.arthur.applistaaluno.util.UtilGasEta;

public class GasEtaActivity extends AppCompatActivity{

    Button btn_calcular;
    Button btn_limpar;
    Button btn_Salvar;
    Button btn_Finalizar;

//    UtilGasEta utilGasEta = new UtilGasEta();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaseta);


//        UtilGasEta.metodoNaoEstatico();
//        UtilGasEta.metodoEstatico();

        Toast.makeText(GasEtaActivity.this, UtilGasEta.mensagem(),
                Toast.LENGTH_SHORT).show();

        Toast.makeText(GasEtaActivity.this, UtilGasEta.calcularMelhorOpcao(5.12,3.19),
                Toast.LENGTH_SHORT).show();

        btn_calcular = findViewById(R.id.btn_Calcular);
        btn_limpar = findViewById(R.id.btn_limpar);
        btn_Salvar = findViewById(R.id.btn_Salvar);
        btn_Finalizar = findViewById(R.id.btn_Finalizar);

        

    }
}
