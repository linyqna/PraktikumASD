package Object.Jobsheet02;

public class LecturerMain09 {
    public static void main(String[] args) {
        Lecturer09 dsn1 = new Lecturer09();
        dsn1.name = "Parjo Paijo";
        dsn1.idLecturer = "23423453";
        dsn1.activeStatus = true;
        dsn1.yearOfEntry = 2014;
        dsn1.expertiseCompetency = "Math";

        dsn1.showInformation();
        dsn1.setStatusActive(false);
        dsn1.showInformation();
        dsn1.calculateTimeWork(2026);
        
        Lecturer09 dsn2 = new Lecturer09("Payul Paul", "76868778", false, 1998, "English");
        dsn2.showInformation();
        dsn2.calculateTimeWork(2026);

    }
}
