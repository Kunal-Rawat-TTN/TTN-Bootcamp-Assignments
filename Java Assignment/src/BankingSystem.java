abstract class Bank {
    protected String name;
    protected String headOfficeAddress;
    protected String chairmanName;
    protected int branchCount;
    protected double fdInterestRate;
    protected double personalLoanInterestRate;
    protected double homeLoanInterestRate;

    // Constructor
    public Bank(String name, String headOfficeAddress, String chairmanName, int branchCount,
                double fdInterestRate, double personalLoanInterestRate, double homeLoanInterestRate) {
        this.name = name;
        this.headOfficeAddress = headOfficeAddress;
        this.chairmanName = chairmanName;
        this.branchCount = branchCount;
        this.fdInterestRate = fdInterestRate;
        this.personalLoanInterestRate = personalLoanInterestRate;
        this.homeLoanInterestRate = homeLoanInterestRate;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getHeadOfficeAddress() { return headOfficeAddress; }
    public void setHeadOfficeAddress(String headOfficeAddress) { this.headOfficeAddress = headOfficeAddress; }

    public String getChairmanName() { return chairmanName; }
    public void setChairmanName(String chairmanName) { this.chairmanName = chairmanName; }

    public int getBranchCount() { return branchCount; }
    public void setBranchCount(int branchCount) { this.branchCount = branchCount; }

    public double getFdInterestRate() { return fdInterestRate; }
    public void setFdInterestRate(double fdInterestRate) { this.fdInterestRate = fdInterestRate; }

    public double getPersonalLoanInterestRate() { return personalLoanInterestRate; }
    public void setPersonalLoanInterestRate(double personalLoanInterestRate) { this.personalLoanInterestRate = personalLoanInterestRate; }

    public double getHomeLoanInterestRate() { return homeLoanInterestRate; }
    public void setHomeLoanInterestRate(double homeLoanInterestRate) { this.homeLoanInterestRate = homeLoanInterestRate; }

    // Abstract toString method to be implemented by subclasses
    public abstract String toString();
}

// SBI Bank subclass
class SBI extends Bank {
    public SBI() {
        super("State Bank of India", "Delhi, India", "Krishna Sharma", 2201, 6.5, 9.5, 8.5);
    }

    @Override
    public String toString() {
        return "Bank Name: " + name + "\nHead Office: " + headOfficeAddress + "\nChairman: " + chairmanName +
                "\nBranches: " + branchCount + "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}

// BOI Bank subclass
class BOI extends Bank {
    public BOI() {
        super("Bank of India", "Mumbai, India", "Kunal Rawat", 5100, 5.3, 10.0, 9.0);
    }

    @Override
    public String toString() {
        return "Bank Name: " + name + "\nHead Office: " + headOfficeAddress + "\nChairman: " + chairmanName +
                "\nBranches: " + branchCount + "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}

// ICICI Bank subclass
class ICICI extends Bank {
    public ICICI() {
        super("ICICI Bank", "Banglore, India", "Rohit Gupta", 5700, 5.7, 10.5, 9.2);
    }

    @Override
    public String toString() {
        return "Bank Name: " + name + "\nHead Office: " + headOfficeAddress + "\nChairman: " + chairmanName +
                "\nBranches: " + branchCount + "\nFD Interest Rate: " + fdInterestRate + "%" +
                "\nPersonal Loan Interest Rate: " + personalLoanInterestRate + "%" +
                "\nHome Loan Interest Rate: " + homeLoanInterestRate + "%\n";
    }
}

// Main class to test the banking system
public class BankingSystem {
    public static void main(String[] args) {
        // Create instances of each bank
        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();

        // Print details of each bank
        System.out.println(sbi);
        System.out.println(boi);
        System.out.println(icici);
    }
}
