package ejercicio06;

public class ejercicio06 {
    public static void main(String[] args) {
        double vari1 = 81;
        double vari2 = 9;
        double vari3 = 3;
        double vari4 = 9;
        double vari5 = 10;
        double vari6 = 1;
        String ejercicio = "((raiz(81) + 9) / 3 == 9) && (10 > 1)";
        System.out.println("Ejercicio: " + ejercicio);
        boolean respuesta = ((Math.sqrt(vari1) + vari2) / vari3 == vari4)
                && (vari5 > vari6);
        System.out.println("Respuesta: " + respuesta);
    }
}
