public class ListaDuplamenteLigada {
    private NoDuplo inicio, fim;

    public void adicionarNoInicio(Livro livro) {
        NoDuplo novoNo = new NoDuplo(livro);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void adicionarNoFim(Livro livro) {
        NoDuplo novoNo = new NoDuplo(livro);
        if (fim == null) {
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public Livro removerDoInicio() {
        if (inicio == null) return null;
        Livro livro = inicio.livro;
        inicio = inicio.proximo;
        if (inicio != null) inicio.anterior = null;
        else fim = null;
        return livro;
    }

    public Livro removerDoFim() {
        if (fim == null) return null;
        Livro livro = fim.livro;
        fim = fim.anterior;
        if (fim != null) fim.proximo = null;
        else inicio = null;
        return livro;
    }

    public Livro buscarPorID(int id) {
        NoDuplo atual = inicio;
        while (atual != null) {
            if (atual.livro.id == id) return atual.livro;
            atual = atual.proximo;
        }
        return null;
    }

    public void imprimirOrdemOriginal() {
        NoDuplo atual = inicio;
        while (atual != null) {
            System.out.println(atual.livro);
            atual = atual.proximo;
        }
    }

    public void imprimirOrdemReversa() {
        NoDuplo atual = fim;
        while (atual != null) {
            System.out.println(atual.livro);
            atual = atual.anterior;
        }
    }
}

