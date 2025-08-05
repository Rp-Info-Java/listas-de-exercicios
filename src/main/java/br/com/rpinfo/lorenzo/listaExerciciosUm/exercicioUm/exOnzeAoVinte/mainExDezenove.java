package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExDezenove {
    private static int k;
    private static int[] vet = new int[50];

    public static void main(String[] args) {
        int num;
        long resp;
        System.out.println("-Calculando números de Fibonacci-");
        System.out.println("Digite o enésimo número da Sequência Fibonacci que deseja visualizar: ");
        num = FunctionsAux.lerOpcaoInt();

        for(int i=0; i<num; i++){
            resp = funcaoRecursiva(i);
            if(i == num-1){
                System.out.println("O número " + num + " da Sequência de Fibonacci é: " + resp);
            }
        }
        System.out.println("Os " + num + " primeiros números da Sequência Fibonacci são: ");
        for(int j=0; j<num; j++){
            System.out.print(funcaoRecursiva(j) + " ");
        }
    }
    public static int fibonacci(int num){
        if(num < 0){
            return vet[0];
        }else{
            if(k < 3){
                vet[num] = k - 1;
                k++;
            }else{
                vet[num] = vet[num + 1] + vet[num + 2];
            }
            return fibonacci(num - 1);
        }
    }
    public static long funcaoRecursiva(int result){
        k = 1;
        return fibonacci(result);
    }
}
