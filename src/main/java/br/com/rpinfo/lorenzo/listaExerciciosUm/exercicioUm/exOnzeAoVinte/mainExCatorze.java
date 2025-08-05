package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExCatorze {

    public static void main(String[] args) {
        int num;
        System.out.println("=== TRIÂNGULO RETÂNGULO AO CONTRÁRIO ===");
        System.out.println("Digite um número para formar o triângulo: ");
        num = FunctionsAux.lerOpcaoInt();
        if (num > 0) {
            trianguloInvertido(num);
        } else {
            System.out.println("O número informado deve ser maior que 0.\n");
        }
    }
    public static void trianguloInvertido(int num) {
        int k = 0;
        int soma = 0;
        while (soma < num) {
            k++;
            soma += k;
        }
        int current = num;
        for (int cols = k; cols > 0 && current > 0; cols--) {
            for (int j = 0; j < cols && current > 0; j++) {
                System.out.print(current-- + " ");
            }
            System.out.println();
        }
    }

}
