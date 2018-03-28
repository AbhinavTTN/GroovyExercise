package q2

import com.sun.org.apache.xalan.internal.xsltc.runtime.Operators


//Extend the Person class in Groovy Add following fields to it: empId, company,salary
//Access the fields in all known ways: like through getter , by dot operator, by @ operator.


class Employee extends Person {
    int empId
    String company
    int salary
}



        Employee employee = new Employee(name: "Neelesh",age: 21, gender: 'M', address: "Noida-126",
                empId: 1, company: "TTN" , salary: 15100 )
        //println(${employee.@empId})
        printf "${employee.@empId}\n"
        print(employee.name+"\n")
        print(employee.getSalary())

