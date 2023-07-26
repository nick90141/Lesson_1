package task_5;

public class Address {

    private static int index;
    private static String country;
    private static String city;
    private static String street;
    private static int house;
    private static int apartment;

    public Address (int index, String country, String city, String street, int house, int apartment){
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        Address.index = index;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Address.country = country;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        Address.city = city;
    }

    public static String getStreet() {
        return street;
    }

    public static void setStreet(String street) {
        Address.street = street;
    }

    public static int getHouse() {
        return house;
    }

    public static void setHouse(int house) {
        Address.house = house;
    }

    public static int getApartment() {
        return apartment;
    }

    public static void setApartment(int apartment) {
        Address.apartment = apartment;
    }
}
