// each warranty in the inventory is represented by an instance of this class

public class Warranty {

    private String description, warrantyValidity, customerName, customerAddress, ;
    private int warrantyOrderID, modelNumber, customerID, date;

    public Warranty(int warrantyOrderID, String description, int modelNumber, String warrantyValidity, String customerName, String customerAddress, int customedID, int date){

        this.warrantyOrderID = warrantyOrderID;
        this.description = description;
        this.modelNumber = modelNumber;
        this.warrantyValidity = warrantyValidity;
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.date = date;
    }

    public int getWarrantyOrderID() {
        return warrantyOrderID;
    }

    public String getDescription(){
        return description;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public String getWarrantyValidity() {
        return warrantyValidity;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerAddress(){
        return customerAddress;
    }

    public int getDate() {
        return date;
    }
}
