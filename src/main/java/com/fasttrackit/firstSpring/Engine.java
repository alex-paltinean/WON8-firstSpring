package com.fasttrackit.firstSpring;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
    private int horsePower;

    public Engine() {
        System.out.println("Building default engine");
        horsePower = 100;
    }

    public Engine(int horsePower) {
        System.out.println("Building engine with horsePower: " + horsePower);
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                '}';
    }
}
