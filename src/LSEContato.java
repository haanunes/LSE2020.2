
public class LSEContato {

    public Contato cabeca = null;
    public Contato cauda = null;
    public int tamanhoDaLista = 0;

    public void inserirInicio(Contato novo) {
        if (cabeca == null) { // se a lista estiver vazia
            cabeca = novo;
            cauda = novo;
        } else { // se a lista NÃO estiver vazia
            novo.proximo = cabeca;
            cabeca = novo;
        }
        tamanhoDaLista++;
    }

    public void inserirFim(Contato novo) {
        if (cabeca == null) { // se a lista estiver vazia
            cabeca = novo;
            cauda = novo;
        } else {// se a lista NÃO estiver vazia
            cauda.proximo = novo;
            cauda = novo;
        }
        tamanhoDaLista++;
    }

    public void inserirQualquerIndice(Contato novo, int i) {
        // Tarefinha de casa: faça esse métodomm
        if (i == 0) {
            inserirInicio(novo);
        } else if (i == tamanhoO1()) {
            inserirFim(novo);
        } else {
            // aki é a lógica de verdade dessa função
        }
    }

    // O(N) = linear
    public int tamanhoON() {
        int tamanho = 1;
        Contato aux = cabeca;
        while (aux.proximo != null) {
            aux = aux.proximo;
            tamanho++;
        }
        return tamanho;
    }
    // O(1) = constante

    public int tamanhoO1() {
        return tamanhoDaLista;
    }

    public Contato removerInicio() {
        Contato aux = cabeca;
        if (cabeca == null) {
            System.out.println("Lista Vazia");
            return null;
        } else if (cabeca == cauda) { // tamanhoO1 == 1
            cabeca = null;
            cauda = null;
            tamanhoDaLista--;
            return aux;
        } else {
            cabeca = aux.proximo;
            aux.proximo = null;
            tamanhoDaLista--;
            return aux;
        }
    }

    public Contato removerFinal() {
        if (tamanhoO1()==0){
            System.out.println("Lista Vazia");
            return null;
        }
        else if (tamanhoO1()==1){
            Contato aux = this.cabeca;
            this.cabeca=null;
            this.cauda=null;
            tamanhoDaLista--;
            return aux;
        }
        else {
            Contato aux = this.cabeca;
            while (aux.proximo != this.cauda){
                aux=aux.proximo;
            }
            Contato r = aux.proximo;
            aux.proximo=null;
            this.cauda=aux;
            tamanhoDaLista--;
            return r;
        }
    }

    public Contato remover(int i) {// remover de um indice específico
        if (i == 0) {
            return removerInicio();
        } else if (i == tamanhoDaLista - 1) {
           return removerFinal();
        } else {
            Contato aux = cabeca;
            for (int cont = 0; cont < i - 1; cont++) {
                aux = aux.proximo;
            }
            Contato r = aux.proximo;
            aux.proximo = r.proximo;
            r.proximo = null;
            tamanhoDaLista--;
            return r;
        }

    }

    public void imprimirLista() {
        if (cauda == null) {
            System.out.println("Lista Vazia!");
        } else {
            //impressao:   Ana, João, Maria
            //            aux 
            Contato aux = cabeca;// Ana, João, Maria
            while (aux != null) {
                System.out.print("| " + aux.nome + " | ");
                aux = aux.proximo;
            }
        }
    }
}
