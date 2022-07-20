package AulaMJ01;

import java.util.Scanner;

public class Calculadora {

    public static void soma(double numero1, double numero2){//definiu-se a visibilidade(public), tipo(static), retorno(void), nome(soma), parâmetros(double num...)
        double resultado =  numero1 + numero2;
        System.out.println("O resultado de " + numero1 + " somado com " + numero2 + " é " + resultado);
    }
    public static void subtracao(double numero1, double numero2){
        double resultado =  numero1 - numero2;
        System.out.println("O resultado de " + numero1 + " subtraído de " + numero2 + " é " + resultado);
    }
    public static void multiplicacao(double numero1, double numero2){
        double resultado =  numero1 * numero2;
        System.out.println("O resultado de " + numero1 + " multiplicado com " + numero2 + " é " + resultado);
    }
    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("O resultado de " + numero1 + " dividido por " + numero2 + " é " + resultado);
    }
}
