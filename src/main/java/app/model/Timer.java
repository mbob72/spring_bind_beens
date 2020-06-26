package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        System.out.println(timer.getTime());
        System.out.println(timer.getTime());
        System.out.println(timer.getTime());
    }
}
