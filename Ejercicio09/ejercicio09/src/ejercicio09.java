package ejercicio09;
public class Ejercicio09 {
    public static void main(String[] args) {
        double vari1 = 81;
        double vari2 = 25;
        double vari3 = 10;
        double vari4 = 50;
        String ejercicio = "raiz(81) + raiz(25) * 10 >= 50";
        System.out.println("Ejercicio: " + ejercicio);
        boolean respuesta = Math.sqrt(vari1) + Math.sqrt(vari2) * vari3 >= vari4;
        System.out.println("Respuesta: " + respuesta);
    }
}