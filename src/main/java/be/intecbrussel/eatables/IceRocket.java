package be.intecbrussel.eatables;

public class IceRocket implements Eatable {


    public IceRocket() {
    }

    @Override
    public void eat() {

        System.out.println("eating iceRocket");

    }

    @Override
    public String toString() {
        return "iceRocket";
    }
}
