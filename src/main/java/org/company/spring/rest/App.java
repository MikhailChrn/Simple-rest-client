package org.company.spring.rest;

import org.company.spring.rest.configuration.MyConfig;
import org.company.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

/*        Employee empById = communication.getEmployee(11);
        System.out.println(empById);*/

/*        Employee emp = new Employee("Sveta", "Sokolova", "HR", 700);
        emp.setId(14);
        communication.saveEmployee(emp)*/;

/*        communication.deleteEmployee(14);*/
    }
}
