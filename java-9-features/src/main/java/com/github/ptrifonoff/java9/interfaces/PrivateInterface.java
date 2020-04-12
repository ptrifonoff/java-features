package com.github.ptrifonoff.java9.interfaces;

public class PrivateInterface {

    public static void main(String[] args) {
        // TODO private methods in interfaces are possible
        // You can use public interface methods...
        new InterfaceWithPrivateMethod() {}.defaultMethodCallingInit();
        
        // ...but you cannot call private interface methods
        // TODO try it out: new InterfaceWithPrivateMethod() {}.init();
    }

    public interface InterfaceWithPrivateMethod {

        default void defaultMethodCallingInit() {  init(); }

        // This method is not part of the public API exposed by MyInterface
        private void init() { System.out.println("Initializing"); }
    }
}
