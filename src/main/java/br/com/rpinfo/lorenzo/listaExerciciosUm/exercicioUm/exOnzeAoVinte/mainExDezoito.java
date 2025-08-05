package br.com.rpinfo.lorenzo.listaExerciciosUm.exercicioUm.exOnzeAoVinte;

import br.com.rpinfo.lorenzo.FunctionsAux;

public class mainExDezoito {
    public static void main(String[] args) {
        double num1, num2;
        System.out.println("-Comparando casas decimais de dois números diferentes-");
        System.out.println("Informe o primeiro número: ");
        num1 = FunctionsAux.lerOpcaoDouble();
        System.out.println("Informe o segundo número: ");
        num2 = FunctionsAux.lerOpcaoDouble();
        comparaDecimal(num1, num2);
    }
    public static void comparaDecimal(double num1, double num2){
        double numeroDec1, numeroDec2;
        numeroDec1 = (num1 - getInteiro(num1)) * 100;
        numeroDec2 = (num2 - getInteiro(num2)) * 100;

        if(getInteiro(num1) == getInteiro(num2)){
            if(getInteiro(numeroDec1) == getInteiro(numeroDec2)){
                System.out.println("Até as primeiras duas casas decimais, os números são iguais!");
            }else{
                System.out.println("Os números não são iguais até as primeiras duas casas decimais!");
            }
        }else{
            System.out.println("Os números são diferentes!\n");
        }
    }
    public static int getInteiro(double num){
        int numInt = (int)num;
        return numInt;
    }
}
