/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author wilmer
 */
public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color;
    private Motor motor;
    private Estanque estanque;
    private TipoAutomovil tipo;
    private Persona conductor;
    private Rueda[] ruedas;

    private static int ultimoId;

    public static final int VELOCIDAD_MAXIMA_CARRETERA = 90;
    public static final int VELOCIDAD_MINIMA_CARRETERA = 45;

    public Automovil() {
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque capacidadEstanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = capacidadEstanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque capacidadEstanque, TipoAutomovil tipo) {
        this(fabricante, modelo, color, motor, capacidadEstanque);
        this.tipo = tipo;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, TipoAutomovil tipo, Persona conductor, Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque, tipo);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getCapacidadEstanque() {
        return estanque;
    }

    public void setCapacidadEstanque(Estanque capacidadEstanque) {
        this.estanque = capacidadEstanque;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "id=................... " + id
                + "\nfabricante=........... " + fabricante
                + "\nmodelo=............... " + modelo
                + "\ncolor=................ " + color
                + "\nmotor=................ " + motor.getTipo()
                + "\ncapacidadEstanque=.... " + estanque.getCapacidad()
                + "\ntipo=................. " + tipo
                + "\nCondutor=............. " + conductor + "\n";
    }

    public double calcularConsumo(int km, int porcentajeConsumido) {
        return km / (this.estanque.getCapacidad() * (porcentajeConsumido / 100f));
    }
}
