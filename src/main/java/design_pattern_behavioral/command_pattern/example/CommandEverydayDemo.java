package design_pattern_behavioral.command_pattern.example;

public class CommandEverydayDemo {
    static void main() {
        Task task1 = new Task(10,12); // encapsulate request
        Task task2 = new Task(11,13);

        Thread thread1 = new Thread(task1);
        thread1.start(); // invoker

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}
