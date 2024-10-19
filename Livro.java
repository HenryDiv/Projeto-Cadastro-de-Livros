import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Livro {
    private String titulo;
    private Pessoa autor;
    private Genero genero;
    public Livro(String titulo,Pessoa autor,Genero genero){
        if(titulo==null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("⚠\uFE0FO TÍTULO NÃO PODE SER NULO!⚠\uFE0F \n");

        }        this.titulo=titulo;
        this.autor=autor;
        this.genero=genero;
    }

     public String getTitulo() {
         return titulo;
     }

     public void setTitulo(String titulo) {
         this.titulo = titulo;
     }

     public Pessoa getAutor() {
         return autor;
     }

     public void setAutor(Pessoa autor) {
         this.autor = autor;
     }

     public Genero getGenero() {
         return genero;
     }

     public void setGenero(Genero genero) {
         this.genero = genero;
     }
 }
interface OperacoesLivro{
    void cadastrarLivro(Livro livro);
    void listarLivros();
    void ListarLivrosPorCategoria(String categoria);
}
 class SistemaCadastroLivros implements OperacoesLivro {
     private HashMap<String, List<Livro>> livrosPorGenero = new HashMap<>();

     public void cadastrarLivro(Livro livro) {
         livrosPorGenero.putIfAbsent(livro.getGenero().getNome(), new ArrayList<>());
         livrosPorGenero.get(livro.getGenero().getNome()).add(livro);
         System.out.println("LIVRO CADASTRADO COM SUCESSO!");

     }

     public void listarLivros() {
         if (livrosPorGenero.isEmpty()) {
             System.out.println("NENHUM LIVRO REGISTRADO!\n");
         } else {
             System.out.println("----------------LIVROS DISPONÍVEIS:------------");
             for (String genero : livrosPorGenero.keySet()) {
                 System.out.println("GÊNERO: " + genero);
                 for (Livro livro : livrosPorGenero.get(genero)) {
                     System.out.println("TÍTULO: " + livro.getTitulo() + "\nAUTOR: " + livro.getAutor().getNomeCompleto());
                     System.out.println("-----------------------------------------------");
                 }

             }
         }
     }


     public void ListarLivrosPorCategoria(String categoria) {
         if (livrosPorGenero.containsKey(categoria)) {
             System.out.println("LIVROS DO GENERO " + categoria + ":");
             for (Livro livro : livrosPorGenero.get(categoria)) {
                 System.out.println("TITULO: " + livro.getTitulo() + ", AUTOR: " + livro.getAutor().getNomeCompleto());

             }
         } else {
             System.out.println("NENHUM LIVRO ENCONTRADO PARA O GENERO: " + categoria);

         }
     }
 }
