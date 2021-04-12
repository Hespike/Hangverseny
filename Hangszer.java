public class Hangszer {
    private int ertekeles;
    private int hangossag;

    private boolean harfa;
    private boolean gitar;

    public Hangszer(int ertekeles, int hangossag, boolean harfa, boolean gitar) {
        this.ertekeles = ertekeles;
        this.hangossag = hangossag;
        this.harfa = harfa;
        this.gitar = gitar;
    }

    public int getErtekeles() {
        return ertekeles;
    }

    public int getHangossag() {
        return hangossag;
    }

    public boolean isHarfa() {
        return harfa;
    }

    public boolean isGitar() {
        return gitar;
    }

    @Override
    public String toString() {
        return "Hangszer{" +
                "ertekeles=" + ertekeles +
                ", hangossag=" + hangossag +
                ", harfa=" + harfa +
                ", gitar=" + gitar +
                '}';
    }
}
