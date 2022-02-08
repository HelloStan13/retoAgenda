package agendasoftka;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EntradaSalida {

    static Scanner sc = new Scanner(System.in);

    static int leerNumero() {
        int numero = 0;
        try {
            numero = sc.nextInt();
        } catch (InputMismatchException ime) {
            imprimirCadena("introduce un valor corecto");
        }
        sc.nextLine();
        return numero;
    }

    static void imprimirMenu() {
        imprimirCadena("1. Añadir contacto"
                + System.lineSeparator() + "2. Buscar número por nombre"
                + System.lineSeparator() + "3. Mostrar todo"
                + System.lineSeparator() + "4. Guardar agenda"
                + System.lineSeparator() + "5. Ingreso de Saldo"
                + System.lineSeparator() + "6. Transferencia de Saldo"
                + System.lineSeparator() + "7. Salir");
    }

    static String leerNombre() {
        return sc.nextLine();
    }

    static String leerTelefono() {
        boolean telefonoCorrecto = false;
        String telefono = "";
        while (!telefonoCorrecto) {
            telefono = sc.nextLine();
            try {
                telefonoCorrecto = Integer.parseInt(telefono) > 10;
            } catch (NumberFormatException nfe) {
                imprimirCadena("Introduce un número válido");
            }
        }
        return telefono;
    }
    
     static String leerCorreo() {
         String correo = "";
         correo = sc.nextLine();
         return correo;
         
    }
    static String leerSaldodolares() {
        String saldoActual;
        saldoActual = sc.nextLine();
        return saldoActual;
        
    }
    static String leerSaldodolares2() {
        String saldo;
        saldo = sc.nextLine();
        return saldo;
        
    }

    static void imprimirCadena(String cadena) {
        System.out.println(cadena);
    }
}
