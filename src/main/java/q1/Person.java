package q1;

//Create a class in Java along with follwing fields. classname: Person fields: name, age, gender,
//        address Access the fields in all known ways: like through getter , by dot operator
public class Person {

    String name;
    int age;
    char gender;
    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class test{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Neelesh");
        person.setAge(21);
        person.setGender('M');
        person.setAddress("Noida-126");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getAddress());

//        person.name="Neelesh";
//        person.age=21;
//        person.gender='M';
//        person.address="Noida-126";
//        System.out.println(person.name);
//        System.out.println(person.age);
//        System.out.println(person.gender);
//        System.out.println(person.address);




    }

}

