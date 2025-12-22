package design_pattern_behavioral.state_pattern.example;

public class StateEverydayDemo {
    static void main() {
        Fan fan = new Fan();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();

        System.out.println(fan);

        fan.pullChain();
    }
}

class Fan {
    final static int ON = 1;
    final static int OFF = 0;
    int state = OFF;

    public void pullChain() {
        if (state == ON) {
            System.out.println("Fan is already on");
        } else if (state == OFF) {
            System.out.println("Turning Fan on");
            state = ON;
        }
    }
}
