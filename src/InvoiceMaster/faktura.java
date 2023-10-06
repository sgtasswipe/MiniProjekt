package InvoiceMaster;

import java.util.ArrayList;

public class faktura {
    private double totalPrice;

    private String date;
    private int invoiceNumber;
    private String paymentDue;
    private double priceUMoms;
    private double momsAmount;


    private FakturaUdsteder fakturaUdsteder;
    private FakturaModtager fakturaModtager;

    private  ArrayList<Fakturalinjer> fakturalinjer = new ArrayList<>();



    public faktura(int invoiceNumber, FakturaModtager fakturaModtager, FakturaUdsteder fakturaUdsteder) {
        this.invoiceNumber = invoiceNumber;
        this.fakturaModtager = fakturaModtager;
        this.fakturaUdsteder = fakturaUdsteder;

    }


    public faktura(int totalPrice, String itemName, int quantity) {

        setTotalPrice(totalPrice);

        setDate(date);
        setInvoiceNumber(invoiceNumber);
        setPaymentDue(paymentDue);
        setPriceUMoms(priceUMoms);
        setMomsAmount(momsAmount);

    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;

    }

    public void setPaymentDue(String paymentDue) {
        this.paymentDue = paymentDue;
    }

    public void setPriceUMoms(double priceUMoms) {
        this.priceUMoms = priceUMoms;
    }

    public void setMomsAmount(double momsAmount) {
        this.momsAmount = momsAmount;
    }

    public double calcTotalPrice(double totalunitPrice) {
        return (priceUMoms * 1.25);
    }

    public double calcPriceUMoms(double totalPrice) {
        return (totalPrice * 0.8);
    }


    @Override
    public String toString() {
        return "faktura{"
                 +
                ",\n date='" + date + '\'' +
                ",\n invoiceNumber=" + invoiceNumber +
                ",\n paymentDue='" + paymentDue + '\'' +
                ",\n priceUMoms=" + priceUMoms +
                ",\n momsAmount=" + momsAmount +
                ",\n totalPrice=" + totalPrice +
                ",\n fakturaUdsteder=" + fakturaUdsteder +
                ",\n fakturaModtager=" + fakturaModtager +

                '}';
    }
}
