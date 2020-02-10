package AvenuPraktiva;

public class FractionNumberOperationImp implements  FractionNumberOperation {
    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        FractionNumberImpl result;
         int znamenatel = a.getDivisor()*b.getDivisor();

         int chislitel1 =(znamenatel/a.getDivisor()*a.getDividend());

         int chislitel2 =(znamenatel/b.getDivisor()*b.getDividend());

         int chislitel=chislitel1+chislitel2;
        System.out.println("числитель "+chislitel);
         for(int i = 1;i<chislitel;i++){
         if(chislitel%i==0&&znamenatel%i==0){
             int nod = 1;
             nod*=i;
             chislitel=chislitel/nod;
             znamenatel=znamenatel/nod;
         }
         }
        result= new FractionNumberImpl(chislitel,znamenatel);
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}
