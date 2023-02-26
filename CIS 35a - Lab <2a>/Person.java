// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  2a
// Due Date:           02.06.2023
// Date Submitted:     02.06.2023
// __________________________________

public class Person {
    // PROPERTIES
    private String name;
    private String address;
    private int    age;
    private int    phoneNum;

    // CONSTRUCTORS
    public Person() {
        this.name = "";
        this.address = "";
        this.age = 0;
        this.phoneNum = 0;
    }
    public Person(String _name, String _address, 
        int _age, int _phoneNum) {
        this.name = _name;
        this.address = _address;
        this.age = _age;
        this.phoneNum = _phoneNum;
    }

    // METHODS
        // GETTERS
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public int getAge() {
        return this.age;
    }
    public int getPhoneNum() {
        return this.phoneNum;
    }
        // SETTERS
    public void setName(String _name) {
        this.name = _name;
    }
    public void setAddress(String _address) {
        this.address = _address;
    }
    public void setAge(int _age) {
        this.age = _age;
    }
    public void setPhoneNum(int _phoneNum) {
        this.phoneNum = _phoneNum;
    }
        // INSTANCE
    public void print() {
        System.out.printf("%s, %s, %d, %d", name, address, age, phoneNum);
    }
}