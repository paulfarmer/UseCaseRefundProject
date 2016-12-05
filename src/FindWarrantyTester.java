public class FindWarrantyTester {

    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        WarrantyInventory inventory = new WarrantyInventory();
        initializeInventory(warrantyinventory);

        Warranty warrantiesFound = new Warranty(123, fdgskfkskfsda, 5421213, "Yes", 45155, "seamus", "1 New Street", 12-5-2016);

        Warranty warranty = inventory.search(warrantiesFound);
        if (warranty != null) {
            System.out.println("Erin, you might like this " +
                    warranty.getWarrantyOrderID() + " " + warranty.getDescription() +  " " +
                    warranty.getModelNumber() + " guitar:\n   " +
                    warranty.getWarrantyValidity() + " back and sides,\n   " +
                    warranty.getCustomerID() + " top.\nYou can have it for only $" +
                    warranty.getCustomerName() + "!" + warranty.getCustomerAddress() + " " +
                    warranty.getDate());
        } else {
            System.out.println(".");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar(234, thearjhj, 5178856, "Yes", 1518785555 ,"paulie",
                "Rosewood Manor", 12-6-16);
        inventory.addGuitar(234, theayyhdrjhj, 517856, "Yes", 251878555 ,"mary",
                "Denny Street", 12-6-16);
        inventory.addGuitar(345, thearjhvaj, 51786, "Yes", 351878555 ,"brendan",
                "Marion Park", 12-6-16);
        inventory.addGuitar(456, thearjhjmk, 517885, "Yes", 451878555 ,"del",
                "Shanakill", 12-6-16);
        inventory.addGuitar(567, thearjhjthy, 511378856, "Yes", 551878555 ,"corey",
                "Glenflesk", 12-6-16);
        inventory.addGuitar(678, thearjhjewtrt, 517158856, "Yes", 651878555 ,"ronaldo",
                "Caherslee", 12-6-16);
    }
}