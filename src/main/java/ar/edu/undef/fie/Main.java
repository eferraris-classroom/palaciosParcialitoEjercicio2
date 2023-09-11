package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {

        int[] arreglo = {1, 2, -4, 8, 5, 6};

        var valor1 = 5;
        var valor2 = 10;

        System.out.println(existe(valor1, arreglo));
        System.out.println(existe(valor2, arreglo));
    }

    private static boolean existe(int valor, int[] numeros) {
        for (var numero : numeros) {
            if (numero == valor)
                return true;
        }
        return false;
    }
}
