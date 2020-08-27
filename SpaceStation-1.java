package gov.nasa.spacevehicle;

import gov.nasa.personnel.Astronaut;

public class SpaceStation
{
    private String spaceStationName;
    private double spaceStationWeight;
    private double orbitalAltitude;
    private Astronaut[] maxAstronautsArray = new Astronaut[10]; //
    private int currentAstronautsCount;

    //default constructor with default values
    public SpaceStation()
    {
        spaceStationName = "";
        spaceStationWeight = 0;
        orbitalAltitude = 0;
        currentAstronautsCount = 0;
    }
    //overloaded constructor
    public SpaceStation(String spaceStationName, double spaceStationWeight)
    {
        this.spaceStationName = spaceStationName;
        this.spaceStationWeight = spaceStationWeight;
        this.orbitalAltitude = 0.0;
        this.currentAstronautsCount = 0;
    }

    //Method for pushing astronaut details, accepting name + height + weight
    public void addAstroDetails(String astronautName, double astronautHeight, double astronautWeight)
    {
        Astronaut astro = new Astronaut(astronautName, astronautHeight, astronautWeight);
        maxAstronautsArray[currentAstronautsCount++] = astro;
        spaceStationWeight += astronautWeight;
    }

    //Method to obtain the space stations orbital altitude
    public void setOrbitalAltitude(double orbitalAltitude)
    {
        this.orbitalAltitude = orbitalAltitude;
    }

    //Method to return concatenated space station values
    //Station name, station weight, altitude, number of occupants
    public String toString()
    {
        return "Spacestation:" + spaceStationName + "\n" + "Weight (kg):" + spaceStationWeight + "\n" + "Altitude(km):" + orbitalAltitude +
                "\n" + "Astronauts: " + currentAstronautsCount + "\n";
    }

    //Main method
    public static void main(String []args)
    {
        //New SpaceStation object called orbiter
        SpaceStation orbiter = new SpaceStation("ISS", 419700.0);
        //Printing the current state before adding an astronaut
        System.out.println(orbiter);
        //Adding Buzz Aldrin
        orbiter.addAstroDetails("BuzzAldrin", 180.00, 90.50);
        //Adding Alan Sheperd
        orbiter.addAstroDetails("AlanSheperd", 200.00, 95.55);
        //Adding Neil Armstrong
        orbiter.addAstroDetails("NeilArmstrong", 197.99, 88.25);
        //Setting the altitude
        orbiter.setOrbitalAltitude(495.0);
        //Printing ISS Orbiter state
        System.out.println(orbiter);

    }
}