package astronaut;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Astronaut {
   private String name;
   private double heightCm; // height in centimeters
   private double weightKg; // weight in kilograms
   private LocalDateTime timeOfTravel;
   private Period stay;
   private LocalDate estDeparture;

   // overload, create an astronaut with specified name, height, weight,
   // timeOfTravel, stay and estDeparture
   public Astronaut(String name, double heightCm, double weightKg, LocalDateTime timeOfTravel, Period stay,
           LocalDate estDeparture) {
       this.name = name;
       this.heightCm = heightCm;
       this.weightKg = weightKg;
       this.timeOfTravel = timeOfTravel;
       this.stay = stay;
       this.estDeparture = estDeparture;
   }

   @Override
   public String toString() {
       return "name: " + name + "height: " + heightCm + " (cm)\n" + "weight: " + weightKg + " (kg)\n" + "arrival: "
               + timeOfTravel + "\n" + "stay length: " + (stay.getDays()) + " days\n" + "est.return: " + estDeparture;
   }

}