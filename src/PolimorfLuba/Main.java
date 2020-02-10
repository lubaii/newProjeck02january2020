package PolimorfLuba;

public class Main {
    public static void main(String[] args) {
        Danser danser = new Danser(25,"Марио");
        danser.danse();
        TangoDanser tangoDanser = new TangoDanser(33,"Антонио");
        tangoDanser.danse();
        ValseDanser valseDanser = new ValseDanser(28,"Альберто");
        valseDanser.danse();

    }
}
