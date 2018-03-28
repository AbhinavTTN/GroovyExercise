package q4


import groovy.transform.ToString

//GString... override the toString() of the Person class to return something like...
//"Sachin is a man aged 24 who lives at Delhi. He works for Intelligrape with employee id 12 and draws $$$$$$$ lots of money !!!!."


class Employee extends Person {
    int empId;
    String company;
    int salary;


    @Override
    public String toString() {
        return  ""+ name +
                " is a man aged " + age +
                " who lives at " + address +
                ". He works for " + company +
                " with employee id " + empId  +
                " and draws " + salary +
                " lots of money !!!!."
    }
}


        Employee employee = new Employee(name: "Sachin",age: 25, gender: 'M', address: "Delhi",
                empId: 12, company: "Intelligrape" , salary: 15100 )
        println(employee)
