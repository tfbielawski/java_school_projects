// Pair.java
// Tom Bielawski
// 7/1/2020
// Create a main method for Pair.java, implement a unit test


//First constituent class
class Butter
{
    @Override
    public String toString() {return getClass().getName();}
}

//Second constituent class
class Jam
{
    @Override
    public String toString() {return getClass().getName();}
}

//Third constituent class
class Condiments
{
    @Override
    public String toString() {return getClass().getName();}
}

//Pair class from assignment
public final class Pair
{

    private final Object first, second;

    // construct a Pair object
    public Pair(Object one, Object two) {
        first = one;
        second = two;
    }

    // return the first constituent object
    public Object getFirst() {
        return first;
    }

    // return the second constituent object
    public Object getSecond() {
        return second;
    }

    // return true if the pair of objects are identical
    @Override
    public boolean equals(Object other) {
        boolean result;
        if (this == other)
            result = true;
        else if (!(other instanceof Pair))
            result = false;
        else {
            Pair otherPair = (Pair) other;
            result = first.equals(otherPair.first) && second.equals(otherPair.second);
        }
        return result;
    }

    // return hash code for the aggregate pair
    @Override
    public int hashCode() {
        // XOR hash codes to create a hashcode for the pair
        // if the objects are equal, use one hashcode, otherwise
        // the XOR result (and subsequent hashCode value) is 0.
        return first.equals(second) ? first.hashCode() : first.hashCode() ^ second.hashCode();
    }

    // return textual representation of aggregated object
    @Override
    public String toString()  {
        return "[" + first + ", " + second + "]";
    }

    //Main method in Pair Class
    public static void main(String[] args)
    {
        //Instantiate object from each constituent class
        Condiments yumYumSauce = new Condiments();
        Butter honeyButter = new Butter();
        Jam grapeJam = new Jam();
        Jam appleJam = new Jam();

        //Instantiate pairs
        Pair firstPair = new Pair(grapeJam, honeyButter);
        Pair secondPair = new Pair (honeyButter, yumYumSauce);
        Pair thirdPair = new Pair(yumYumSauce, grapeJam);

        //These pairs are equal to test equal method
        Pair fourthPair = new Pair(appleJam, appleJam);
        Pair fifthPair = new Pair(appleJam, appleJam);


        //Print the toString value and the hashCode values overriden above
        System.out.println("pair 0: " + firstPair.toString());
        System.out.println("pair 0 hashcode: " + firstPair.hashCode());
        System.out.println("pair 1: " + secondPair.toString());
        System.out.println("pair 1 hashcode: " + secondPair.hashCode());
        System.out.println("pair 2: " + thirdPair.toString());
        System.out.println("pair 2 hashcode: " + thirdPair.hashCode());
        System.out.println("pair 3: " + fourthPair.toString());
        System.out.println("pair 3 hashcode: " + fourthPair.hashCode());
        System.out.println("pair 4: " + fifthPair.toString());
        System.out.println("pair 4 hashcode: " + fourthPair.hashCode());

        //Test each pair to see if objects are equal, return true or false.
        System.out.println(firstPair + "equals" + secondPair + "? " + firstPair.equals(secondPair));
        System.out.println(secondPair + "equals" + thirdPair + "? " + secondPair.equals(thirdPair));
        System.out.println(thirdPair + "equals" + firstPair + "? " + thirdPair.equals(firstPair));
        System.out.println(fourthPair + "equals" + fifthPair + "? " + fourthPair.equals(fifthPair));
        

    }
}