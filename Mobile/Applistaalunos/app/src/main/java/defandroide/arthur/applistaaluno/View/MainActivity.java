package defandroide.arthur.applistaaluno.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import defandroide.arthur.applistaaluno.Model.Pessoa;
import defandroide.arthur.applistaaluno.R;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa = new Pessoa();

        pessoa.setPrimeiroNome("Super-Man");
        pessoa.setSobreNome("GamerGrato_Pro34");
        pessoa.setMatricula("010101");
        pessoa.setCpf("123.546.744-01");

    }
}