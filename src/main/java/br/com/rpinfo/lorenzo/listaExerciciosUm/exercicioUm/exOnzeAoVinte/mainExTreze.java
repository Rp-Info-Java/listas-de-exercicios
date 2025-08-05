package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExTreze {
    public static void main(String[] args) {
        int numLinhas = 0;

        System.out.println("=== PIRÂMIDE DE NÚMEROS ===");
        System.out.println("Digite o número de linhas da pirâmide: ");
        numLinhas = FunctionsAux.lerOpcaoInt();

        if (numLinhas > 0) {
            piramide(numLinhas);
        } else {
            System.out.println("O número de linhas deve ser maior que 0.\n");
        }
    }

    public static void piramide(int numLinhas) {
        int contSpace = numLinhas-1;
        for (int i = 1; i <= numLinhas; i++) {
            for(int k=contSpace; k>=0; k--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            contSpace--;
        }
    }
}
