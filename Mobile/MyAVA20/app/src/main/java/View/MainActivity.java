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
        btnNum2 = findViewById(R.id.idNm2);
        btnNum3 = findViewById(R.id.idNm3);
        btnNum4 = findViewById(R.id.idNm4);
        btnNum5 = findViewById(R.id.idNm5);
        btnNum6 = findViewById(R.id.idNm6);
        btnNum7 = findViewById(R.id.idNm7);
        btnNum8 = findViewById(R.id.idNm8);
        btnNum9 = findViewById(R.id.idNm9);
        btnNum0 = findViewById(R.id.idNm0);




    }
}