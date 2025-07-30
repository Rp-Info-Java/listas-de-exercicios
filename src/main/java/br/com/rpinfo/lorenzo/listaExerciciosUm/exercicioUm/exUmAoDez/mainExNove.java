package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExNove {
    public static void main(String[] args) {
        int num;
        double numFlutuante;

        System.out.println("=== Tabuada de um Número Inteiro ===");
        System.out.println("Digite um número inteiro: ");
        num = FunctionsAux.lerOpcaoInt();
        tabuada(num);

        System.out.println("\nDigite um número de ponto flutuante (digitar com vírgula): ");
        numFlutuante = FunctionsAux.lerOpcaoDouble();
        tabuadaDouble(Math.round(numFlutuante));
        //Função de tabuada para double é irrelevante, pois a função Math.round arredonda para X.0, que é o mesmo que um inteiro, já que a decimal é zero.
    }
    public static void tabuada(int num){
        System.out.println("\n--- TABUADA ---");
        for(int i=0; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
    public static void tabuadaDouble(double num){
        System.out.println("\n--- TABUADA ---");
        for(int i=0; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
