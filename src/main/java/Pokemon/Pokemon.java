/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon;

/**
 * Clase que genera objetos de tipo Pokemon
 * @author Issmael
 */
public class Pokemon {
    private String color;
    private String nombre;
    private String especie;
    private int dificultad;
    private int tamaño;

    /**
     * Constructor vacío
     */
    public Pokemon() {
    }

    /**
     * Constructor que inicializa todos los atributos de la clase
     * @param color color del pokemon
     * @param nombre nombre del pokemon
     * @param especie tipo: {agua, fuego, piedra}
     * @param dificultad dificultad para vencer/atrapar
     * @param tamaño qué tan grande es en cm
     */
    public Pokemon(String color, String nombre, String especie, int dificultad, int tamaño) {
        this.color = color;
        this.nombre = nombre;
        this.especie = especie;
        this.dificultad = dificultad;
        this.tamaño = tamaño;
    }

    /**
     * Obtener el color del pokemon
     * @return una cadena que describe el color
     */
    public String getColor() {
        return color;
    }

    /**
     * Modificar el color del pokemon
     * @param color color deseado
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtener el nombre del pokemon
     * @return String que contiene el nombre del pokemon
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modificar el nombre del pokemon
     * @param nombre nuevo nombre del pokemon
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtener la especie del pokemon
     * @return String que contiene la especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Modificar la especie del Pokemon
     * @param especie tipo fuego, tierra, piedra
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Obtener la dificultad de combate/captura
     * @return entero 0-100
     */
    public int getDificultad() {
        return dificultad;
    }

    /**
     * Modificar la dificultad de combate/captura
     * @param dificultad 1-100
     */
    public void setDificultad(int dificultad) {
        if (dificultad < 0) {
            System.out.println("Dificultad inválida");
        } else if (dificultad > 100) {
            System.out.println("Máximo superado: 100");
            this.dificultad = 100;
        } else {
            this.dificultad = dificultad;
        }
    }

    /**
     * Obtener el tamaño del pokemon (en cm)
     * @return entero de centímetros
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Modificar el tamaño del pokemon
     * @param tamaño (cm)
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Imprime el mensaje para atacar
     */
    public void atacar() {
        System.out.println(nombre + " ataca!!!");
    }

    /**
     * Imprime el mensaje para defenderse
     */
    public void defender() {
        System.out.println(nombre + " defiende!!!");
    }

    /**
     * Imprime el mensaje para curarse
     */
    public void curarse() {
        System.out.println(nombre + " se cura");
    }

    /**
     * Imprime el mensaje para retirarse
     */
    public void retirarse() {
        System.out.println(nombre + " se retira del combate!");
    }
}

