import java.sql.Array;

class BirdWatcher {
    private static final int DAY1 = 0;
    private static final int DAY2 = 2;
    private static final int DAY3 = 5;
    private static final int DAY4 = 3;
    private static final int DAY5 = 7;
    private static final int DAY6 = 8;
    private static final int TODAY = 4;
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, TODAY};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1]; // the last element is today's count
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int day : birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birds = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (i < numberOfDays) {
                birds = birds + birdsPerDay[i];
            } else {
                break;
            }
        }
        return birds;
    }

    public int getBusyDays() {
        int count = 0;
        for (int day : birdsPerDay) {
            if (day >= 5) { // A busy day is one where five or more birds have visited your garden
                count++;
            }
        }
        return count;
    }
}
