package IceCreamShop.be.intecbrussel.sellers;

import IceCreamShop.be.intecbrussel.eatables.Magnum;

public class PriceList {

    private double ballPrice = 1.20;
    private double rocketPrice = 1.50;
    private double magnumStandardPrice = 1.30;

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType type) {
        if (type == Magnum.MagnumType.ALPINENUTS){
            this.magnumStandardPrice*=1.5;
        }

        return magnumStandardPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }
}
