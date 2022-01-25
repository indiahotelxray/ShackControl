package components;

import interfaces.Pin;

public class DigitalOutput implements Pin {
    String name;

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public void setName(String n) {
        // TODO Auto-generated method stub
        name = n;
    }
    
}
