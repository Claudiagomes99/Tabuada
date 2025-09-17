/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadawhile;

/**
 *
 * @author Gomes
 */
 import java.util.Scanner;
public class TabuadaWhile {

    public static void main(String[] args) {
        Scanner tb = new Scanner(System.in);

        System.out.print("Informe um número: "); // mensagem inicial para adicionar informação
        int num = tb.nextInt();

        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num * i)); // conta necessaria para tabuada
            i++;
        } while (i <= 10); // conta vai até a tabuada do 10 basicamente 

        tb.close();
    }
}