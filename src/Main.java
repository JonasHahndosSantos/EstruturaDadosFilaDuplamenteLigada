import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();

        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Adicionar livro no início");
            System.out.println("2. Adicionar livro no fim");
            System.out.println("3. Remover livro do início");
            System.out.println("4. Remover livro do fim");
            System.out.println("5. mostrar livro por id");
            System.out.println("6. Imprimir livros na ordem original");
            System.out.println("7. Imprimir livros na ordem reversa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    Livro livroInicio = lerLivro(scanner);
                    lista.adicionarNoInicio(livroInicio);
                    System.out.println("Livro adicionado no início.");
                    break;
                case 2:
                    Livro livroFim = lerLivro(scanner);
                    lista.adicionarNoFim(livroFim);
                    System.out.println("Livro adicionado no fim.");
                    break;
                case 3:
                    System.out.println("Livro removido: " + lista.removerDoInicio());
                    break;
                case 4:
                    System.out.println("Livro removido: " + lista.removerDoFim());
                    break;
                case 5:
                    System.out.print("Digite o ID que deseja procurar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha
                    Livro livroEncontrado = lista.buscarPorID(id);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    } else {
                        System.out.println("Livro com esse ID não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Livros na Ordem Original:");
                    lista.imprimirOrdemOriginal();
                    break;
                case 7:
                    System.out.println("Livros na Ordem Reversa:");
                    lista.imprimirOrdemReversa();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static Livro lerLivro(Scanner scanner) {
        System.out.print("Digite o ID do livro: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        return new Livro(id, titulo, autor);
    }

}
