package defandroide.arthur.applistaaluno.Model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Pessoa {

    private String primeiroNome;
    private String SobreNome;
    private String Matricula;
    private String cpf;

    public Pessoa(){}
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String PrimeiroNome) {
        primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.SobreNome = sobreNome;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", SobreNome='" + SobreNome + '\'' +
                ", Matricula='" + Matricula + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
