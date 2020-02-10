package HashSetLuba;

public class Coin implements Comparable<Coin> {
    private int diametr;
    private  int age;
    private int nominal;

    public Coin() {
    }

    public Coin(int diametr, int age, int nominal) {
        this.diametr = diametr;
        this.age = age;
        this.nominal = nominal;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diametr=" + diametr +
                ", age=" + age +
                ", nominal=" + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;

        Coin coin = (Coin) o;

        if (getDiametr() != coin.getDiametr()) return false;
        if (getAge() != coin.getAge()) return false;
        return getNominal() == coin.getNominal();
    }

    @Override
    public int hashCode() {
        int result = getDiametr();
        result = 31 * result + getAge();
        result = 31 * result + getNominal();
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        int year1 = this.age;
        int yaer2 = o.age;
        if (year1 != yaer2) {
            int result = yaer2 - year1;

            return result;
        }
        int nominal = this.nominal;
        int nominal2=o.nominal;
        if(nominal!=nominal2){
            return nominal2-nominal2;
        }
        return o.diametr-this.diametr;
    }
}

