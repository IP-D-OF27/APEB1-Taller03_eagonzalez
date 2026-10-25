package Ejercicio04;

public class Ejercicio04 {
    public static void main(String[] args) {
        double vari1 = 20;
        double vari2 = 1;
        double vari3 = 3;
        double vari4 = 2;
        double vari5 = 3;
        String ejercicio = "(20 / (1 + 3)) + 2 >= 3";
        System.out.println("Ejercicio: " + ejercicio);
        boolean respuesta = (vari1 / (vari2 + vari3) + vari4) >= vari5;
        System.out.println("Respuesta: " + respuesta);
    }
}