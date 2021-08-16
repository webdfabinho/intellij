package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o Primeiro Numero: ");
        a = scan.nextInt();

        System.out.println("Digite o Segundo Numero: ");
        b = scan.nextInt();

        int soma = soma(a, b);
        int subtrair = subtrair(a, b);
        int divisao = divisao(a, b);
        int multiplicacao = multiplicacao(a, b);

        System.out.println("A Soma dos valores é: " + soma);
        System.out.println("A Subtração dos valores é: " + subtrair);
        System.out.println("A Divisão dos valores é: " + divisao);
        System.out.println("A Multiplicação dos valores é: " + multiplicacao);
    }

    public static int soma (int a, int b){
        return a + b;
    }
    public static int subtrair (int a, int b){
        return a - b;
    }
    public static int divisao (int a, int b){
        return a / b;
    }
    public static int multiplicacao (int a, int b){
        return a * b;
    }
}
