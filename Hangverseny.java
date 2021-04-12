import java.util.Arrays;
import java.util.Comparator;

public class Hangverseny {

    private Hangszer[] hangszerek;

    public Hangverseny(Hangszer[] hangszerek) {
        this.hangszerek = hangszerek;
    }

    public Hangszer[] getHangszerek() {
        return hangszerek;
    }

    public Hangszer legjobb() {
        if (hangszerek.length == 0 || hangszerek[0] == null){
            return null;
        }

        Hangszer legnagyobb = hangszerek[0];
        for (Hangszer hangszer: hangszerek) {
            if (hangszer.getErtekeles() > legnagyobb.getErtekeles()){
                legnagyobb = hangszer;
            }
        }
        return legnagyobb;
    }

    public int kitiltas() {
        int darab = 0;
        for (Hangszer h: hangszerek) {
            if (h != null && !h.isGitar() && !h.isHarfa()) {
                darab++;
            }
        }

        return darab;
    }

    public Hangszer leghangosabbHarfaGitar() {
        if (hangszerek.length == 0 || hangszerek[0] == null) {
            return null;
        }

        Hangszer leghangosabb = null;
        for (Hangszer hangszer: hangszerek) {
            if (hangszer != null && hangszer.isHarfa() && hangszer.isGitar()) {
                if (leghangosabb == null) {
                    leghangosabb = hangszer;
                } else {
                    if (leghangosabb.getHangossag() < hangszer.getHangossag()) {
                        leghangosabb = hangszer;
                    }
                }
            }
        }
        return leghangosabb;
    }

    public void rangsor() {
        Arrays.sort(hangszerek, (a, b) -> Integer.compare(b.getErtekeles(), a.getErtekeles()));

    }

}
