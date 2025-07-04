package tw.work;

import java.util.HashMap;
import java.util.Set;

public class Work38 {

    public static void main(String[] args) {
        HashMap<String, Object> person = new HashMap<>();
        person.put("name", "Sam");
        person.put("gender", "Brad");
        person.put("age", 18);
        person.put("weight", 80.3); // 修正錯誤：key 與 value 要分開

        System.out.println(person.size());
        System.out.println(person.get("name"));
        System.out.println("-------------");

        Set<String> keys = person.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + person.get(key) + "\n"); // 修正括號
        }
    }
}
