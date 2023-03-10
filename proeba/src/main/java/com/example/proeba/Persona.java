package com.example.proeba;

/**
 * Clase que se encarga de objetos Persona
 */
public class Persona {
    private String nombre;
    private String canton;
    private int edad2;

    public Persona(String nombre, String canton, int edad2) {
        /**
         * Pasan argumentos nombre,cantón y edad, son asignados como atributos del objeto
         */
        this.nombre = nombre;
        this.canton = canton;
        this.edad2 = edad2;
    }

    /**
     * Variables que sirven para tener acceso a atributos nombre, edad y cantón con facilidad
     * @return
     */
    public String getName() {
        return nombre;
    }

    public void setName(String nombre) {
        this.nombre = nombre;
    }

    public String getCanton() {
        return canton;
    }

    public void setCountry(String canton) {
        this.canton = canton;
    }

    public int getEdad() {
        return edad2;
    }

    public void setEdad(int edad2) {
        this.edad2 = edad2;
    }
}