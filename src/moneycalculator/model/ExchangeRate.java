package moneycalculator.model;

public class ExchangeRate {

    private final Currency from;
    private final Currency to;
    private final double amount;

    public ExchangeRate(Currency from, Currency to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public ExchangeRate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getAmount() {
        return amount;
    }

}