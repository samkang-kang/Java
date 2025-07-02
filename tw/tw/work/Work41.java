package tw.work;

import java.io.File;
import java.io.IOException;

public class Work41 {

    public static void main(String[] args) {
        File f1 = new File("d:/sam/sam1/file1");
        if (!f1.exists()) {
            try {
                if (f1.createNewFile()) {
                    System.out.println("OK");
                } else {
                    System.out.println("XX");
                }
                System.out.println("OK2");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }  // 補上這一個大括號
}
