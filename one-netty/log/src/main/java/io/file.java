package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class file {

    public static void main(String[] args) throws IOException {

        File f = new File("a.txt");

        FileOutputStream fop = new FileOutputStream(f);

        OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");

        writer.append("中文输入：");

        writer.append("\r\n");

        writer.append("enligsh");

        writer.close();

        fop.close();


    }
}
