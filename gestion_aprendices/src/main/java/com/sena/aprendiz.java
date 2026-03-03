package com.sena;

public class sena {

    // 1. Atributos {encapsulamiento, private}
    private String nombre;
    private String documento;
    private String correo;
    private int edad;

    // 2. Constructor vacio para crear objetos sin inicializar atributos
    public sena() {
    }

    // 3. Constructor con parametros para crear objetos con atributos inicializados
    public sena(String nombre, String documento, String correo, int edad) {
        this.nombre = nombre; // this hace referencia al atributo de la clase, no al parametro del constructor
        this.documento = documento;
        setCorreo(correo); // llamamos al setter para validar el correo
        setEdad(edad); // llamamos al setter para validar la edad
    }

    // 4. Getters y Setters para acceder y modificar los atributos de forma
    // controlada
    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public int getEdad() {
        return edad;
    }

    // SETTER para Y MODIvalidar FICAR el correoMODIFICAR DATOS

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setCorreo(String correo) {
        if (correo != null && correo.contains("@")) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("Correo inválido");
        }
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 150) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("Edad inválida");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // 6 metodo para mostrar la informacion del aprendiz
    public String presentarse() {
        return "Hola, mi nombre es " + nombre + ", mi documento es " + documento + ", mi correo es " + correo
                + " y tengo " + edad + " años.";
    }

}
