package InvoiceMaster;

public class Fakturalinjer {
    private String itemName;
    private double totalUnitPrice;
    private double unitPrice;
    private int quantity;
    private String units;


    public Fakturalinjer(String bananer, int i, int i1, int i2, String stk) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.units = units;
        this.unitPrice = unitPrice;
        this.totalUnitPrice = totalUnitPrice;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void setTotalUnitPrice(double totalUnitPrice) {
        this.totalUnitPrice = totalUnitPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getAmount () {
      double amount  =  unitPrice*quantity;
      return amount;
    }
}
