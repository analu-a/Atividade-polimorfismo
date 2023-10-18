package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Circulo;
import br.senai.sp.jandira.model.Retangulo;

import java.util.Scanner;

public class GerenciadorFormas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean iniciar = true;
        do {
            System.out.println("O que deseja fazer? [1]-Calcular circulo [2]-Calcular retangulo [3]-Sair");
            int escolha = teclado.nextInt();
            teclado.nextLine();

            switch (escolha) {
                case 1:
                    Circulo circulo = new Circulo();
                    circulo.calcularArea();
                   circulo.calcularPerimetro();
                    break;

                case 2:
                    Retangulo retangulo = new Retangulo();
                    retangulo.calcularArea();
                    retangulo.calcularPerimetro();
                    break;

                case 3:
                    iniciar = false;
                    break;


            }

        } while (iniciar);


    }
}
