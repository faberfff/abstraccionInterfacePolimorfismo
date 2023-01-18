package src;

public class Lanzadera extends Spacecraft implements ILanzadera {

    private String launchTime;

    /**
     * constructor con parametros, para crear un objeto tipo Lanzadera
     */
    public Lanzadera(String mission, String capacity, String power, String speed, String name, String fuelType, String launchTime) {
        super(mission, capacity, power, speed, name, fuelType);
        this.launchTime = launchTime;
    }


    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * Método que extiende de la clase Spacecraft y retorna la misión a cumplir de la nave
     *
     * @return mission
     */
    @Override
    public String makeTask(String cargo) {
        String mission;
        String capacity;
        String speed;
        String fuelType;
        String name;
        name = getName();
        capacity = getCapacity();
        speed = getSpeed();
        fuelType = getFuelType();
        mission = "La capacidad de carga del cohete autopropulsado " + name + " es :" + capacity + "\n"
                +"capacidad para impulsar la carga util " + cargo + "\n"
                +"este cohete impulsador utiliza  " + "\n"
                + fuelType + " para cumplir la misión desarrollara una velocidad " + "\n"
                + speed;
        return mission;
    }

    /**
     * Método que extiende de la clase Spacecraft, recibe Un String como parámetro, e imprime que la nave se
     * encuentra cargando combustible
     *
     * @param fuelType
     */
    @Override
    public void reFuel(String fuelType) {
        fuelType = getFuelType();
        System.out.println("La nave esta cargando combustible " + fuelType);
    }

    /**
     * Método que extiende de la clase Spacecraft, recibe un tipo de nave como carga para la nave lanzadera
     * para mostrar un mensaje con el tiempo que se demora para lanzar la carga
     *
     * @param spacecraft
     */
    @Override
    public void boostCargo(Spacecraft spacecraft) {
        String time;
        time = getLaunchTime();
        System.out.println("El tiempo de lanzamiento es de" + time + "horas: para la nave " + spacecraft);

    }

    /**
     * Método que cumple con la exigencia del taller sobre carga de métodos:
     * recibe una nave tipo (lanzadera), para mostrar un mensaje con el tiempo que necesita la nave para escapar
     * de la tracción después del lanzamiento de la carga
     */
    public void escapeTraction(Lanzadera lanzadera) {
        String name;
        name = lanzadera.getName();
        System.out.println("El tiempo límete de escape de tracción es de 30 minutos para la nave " + name);
    }

    @Override
    public String toString() {
        return "Lanzadera{" +
                "launchTime='" + launchTime + '\'' +
                '}';
    }
}
