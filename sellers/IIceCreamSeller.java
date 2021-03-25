package IceCreamShop.be.intecbrussel.sellers;

import IceCreamShop.be.intecbrussel.eatables.Cone;
import IceCreamShop.be.intecbrussel.eatables.IceRocket;
import IceCreamShop.be.intecbrussel.eatables.Magnum;

public interface IIceCreamSeller extends IProfitable{

  Cone orderCone(Cone.Flavor[] balls);


  //Cone.Flavor[] orderCone = new Cone.Flavor[0];

  IceRocket orderIceRocket();
  Magnum orderMagnum(Magnum.MagnumType type);

}
