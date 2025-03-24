public class Main {
    public static void main(String[] args) {
        String notas = "10 20 30 40 50";
        Promedio prom = new Promedio();
        System.out.println(prom.notas(notas));

        System.out.println(prom.calcularPromedio(prom.notas(notas)));
    }
}