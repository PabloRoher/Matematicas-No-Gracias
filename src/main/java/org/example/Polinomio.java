package org.example;

public class Polinomio {
    public  Polinomio terminoMayor;
    public int grado;

    public Polinomio() {
        setTerminoMayor(null);
        setGrado(-1);
    }

    public Polinomio(int grado) {
        setTerminoMayor(null);
        setGrado(grado);
    }

    public void insertar(Polinomio polinomio, int grado) {
        setTerminoMayor(polinomio);
        setGrado(grado);
    }

    public Polinomio getTerminoMayor() {
        return terminoMayor;
    }

    public void setTerminoMayor(Polinomio terminoMayor) {
        this.terminoMayor = terminoMayor;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }


}

