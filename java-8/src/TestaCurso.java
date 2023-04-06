import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestaCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.forEach(curso -> System.out.println(curso.getNome()));
        System.out.println("-".repeat(25));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));
        cursos.forEach(curso -> System.out.println(curso.getNome()));

        System.out.println("-".repeat(25));

        int soma = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)  // pega quantidade de alunos
                .sum();
        System.out.println("A soma dos cursos com mais de 100 aluno é: " + soma);

        System.out.println("-".repeat(25));

        cursos.stream()
                .map(Curso::getAlunos)
                .filter(alunos -> alunos > 50)
                .forEach(System.out::println);

        System.out.println("-".repeat(25));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        System.out.println("-".repeat(25));

        cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        Curso::getNome,
                        Curso::getAlunos))
                .forEach((nome, qtdAlunos) -> System.out.println(nome + " tem " + qtdAlunos + " alunos."));

        System.out.println("-".repeat(25));

        Map<String, Integer> mapaDeCursos = cursos.stream()
                .filter(curso -> curso.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        Curso::getNome,
                        Curso::getAlunos));
        System.out.println(mapaDeCursos);
    }
}
