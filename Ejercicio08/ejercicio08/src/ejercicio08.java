package ejercicio08;
public class Ejercicio08 {
    public static void main(String[] args) {
        double vari1 = 10;
        double vari2 = 9;
        double vari3 = 20;
        double vari4 = 500;
        double vari5 = 2;
        double vari6 = 3;
        double vari7 = 2;
        double vari8 = 200;
        double vari9 = 50;
        double vari10 = 50;
        double vari11 = 50;
        double vari12 = 51;
        String ejercicio = "((10 * 9) + 20 - (500 / 2) + 3^2 >= 200) || (50 >= 50 - 50 + 51)";
        System.out.println("Ejercicio: " + ejercicio);
        boolean respuesta = ((vari1 * vari2 + vari3 - vari4 / vari5
                + Math.pow(vari6, vari7)) >= vari8)
                || (vari9 >= vari10 - vari11 + vari12);
        System.out.println("Respuesta: " + respuesta);
    }
}
