package CaseMethod.FinalExam;

public class Tax09 {
    static int autoIncrementCode = 1;
    int code;
    long nominal;
    long fine;
    int monthPay;
    Vehicle09 vehicle;

    public Tax09(Vehicle09 vehicle, int monthPay) {
        this.code = autoIncrementCode++;
        this.vehicle = vehicle;
        this.monthPay = monthPay;
        calculateTax();
    }

    public void calculateTax() {
        if (vehicle.type.equalsIgnoreCase("2 wheels")) {
            if (vehicle.cc < 100) 
                nominal = 100000;
            else if (vehicle.cc <= 250) 
                nominal = 250000;
            else 
                nominal = 500000;
        } else if (vehicle.type.equalsIgnoreCase("4 wheels")) {
            if (vehicle.cc < 1000) {
                nominal = 750000;
            } else if (vehicle.cc <= 2500) {
                nominal = 1000000;
            } else 
                nominal = 1500000;
        }

        int delay = monthPay - vehicle.monthMustPay;
        if (delay > 0) {
            if (delay <= 3) {
                fine = 50000;
            } else {
                fine = delay * 50000;
            }
        } else {
            fine = 0;
        }
    }
    
    public long getTotal() {
        return nominal + fine;
    }
}
