package InvoiceMaster;

public class FakturaUdsteder {
    private String companyName;
    private String email;
    private String adress;
    private int zipcode;
    private int cvr;
    private int momsNr;
    private  int eu_momsNr;
    private String bankName;
    private int regNr;
    private int accountNumber;
    private String accountHolder;


    public FakturaUdsteder (String companyName, String email, String adress, int zipcode, int cvr, int momsNr, int  eu_momsNr,String bankName, int regNr, int accountNumber, String accountHolder) {
        this.cvr = cvr;
        this.accountHolder = accountHolder;
        this.companyName = companyName;
        this.zipcode = zipcode;
        this.adress = adress;
        this.email= email;
        this.momsNr= momsNr;
        this.eu_momsNr = eu_momsNr;
        this.bankName = bankName;
        this.regNr = regNr;
        this.accountNumber = accountNumber;


    }

    @Override
    public String toString() {
        return "FakturaUdsteder{" +
                "companyName='" + companyName + '\'' +
                ",\n email='" + email + '\'' +
                ",\n adress='" + adress + '\'' +
                ",\n zipcode=" + zipcode +
                ",\n cvr=" + cvr +
                ",\n momsNr=" + momsNr +
                ",\n eu_momsNr=" + eu_momsNr +
                ",\n bankName='" + bankName + '\'' +
                ",\n regNr=" + regNr +
                ",\n accountNumber=" + accountNumber +
                ",\n accountHolder='" + accountHolder + '\'' +
                '}';
    }
}
