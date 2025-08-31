public class Lista {
    Nodo header = null;
    public  Lista(){
        header = null;
    }

    public void agregar(int numero){
        Nodo nuevo = new Nodo(numero);
        Nodo agregar = header;
        if(header == null) { header = nuevo; return; }
        while(agregar.Next != null){
            agregar = agregar.Next;
        }
        agregar.Next = nuevo;
    }
    public void Imprimir(){
        Nodo Print = header;
        if(header == null){ System.out.println("Lista vacia"); return; }
        while(Print.Next != null){
            System.out.println(Print.Numero);
            Print = Print.Next;
        }
    }
}
