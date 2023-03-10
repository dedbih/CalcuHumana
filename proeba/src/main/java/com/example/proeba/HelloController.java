package com.example.proeba;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;

/**
 * Clase principal de la lógica detrás del GUI y operaciones de la calculadora
 */
public class HelloController {
    /**
     * defino variables age, name y can. me permiten crear instancias de la clase Persona.
     * defino e1 y e2, los operandos principales de la calculadora. sus valores se definen en cada definición de operación
     * res me guarda el resultado de las operaciones
     */
    String age;
    String name;
    String can;

    Short resdisplay;
    int e1;
    int e2;

    public short res;

    @FXML
    private Label titulomain;

    @FXML
    private Label tituloclase;

    @FXML
    private Label titulocalc;

    @FXML
    private Label titulonom;

    @FXML
    private Label tituloresi;

    @FXML
    private Label tituloedad;

    @FXML
    private Label resultlab;

    @FXML
    private Label spec1lab;

    @FXML
    private Label spec2lab;


    @FXML
    private Button crearb;

    @FXML
    private Button sumb;

    @FXML
    private Button resb;

    @FXML
    private Button multb;

    @FXML
    private Button divb;

    @FXML
    private Button catchName;
    @FXML
    private Button catchAge;
    @FXML
    private TextField nombreinput;

    @FXML
    private TextField ageinput;


    @FXML
    ChoiceBox<String> cantonl = new ChoiceBox<>();

    @FXML
    ComboBox<String> personalist1 = new ComboBox<>();

    @FXML
    ComboBox<String> personalist2 = new ComboBox<>();



    public void initialize() {
       cantonl.getItems().addAll("San José", "Cartago", "Alajuela", "Heredia", "Puntarenas", "Limón");
       nombreinput = new TextField();
       String name = nombreinput.getText();
       ageinput = new TextField();
       personalist1.getItems().addAll("1", "2", "3", "4");
       personalist2.getItems().addAll("1", "2", "3", "4");
    }

    @FXML
    public void agarraTextoN() {
        String name = nombreinput.getText();
    }
    @FXML
    public void agarraTextoP() {
        String name = nombreinput.getText();

    }
    @FXML
    public void agarraTextoE() {
        String age = ageinput.getText();
        System.out.println(age);
    }

    /**
     * Creo un método Handler para cada operación (suma, resta, división y multiplicacion)
     * Iguala mis variables operando a la edad de cada objeto Persona
     * res guarda el resultado
     */
    @FXML
    public void sumaHandler(int e1, int e2) {
        e1 = Integer.parseInt(personalist1.getValue());
        e2 = Integer.parseInt(personalist1.getValue());
        res = (short) (e1 + e2);
        resdisplay = res;
        cambiaResultado();
    }
    @FXML
    public void restaHandler() {
        e1 = Integer.parseInt(personalist1.getValue());
        e2 = Integer.parseInt(personalist1.getValue());
        res = (short) (e1 - e2);
        cambiaResultado();
    }
    @FXML
    public void multHandler() {
        e1 = Integer.parseInt(personalist1.getValue());
        e2 = Integer.parseInt(personalist1.getValue());
        res = (short) (e1 * e2);
        resdisplay = res;
        cambiaResultado();
    }

    @FXML
    public void divHandler() {
        e1 = Integer.parseInt(personalist1.getValue());
        e2 = Integer.parseInt(personalist1.getValue());
        res = (short) (e1 / e2);
        resdisplay = res;
        cambiaResultado();
    }

    /**
     * el método cambiaResultado me cambia el valor de el label al resultado de mi operación
     * se ejecuta después de cada operación
     */
    @FXML
    public void cambiaResultado() {
        String resdisplay = Short.toString(res);
        resultlab.setText(resdisplay);
    }

    /**
     * Este método se encarga de tomar las variables nombre, edad y cantón y pasarlas como argumento en el creador de clases
     */
        @FXML
    public void llamaCreaPersonas() {
        String can = cantonl.getValue();
        int edad1 = Integer.parseInt(age);
        PersonaManager manager = new PersonaManager();
        manager.creaPersonas(name,can,edad1);
    }
}