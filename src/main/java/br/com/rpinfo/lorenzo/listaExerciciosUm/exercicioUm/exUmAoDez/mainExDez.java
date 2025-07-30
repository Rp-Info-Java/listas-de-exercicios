package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExDez {
    public static void main(String[] args) {
        int num;
        System.out.println("=== TRIÂNGULO RETÂNGULO COM NÚMEROS ===");
        System.out.println("Digite um número para formar o triângulo: ");
        num = FunctionsAux.lerOpcaoInt();

        triangulo(num);
    }

    public static void triangulo(int num) {
        String frase = "";
        for (int i = 1; i <= num; i++) {
            frase += i;
            System.out.println(frase);
        }
    }
}
