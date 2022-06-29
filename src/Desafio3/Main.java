package Desafio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Doenca> doencas = new ArrayList<>();
        String sintoma = scanner.next();

        Doenca covid = new Doenca("Covid", List.of("Febre", "Dor de Garganta", "Dor no corpo", "Falta de Ar"));
        Doenca gripe = new Doenca("Gripe", List.of("Febre", "Dor de Garganta", "Coriza", "Catarro"));
        doencas.add(covid);
        doencas.add(gripe);

        List<Doenca> doencasProvaveis = new ArrayList<>();
        for (Doenca doenca : doencas) {
            if (doenca.sintomas.contains(sintoma)) {
                doencasProvaveis.add(doenca);
            }
        }
        System.out.println(doencasProvaveis);
    }
}
