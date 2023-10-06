package InvoiceMaster;

public class FakturaModtager {
    private String adress;
    private int zipcode;
    private  String city;
    private  String country;

    public FakturaModtager (String adress, int zipcode, String city, String country) {
        this.adress = adress;
        this.zipcode = zipcode;
        this.city = city;
        this.country= country;
    }

    @Override
    public String toString() {
        return "FakturaModtager{" +
                "adress='" + adress + '\'' +
                ",\n zipcode=" + zipcode +
                ",\n city='" + city + '\'' +
                ",\n country='" + country + '\'' +
                '}';
    }
}
