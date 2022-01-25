package interfaces;

public interface Pin extends NamedType {


    PinState getState();

    void setState(PinState state);

}
