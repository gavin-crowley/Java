/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gavin
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        // write code here
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        // write code here
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        // write code here

        if (amount < 0) {
            this.balance = this.balance;
        } else {
            if (this.balance <= 150.0) {
                double result = this.balance += amount;
                if (result > 150.0) {
                    this.balance = 150.0;
                }
            }
        }

    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
