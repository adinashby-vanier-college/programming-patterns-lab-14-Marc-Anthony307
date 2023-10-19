package com.prog2.labs;

public class Dragon {

    private Bird bird;
    private Lizard lizard;
    private int age;

    public Dragon() {
        this.bird = new Bird();
        this.lizard = new Lizard();
    }

    public void setAge(int age) {
        bird.age = age;
        lizard.age = age;
        this.age = age;
    }

    public String fly() {
        return bird.fly();
    }

    public String crawl() {
        return lizard.crawl();
    }
}
