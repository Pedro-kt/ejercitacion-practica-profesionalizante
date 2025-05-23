public class Prueba {
    public static int calcular(int numero1, int numero2) {

        int suma = numero1 + numero2;
        System.out.println(suma);

        return suma;
    }

    static int funcion = calcular(15, 46);

    public static void imprimir(String[] args) {
        System.out.println(funcion);
    }

    public static void main(String[] args) {

        System.out.println("Hola mundo");

    }
}
