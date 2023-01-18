package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unmanned extends Spacecraft{

    /**
     * Se crea un objeto BufferedReader para Interactuar con la consola
     */
    BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Atributos de la clase Unmanned
     */
    private boolean state;
    private String target;

    /**
     * Constructor con parametros
     * @param mission
     * @param capacity
     * @param power
     * @param speed
     * @param name
     * @param fuelType
     * @param state
     * @param target
     */
    public Unmanned(String mission, String capacity, String power, String speed, String name, String fuelType, boolean state, String target) {
        super(mission, capacity, power, speed, name, fuelType);
        this.state = state;
        this.target = target;
    }

    /**
     * Métodos get y set
     * @return
     */

    public String getTarget() {
        return this.target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public boolean getState() {
        return this.state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * Método toString permite mostrar información de los objetos
     * @return
     */
    @Override
    public String toString() {
        return "Unmanned{" +
                "state=" + state +
                ", target='" + target + '\'' +
                '}';
    }


    /**
     * Método que se extiende de la clase abstracta y se debe impolementar, sobrescribir
     * @param string
     * @return
     * @throws IOException
     */
    @Override
    public String makeTask(String string) throws IOException {
        String name;
        String fuelType;
        boolean state;
        String target;
        String power;
        String speed;
        name = getName();
        fuelType = getFuelType();
        state = getState();
        target = getTarget();
        power = getPower();
        speed = getSpeed();
        String mission;
        String s = "";

        if(state == true){
            s = "Todavía sigue en marcha";
        }else{
            s = "El proyecto no existe";
        }

        mission = (string +
                "\n"+
                "La sonda " + name + " actualmente  " + s + "\n" +
                " su objetivo " + target + ", La sonda es impulsada por " + fuelType + "\n" +
                " con una velocidad de " + speed + " y una capacidad de " + power);

        return mission;
    }

    /**
     * Método que se extiende de la clase abstracta y se debe impolementar, sobrescribir
     * @param fuelType
     */
    @Override
    public void reFuel(String fuelType) {
        fuelType = getFuelType();
        System.out.println("La nave esta cargando combustible " + fuelType );
    }
}
