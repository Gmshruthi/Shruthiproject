package Git.src.practise.Inheritance;

import Git.src.practise.Dealer;

public class Shop extends Dealer {
    public int boostMRP = 100;
    public int boostSellingPrice = 98;

    public Shop(int boostMRP) {
        super(boostMRP);
        System.out.println(this.boostMRP);
        System.out.println(super.boostMRP);
    }
    public static void main(String[] args) {
        Shop shop = new Shop(110);
    }
}
