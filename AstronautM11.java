//AstronautM11.java
//August 7, 2020
//Tom Bielawski
//A class containing the Astronaut's identifier fields

package gov.nasa.personnel;
//Imports added to original
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class AstronautM11
{
    private final String astronautName;
    private final double astronautHeight; //in cm
    private final double astronautWeight; //in kilos

    //New fields added
    private LocalDateTime arrivalOnStation;
    private Period durationOnStation;
    private LocalDate departureFromStation;


    //Overloaded constructor
    //Added new values to the signature and in the body
    public AstronautM11(String astronautName, double astronautHeight, double astronautWeight,
                        LocalDateTime arrivalOnStation, Period durationOnStation, LocalDate departureFromStation)
    {
        this.astronautName = astronautName;
        this.astronautHeight = astronautHeight;
        this.astronautWeight = astronautWeight;
        this.arrivalOnStation = arrivalOnStation;
        this.durationOnStation = durationOnStation;
        this.departureFromStation = departureFromStation;
    }

    //ToString() method updated to reflect added values
    public String toString()
    {
        return "Astronaut name: " + astronautName + "\nAstronaut height in cm: " + astronautHeight + " (cm)" + "\nAstronaut weight in kg: "
                + astronautWeight + " (kg)\n" + "Arrival on Station: " + arrivalOnStation + "\n" + "Duration of stay on station: " +
                durationOnStation.getDays() + " days\n" + "Departure from station in: " + departureFromStation + " days\n" ;
    }

}