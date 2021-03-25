package IceCreamShop.be.intecbrussel.sellers;

import IceCreamShop.be.intecbrussel.eatables.Cone;
import IceCreamShop.be.intecbrussel.eatables.IceRocket;
import IceCreamShop.be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IIceCreamSeller {

    private final PriceList priceList;
    private double totalProfit = 0;


    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;

    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        totalProfit += (flavors != null && flavors.length > 0) ? (priceList.getBallPrice() * flavors.length) : priceList.getBallPrice();
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        totalProfit += priceList.getMagnumPrice(magnumType);
        return new Magnum(magnumType);
    }

    @Override
    public double getProfit() {
        return Math.ceil(totalProfit);
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
