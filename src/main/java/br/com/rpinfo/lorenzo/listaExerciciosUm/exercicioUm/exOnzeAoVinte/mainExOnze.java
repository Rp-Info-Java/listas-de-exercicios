package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExOnze {
    public static void main(String[] args) {
        int num;
        System.out.println("=== TRIÂNGULO RETÂNGULO COM NÚMEROS REPETIDOS ===");
        System.out.println("Digite um número para formar o triângulo: ");
        num = FunctionsAux.lerOpcaoInt();

        if(num > 0){
            trianguloRep(num);
        }else{
            System.out.println("O número informado deve ser maior que 0.\n");
        }
    }

    public static void trianguloRep(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
