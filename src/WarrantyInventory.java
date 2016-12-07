// this inventory stores a list of all the warranties that are available
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WarrantyInventory {
    private List warranties;

    public WarrantyInventory(){
        warranties = new LinkedList();
    }

    // this method takes in all of a warranties details, creates a warranty object and adds it to the inventory
    public void addWarranty(int warrantyOrderID, String description, int modelNumber, String warrantyValidity, String customerName, String customerAddress, int customedID, int date){

        Warranty warranty = new Warranty(warrantyOrderID, description, modelNumber, warrantyValidity, customerID, customerName, customerAddress, date);

        warranties.add(warranty);
    }

    // this method takes in a warranties number, and returns the warranty details
    public Warranty getWarranty(String modelNumber){
        for(Iterator i = warranties.iterator(); i.hasNext();) {
            Warranty warranty = (Warranty)i.next();
            if(warranty.getModelNumber().equals(modelNumber)) {
                return warranty;
            }
        }
        return null;
    }

    // this search method takes in a clients ideal warranty, and returns a warranty from the inventory that matches up with the search
    public Warranty search(Warranty searchWarranty) {
        for (Iterator i = warranties.iterator(); i.hasNext(); ) {
            Warranty warranty = (Warranty) i.next();

            int warrantyOrderID = searchWarranty.getWarrantyOrderID();
            if ((warrantyOrderID != 0) && (!warrantyOrderID.equals()) &&
                    (!warrantyOrderID.equals(warrantyOrderID.getwarrantyOrderID())))
                continue;

            String description = searchWarranty.getDescription();
            if ((description != null) && (!description.equals("")) &&
                    (!description.equals(description.getDescription())))
                continue;

            int modelNumber = searchWarranty.getModelNumber();
            if ((modelNumber != 0) && (!modelNumber.equals("")) &&
                    (!modelNumber.equals(modelNumber.getModelNumber())))
                continue;

            String warrantyValidity = searchWarranty.getWarrantyValidity();
            if ((warrantyValidity != null) && (!warrantyValidity.equals("")) &&
                    (!warrantyValidity.equals(warrantyValidity.getWarrantyValidity())))
                continue;

            int customerID = searchWarranty.getCustomerID();
            if ((customerID != 0) && (!customerID.equals("")) &&
                    (!customerID.equals(customerID.getCustomerID())))
                continue;

            String customerName = searchWarranty.getCustomerName();
            if ((customerName != null) && (!customerName.equals("")) &&
                    (!customerName.equals(customerName.getCustomerName())))
                continue;

            String customerAddress = searchWarranty.getCustomerAddress();
            if ((customerAddress != null) && (!customerAddress.equals("")) &&
                    (!customerAddress.equals(customerAddress.getAddress())))
                continue;

            int date = searchWarranty.getDate();
            if ((date != 0) && (!date.equals("")) &&
                    (!date.equals(date.getDate())))
                continue;
            return warranty;
        }
        return null;
        }
}

