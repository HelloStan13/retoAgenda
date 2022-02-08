package agendasoftka;

public class Contacto implements Comparable<Contacto> {

    private final String nombre;
    private final String telefono;
    private final String correo;
    private final String saldodolares;

    public Contacto(String nombre, String telefono, String correo, String saldodolares) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.saldodolares = saldodolares;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return telefono;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public String getSaldodolares() {
        return saldodolares;
    }

    @Override
    public int compareTo(Contacto o) {
        return this.nombre.compareTo(o.nombre);
    }
}
