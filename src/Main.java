import javax.swing.*;

public class Main {

        /*
        En este metodo va toda la interfaz del usuario
        Las clases NodoDoble y ListaDoble deben tener solo implementación (nada de interfaz o visualización),
        excepto los métodos de mostrarInicioFin y mostrarFinInicio (son los únicos que pueden imprimir en consola
        o devolver un String para después imprimirlo desde aquí o mostrarlo en un JOptionPane aquí en Main.java).
         */

        /*
        Pueden usar JOptionPane o hacer la interfaz por consola.
        Deben definir un menú con las siguientes opciones:
                "1. Insertar un elemento al inicio\n"+
                "2. Insertar un elemento al final\n"+
                "3. Insertar un elemento en orden\n"+
                "4. Eliminar un elemento al inicio\n"+
                "5. Eliminar un elemento al final\n"+
                "6. Eliminar un elemento\n"+
                "7. Buscar un elemento\n"+
                "8. Mostrar los datos de inicio a fin\n"+
                "9. Mostrar los datos de fin a inicio\n"+
                "10. Salir\n","Menú de opciones",3));
        */
        public static void main(String[] args) {

            int opcion = 0;
            int elemento;
            ListaDoble lista = new ListaDoble();

            do {
                try {
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "1. Insertar un elemento al inicio\n"+ //TODO @ Víctor Miguel Ochoa Camargo
                                    "2. Insertar un elemento al final\n"+ // @ Mia Renee Valenzuela Yescas
                                    "3. Insertar un elemento en orden\n"+ //TODO @ Víctor Miguel Ochoa Camargo
                                    "4. Eliminar un elemento al inicio\n"+ //TODO @ Jesus Francisco Villa Icedo
                                    "5. Eliminar un elemento al final\n"+ // @ Mia Renee Valenzuela Yescas
                                    "6. Eliminar un elemento\n"+ //TODO @ Jesus Francisco Villa Icedo
                                    "7. Buscar un elemento\n"+ //TODO @ Gloria Jesús Sanchez Lopez
                                    "8. Mostrar los datos de inicio a fin\n"+ //TODO @
                                    "9. Mostrar los datos de fin a inicio\n"+ //TODO @ Gloria Jesús Sanchez Lopez
                                    "10. Salir\n",
                            "Menú de opciones", 3));
                    switch (opcion) {
                        case 1://Insertar un elemento al inicio TODO @ Víctor Miguel Ochoa Camargo
                            break;
                        case 2://Insertar un elemento al final  @ Mia Renee Valenzuela Yescas
                           try {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingresa el elemento: ",
                                        "Insertar al Final: ", 3));
                                lista.insertarFinal(elemento);
                            }catch (NumberFormatException n) {
                               JOptionPane.showInputDialog(null, "Error" + n.getMessage(), "Error de ingreso", 0);
                           }
                            break;
                        case 3: //Insertar en orden TODO @ Víctor Miguel Ochoa Camargo
                            break;
                        case 4: //Eliminar al inicio TODO @ Jesus Francisco Villa Icedo
                            break;
                        case 5: //Eliminar al final  @ Mia Renee Valenzuela Yescas
                            elemento = lista.eliminarFinal();
                            if (elemento != -1) {
                                JOptionPane.showMessageDialog(null, "Se eliminó el elemento final: " + elemento, "Eliminar al final", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "No se pudo eliminar (lista vacía)", "Error", JOptionPane.WARNING_MESSAGE);
                            }

                            break;

                        case 6: //Eliminar TODO @ Jesus Francisco Villa Icedo
                            break;
                        case 7: //Buscar elemento TODO @ Gloria Jesús Sanchez Lopez
                            try {
                                elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                        "Ingresa el elemento a buscar: ",
                                        "Buscar elemento: ", JOptionPane.QUESTION_MESSAGE));
                                if(lista.buscarElemento(elemento)){
                                    JOptionPane.showMessageDialog(null,elemento+" encontrado en la lista","Elemento encontrado",JOptionPane.INFORMATION_MESSAGE);
                                }else{
                                    JOptionPane.showMessageDialog(null,elemento+" No encontrado en la lista","Elemento no encontrado",JOptionPane.ERROR_MESSAGE);
                                }
                            }catch (NumberFormatException n){
                                JOptionPane.showMessageDialog(null,"Error"+n.getMessage(),"Error de ingreso",JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        case 8: //MostrarLista TODO @ Gloria Jesús Sanchez Lopez
                            lista.mostrarInicioFin();
                            break;
                        case 9: //MostrarLista TODO @ Gloria Jesús Sanchez Lopez
                            lista.mostrarFinInicio();
                            break;
                        case 10: //Salir
                            JOptionPane.showMessageDialog(null, "Programa Finalizado");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción Incorrecta");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "error" + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } while (opcion != 10);
    }
}