package IceCreamShop.be.intecbrussel.sellers;

import IceCreamShop.be.intecbrussel.eatables.Cone;
import IceCreamShop.be.intecbrussel.eatables.IceRocket;
import IceCreamShop.be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IIceCreamSeller{

    private PriceList pricelist;
    private Stock stock;
    private double profit;


    public IceCreamCar(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        profit += ( flavors!= null && flavors.length > 0) ? (pricelist.getBallPrice() * flavors.length) : pricelist.getBallPrice();
        return new Cone(flavors);
    }

    private Cone prepareCone (Cone.Flavor[] flavors){
        //profit += ( flavors!= null && flavors.length > 0) ? (priceList.getBallPrice() * flavors.length) : priceList.getBallPrice();
        return prepareCone(flavors);

    }

    @Override
    public IceRocket orderIceRocket() {
        //profit += priceList.getRocketPrice();
        return new IceRocket();
    }

    private IceRocket prepareRocket(){
        //profit += priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType type) {
        //profit += priceList.getMagnumPrice(type);
        return new Magnum(type);
    }

    private Magnum prepareMagnum (Magnum.MagnumType type){
        //profit += priceList.getMagnumPrice(type);
        return new Magnum(type);
    }



    @Override
    public double getProfit() {
        return Math.ceil(profit);
    }
}
