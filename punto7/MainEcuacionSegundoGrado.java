package ar.edu.unlu.prog1.punto7;


public class MainEcuacionSegundoGrado {
    public static void main(String[] args) {
        // Ejemplo 1: Ecuación con dos raíces reales
        EcuacionSegundoGrado ecuacion1 = new EcuacionSegundoGrado(1, -3, -4);

        double discriminante1 = ecuacion1.calcularDiscriminante();
        System.out.println("Ejemplo 1:");
        System.out.println("El discriminante es: " + discriminante1);

        double[] raices1 = ecuacion1.calcularRaices();
        System.out.println("Las raíces son:");
        for (double raiz : raices1) {
            System.out.println(raiz);
        }

        double x1 = 2.0;
        double y1 = ecuacion1.calcularY(x1);
        System.out.println("Para x = " + x1 + ", y = " + y1);
        System.out.println();

        // Ejemplo 2: Ecuación con una única raíz real
        EcuacionSegundoGrado ecuacion2 = new EcuacionSegundoGrado(1, -4, 4);

        double discriminante2 = ecuacion2.calcularDiscriminante();
        System.out.println("Ejemplo 2:");
        System.out.println("El discriminante es: " + discriminante2);

        double[] raices2 = ecuacion2.calcularRaices();
        System.out.println("Las raíces son:");
        for (double raiz : raices2) {
            System.out.println(raiz);
        }

        double x2 = 3.0;
        double y2 = ecuacion2.calcularY(x2);
        System.out.println("Para x = " + x2 + ", y = " + y2);
    }
}