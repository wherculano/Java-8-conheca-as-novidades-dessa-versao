import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

    public static void main(String[] args) {

        // antes do Java 8
        List<String> palavras = new ArrayList<String>();
        palavras.add("pizza");
        palavras.add("esfiha");
        palavras.add("lasanha");
        palavras.add("noque");
        palavras.add("macarronada");

        System.out.println(palavras);

        Collections.sort(palavras);
        System.out.println(palavras);

        Comparator<String> comparador = new ComparadorPorTamanho();
        Collections.sort(palavras, comparador);
        System.out.println(palavras);

        // A partir do Java 8
        palavras.sort(comparador);
        System.out.println(palavras);

    }
}

class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String str1, String str2) {
        return str1.length() - str2.length();
    }
}