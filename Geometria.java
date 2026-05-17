public class Geometria {
    // Función 1: Calcular el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        double areaR = calcularAreaRectangulo(5.0, 3.0);
        System.out.println("El área del rectángulo es: " + areaR);
    }
}