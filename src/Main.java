public class Main {
    public static void main (String [] args){
        LSEContato lista = new LSEContato();
        Contato c1 = new Contato ();
        c1.nome="Maria";
        c1.telefone="123";
        
        Contato c2 = new Contato ();
        c2.nome="Ti�o";
        c2.telefone="123";
       /* duvida de jackson aula do dia 20/11/2020 
        if (c1.equals(c2)){
            System.out.println("iguais");
        }
        else{System.out.println("diferente");}
        */
        Contato c3 = new Contato ();
        c3.nome="Ana";
        
        lista.inserirInicio(c1); // Jo�o
        lista.inserirInicio(c3);// Ana, Jo�o
        lista.inserirFim(c2); // Ana, Jo�o, Maria
        
        
        lista.imprimirLista();
        System.out.println("O tamanho da lista �:"+lista.tamanhoO1());
        System.out.println("------- Removendo ----- ");
        System.out.println("Estou removendo o contato de nome:"+lista.remover(1).nome);
        lista.imprimirLista();
        System.out.println("");
        System.out.println("Estou removendo o contato de nome:"+lista.removerInicio().nome);
        System.out.println("");
        lista.imprimirLista();
        System.out.println("O tamanho da lista �:"+lista.tamanhoO1());
        
        
    }
}
