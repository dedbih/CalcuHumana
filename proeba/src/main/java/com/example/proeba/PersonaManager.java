package com.example.proeba;

//x=nombre
//y=canton
//z=edad

/**
 * Clase se encarga de crear hasta 4 instancias de Persona
 * si es la primera persona crea una instancia con las variables x,y,z obtenidas en otros métodos y lo guarda en una variable p1.
 * Hace lo mismo para cada objeto que se cree después de esto (p2,p3,p4)
 */
public class PersonaManager {
    /**
     * @param x Se toma como el valor de nombre
     * @param y Se toma como el cantón seleccionado
     * @param z Se toma como la edad
     */
    public void creaPersonas(String x,String y,int z) {
        int i = 1;
        while (i <= 4) {
            if (i == 1) {
                Persona p1 = new Persona(x, y, z);
                i++;
            }
            if (i == 2) {
                Persona p2 = new Persona(x, y, z);
                i++;
            }
            if (i == 3) {
                Persona p3 = new Persona(x, y, z);
                i++;
            }
            if (i == 4) {
                Persona p4 = new Persona(x, y, z);
                i++;
            }
        }
    }
}
