package com.codewr.javacore.intefacevsabstractclass;

/**
 *
 * @author codewr
 */
public class AbstactStudentA extends AbstactInfoStudent {

    @Override
    public void getName() {
        System.out.println("Name is Anna");
    }

    @Override
    public int getAge(int age) {
        return age;
    }

    @Override
    public String getNameClass(String name) {
        return name;
    }
}
