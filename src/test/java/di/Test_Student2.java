/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di;

import org.junit.Test;
import com.mycompany.springbasic1102.newpackage.di.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author student
 */
public class Test_Student2 {
    @Test
    public void test()
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
        Student s1 = (Student)ctx.getBean("s1");
        Student s2 = ctx.getBean("s2",Student.class);
        System.out.println(s1);
        System.out.println(s2);
    }
}
