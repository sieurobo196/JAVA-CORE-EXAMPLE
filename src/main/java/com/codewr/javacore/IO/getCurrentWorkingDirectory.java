package com.codewr.javacore.IO;

/**
 *
 * @author codewr
 */
public class getCurrentWorkingDirectory {

    public static void main(String[] args) {
        String workingDir = System.getProperty("user.dir");
        System.out.println("Current working directory : " + workingDir);
    }
}
