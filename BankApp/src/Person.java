public class Person {

    private String name;
    private String lastName;
    private String address;
    private String phone;
    private String city;

    public Person() {}

    public Person(String name, String lastName,  String address, String phone, String city) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.city = city;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void Info(){
        System.out.println("Name: " + this.name);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Address: " + this.address);
        System.out.println("Phone: " + this.phone);
        System.out.println("City: " + this.city);
    }

}
