public class ListaDoble {
    protected NodoDoble inicio, fin; //Apuntadores para saber donde esta el inicio y el fin de la lista doble

    //Constructor para crear la lista doble vacía
    public ListaDoble(){
        inicio = null;
        fin =null;
    }

    //Metodo para saber si la lista doble está vacía
    public boolean listaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }

    //Metodo para agregar un NodoDoble al Inicio de la Lista Doble
    public void insertarInicio(int dato){
        //2,4,5,7
        inicio = new NodoDoble(dato, inicio, null);
        if (inicio.siguiente != null) {
            inicio.siguiente.anterior = inicio;
        }
        if (fin == null) {
            fin = inicio;
        }
    }

    //Metodo para insertar al Final de la lista doble
    public void insertarFinal(int dato){

    }


    /* Metodo para insertar un elemento suponiendo que la lista está en orden ascendente
    es decir, se debe comenzar a recorrer la lista e insertar el elemento antes del primer
    número mayor al elemento que se encuentre en la lista, si no se encuentar un dato mayor
    se inserta al final */

    public void insertarEnOrden(int dato){
        //2,5,7,9
        if (listaVacia() || dato < inicio.dato) {
            insertarInicio(dato);
        } else if (dato > fin.dato) {
            insertarFinal(dato);
        } else {
            NodoDoble actual = inicio;
            while (actual.siguiente != null && dato > actual.siguiente.dato) {
                actual = actual.siguiente;
            }
            NodoDoble nuevo = new NodoDoble(dato, actual.siguiente, actual);
            actual.siguiente.anterior = nuevo;
            actual.siguiente = nuevo;

        }
    }


    //Eliminar al inicio
    public int eliminarInicio(){

        return -1;
    }

    //Eliminar al final
    public int eliminarFinal(){

        return -1;
    }

    //Eliminar un elemento
    public int eliminarElemento(int elemento){

        return elemento;
    }

    //Metodo para buscar un elemento
    public boolean buscarElemento(int elemento){

        return false;

    }

    //Imprimir los datos de la lista doble de inicio a fin
    public void mostrarInicioFin(){
        NodoDoble actual=inicio;
        System.out.println();
        while(actual!=null){
            System.out.print(actual.dato+" --> ");
            actual = actual.siguiente;
        }
    }

    //Imprimir los datos de la lista doble de fin a inicio
    public void mostrarFinInicio(){

    }


}