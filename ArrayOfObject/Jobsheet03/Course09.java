package ArrayOfObject.Jobsheet03;

public class Course09 {
    public String code;
    public String name;
    public int sks;
    public int numberOfHours;
    
    void addData(String code, String name, int sks, int numberOfHours) {
        this.code = code;
        this.name = name;
        this.sks = sks;
        this.numberOfHours = numberOfHours;
    }

    void printInfo() {
        System.out.println("====Course Data====");
            System.out.println("Code              : " + code);
            System.out.println("Name              : " + name);
            System.out.println("SKS               : " + sks);
            System.out.println("Number of Hours   : " + numberOfHours);
            System.out.println("--------------------------------");
    }
}
