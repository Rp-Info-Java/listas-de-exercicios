package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exUmAoDez;

import br.com.rpinfo.lorenzo.FunctionsAux;

import java.util.ArrayList;
import java.util.List;

public class mainExSeis {
    public static void main(String[] args) {
        int num1,num2,num3;
        List<Integer> listaNum = new ArrayList<>();

        System.out.println("=== Retorno de Maior Número ===");
        System.out.println("Digite o primeiro número: ");
        num1 = FunctionsAux.lerOpcaoInt();
        listaNum.add(num1);
        System.out.println("Digite o segundo número: ");
        num2 = FunctionsAux.lerOpcaoInt();
        listaNum.add(num2);
        System.out.println("Digite o terceiro número: ");
        num3 = FunctionsAux.lerOpcaoInt();
        listaNum.add(num3);
//        System.out.println("Quarto num: ");
//        int num4 = FunctionsAux.lerOpcaoInt();
//        listaNum.add(num4);
//        System.out.println("Quinto num: ");
//        int num5 = FunctionsAux.lerOpcaoInt();
//        listaNum.add(num5);
        System.out.println("O maior número informado é: " + verificaMaior(listaNum));
    }
    //Utiliza um for com o tamanho da lista para abranger um tamanho genérico de lista
    public static int verificaMaior(List<Integer> listaNum){
        int maior, atual = 0;
        if(!listaNum.isEmpty()){
            atual = listaNum.getFirst();
            for(int i = 0; i<listaNum.size(); i++){
                maior = listaNum.get(i);
                if(maior > atual){
                    atual = maior;
                }
            }
        }
        return atual;
    }
}
