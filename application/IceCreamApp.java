package IceCreamShop.be.intecbrussel.application;

import IceCreamShop.be.intecbrussel.eatables.Cone;
import IceCreamShop.be.intecbrussel.eatables.IEatable;
import IceCreamShop.be.intecbrussel.eatables.IceRocket;
import IceCreamShop.be.intecbrussel.eatables.Magnum;
import IceCreamShop.be.intecbrussel.sellers.IIceCreamSeller;
import IceCreamShop.be.intecbrussel.sellers.IceCreamSalon;
import IceCreamShop.be.intecbrussel.sellers.PriceList;

import java.util.Arrays;

public class IceCreamApp {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(1.25,2.50,3.10);

        IIceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);

        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.LEMON, Cone.Flavor.CHOCOLATE};

        Cone order1 = iceCreamSeller.orderCone(flavors);
        Magnum order2 = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        IceRocket order3 = iceCreamSeller.orderIceRocket();

        IEatable [] eatables =  {order1,order2,order3};

        for (IEatable eatable : eatables) {
            eatable.eat();
        }


        double totalProfit = iceCreamSeller.getProfit();
        System.out.println("Profit is: " +totalProfit);








    }
}
