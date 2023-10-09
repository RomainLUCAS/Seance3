package org.example;

public class NewOperationVisitor implements Visitor {
    @Override
    public String visitCPU(CPU cpu) {
        // Ici, nous effectuons la nouvelle opération désirée sur le CPU
        return "New operation done on CPU";
    }

    @Override
    public String visitMemory(Memory memory) {
        // Ici, nous effectuons la nouvelle opération désirée sur la mémoire
        return "New operation done on Memory";
    }
}
