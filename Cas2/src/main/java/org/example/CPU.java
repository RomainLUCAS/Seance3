package org.example;

public class CPU implements Component {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean validateConfiguration() {
        return true;
    }

    @Override
    public Object accept(Visitor visitor) {
        return visitor.visitCPU(this);
    }
}
