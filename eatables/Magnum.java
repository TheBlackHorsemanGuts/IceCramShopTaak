package IceCreamShop.be.intecbrussel.eatables;

public class Magnum implements IEatable {

    public enum MagnumType {
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES
    }


    private MagnumType type;


    public Magnum(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() {
        return type;
    }

    @Override
    public void eat() {
        System.out.println(" suck my balls, Deeeeez nuts ");

    }


}
