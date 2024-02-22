package com.learn.behavioral.command.receiver;

public class TextFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    public String open() {
        return "Opening File: " + name;
    }

    public String save() {
        return "Saving File: " + name;
    }

    public String update() {
        return "Updating File: " + name;
    }
}
