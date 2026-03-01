package ArrayOfObject.Jobsheet03;

public class LecturerData09 {
    void dataAllLecturer(Lecturer09[] arrayOfLecturer) {
        System.out.println("==All Lecturer Data==");
        System.out.println("---------------------");
        for (Lecturer09 array : arrayOfLecturer) {
            array.printInfo();
        }
    }

    void numberOfLecturerPerGender(Lecturer09[] arrayOfLecturer) {
        int male = 0;
        int female = 0;

        for (Lecturer09 array : arrayOfLecturer) {
            if (array.gender == true) {
                male++;
            } else {
                female++;
            }
        }

        System.out.println("==Total Lecturer Per Gender==");
        System.out.println("Male    : " + male);
        System.out.println("Female  : " + female);
        System.out.println("---------------------");
    }

    void averageAgeOfLecturersPerGender (Lecturer09[] arrayOfLecturer) {
        int male = 0;
        int female = 0;
        int maleage = 0;
        int femaleage = 0;

        for (Lecturer09 array : arrayOfLecturer) {
            if (array.gender == true) {
                male++;
                maleage += array.age;
            } else {
                female++;
                femaleage += array.age;
            }
        }
        
        double avgMale = 0;
        double avgFemale = 0;

        if (male != 0) {
            avgMale = (double) maleage / male;
        }

        if (female != 0) {
            avgFemale = (double) femaleage / female;
        }

        System.out.println("==Average Age Per Gender==");
        System.out.println("Average Male Age    : " + avgMale);
        System.out.println("Average Female Age  : " + avgFemale);
        System.out.println("---------------------");
    }

    void theOldestLecturerInfo(Lecturer09[] arrayOfLecturer) {
        Lecturer09 oldest = arrayOfLecturer[0];
        for (Lecturer09 array : arrayOfLecturer) {
            if (array.age > oldest.age) {
                oldest = array;
            }
        }

        System.out.println("==The Oldest Lecturer==");
        oldest.printInfo();
    }

    void theYoungestLecturerInfo(Lecturer09[] arrayOfLecturer) {
        Lecturer09 youngest = arrayOfLecturer[0];
        for (Lecturer09 array : arrayOfLecturer) {
            if (array.age < youngest.age) {
                youngest = array;
            }
        }

        System.out.println("==The Youngest Lecturer==");
        youngest.printInfo();
    }
}
