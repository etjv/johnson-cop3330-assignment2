package oop.assignment2.ex26;

public class PaymentCalculator {

    public double calculateMonthsUntilPaidOff(double balance, double apr, double payment) {
        double i = apr / 365;
        return -((double)1/30) * Math.log((1 + balance/payment * (1 - (Math.pow(1 + i, 30)))))/ Math.log(1 + i);
    }
}
