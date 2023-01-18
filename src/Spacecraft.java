package src;

import java.io.IOException;

public abstract class Spacecraft {

    /**
     * Declaración de los atributos de la clase
     */
    private String mission;
    private String capacity;
    private String power;
    private String speed;
    private String name;
    private String fuelType;

    /**
     * Costructor sin parametros
     */
    public Spacecraft() {

    }

    /**
     * Constructor con parametros
     * @param mission
     * @param capacity
     * @param power
     * @param speed
     * @param name
     * @param fuelType
     */
    public Spacecraft(String mission, String capacity, String power, String speed, String name, String fuelType) {
        this.mission = mission;
        this.capacity = capacity;
        this.power = power;
        this.speed = speed;
        this.name = name;
        this.fuelType = fuelType;
    }


    /**
     * Métodos get and set, para encapsular los datos
     * @return
     */
    public String getMission() {
        return this.mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPower() {
        return this.power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSpeed(){
        return this.speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * Método toString permite mostrar información de los objetos
     * @return
     */
    @Override
    public String toString() {
        return "Spacecraft{" +
                "mission='" + mission + '\'' +
                ", capacity='" + capacity + '\'' +
                ", power='" + power + '\'' +
                ", speed='" + speed + '\'' +
                ", name='" + name + '\'' +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    /**
     * Método abstracto el cual las clases que extiendan deben implementar, recibe como parametro un string
     * retorna un String que específica como realisa la misión
     * @param string
     * @return
     * @throws IOException
     */
    public abstract String makeTask(String string) throws IOException;

    /**
     * Método abstracto recibe como parametro un String con el tipo de combustible no retorna nada, simplementa
     * imprime como se recarga la nave
     * @param fuelType
     */
    public abstract void reFuel(String fuelType);


}
