package AulaMJ03;

public class Main {

    public static void main(String[] args){
        //Retornos
        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilatero.area(3); //os metodos retornam valores, que você armazena em "areaQuadrilateroCorrespondente" e imprime
        System.out.println("Área do quadrado = " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retângulo = " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapezio = " + areaTrapezio);
    }
}
