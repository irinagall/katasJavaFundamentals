package practicekatas_exercism;

class BirdWatcher {


    private final int[] birdsPerDay;


    public BirdWatcher(int[] birdsPerDay) {


        this.birdsPerDay = birdsPerDay.clone();


    }


    public int[] getLastWeek() {


        int[] birdsEachDayOfLastWeek = new int[7];


        for (int i = 0; i < birdsPerDay.length; i++) {


            birdsEachDayOfLastWeek[i] += birdsPerDay[i];


        }


        return birdsEachDayOfLastWeek;


    }


    public int getToday() {


        return birdsPerDay[6];


    }


    public void incrementTodaysCount() {


        birdsPerDay[6] = birdsPerDay[6] + 1;


    }


    public boolean hasDayWithoutBirds() {


        for (int i = 0; i < birdsPerDay.length; i++) {


            if (birdsPerDay[i] == 0) {


                return true;


            }


        }


        return false;


    }


    public int getCountForFirstDays(int numberOfDays) {


        int count = 0;


        if (numberOfDays < birdsPerDay.length - 1) {


            for (int i = 0; i < numberOfDays; i++) {


                count += birdsPerDay[i];


            }


        } else {


            for (int i = 0; i < birdsPerDay.length; i++) {


                count += birdsPerDay[i];


            }


        }


        return count;


    }


    public int getBusyDays() {


        int daysWhenAtLeast5BirdsWereSeenCount = 0;


        for (int i = 0; i < birdsPerDay.length; i++) {


            if (birdsPerDay[i] >= 5) {


                daysWhenAtLeast5BirdsWereSeenCount++;


            }


        }


        return daysWhenAtLeast5BirdsWereSeenCount;


    }


}
