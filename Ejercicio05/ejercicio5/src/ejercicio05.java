package ejercicio05;

public class ejercicio05 {
    public static void main(String[] args) {
        int vari1 = 2;
        int vari2 = 2;
        int vari3 = 12;
        int vari4 = 1;
        int vari5 = 3;
        String ejercicio = "(2^2 + 12 - 1) / 3";
        System.out.println("Ejercicio: " + ejercicio);
        int respuesta = (int) ((Math.pow(vari1, vari2) + vari3 - vari4) / vari5);
        System.out.println("Respuesta: " + respuesta); 
    }
}
