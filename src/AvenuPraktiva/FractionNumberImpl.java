package AvenuPraktiva;

public class FractionNumberImpl implements FractionNumber {
    private  int divident ;
   private int devisor;

    public FractionNumberImpl() {
        devisor = FractionNumber.DEFAULT_DIVISOR_VALUE; // если в интерфейсе изменится и в в классе тоже поменяется
    }

    public FractionNumberImpl(int divident, int devisor) {
        this.divident = divident;
        if(devisor == 0){ // если поставить divisor c this, то в переменной толкьо 1 будет
            this.devisor=FractionNumber.DEFAULT_DIVISOR_VALUE;
        }
        else {
        this.devisor = devisor;}
    }

    @Override
    public void setDividend(int dividend) {
        this.divident = dividend;
    }

    @Override
    public int getDividend() {
        return this.divident;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
  this.devisor=divisor;
    }

    @Override
    public int getDivisor() {
        return this.devisor;
    }

    @Override
    public double value() {
        return ( (double) this.divident/this.devisor);
    }

    @Override
    public String toString() {
        return this.divident+"/"+this.devisor;
    }
}
