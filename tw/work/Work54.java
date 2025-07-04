package tw.work;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Work54 {

    public static void main(String[] args) {
        try (FileReader reader  = new FileReader("dir/ns1hosp.csv");
            FileInputStream fin = new FileInputStream("dir1/ns1hosp.csv");
            InputStreamReader isr = new InputStreamReader(fin);
            BufferedReader br = new BufferedReader(isr)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                if (row.length > 2) {
                    System.out.printf("%s:%s\n",row[2],row[7]);
                }
            }
        } catch (Exception e) { 
            System.out.println(e);
        }
    }
}
