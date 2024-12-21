package org.demee.avrofaker;

import org.demee.avrofaker.avrowriter.UserWriter;
import org.demee.avrofaker.fakers.UserFaker;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserFaker userFaker = new UserFaker();
        UserWriter userWriter = new UserWriter();

        userWriter.writeUsers(userFaker.fakeUsers(10000000), "users.avro");

        File file = new File("users.avro");
        System.out.println("File size: " + file.length());
        System.out.println("File path: " + file.getAbsolutePath());
    }
}
