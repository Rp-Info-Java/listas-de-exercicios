package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExCinco {
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("=== Operações Aritméticas Básicas ===\n");
        System.out.println("Digite um número inteiro: ");
        num1 = FunctionsAux.lerOpcaoInt();
        System.out.println("Digite outro número inteiro: ");
        num2 = FunctionsAux.lerOpcaoInt();

        System.out.println("\nSoma dos números: " + soma(num1,num2));
        System.out.println("Diferença dos números (num1 - num2): " + dif(num1,num2));
        System.out.println("Produto dos números: " + prod(num1,num2));
        System.out.println("Média dos números: " + media(num1,num2));
        System.out.println("Distância dos números: " + dist(num1, num2));
        System.out.println("O maior número: " + max(num1, num2));
        System.out.println("O menor número: " + min(num1, num2));
    }
    public static int soma(int num1, int num2){
        return num1 + num2;
    }
    public static int dif(int num1, int num2){
        return num1 - num2;
    }
    public static int prod(int num1, int num2){
        return num1 * num2;
    }
    public static int dist(int num1, int num2){
        return num2 - num1;
    }
    public static double media(int num1, int num2){
        return (double)soma(num1, num2)/2;
    }
    public static int max(int num1, int num2){
        return Math.max(num1,num2);
    }
    public static int min(int num1, int num2){
        return Math.min(num1,num2);
    }
}
