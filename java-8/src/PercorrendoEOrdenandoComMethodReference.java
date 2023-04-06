import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PercorrendoEOrdenandoComMethodReference {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("pizza");
        palavras.add("esfiha");
        palavras.add("lasanha");
        palavras.add("noque");
        palavras.add("macarronada");

        // foreach usando method reference como consumer
        palavras.forEach(System.out::println);

        // sort com method reference (considera o tamanho da string)
        palavras.sort(Comparator.comparingInt(String::length));
        System.out.println(palavras);
    }
}
