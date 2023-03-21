package org.example;

public class Menu extends Polinomio implements AdministrarPolinomio{

    public void menu() {
        System.out.println("1. Agregar polinomio");
        System.out.println("2. Modificar polinomio");
        System.out.println("3. Obtener valor de un polinomio");
        System.out.println("4. Mostrar polinomio");
        System.out.println("5. Sumar polinomios");
        System.out.println("6. Multiplicar polinomios");
        System.out.println("7. Salir");
    }

    @Override
    public void agregarPolinomio(Polinomio polinomio, int termino, int valor) {
    }

    @Override
    public void modificarPolinomio(Polinomio polinomio, int termino, int valor) {

    }

    @Override
    public void obtenerValorPolinomio(Polinomio polinomio, int termino) {

    }

    @Override
    public void mostrarPolinomio(Polinomio polinomio) {
    }

    @Override
    public void sumarPolinomio(Polinomio polinomio1, Polinomio polinomio2) {
    }

    @Override
    public void multiplicarPolinomio(Polinomio polinomio1, Polinomio polinomio2) {

    }
}
