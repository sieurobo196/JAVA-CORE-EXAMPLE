package com.codewr.javacore.intefacevsabstractclass;

/**
 *
 * @author codewr
 */
public class AbstactStudentC extends AbstactStudentB {

    public AbstactStudentC() {
    }

    @Override
    public int getAge(int age) {
        return 12;
    }

    @Override
    public String getNameClass(String name) {
        System.out.println("Class C is 12A");
        return "12A";
    }

}
