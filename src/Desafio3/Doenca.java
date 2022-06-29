package Desafio3;

import java.util.List;

public class Doenca {
    String nome;
    List<String> sintomas;

    public Doenca(String nome, List<String> sintomas) {
        this.sintomas = sintomas;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Doenca{" +
                "nome='" + nome + '\'' +
                ", sintomas=" + sintomas +
                '}';
    }
}
