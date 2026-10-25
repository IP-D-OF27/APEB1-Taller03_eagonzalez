package ejercicio07;
public class ejercicio07 {
    public static void main(String[] args) {
        double vari1 = 81;
        double vari2 = 9;
        double vari3 = 3;
        double vari4 = 9;
        double vari5 = 10;
        double vari6 = 1;
        double vari7 = 100;
        double vari8 = 25;
        double vari9 = 100;
        String ejercicio = "((raiz(81) + 9) / 3 == 9) && (10 > 1) && (100 / 25 >= raiz(100))";
        System.out.println("Ejercicio: " + ejercicio);
        boolean respuesta = ((Math.sqrt(vari1) + vari2) / vari3 == vari4)
                && (vari5 > vari6)
                && (vari7 / vari8 >= Math.sqrt(vari9));
        System.out.println("Respuesta: " + respuesta);
    }
}