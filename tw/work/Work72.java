package tw.work;

import java.util.Timer;
import java.util.TimerTask;

public class Work72 {
	public static void main(String[] args) {
		Timer timer = new Timer();                         // 建立定時器
		MyTask task1 = new MyTask();                       // 建立每秒執行任務
		timer.schedule(task1, 0, 1*100);                  // 立即執行，之後每隔1秒執行一次
		timer.schedule(new StopTask(timer), 10*100);     // 10秒後執行一次任務（用來停止 timer）
		System.out.println("Main");                        // 主執行緒先印出 Main


	}
}
class MyTask extends TimerTask {
	private int i;
	@Override
	public void run() {
		System.out.println(i++);
	}
}
class StopTask extends TimerTask {
	private Timer timer;
	public StopTask(Timer timer) {
		this.timer = timer;
	}
	@Override
	public void run() {
		timer.cancel();   // 停止所有排程中的任務
		timer.purge();    // 清除已取消的任務（可省略）
		timer = null;     // 將參考清除（非必要，GC 自動處理）
	}
}