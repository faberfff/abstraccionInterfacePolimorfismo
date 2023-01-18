package src;

import java.io.IOException;

public class Manned extends Spacecraft{

    /**
     * Atributos de la clase Manned
     */
   private int crewCapacity;

   private double orbitalCapacity;

   private int weight;

   public Manned() {

   }

    /**
     * Constructor con parametros
     * @param mission
     * @param capacity
     * @param power
     * @param speed
     * @param name
     * @param fuelType
     * @param crewCapacity
     * @param orbitalCapacity
     * @param weight
     */
    public Manned(String mission, String capacity, String power, String speed, String name, String fuelType, int crewCapacity, double orbitalCapacity, int weight) {
        super(mission, capacity, power, speed, name, fuelType);
        this.crewCapacity = crewCapacity;
        this.orbitalCapacity = orbitalCapacity;
        this.weight = weight;
    }

    /**
     * Métodos get y set
     * @return
     */
    public int getWeight() {
       return this.weight;
   }

   public void setWeight(int weight) {
       this.weight = weight;
   }

   public int getCrewCapacity() {
       return this.crewCapacity;
   }

   public void setCrewCapacity(int crewCapacity) {
       this.crewCapacity = crewCapacity;
   }

   public double getOrbitalCapacity() {
       return this.orbitalCapacity;
   }

   public void setOrbitalCapacity(double orbitalCapacity) {
       this.orbitalCapacity = orbitalCapacity;
   }

    /**
     * Método toString permite mostrar información de los objetos
     * @return
     */
    @Override
    public String toString() {
        return "Manned{" +
                "crewCapacity=" + crewCapacity +
                ", orbitalCapacity=" + orbitalCapacity +
                ", weight=" + weight +
                '}';
    }

    /**
     * Método que se extiende de la clase abstracta y se debe impolementar, sobrescribir
     * @param string
     * @return
     * @throws IOException
     */
    @Override
    public String makeTask(String string) {
       String mission;
       String name;
       name = getName();
       int newCrewCapacity;
       newCrewCapacity = getCrewCapacity();
       mission = "La operación se realizara en la nave " + name + " con una tripulación de " + "\n"+
               newCrewCapacity + " integrantes " + "\n"
               + string;
        return mission;
    }

    /**
     * Método que se extiende de la clase abstracta y se debe impolementar, sobrescribir
     * @param fuelType
     */
    @Override
    public void reFuel(String fuelType) {
        fuelType = getFuelType();
        System.out.println("La nave esta cargando combustible " + fuelType);
    }

    /**
     * Método que cumple con la exigencia del taller sobre carga de métodos:
     * no recibe ningun parametro, no devuelve nada, imprime un mensaje por consola
     * con la capacidad de orbita de la nave
     */
    public void orbiting() {
       double orbit;
       String name;
       int crewCapacity;
       crewCapacity = getCrewCapacity();
       orbit = getOrbitalCapacity();
       name = getName();
        System.out.println("El centro de investigación espacial " + name + "\n" +
                " con una capacidad de orbita de " + orbit + " y una tripulación de " + crewCapacity);
    }
}
