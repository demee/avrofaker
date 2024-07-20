package org.demee.avrofaker.avrowriter;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.demee.avrofaker.model.User;

public class UserWriter {
    public void writeUsers(List<User> users, String filename) {
        try {
            DatumWriter<User> userDatumWriter = new SpecificDatumWriter<>(User.class);
            try (DataFileWriter<User> dataFileWriter = new DataFileWriter<>(userDatumWriter)) {
                dataFileWriter.create(users.get(0).getSchema(), new File(filename));
                for (User user : users) {
                    dataFileWriter.append(user);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
