package br.com.rpinfo.lorenzo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FunctionsAux {
    public static Double lerOpcaoDouble(){
        Scanner teclado = new Scanner(System.in);
        try{
            return teclado.nextDouble();
        }catch(Exception e){
            throw new InputMismatchException("Erro de digitação: " + e.getMessage());
        }
    }
    public static int lerOpcaoInt(){
        Scanner teclado = new Scanner(System.in);
        try{
            return teclado.nextInt();
        }catch(Exception e){
            throw new InputMismatchException("Erro de digitação: " + e.getMessage());
        }
    }
    public static String lerOpcaoString(){
        Scanner teclado = new Scanner(System.in);
        try{
            return teclado.nextLine();
        }catch(Exception e){
            throw new InputMismatchException("Erro de digitação: " + e.getMessage());
        }
    }
    public static long lerOpcaoLong(){
        Scanner teclado = new Scanner(System.in);
        try{
            return teclado.nextLong();
        }catch(Exception e){
            throw new InputMismatchException("Erro de digitação: " + e.getMessage());
        }
    }
}
