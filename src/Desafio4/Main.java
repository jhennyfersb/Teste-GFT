package Desafio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String fraseMinuscula = frase.toLowerCase(Locale.ROOT);
        StringBuilder panagrama = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        int cont = 0;

        for (int i = 0; i < frase.length(); i++) {
            int index = panagrama.indexOf(String.valueOf(fraseMinuscula.charAt(i)));
            if (index >= 0) {
                panagrama.deleteCharAt(index);
                cont++;
            }
        }
        if (cont == 26) {
            System.out.println("É pangrama.");
        } else {
            System.out.println("Não é pangrama.");
        }
    }
}
