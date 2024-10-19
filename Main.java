import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaCadastroLivros sistema = new SistemaCadastroLivros();

        while (true) {
            System.out.println("----------------CADASTRO-DE-LIVROS------------\nOPÇÕES:");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Listar Livros");
            System.out.println("3. Listar Livros por Categoria");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do autor: ");
                        String nomeAutor = scanner.nextLine();
                        System.out.print("Digite o gênero do livro: ");
                        String nomeGenero = scanner.nextLine();
                        System.out.print("Digite o título do livro: ");
                        String titulo = scanner.nextLine();


                        Pessoa autor = new Pessoa(nomeAutor);
                        Genero genero = new Genero(nomeGenero);
                        Livro livro = new Livro(titulo, autor, genero);

                        sistema.cadastrarLivro(livro);
                        break;
                    case 2:
                        sistema.listarLivros();
                        break;
                    case 3:
                        System.out.print("Digite o gênero para listar os livros: ");
                        String categoria = scanner.nextLine();
                        sistema.ListarLivrosPorCategoria(categoria);
                        break;
                    case 4:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida Tente novamente!");
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}