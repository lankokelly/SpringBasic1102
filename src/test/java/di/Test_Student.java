/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di;

import com.mycompany.springbasic1102.newpackage.di.Student;

/**
 *
 * @author student
 */
public class Test_Student {
    
    public void test()
    {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("Apple");
        System.out.println(s1);
    }
}
