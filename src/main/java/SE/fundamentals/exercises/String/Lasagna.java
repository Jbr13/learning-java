package SE.fundamentals.exercises.String;

public class Lasagna {

    // Java is a statically-typed language, which means that the type of variable is known at compile-time. Assigning
    // a value to a name is referred to as defining a variable. A variable is defined by explicitly specifying its type.

    // int explicitVar = 10;

    // Update a variable's value is done through the "=" operator, here, the "=" sign does not represent mathematical
    // equality, but simply assigns a new value to a variable. Once defined, a variable's type can never change.

    // Java is an object-oriented language which means that every function must be defined in a class. A function within
    // a class is referred to as method. Each method can have zero or more parameters, and all must be explicit typed,there
    // is no type inference for parameters. Similarly, the return type must also be made explicit using the return key word.

    // To allow a method to be called by other classes, the public access modifier must be added.

    // Invoking/calling a method is done by specifying its class and method name and passing arguments for each of the
    // method's parameters.

    // The scope in java is defined between the { and } (curly brackets) characters.

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        lasagna.expectedMinutesInOven();
        lasagna.remainingMinutesInOven(30);
        lasagna.preparationTimeInMinutes(2);
        lasagna.totalTimeInMinutes(3, 20);
    }

    public int expectedMinutesInOven() {
        int expectedMinutesInOven = 40;
        return expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return expectedMinutesInOven() - minutesInOven;
    }

    public int preparationTimeInMinutes(int layers) {
        int minutesSpentToPrepareOneLayer = 2;
        return layers * minutesSpentToPrepareOneLayer;
    }

    public int totalTimeInMinutes(int layers, int minutesThatTheLasagnaHasBeenInTheOven) {
        return preparationTimeInMinutes(layers) + minutesThatTheLasagnaHasBeenInTheOven;
    }

    public int getExpectedMinutesInOven() {
        return expectedMinutesInOven();
    }

}
