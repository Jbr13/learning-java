package SE.fundamentals.exercises.Boolean;

public class AnnalynsInfiltration {

    // Boolean in java are represented by the boolean type, which values can be either true or false.
    // Java supports three boolean operators, ! (NOT), && (AND) and || (OR)

    public static void main(String[] args) {

        boolean knightIsAwake = true;
        AnnalynsInfiltration.canFastAttack(knightIsAwake);

        knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);

        archerIsAwake = false;
        prisonerIsAwake = true;
        AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);

        knightIsAwake = true;
        archerIsAwake = true;
        prisonerIsAwake = false;
        boolean petDogIsPresent = true;

        AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);

    }

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean prisonerIsAwake, boolean archerIsAwake) {
        return knightIsAwake || prisonerIsAwake || archerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return prisonerIsAwake && !archerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (prisonerIsAwake || petDogIsPresent) ? (petDogIsPresent && !archerIsAwake) || (!petDogIsPresent && !knightIsAwake && !archerIsAwake) : false;
    }
}
