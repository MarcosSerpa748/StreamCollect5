import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = List.of(
                new Livro("A revolução do bichos","Orwell",12.99,2008),
                new Livro("1878","Orwell",5.99,2010),
                new Livro("Os Gregos","Asimov",59.99,2015),
                new Livro("Os Egípcios","Asimov",45.99,2006),
                new Livro("William Shakspear","Jennifer Basset",11.99,2018),
                new Livro("Pinóquio","Carlo Collodi",1.99,1889),
                new Livro("Sherlock Holmes","Arthur Conan",8.99,1959),
                new Livro("Game of Thrones","George R. R. Martin",79.99,2007),
                new Livro("Lord of The Rings","Tokien",5.99,1997),
                new Livro("Hobbit","Tokien",7.99,9)
        );

        Map<String,List<Livro>> livrosPorAutor = livros
                .stream()
                .collect(Collectors.groupingBy(Livro::getAutor));

        for (String i: livrosPorAutor.keySet()){
            System.out.println("Existe "+livrosPorAutor.get(i).size()+" livro(s) do(a) autor(a) "+i+" na nossa biblioteca");
        }
    }
}