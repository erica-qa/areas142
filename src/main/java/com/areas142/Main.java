package com.areas142;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){

    }

    public static float quadrado(float lado) {
        if(lado > 0){
            float areaQ = lado*lado;
            System.out.println("A área do quadrado é: " + lado + " x " + lado + " = " + areaQ);
            return areaQ;
        }
        else{
            System.out.println("Não foi possível calcular a área. Por favor, insira um número positivo e maior que zero.");
            return 0;
        }
    }

    public static float retangulo(float baser, float alturar) {
        if(baser > 0 && alturar > 0){
            float areaR = baser*alturar;
            System.out.println("A área do retangulo é: " + baser + " x " + alturar + " = " + areaR);
            return areaR;
        }
        else{
            System.out.println("Não foi possível calcular a área. Por favor, insira números positivo e maiores que zero.");
            return 0;
        }
    }

    public static String circulo(double raio) {
        if(raio > 0){
            double areaC = Math.PI * Math.pow(raio,2);
    
            // Cria um objeto DecimalFormat para formatar o número
            DecimalFormat df = new DecimalFormat("#.00");
            // Arredonda e formata o resultado da Área do Círculo
            String areaFormatada = df.format(areaC);
    
            System.out.println("A área do círculo é: " + Math.PI + " x " + raio + "² = " + areaFormatada);
            return areaFormatada;
        }
        else{
            System.out.println("Não foi possível calcular a área. Por favor, insira um número positivo e maior que zero.");
            return "";
        }
    }

    public static double triangulo(float baset, float alturat) {
        if(baset > 0 && alturat > 0){
            double areaT = (baset*alturat)/2;
            System.out.println("A área do triângulo é: " + "(" + baset + " x " + alturat + ") / 2 = " + areaT);
            return areaT;
        }
        else{
            System.out.println("Não foi possível calcular a área. Por favor, insira números positivo e maiores que zero.");
            return 0;
        }
    }
    
}