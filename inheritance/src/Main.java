public class Main {

    public static void main(String[] args) {

        IndividualCustomer taner = new IndividualCustomer();


        CorporateCustomer hepsiBurada= new CorporateCustomer();
        hepsiBurada.companyName = "Hepsi Burada";


        Customer customer1 = new Customer();
        customer1.getId(1);
        customer1.getName("taner");
        customer1.getSurname("Öztürk");
        customer1.getNationalIdentity("1000000");
        customer1.getCustomerNumber("1323");

    }
}
