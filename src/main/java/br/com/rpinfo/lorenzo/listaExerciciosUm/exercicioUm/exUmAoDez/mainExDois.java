package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExDois {
    public static void main(String[] args) {
        int num;

        do{
            System.out.println("\n=== Progressão Aritmética ===");
            System.out.println("0 -> Para sair da aplicação");
            System.out.println("Digite um número inteiro entre 0 e 1000 para ver a soma de todos os dígitos: ");
            num = FunctionsAux.lerOpcaoInt();

            if(num < 0 || num > 1000){
                System.out.println("O número digitado está fora do escopo!\n");
            }else{
                somaProgArit(num);
            }
        }while(num != 0);
    }

    public static void somaProgArit(int num){
        double resposta;
        resposta = ((double)num/2) * (1 + num); //somamos a partir do primeiro número (1) até o num desejado (int num)
        System.out.println("Soma de Gauss: " +  resposta);
    }
}
