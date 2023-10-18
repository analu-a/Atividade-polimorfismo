package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Circulo implements FormaGeometrica{

    Scanner teclado = new Scanner(System.in);

    double raio =10, perimetro, area;

    @Override
    public void calcularPerimetro() {

        System.out.println("digite o raio: ");
        raio = teclado.nextDouble();

       perimetro = 2 * Math.PI * Math.pow(raio, 2);
        System.out.printf("Área: %.f2" + perimetro);

    }

    @Override
    public void calcularArea() {
        area = (Math.PI * Math.pow(raio, 2));
        System.out.print(area);
    }
}
