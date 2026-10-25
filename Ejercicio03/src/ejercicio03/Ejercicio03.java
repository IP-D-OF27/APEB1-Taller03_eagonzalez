package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 10;
        int var2 = 2;
        int var3 = 16;
        int var4 = 20;
        int var5 = 1;
        int var6 = 11;
        String problema = "10^2 + raiz16 + 20/1+11";
        System.out.println("Ejercicio: " + problema);
        double rta = Math.pow(var1, var2) + Math.sqrt(var3) + (double) var4 / (var5 + var6);        
        System.out.println("Respuesta: " + rta);

    }
    
}
