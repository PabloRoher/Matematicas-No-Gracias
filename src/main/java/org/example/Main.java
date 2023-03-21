package org.example;

public class Main {
    public static void main(String[] args) {

        datoPolinomio dato1 = new datoPolinomio(2, 2);
        datoPolinomio dato2 = new datoPolinomio(3, 3);
        datoPolinomio dato3 = new datoPolinomio(4, 4);
        datoPolinomio dato4 = new datoPolinomio(5, 5);

        Polinomio polinomio1 = new Polinomio(dato1.valor);
        Polinomio polinomio2 = new Polinomio(dato2.valor);
        Polinomio polinomio3 = new Polinomio(dato3.valor);
        Polinomio polinomio4 = new Polinomio(dato4.valor);


    }
}