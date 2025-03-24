import java.util.ArrayList;
import java.util.List;
public class Promedio {
    public Promedio() {
    }
    public List notas(String notas){
        List<Double> lista = new ArrayList<>();
        String[] array = notas.split(" ");
        for (String s : array) {
            lista.add(Double.parseDouble(s));
        }
        return lista;
    }
}
