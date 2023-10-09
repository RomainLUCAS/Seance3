package org.example;

public class OtherNewOperationVisitor implements Visitor {
    @Override
    public String visitCPU(CPU cpu) {
        return "Other new operation done on CPU";
    }

    @Override
    public String visitMemory(Memory memory) {
        return "Other new operation done on Memory";
    }
}
