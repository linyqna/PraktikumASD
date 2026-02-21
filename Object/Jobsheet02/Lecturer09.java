package Object.Jobsheet02;

public class Lecturer09 {
    String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    public Lecturer09() {}
    public Lecturer09(String nm, String id, boolean activeStatus, int entry, String focus) {
        name = nm;
        idLecturer = id;
        this.activeStatus = activeStatus;
        yearOfEntry = entry;
        expertiseCompetency = focus;
    }

    void showInformation() {
        System.out.println("===Lecturer Information===");
        System.out.println("Name            : " + name);
        System.out.println("ID              : " + idLecturer);
        
        if (activeStatus == true) {
            System.out.println("Status          : Active");
        } else {
            System.out.println("Status          : Inactive");
        }

        System.out.println("Year of Entry   : " + yearOfEntry);
        System.out.println("Academic Focus  : " + expertiseCompetency);
    }

    void setStatusActive(boolean status) {
        activeStatus = status;
        if (status == true) {
            System.out.println(name + " status is ACTIVE.");
        } else {
            System.out.println(name + " status is INACTIVE.");
        }
    }

    void calculateTimeWork(int yearNow) {
        int timeWork = yearNow - yearOfEntry;
        System.out.println(name + " has been working for " + timeWork + " year.");
    }

    void changeSkill(String skill) {
        expertiseCompetency = skill;
    }
}
