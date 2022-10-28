package arrays.loops.comentado;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = Scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = Scan.nextInt();

            if (numero % 2 == 0 ) quantPares++;  // quantPares = quantPares + 1
            else quantImpares++;


            count++;
        } while(count < quantNumeros);
        System.out.println("Quantide Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
}

