package com.github.ptrifonoff.java9.process;

public class ProcessAccessor {

    public static void main(String[] args) {
        // TODO ProcessHandle.current().pid(): get the current PID
        System.out.println("Current process id: " + ProcessHandle.current().pid());

        // TODO ProcessHandle class: many useful methods to deal with processes
    }
}
