package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExDezesseis {
    public static void main(String[] args) {
        double num1;

        System.out.println("Digite um número de ponto flutuante (com vírgula): ");
        num1 = FunctionsAux.lerOpcaoDouble();
        comparaNum(num1);
    }
    public static void comparaNum(double num1){
        if(num1 == 0.0){
            System.out.println("Zero\n");
        }else if(num1 > 0){
            System.out.println("Positivo\n");
            if(num1 < 1){
                System.out.println("Pequeno\n");
            }
            else if(num1 > 1000000){
                System.out.println("Grande\n");
            }
        }else if(num1 < 0){
            System.out.println("Negativo\n");
        }
    }
}
