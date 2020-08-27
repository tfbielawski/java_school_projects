package gov.nasa.personnel;
public class Astronaut
{
    private String astronautName;
    private double astronautHeight; //in cm
    private double astronautWeight; //in kilos

    //default constructor, default values
    public Astronaut()
    {
        astronautName = "";
        astronautHeight = 0;
        astronautWeight = 0;
    }

    //Overloaded constructor
    public Astronaut(String astronautName, double astronautHeight, double astronautWeight)
    {
        this.astronautName = astronautName;
        this.astronautHeight = astronautHeight;
        this.astronautWeight = astronautWeight;
    }

}