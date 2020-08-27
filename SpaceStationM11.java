//SpaceStationM11.java
//August 7, 2020
//Tom Bielawski
//A class containing the SpaceStation's identifier fields, and implements the class

package gov.nasa.spacevehicle;

import gov.nasa.personnel.AstronautM11;

//Imports added to original
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


public class SpaceStationM11
{
    private final String spaceStationName;
    private double spaceStationWeight;
    private double orbitalAltitude;

    //Replaced astronaut array with astronautM11List
    private int currentAstronautsCount;
    List<AstronautM11> astronautM11List = new ArrayList<>();


    //default constructor with default values
    public SpaceStationM11()
    {
        spaceStationName = "";
        spaceStationWeight = 0;
        orbitalAltitude = 0;
        currentAstronautsCount = 0;
    }

    //overloaded constructor
    public SpaceStationM11(String spaceStationName, double spaceStationWeight)
    {
        this.spaceStationName = spaceStationName;
        this.spaceStationWeight = spaceStationWeight;
        this.orbitalAltitude = 0.0;
        this.currentAstronautsCount = 0;
    }

    //Method for pushing astronaut details, accepting name + height + weight
    //Added LocalDateTime, Period, and LocalDate
    //Changed from adding to array, to adding to a arraylist
    public void addAstroDetails(String astronautName, double astronautHeight, double astronautWeight,
                                LocalDateTime arrivalOnStation, Period durationOnStation, LocalDate departureFromStation)
    {
        //AstronautM11 astro = new AstronautM11(astronautName, astronautHeight, astronautWeight, arrivalOnStation, durationOnStation, departureFromStation);
        astronautM11List.add(new AstronautM11(astronautName, astronautHeight, astronautWeight, arrivalOnStation, durationOnStation, departureFromStation));
        currentAstronautsCount++;
        spaceStationWeight += astronautWeight;
    }

    //Method to obtain the space stations orbital altitude
    //Unchanged from Module 4
    public void setOrbitalAltitude(double orbitalAltitude)
    {
        this.orbitalAltitude = orbitalAltitude;
    }

    //Method to return concatenated space station values
    //Station name, station weight, altitude, number of occupants
    //Unchanged from Module 4
    public String toString()
    {
        return "Spacestation:" + spaceStationName + "\n" + "Weight (kg):" + spaceStationWeight + "\n" + "Altitude(km):" + orbitalAltitude +
                "\n" + "Astronauts: " + currentAstronautsCount + "\n";
    }

    //Main method
    public static void main(String []args)
    {
        //New SpaceStation object called orbiter
        SpaceStationM11 orbiter = new SpaceStationM11("ISS", 419700.0);
        //Printing the current state before adding an astronaut
        System.out.println(orbiter);

        //Establishing arrival on station
        LocalDateTime arrivalOnStation = LocalDateTime.now();

        //Setting the days on station for each astronaut
        Period daysOnStationAldrin = Period.ofDays(30);
        Period daysOnStationSheperd = Period.ofDays(60);
        Period daysOnStationArmstrong = Period.ofDays(90);

        //Getting the departure date for each astronaut
        LocalDate departureFromStationAldrin = LocalDate.now().plusDays(daysOnStationAldrin.getDays());
        LocalDate departureFromStationSheperd = LocalDate.now().plusDays(daysOnStationSheperd.getDays());
        LocalDate departureFromStationArmstrong = LocalDate.now().plusDays(daysOnStationArmstrong.getDays());

        //Adding astronauts
        //Added arrivalOnStation, daysonStation, and departureFromStation
        orbiter.addAstroDetails("Buzz Aldrin", 180.00, 90.50, arrivalOnStation,
                daysOnStationAldrin, departureFromStationAldrin);

        orbiter.addAstroDetails("Alan Sheperd", 200.00, 95.55, arrivalOnStation,
                daysOnStationSheperd, departureFromStationSheperd);

        orbiter.addAstroDetails("Neil Armstrong", 197.99, 88.25, arrivalOnStation,
                daysOnStationArmstrong, departureFromStationArmstrong);

        //Setting the altitude
        //Unchanged from Module 4
        orbiter.setOrbitalAltitude(495.0);

        System.out.println("Adding astronauts to the ISS! \n");

        //Printing ISS Orbiter state
        //Unchanged from Module 4
        System.out.println(orbiter);

        System.out.println("Astronaut details: ");
        //Loop to iterate through list and print
        for (AstronautM11 i : orbiter.astronautM11List) { System.out.println(i + "\n"); }

    }
}