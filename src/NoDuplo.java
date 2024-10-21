public class NoDuplo {
    Livro livro;
    NoDuplo anterior, proximo;
    public NoDuplo(Livro livro) {
        this.livro = livro;
        this.anterior = this.proximo = null;
    }
}
