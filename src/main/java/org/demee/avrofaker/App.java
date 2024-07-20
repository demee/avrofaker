package org.demee.avrofaker;

import org.demee.avrofaker.avrowriter.UserWriter;
import org.demee.avrofaker.fakers.UserFaker;

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

        userWriter.writeUsers(userFaker.fakeUsers(100000), "users.avro");
    }
}
