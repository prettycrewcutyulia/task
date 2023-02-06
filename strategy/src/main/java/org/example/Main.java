package org.example;

interface StrategyPay {
    abstract void pay(int price);
}

class CreditCard implements StrategyPay {
    public void pay(int amount) {
        System.out.println(amount + "$ paid with credit/debit card");
    }
}

class KiviPay implements StrategyPay {
    public void pay(int amount) {
        System.out.println(amount + "$ paid with kivi");
    }
}

class SalePay implements StrategyPay {
    public void pay(int amount) {
        System.out.println(amount + "$ paid with SALES");
    }
}

class Shop {
    public void pay(int amount, StrategyPay strategy) {
        strategy.pay(amount);
    }
}
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.pay(100,new CreditCard());
        shop.pay(100, new KiviPay());
        shop.pay(100, new SalePay());
    }
}