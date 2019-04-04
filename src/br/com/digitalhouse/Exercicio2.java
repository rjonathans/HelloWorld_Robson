package br.com.digitalhouse;

public class Exercicio2 {

    public static void main(String[] args) {
        System.out.println(verificarSeEImpar(11));
    }

    public static boolean verificarSeEImpar(Integer a){
        return a%3==0 & a>10;
    }
}
