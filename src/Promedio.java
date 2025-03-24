import java.util.ArrayList;
import java.util.List;
public class Promedio {
    public Promedio() {
    }
    public List<Double> notas(String notas){
        List<Double> lista = new ArrayList<>();
        String[] array = notas.split(" ");
        for (String s : array) {
            lista.add(Double.parseDouble(s));
        }
        return lista;
    }

    public Double calcularPromedio(List<Double> notas){
        Double promedio = 0.0;
        for (Double nota : notas) {
          promedio += nota;
        }
        return promedio/notas.size();
    }
}
