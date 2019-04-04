package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("HelloWorld");

        Integer umNumeroA;
        Double umNumeroB;
        String umaCadeiaDeTexto;

        umNumeroA=10;
        umNumeroB=20.0D;
        umaCadeiaDeTexto="Cadeia de Texto do Robson";

        System.out.println(umNumeroA);
        System.out.println(umNumeroB);
        System.out.println(umaCadeiaDeTexto);

        System.out.println("Soma de A + B é igual a " + (umNumeroA+umNumeroB));
        System.out.println("Subtração de A - B é igual a" + (umNumeroA-umNumeroB));

        System.out.println("Digite um numero:");
        Scanner scanner = new Scanner(System.in);

        umNumeroA = scanner.nextInt();

        System.out.println("Recebi: " + umNumeroA);

    }
}
