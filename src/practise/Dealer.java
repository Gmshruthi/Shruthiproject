package Git.src.practise;

import Git.src.practise.Inheritance.BoostCompany;

public class Dealer extends BoostCompany {
    public int boostMRP=100;
    public int boostSellingPrice=90;
    public Dealer(int boostMRP) {
        super(boostMRP);
    }
}
