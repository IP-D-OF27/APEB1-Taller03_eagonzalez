package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        double vari1 = 25;
        double vari2 = 10;
        double vari3 = 100;
        double vari4 = 10;
        double vari5 = 5;
        double vari6 = 2;
        String ejercicio = "(raiz(25) * 10 >= 100) && true || false || (10 / 5 >= 2)";
        System.out.println("Ejercicio: " + ejercicio);
        boolean respuesta = ((Math.sqrt(vari1) * vari2 >= vari3) && true)
                || false
                || (vari4 / vari5 >= vari6);
        System.out.println("Respuesta: " + respuesta);
    }
}