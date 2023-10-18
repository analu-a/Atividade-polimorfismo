package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Retangulo implements FormaGeometrica{

    double lado1 , lado2 , area, perimetro;
    Scanner teclado = new Scanner(System.in);

    @Override
    public void calcularPerimetro() {

        System.out.println("digite o número 1 ");
        lado1 = teclado.nextDouble();
        System.out.println("digite o número 2 ");
        lado2 = teclado.nextDouble();

      perimetro = (lado1 * 2) + (lado2 * 2);
        System.out.printf( "Perimetro: %.f2" +perimetro);
    }

    @Override
    public void calcularArea() {
        area = lado1 * lado2;
        System.out.printf( "Área: %.f2" + area);
    }
}
