package InvoiceMaster;
import java.util.ArrayList;
import java.util.Date;

public class FakturaTest {
    ArrayList<Fakturalinjer> fakturaList = new ArrayList<>();
    public static void main(String[] args) {
        new FakturaTest().run();

    }

    private void run() {
        fakturaList.add(new Fakturalinjer("Bananer", 10, 10, 10, "stk"));
        System.out.println(fakturaList);
        FakturaModtager fakturaModtager = new FakturaModtager("bøgevej 34", 2300, "kbh s " , "Denmark");
        FakturaUdsteder fakturaUdsteder = new FakturaUdsteder("Country bois", "countrybois@gmail.com", "Country Road 69",
                304681, 3333, 5555, 2311, "Bank for Country People", 8075, 000012345,"Jack Daniels" );
        faktura Faktura = new faktura(1, fakturaModtager, fakturaUdsteder);
      //Faktura.setItemName("Bananer");
      Faktura.setDate("17/17/17");
      Faktura.setMomsAmount(500);
      Faktura.setPaymentDue("18/18/18");  // der findes over 12. måneder. We are not the same
      //Faktura.setQuantity(10);
      //Faktura.setTotalUnitPrice(500);
      Faktura.setTotalPrice(Faktura.calcTotalPrice(500));
      //Faktura.setUnitPrice(50);
      Faktura.setPriceUMoms(500);
      //Faktura.setUnits("gram");


      System.out.println(Faktura);

    }




}
