public class LinkedList<T> implements Interface<T> {
    private No<T> inicioNo;
    private No<T> ultimoNo;
    private int size = 0;

    LinkedList() {
        
    }

    @Override
    public void add(T elemento) {
        No<T> celula = new No<T>(elemento);

        if (this.size == 0) {
            this.inicioNo = celula;
        }

        else this.ultimoNo.setProximo(celula);

        this.inicioNo = celula;
        this.ultimoNo = celula;
        this.size++;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void clean() {
        for(No<T> atual = this.inicioNo; atual != null;) {
            No<T> proximoNo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
        }
        this.inicioNo = null;
        this.ultimoNo = null;
        this.size = 0;
    }

    @Override
    public String toString() {
        if (this.size == 0) {
            return "[]";
        }
        
        StringBuilder builder = new StringBuilder();
        
        No<T> atual = this.inicioNo;
        builder.append(atual.getElemento()).append(" , ");
    
        while(atual.getProximo() != null) {
        atual = atual.getProximo();
        builder.append(atual.getElemento()).append(" , ");
    }

    return builder.toString();
    }
    
}