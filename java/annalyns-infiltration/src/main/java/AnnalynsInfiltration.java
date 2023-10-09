class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake; // a fast attack can be made if the knight is sleeping
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // the group can be spied upon if at least one of them is awake
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake; // archers are trained in bird signaling, so they could intercept the message.
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent && !archerIsAwake) {
            return true; // If dog is present she can rescue the prisoner if the archer is asleep.
        }

        // If not, she can only free the prisoner if the prisoner is awake and the knight and archer are both sleeping
        return prisonerIsAwake && !knightIsAwake && !archerIsAwake;
    }
}
