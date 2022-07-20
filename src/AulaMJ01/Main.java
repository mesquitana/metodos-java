package AulaMJ01;

import java.util.Locale;
import java.util.Scanner;

public class Main { //é aonde serão executados os códigos
    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora");
        double numero1, numero2;
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US); //esse comando faz o scan receber o numero decimal  com "." no lugar de ","
        System.out.println("Digite o primeiro valor: ");
        numero1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        numero2 = scan.nextDouble();

        Calculadora.soma(numero1,numero2);
        Calculadora.subtracao(numero1, numero2);
        Calculadora.multiplicacao(numero1,numero2);
        Calculadora.divisao(numero1, numero2);

        //HoraDia
        System.out.println("Exercício mensagem para hora do dia");
        int hora;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Digite as horas: ");
        hora = scan2.nextInt();

        HoraDia.mensagem(hora);

        //Empréstimo
        System.out.println("Exercício Empréstimo");
        double valor;
        int parcelas;
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        scan3.useLocale(Locale.US);
        valor = scan3.nextDouble();
        System.out.println("Digite o número de parcelas: ");
        parcelas = scan3.nextInt();

        Emprestimo.calcular(valor, parcelas);

        /* No original:
            System.out.println("Digite o valor: ");
            Emprestimo.calcular(1000, Emprestimo.getDuasParcelas()); comum na chamada do método, passou outro método(Emprestimo.getDuasParcelas()) como parâmetro
            Emprestimo.calcular(1000, Emprestimo.getTresParcelas()); o que esse outro metodo der vai ser repassado
            Emprestimo.calcular(1000, 5);
         */
    }
}
