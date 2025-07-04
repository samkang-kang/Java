package tw.work;

public class Work21 {
    public static void main(String[] args) {
        // Work211 obj1 = new Work211(0);
        // Work211 obj2 = new Work212();
        Work211 obj3 = new Work213();         // 無參數建構式
        Work211 obj31 = new Work213(1);       // int 參數建構式
        Work211 obj32 = new Work213(1.0);     // double 參數建構式
    }
}

// JAVA 裡面所有類別一定有建構式
// 若無定義 使用父類別無傳參數

// Work211 定義
class Work211 extends Object {
    Work211(int a) {
        System.out.println("Work211(int)");
    }
}

// 建構式 => 將祖宗十八代完成初始化

// Work212 繼承 Work211
class Work212 extends Work211 {
    Work212() {
        super(1); // 呼叫 Work211(int)
        System.out.println("Work212()");
    }
}

// Work213 繼承 Work212
class Work213 extends Work212 {
    Work213() {
        super(); // 呼叫 Work212()
        System.out.println("Work213()");
    }

    Work213(int a) {
        this(); // 呼叫無參數建構式
        System.out.println("Work213(int)");
    }

    Work213(double a) {
        this(2); // 呼叫 int 建構式
        System.out.println("Work213(double)");
    }
}


