package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;
import java.lang.Math;

public class mainExQuatro {
    public static void main(String[] args) {
        int numero;
        do{
            System.out.println("\n=== Número e suas potências ===");
            System.out.println("Digite um número inteiro (0 para sair do sistema): ");
            numero = FunctionsAux.lerOpcaoInt();
            if(numero == 0){
                System.out.println("\nSaindo do sistema...");
            }else{
                potenciaNum(numero);
            }
        }while(numero != 0);
    }
    public static void potenciaNum(int num){
        System.out.println("\nQuadrado do número " + num + ": " + Math.round(Math.pow(num, 2)));
        System.out.println("Cubo do número " + num + ": " + Math.round(Math.pow(num, 3)));
        System.out.println("Quarta potência do número " + num + ": " + Math.round(Math.pow(num, 4)));
    }
}
