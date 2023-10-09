package org.example;

public interface Visitor {
    Object visitCPU(CPU cpu);
    Object visitMemory(Memory memory);
}
