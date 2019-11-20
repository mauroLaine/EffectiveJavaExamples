package chap2_creating_and_destroying_obj.item6_eliminate_obsolete_obj;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestObsolteReferences {

    public static void main(String[] args) {

        try {
            final BufferedReader br = new BufferedReader(new FileReader("assets/test_text.txt"));
            while (br.readLine() != null) {
                System.out.println(br.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
