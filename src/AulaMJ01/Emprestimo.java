package AulaMJ01;

public class Emprestimo {

    public static int getDuasParcelas(){//no programa que eu escrevi não utilizou isto
        return 2;
    }

    public static int getTresParcelas(){//no programa que eu escrevi não utilizou isto
        return 3;
    }

    public static double getTaxaDuasParcelas(){
        return 0.3;
    }

    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo para duas parcelas: R$" + valorFinal);
        }
        else if (parcelas == 3) {
            double valorFinal = valor  + (valor * getTaxaTresParcelas());
            System.out.println("Valor final do empréstimo para três parcelas: R$" + valorFinal);
        }
        else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }

}
