package Git.src.practise.Inheritance;

import Git.src.practise.Dealer;

public class Shop extends Dealer {
    public Shop(){
        super.boostMRP=100;
        super.boostSellingPrice=98;
    }
    public static void main(String[] args) {
        Shop shop=new Shop();
        Dealer dealer=new Dealer();
        System.out.println(shop.boostMRP);
    }
}
