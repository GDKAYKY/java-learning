import java.util.List;
import java.util.LinkedList;

/**
 * Demonstração de listas no Java:
 * - Classe ArrayList (java.util.ArrayList)
 * - Métodos add(), size(), get()
 * - Diferentes tipos de listas (ArrayList, LinkedList, Vector, etc.)
 * - Método toString()
 */
public class ArrayList {

    public static void main(String[] args) {

        // ============================================================
        // 1. CRIANDO UM ArrayList DE OBJETOS (Movie)
        // ============================================================
        // ArrayList é uma lista redimensionável que armazena objetos.
        // Está no pacote java.util e implementa a interface List.

        java.util.ArrayList<Film> movies = new java.util.ArrayList<>();

        // ============================================================
        // 2. MANIPULANDO COM add(), size() e get()
        // ============================================================

        // add() — adiciona elementos ao final da lista
        movies.add(new Film("Top Gun: Maverick", "Joseph Kosinski", "Plus"));
        movies.add(new Film("Avatar", "James Cameron", "Basic"));
        movies.add(new Film("Inception", "Christopher Nolan", "Plus"));
        movies.add(new Film("Interestelar", "Christopher Nolan", "Premium"));

        // size() — retorna a quantidade de elementos
        System.out.println("Total de filmes na lista: " + movies.size());

        // get() — acessa um elemento pelo índice (baseado em 0)
        System.out.println("Primeiro filme: " + movies.get(0).movieName);
        System.out.println("Último filme : " + movies.get(movies.size() - 1).movieName);

        // Percorrendo a lista com for
        System.out.println("\n--- Todos os filmes ---");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println((i + 1) + ". " + movies.get(i));
            // ^^^^^^^
            // get() retorna o Movie no índice i
            // O println chama toString() automaticamente
        }

        // ============================================================
        // 3. DIFERENTES TIPOS DE LISTAS NO JAVA
        // ============================================================
        // A interface List é implementada por várias classes:

        // ArrayList — array redimensionável (rápido para leitura)
        java.util.ArrayList<Film> arrayList = new java.util.ArrayList<>();

        // LinkedList — lista duplamente encadeada (rápido para inserções/remoções)
        List<Film> linkedList = new LinkedList<>();

        // Vector — thread-safe, mas mais lento (legado)
        java.util.Vector<Film> vector = new java.util.Vector<>();

        // Stack — pilha LIFO (estende Vector)
        java.util.Stack<Film> stack = new java.util.Stack<>();

        // Programar para a interface (boa prática):
        List<Film> list = new java.util.ArrayList<>();
        // ^^^^ ^^^^^^^^^^^^^^^^
        // tipo da variável implementação concreta

        System.out.println("\n--- Tipos de lista usam a mesma interface ---");
        System.out.println("ArrayList : " + arrayList.getClass().getSimpleName());
        System.out.println("LinkedList: " + linkedList.getClass().getSimpleName());
        System.out.println("Vector    : " + vector.getClass().getSimpleName());
        System.out.println("Stack     : " + stack.getClass().getSimpleName());

        // ============================================================
        // 4. MÉTODO toString()
        // ============================================================
        // Sem sobrescrever toString(), o Java imprime:
        // Movie@1a2b3c4d (nomeDaClasse@hashCode)
        //
        // Sobrescrevendo toString() na classe Movie, conseguimos uma
        // representação legível. Veja a classe Movie abaixo!
        System.out.println("\n--- toString() em ação ---");
        System.out.println("Lista completa: " + movies);
        // O println acima chama movies.toString() internamente,
        // que por sua vez chama toString() de cada Movie da lista.

        System.out.println("Filme único   : " + movies.get(0).toString());
        // Mesmo resultado, mas chamada explícita.
    }
}

/**
 * Classe Movie com toString() sobrescrito.
 * Sem toString(), o Java usaria Object.toString():
 * "Movie@15db9742"
 * Com toString(), temos uma representação amigável.
 */
class Film {
    String movieName;
    String movieAuthor;
    String requiredPlan;

    // Construtor sem argumentos (padrão)
    Film() {
        this.movieName = "Top Gun: Maverick";
        this.movieAuthor = "Joseph Kosinski";
        this.requiredPlan = "Plus";
    }

    // Construtor com argumentos
    Film(String movieName, String movieAuthor, String requiredPlan) {
        this.movieName = movieName;
        this.movieAuthor = movieAuthor;
        this.requiredPlan = requiredPlan;
    }

    /**
     * toString() — herdado de Object.
     * Sobrescrevemos para retornar uma string legível.
     *
     * Sem sobrescrita: "Movie@1a2b3c4d"
     * Com sobrescrita : "🎬 Top Gun: Maverick | Joseph Kosinski | Plus"
     */
    @Override
    public String toString() {
        return "🎬 " + movieName + " | " + movieAuthor + " | " + requiredPlan;
    }
}
