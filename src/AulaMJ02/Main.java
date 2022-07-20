package AulaMJ02;

public class Main {
    public static void main(String[] args) {
        //Quadrado
        System.out.println("Exercício quadrilátero");
        Quadrilatero.Area(3); //Java reconhece o quadrilatero a ser calculado por causa da quantidade de parametros escritos
        Quadrilatero.Area(5d,5d); //esse seria o retangulo, que aceita double, então pra evitar erros, adiciona o d no final
        Quadrilatero.Area(7, 8, 9);
        Quadrilatero.Area(5f,5f);
    }
}
