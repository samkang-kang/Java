package tw.work;

import tw.sam.api.TWid;

public class Work25 {
    public static void main(String[] args) {
        System.out.println(TWid.isRightID("G122187969"));
        System.out.println("----------------");

        TWid id1 = new TWid();
        TWid id2 = new TWid(false);
        TWid id3 = new TWid('B');
        TWid id4 = new TWid(true, 'A');

        System.out.println(id1.getId());  // ✅ 修正為 getId()
        System.out.println(id2.getId());
        System.out.println(id3.getId());
        System.out.println(id4.getId());

        
        TWid id5 = TWid.createTWid("G122187969");  // ✅ 呼叫正確方法
        if (id5 != null)                           // ✅ 修正語法
            System.out.println(id5.getId());
    }
}
