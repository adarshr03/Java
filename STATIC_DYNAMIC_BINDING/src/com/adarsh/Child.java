package com.adarsh;

class Child extends Parent {
    public static void staticMethod() {
        System.out.println("Static method in Child");
    }

    @Override
    public void instanceMethod() {
        System.out.println("Instance method in Child");
    }
}