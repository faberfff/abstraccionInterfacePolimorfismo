package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        /**
         * Atributos del método main
         */
        String task;
        String c;
        String mission;
        String capacity;
        String power;
        String speed;
        String name;
        String fuelType;
        String launchTime;
        boolean state;
        String target;
        int crewCapacity;
        double orbitalCapacity;
        int weight;

        int opcion;

        /**
         * Primer tipo de nave
         */
        Manned manned = new Manned("investigación espacial en órbita terrestre", "420 Toneladas",
                "No definida", "No disponible", "Estación Espacial Internacional", "monoxido",
                7, 386, 0);

        /**
         * Segundo tipo de nave
         */
        Unmanned unmanned = new Unmanned("explorar Plutón y sus lunas", "No definido",
                " 16 motores, 4 con un empuje de 0,44 kg", "56000 km/h",
                "New Horizons", "Celdas fotovoltaicas", true,
                "viajar más allá del cinturón de Kuiper");

        /**
         * Tercer tipo de nave
         */
        Unmanned unmanned1 = new Unmanned("Júpiter", " 258 kg",
                " Tiene un empuje de 26 kg", "56000 km/h",
                "Pionero X", "Celdas fotovoltaicas", true,
                "Se desplaza inercialmente hacia la estrella Aldebarán");

        /**
         * Cuarto tipo de nave
         */

        Lanzadera lanzadera = new Lanzadera("Lanzar una carga útil al espacio", "118 toneladas",
                "Potencia de 32000×5 caballos", "No definida", "Saturno V",
                "Combustible químico sólido o bien propelente líquido", "No definida ");

        /**
         * Este bucle do while se ejecuta mientras el usuario no desee
         */

        do {
            System.out.println(" ");
            System.out.println(" Crea las naves espaciales según las necesidades : ");
            System.out.println(" ");
            System.out.println("1. Autopropulsado que sirve para lanzar una carga útil al espacio");
            System.out.println("2. Satélites artificiales que orbitan geoestacionariamente");
            System.out.println("3. Mandar seres humanos al espacio para tareas de reparación," + "\n" +
                    " mantenimiento o investigación");
            System.out.println("4. Salir");
            opcion = Integer.parseInt(bfr.readLine());

            /**
             * Depende de la opción que el usuario digite cada case del switch mostrara una nave diferente
             * con sus propiedades y distintos comportamientos.
             */

            switch (opcion) {
                case 1: {
                    mission = lanzadera.getMission();
                    capacity = lanzadera.getCapacity();
                    power = lanzadera.getPower();
                    speed = lanzadera.getSpeed();
                    name = lanzadera.getName();
                    fuelType = lanzadera.getFuelType();
                    launchTime = lanzadera.getLaunchTime();
                    c = manned.getName();
                    task = lanzadera.makeTask(c);

                    System.out.println("El cohete autopropulsado " + name + " con capacidad de " +"\n"
                             +capacity + " Un poder de " + power + " con una velocidad " + speed + "\n"
                             +" funcionan mediante " + fuelType + "\n"
                             +" necesita un tiempo de lanzamiento " + launchTime + "\n"
                             +" cumple con la misión de " + mission);
                    System.out.println("");
                    System.out.println(task);
                    System.out.println("");
                    lanzadera.escapeTraction(lanzadera);

                }
                break;

                case 2: {

                    mission = unmanned.getMission();
                    capacity = unmanned.getCapacity();
                    power = unmanned.getPower();
                    speed = unmanned.getSpeed();
                    name = unmanned.getName();
                    fuelType = unmanned.getFuelType();
                    state = unmanned.getState();
                    target = unmanned.getTarget();


                    task = unmanned.makeTask("NAVES ESPACIALES NO TRIPULADAS:");

                    System.out.println("");
                    System.out.println("La sonda " + name + " tiene como misión " + "\n"
                    +mission + " la nave posee una capacidad de almacenamiento de" + "\n"
                    +capacity + " una potencia " + power + " y velocidad " + "\n"
                    +speed + " su energia la optiene con " + fuelType + "\n"
                    + " tiene como objetivo principal " + target);
                    System.out.println("");
                    System.out.println(task);



                }
                break;

                case 3: {
                    mission = manned.getMission();
                    capacity = manned.getCapacity();
                    power = manned.getPower();
                    speed = manned.getSpeed();
                    name = manned.getName();
                    fuelType = manned.getFuelType();
                    crewCapacity = manned.getCrewCapacity();
                    orbitalCapacity = manned.getOrbitalCapacity();
                    weight = manned.getWeight();

                    System.out.println("propósito consiste en mandar seres humanos al espacio para tareas" +"\n"
                            + " de reparación, mantenimiento o investigación la " + name + "\n"
                            + " es el único que permanece activo, con el propósito " + mission + "\n"
                            + " una tripulación de " + crewCapacity + " personas " + "\n"
                            + " y una capacidad de carga de " + capacity + " en orbita " + "\n"
                            + orbitalCapacity + " su fuente de energia " + fuelType);
                    System.out.println("");

                    task = manned.makeTask(" Experimentación y estudio del comportamiento " + "\n"
                            + "humano en condiciones ingrávidas y en el exterior de la cápsula");
                    System.out.println(task);
                    System.out.println("");
                    manned.orbiting();

                }
                break;

            }
            /**
             * Si el usuario ingresa la opcion 4 el sistema finalizara
             */

        } while (opcion != 4);

    }

}
