package AulaMJ02;

public class Quadrilatero {//houve sobrecarga pois manteve nome, mudou-se parametros
    public static void Area(double lado){
        System.out.println("Área do quadrado " + lado*lado);
    }

    public static void Area(double lado1, double lado2){
        System.out.println("Área do quadrado " + lado1 * lado2);
    }

    public static void Area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio " + ((baseMaior+baseMenor)*altura)/2);
    }
    //public static void Area(double diagonal1, double diagonal2){ //acusa erro pois o tipo de parâmetro não mudou (double) apenas o nome
    public static void Area(float diagonal1, float diagonal2){
        System.out.println("Área do losango " + (diagonal1*diagonal2)/2);
    }
}
