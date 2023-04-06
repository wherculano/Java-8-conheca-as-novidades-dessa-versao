import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class PercorrendoEOrdenandoComLambda {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("pizza");
        palavras.add("esfiha");
        palavras.add("lasanha");
        palavras.add("noque");
        palavras.add("macarronada");

        // foreach usando lambda como consumer
        palavras.forEach(str -> System.out.println(str));

        // sort com lambda (considera o tamanho da string)
        palavras.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(palavras);
    }
}
