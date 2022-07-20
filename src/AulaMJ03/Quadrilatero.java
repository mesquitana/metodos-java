package AulaMJ03;

public class Quadrilatero {
    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura){
        return ((baseMaior + baseMenor)*altura) / 2;
    }

    public static void xpto(){
        System.out.println("Antes");
        return; //é desnecessário
    }

    public static long abc(){
//        return 1.6; //abc retorna long mas no return retorna double, dá erro de compatibilidade
        return 1;
    }
    public void xpto(int i){}
}
