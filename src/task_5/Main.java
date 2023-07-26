package task_5;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(12345, "Ukraine", "Kiev", "Street", 1, 0);
        System.out.println(address.getIndex());
        System.out.println(address.getCountry());
        System.out.println(address.getCity());
        System.out.println(address.getStreet());
        System.out.println(address.getHouse());
        System.out.println(address.getApartment());
    }
}
