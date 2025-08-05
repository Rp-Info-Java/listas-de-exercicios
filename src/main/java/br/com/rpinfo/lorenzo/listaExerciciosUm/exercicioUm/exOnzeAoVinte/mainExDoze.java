package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExDoze {
    public static void main(String[] args) {
        int num;
        System.out.println("=== TRIÂNGULO RETÂNGULO COM NÚMEROS ===");
        System.out.println("Digite um número para formar o triângulo: ");
        num = FunctionsAux.lerOpcaoInt();
        if(num > 0){
            trianguloCont(num);
        }else{
            System.out.println("O número informado deve ser maior que 0.\n");
        }
    }

    public static void trianguloCont(int num) {
        int numeroImpresso = 1;
        int columns = 1;
        while(numeroImpresso <= num){
            for(int j = 1; j<= columns && numeroImpresso <= num; j++){
                System.out.print(numeroImpresso + " ");
                numeroImpresso++;
            }
            System.out.println();
            columns++;
        }
    }
}
