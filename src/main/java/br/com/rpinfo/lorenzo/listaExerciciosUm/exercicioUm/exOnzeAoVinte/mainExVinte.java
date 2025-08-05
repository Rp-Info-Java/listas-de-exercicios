package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExVinte {
    public static void main(String[] args) {
        String frase = "";

        System.out.println("-Reversão de String-");
        System.out.println("Escreva uma frase para ser revertida: ");
        frase = FunctionsAux.lerOpcaoString();

        System.out.println(inverteFrase(frase));

    }
    public static String inverteFrase(String frase) {
        if (frase.length() == 1) {
            return frase;
        }
        return frase.charAt(frase.length() - 1) + inverteFrase(frase.substring(0, frase.length() - 1));
    }

}
