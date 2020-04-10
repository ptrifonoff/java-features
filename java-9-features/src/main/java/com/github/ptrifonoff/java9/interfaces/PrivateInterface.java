package com.github.ptrifonoff.java9.interfaces;

public class PrivateInterface {

    public static void main(String[] args) {
        // You can use public interface methods...
        new InterfaceWithPrivateMethod() {}.defaultMethodCallingInit();
        
        // ...but you cannot call private interface methods
        // TODO try out: new InterfaceWithPrivateMethod() {}.init();
    }

    public interface InterfaceWithPrivateMethod {

        default void defaultMethodCallingInit() {  init(); }

        // This method is not part of the public API exposed by MyInterface
        private void init() { System.out.println("Initializing"); }
    }
}
