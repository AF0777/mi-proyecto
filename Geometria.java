public class Geometria {
    // Función 1: Calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    // Función 2: Calcular el área de un triángulo (Agregada en la segunda rama)
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        double areaR = calcularAreaRectangulo(5.0, 3.0);
        System.out.println("El área del rectángulo es: " + areaR);

        double areaT = calcularAreaTriangulo(4.0, 6.0);
        System.out.println("El área del triángulo es: " + areaT);
    }
}