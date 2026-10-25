package payment;

public class DebitCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " TL with Debit Card");
    }
}

