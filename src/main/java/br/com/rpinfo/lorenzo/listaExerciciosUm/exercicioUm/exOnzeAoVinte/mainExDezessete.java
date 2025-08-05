package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

import java.util.ArrayList;
import java.util.List;

public class mainExDezessete {
    public static void main(String[] args) {
        int num1, num2, num3;
        List<Integer> lista = new ArrayList<>();

        System.out.println("-Comparando números inteiros informados-");
        System.out.println("Digite o primeiro número: ");
        num1 = FunctionsAux.lerOpcaoInt();
        lista.add(num1);
        System.out.println("Digite o segundo número: ");
        num2 = FunctionsAux.lerOpcaoInt();
        lista.add(num2);
        System.out.println("Digite o terceiro número: ");
        num3 = FunctionsAux.lerOpcaoInt();
        lista.add(num3);
        System.out.println("Digite o terceiro número: ");

        numerosIguais(lista);
    }
    public static void numerosIguais(List<Integer> lista){
        int numeroComparativo, contIgual = 0, contDiferente = 0;
        if(!lista.isEmpty()){
            for(int i = 0; i<lista.size(); i++){
                numeroComparativo = lista.get(i);
                if((i+1) < lista.size() && lista.get(i+1) == numeroComparativo){
                    contIgual++;
                }else{
                    if(i+1 < lista.size()){
                        contDiferente++;
                    }
                }
            }
            if(contIgual == lista.size() - 1){
                System.out.println("Todos os números são iguais.\n");
            }else if(contDiferente == lista.size() - 1){
                System.out.println("Todos os números são diferentes.\n");
            }else{
                System.out.println("Nem todos são iguais nem diferentes.\n");
            }
        }else{
            System.out.println("A lista está vazia!");
        }
    }
}
