package com.fileio;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {

        // WRITE TO A FILE

        String[] names = {"John", "Carl", "Jerry"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\gavin\\Documents\\output.txt"));
//            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nWriting another line to a file.");

            for (String name: names) {
                writer.write("\n" + name);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // READ FROM A FILE

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
//            System.out.println(reader.readLine());

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
