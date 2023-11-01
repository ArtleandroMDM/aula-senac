package View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import Controller.CursoController;
import Model.Curso;
import Model.Pessoa;
import defandroide.arthur.myava20.R;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;



    Button btnNum1;
    Button btnNum2;
    Button btnNum3;
    Button btnNum4;
    Button btnNum5;
    Button btnNum6;
    Button btnNum7;
    Button btnNum8;
    Button btnNum9;
    Button btnNum0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa = new Pessoa();
        pessoa.setidcalculo("Super-Man");

        btnNum1 = findViewById(R.id.idNm1);
        btnNum1 = findViewById(R.id.idNm2);
        btnNum1 = findViewById(R.id.idNm3);
        btnNum1 = findViewById(R.id.idNm4);
        btnNum1 = findViewById(R.id.idNm5);
        btnNum1 = findViewById(R.id.idNm6);
        btnNum1 = findViewById(R.id.idNm7);
        btnNum1 = findViewById(R.id.idNm8);
        btnNum1 = findViewById(R.id.idNm9);
        btnNum1 = findViewById(R.id.idNm0);




    }
}