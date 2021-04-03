package Practice;

public class Person {

	private String name;
    private String age;
    private String sex;
    private String phoneNumber;
    private String address;
    private String job;
    
    public Person(String name, String age, String sex, String phoneNumber, String address, String job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }
 
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", phoneNumber=" + phoneNumber + ", address=" + address + ", job=" + job + "]";
    }

	
}
