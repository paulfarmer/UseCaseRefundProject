public class FindWarrantyTester {

    public static void main(String[] args) {

        WarrantyInventory inventory = new WarrantyInventory();
        initializeInventory(inventory);

        Warranty warrantiesFound = new Warranty(123, "S300", 5421213, "Yes", "seamus", "marion park", 1, 12-5-2016, WarrantyEnum.sixMonths);

        Warranty warranty = inventory.search(warrantiesFound);
        if (warranty != null) {
            System.out.println(", Warranty Search " +
                    warranty.getWarrantyOrderID() + " " + warranty.getWarrantyOrderID() +  " " +
                    warranty.getModelNumber() + " Phone:\n   " +
                    warranty.getWarrantyValidity() + " Warranty Validity,\n   " +
                    warranty.getCustomerID() + " CustomerID: " +
                    warranty.getCustomerName() + " " + warranty.getCustomerName() + " " +
                    warranty.getDate() + warranty.getWarrantyEnum());
        } else {
            System.out.println(".");
        }
    }

    private static void initializeInventory(WarrantyInventory inventory) {
        inventory.addWarranty(234, "S400", 5178856, "valid", "paulie" ,"glenflesk", 2, 12-6-16);
        inventory.addWarranty(234, "S500", 517856, "invalid", "mary" ,"shanakill", 3, 12-6-16);
        inventory.addWarranty(345, "S100", 51786, "invalid", "brendan" ,"boston", 4, 12-6-16);
        inventory.addWarranty(456, "S200", 517885, "valid", "del" ,"london", 5, 12-6-16);
        inventory.addWarranty(567, "S700", 511378856, "invalid", "corey" ,"ardfert", 6, 12-6-16);
        inventory.addWarranty(678, "S800", 517158856, "valid", "ronaldo" ,"lisbon", 7, 12-6-16);
    }
}