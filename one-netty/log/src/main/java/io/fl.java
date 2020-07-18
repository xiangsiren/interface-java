package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class fl {


    public static void main(String[] args) {

        FileOutputStream fileOutputStream = null ;

        FileInputStream fileInputStream = null ;

        String filesname[] = {"星月神话.mp3","我只在乎你.mp3"};

        byte by[] = new byte[1024 * 8] ;

        try {

            fileOutputStream = new FileOutputStream("merge.mp3");

            for (int i= 0 ;i< 2; i++){

                int count = 0 ;

                fileInputStream = new FileInputStream(filesname[i]);

                fileInputStream.skip(1024 * 1024 * 3);

                while (fileInputStream.read(by) != -1){

                    fileOutputStream.write(by);

                    count++ ;
                    System.out.println(count);


                }
            }

        }catch (IOException e){
              e.printStackTrace();

        }finally {

            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
