//classe adaptado do conteudo de lista duplamente encadeada vista semestre passado
//https://github.com/leonardoheredia/alest1-202301/blob/main/aula11_listasduplamenteencadeadas/ListaLinearDuplamenteEncadeada.java
public class DNA {
    private int quantidade;
    private Nodo inicio;
    private Nodo fim;

    public class Nodo {
        private char item;
        private Nodo proximo;
        private Nodo anterior;

        private Nodo(char item) {
            this.item = item;
            this.proximo = null;
        }

    }

    public DNA(char[] dnaList) {
        this.quantidade = 0;
        this.inicio = null;
        this.fim = null;
        // add elementos de um vetor de char lidos do arquivos em uma lista duplamente
        // encadeada
        for (int i = 0; i < dnaList.length; i++) {
            adicionar(dnaList[i]);
        }
    }

    /** Insere novo nodo no final da lista */
    public void adicionar(char item) {
        Nodo novoNodo = new Nodo(item);
        if (quantidade == 0) {
            inicio = novoNodo;
            fim = novoNodo;
            quantidade++;
            return;
        }
        fim.proximo = novoNodo;
        novoNodo.anterior = fim;
        fim = novoNodo;
        quantidade++;
    }

    // remove um nodo
    public void remover(Nodo nodo) {

        if (nodo.proximo != null && nodo.anterior != null) {
            nodo.anterior.proximo = nodo.proximo;
            nodo.proximo.anterior = nodo.anterior;
        } else if (nodo.anterior == null) {
            nodo.proximo.anterior = null;
            inicio = nodo.proximo;

        } else if (nodo.proximo == null) {
            nodo.anterior.proximo = null;
            fim = nodo.anterior;
        }

        quantidade--;
    }

    // comprimi uma sequencia de dna
    public void comprimir() {

        Nodo atual = inicio;
        while (atual != null && atual.proximo != null) {
            if (atual.item != atual.proximo.item) {
                // System.out.println(atual.item + " " + atual.proximo.item);
                if (atual.item == 'D' && atual.proximo.item == 'N') {
                    adicionar('A');
                } else if (atual.item == 'D' & atual.proximo.item == 'A') {
                    adicionar('N');
                } else if (atual.item == 'N' & atual.proximo.item == 'A') {
                    adicionar('D');
                } else if (atual.item == 'N' & atual.proximo.item == 'D') {
                    adicionar('A');
                } else if (atual.item == 'A' & atual.proximo.item == 'N') {
                    adicionar('D');
                } else if (atual.item == 'A' & atual.proximo.item == 'D') {
                    adicionar('N');
                }
                remover(atual);
                remover(atual.proximo);
                if (atual.anterior == null) {
                    atual = inicio;
                } else {
                    atual = atual.anterior;
                }
            } else {
                atual = atual.proximo;
            }
        }
    }

    @Override
    public String toString() {
        String str = " ";
        for (Nodo n = this.inicio; n != null; n = n.proximo) {
            str = str + " " + n.item + " ";
        }
        return str;
    }

}