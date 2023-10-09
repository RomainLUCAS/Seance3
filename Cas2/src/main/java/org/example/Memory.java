package org.example;

public class Memory implements Component {
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
        return visitor.visitMemory(this);
    }
}
