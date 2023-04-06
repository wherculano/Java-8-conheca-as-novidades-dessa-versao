import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PercorreString {
    public static void main(String[] args) {
        // antes do Java 8
        List<String> palavras = new ArrayList<String>();
        palavras.add("pizza");
        palavras.add("esfiha");
        palavras.add("lasanha");
        palavras.add("noque");
        palavras.add("macarronada");

        // Antes do Java 8
        for (String palavra: palavras) {
            System.out.println(palavra);
        }

        System.out.println("---------- JAVA 8+ ----------");

        // A partir do Java 8
        Consumer<String> consumer = new ImprimeNaLinha();
        palavras.forEach(consumer);
    }
}

class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String str) {
        System.out.println(str);
    }
}
