class Die {
    int sideUp;

    int getSideUp() {
        return sideUp;
    }

    void roll() {
        sideUp = (int)(Math.random() * 6) + 1;
    }
}

class DieDemo {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();

        d1.roll();
        d2.roll();

        System.out.println("Die1: " + d1.getSideUp());
        System.out.println("Die2: " + d2.getSideUp());
        System.out.println("Sum: " + (d1.getSideUp() + d2.getSideUp()));
    }
}
