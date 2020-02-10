package AvenuPraktiva;

public class Main {
    public static void main(String[] args) {
        FractionNumberImpl fractionNumber = new FractionNumberImpl(2,6);
        FractionNumberImpl fractionNumber1 = new FractionNumberImpl(2,3);
        System.out.println(fractionNumber.value());

        FractionNumberOperation calc = new FractionNumberOperationImp();

        FractionNumber result = calc.add(fractionNumber,fractionNumber1);
        System.out.println("результат сложения " + result);


        System.out.println(fractionNumber);

    }
}
