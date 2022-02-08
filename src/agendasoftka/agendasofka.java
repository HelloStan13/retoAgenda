package agendasoftka;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

public class agendasofka {

    public static void main(String[] args) {
        Agenda agenda = new Agenda(20);

        boolean salir = false;
        while (!salir) {
            EntradaSalida.imprimirMenu();
            int opcion = EntradaSalida.leerNumero();
            switch (opcion) {
                case 1:
                    if (agenda.getContactosRegistrados() != agenda.getMaxContactos()) {
                        EntradaSalida.imprimirCadena("Nombre: ");
                        String nombre = EntradaSalida.leerNombre();
                        EntradaSalida.imprimirCadena("Teléfono (recuerde minino 3 caracteres): ");
                        String telefono = EntradaSalida.leerTelefono();                        
                        EntradaSalida.imprimirCadena("Correo: ");
                        String correo = EntradaSalida.leerCorreo();                        
                        EntradaSalida.imprimirCadena("Saldo Dolares: ");
                        String saldodolares = EntradaSalida.leerSaldodolares();
                        agenda.contactoNuevo(nombre, telefono,correo,saldodolares);
                    } else {
                        EntradaSalida.imprimirCadena("Agenda llena");
                    }
                    break;
                case 2:
                    EntradaSalida.imprimirCadena("Introduce nombre a buscar: ");
                    EntradaSalida.imprimirCadena(agenda.buscarNumeroPorNombre(EntradaSalida.leerNombre()));
                    break;
                case 3:
                    agenda.ordenarAgendaPorNombre();
                    for (int i = 0; i < agenda.getContactosRegistrados(); i++) {
                        EntradaSalida.imprimirCadena(agenda.infoContacto(i));
                    }
                    break;
                case 4:
                    agenda.ordenarAgendaPorNombre();
                    agenda.guardarAgenda();
                    break;
                case 5:
                    EntradaSalida.imprimirCadena("Introduce nombre a buscar: ");                    
                    String saldoActual =agenda.buscarSaldoPorNombre(EntradaSalida.leerSaldodolares());
                    EntradaSalida.imprimirCadena("Introduce monto a agregar: ");                    
                    String saldo = EntradaSalida.leerSaldodolares2();
                    //System.out.println(saldoActual+""+saldo);
                    int  saldodolares = Integer.parseInt(saldo)+Integer.parseInt(saldoActual);
                    System.out.println("su nuevo saldo es : "+saldodolares);
                    
                    /*pendiente actualizar saldo en agenda luego de ingreso*/
                    
                    break;
                case 6:
                    /*pendiente por constrruir*/
                    break;
                case 7:
                    salir = true;
            }
        }
    }

}
