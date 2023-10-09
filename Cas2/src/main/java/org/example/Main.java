package org.example;

public class Main {
    public static void main(String[] args) {
        Component cpu = new CPU();
        Component memory = new Memory();

        Visitor visitor = new NewOperationVisitor();
        System.out.println(cpu.accept(visitor));
        System.out.println(memory.accept(visitor));

        visitor = new OtherNewOperationVisitor();
        System.out.println(cpu.accept(visitor));
        System.out.println(memory.accept(visitor));
    }
}