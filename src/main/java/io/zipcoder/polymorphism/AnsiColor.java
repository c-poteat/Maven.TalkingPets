package io.zipcoder.polymorphism;

public enum AnsiColor {
    AUTO("\u001B[0m"),
    RED("\u001B[31m");

    private final String color;

    AnsiColor(String ansiColor) {
        this.color = ansiColor;
    }

    public String getColor() {
        return color;
    }

}
