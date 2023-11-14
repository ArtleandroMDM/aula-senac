package defandroide.arthur.applistaaluno.controller;

import java.util.ArrayList;
import java.util.List;

import defandroide.arthur.applistaaluno.model.Curso;

public class CursoController {

    private  List listcurso;

    public List getListaCursos(){

        listcurso = new ArrayList<Curso>();

        listcurso.add(new Curso("JAVA"));
        listcurso.add(new Curso("PYTHON"));
        listcurso.add(new Curso("PHP"));
        listcurso.add(new Curso("C#"));
        listcurso.add(new Curso("C++"));


        return listcurso;
    }
    public ArrayList<String> dadosSpinner(){
        ArrayList<String> dados = new ArrayList<>();
        for (int i = 0; i <getListaCursos().size(); i++){

            Curso objeto = (Curso) getListaCursos().get(i);

          dados.add(objeto.getCursoDesejado());
        }
        return dados;
    }
}

