package design_pattern_behavioral.mediator_pattern.example;

import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {
    private final Timer timer;

    public MediatorEverydayDemo(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds + 1000);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 + 1000);
    }

    static void main() {
        System.out.println("About to schedule task");
        new MediatorEverydayDemo(3);
        System.out.println("Task scheduled");
    }

    class RemindTask extends TimerTask {
        @Override
        public void run() {
            System.out.println("Time's up");
            // toolkit.beep();
        }
    }

    class RemindTaskWithoutBeep extends TimerTask {
        @Override
        public void run() {
            System.out.println("Now time's really up");
            timer.cancel();
        }
    }
}

