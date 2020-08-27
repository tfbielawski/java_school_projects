package astronaut;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class SpaceStation {
   private String name;
   private double weightKg; // weight in kg
   private double altitudeKm; // altitude In kilometers
   private int numAstronauts;
   List<Astronaut> astronauts = new ArrayList<>();

   public static void main(String[] ergs) {
       // create a space station and display it
       SpaceStation ss = new SpaceStation("ISS", 419700.0);
       System.out.println(ss);
       System.out.println();
       LocalDateTime timeOfTravel = LocalDateTime.now();
       Period p1 = Period.ofDays(30);
       Period p2 = Period.ofDays(60);
       Period p3 = Period.ofDays(90);

       LocalDate estDep1 = LocalDate.now().plusDays(p1.getDays());
       LocalDate estDep2 = LocalDate.now().plusDays(p2.getDays());
       LocalDate estDep3 = LocalDate.now().plusDays(p3.getDays());
       // add some astronauts
       System.out.println("Adding astronauts!");
       System.out.println();
       ss.addAstronaut("amith", 167.64, 61.65, timeOfTravel, p1, estDep1);
       ss.addAstronaut("Jones", 153.27, 74.55, timeOfTravel, p2, estDep2);
       ss.addAstronaut("drown", 176.33, 87.91, timeOfTravel, p3, estDep3);
       // set the altitude
       ss.setAltitude(400.0);
       // show the new state
       System.out.println(ss);
       System.out.println("Astronaut details:");
       ss.astronauts.forEach(a -> System.out.println(a + "\n"));
   }

   // overload, create a space station object with specified name and weight
   public SpaceStation(String name, double weightKg) {
       this.name = name;
       this.weightKg = weightKg;
       this.altitudeKm = 0;
       this.numAstronauts = 0;
   }

   // add an astronaut
   public void addAstronaut(String name, double heightCm, double weightKg, LocalDateTime timeOfTravel, Period stay,
           LocalDate estDeparture) {
       astronauts.add(new Astronaut(name, heightCm, weightKg, timeOfTravel, stay, estDeparture));
       numAstronauts++;
   }

   // set the altitude
   public void setAltitude(double altitudeKm) {
       this.altitudeKm = altitudeKm;
   }

   // Show the space station
   public String toString() {
       return "SpaceStation: " + this.name + "\n" + "Weight (kg): " + this.weightKg + "\n" + "Altitude (km) : "
               + this.altitudeKm + "\nAstronauts: " + this.numAstronauts;
   }
}