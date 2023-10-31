package View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import Controller.CursoController;
import Model.Curso;
import Model.Pessoa;
import defandroide.arthur.myava20.R;

public class MainActivity extends AppCompatActivity {
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa = new Pessoa();
    }
}