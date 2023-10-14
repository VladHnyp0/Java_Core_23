package ua.lviv.lgs.obb;

import java.util.Comparator;

public class ObbjValueComparator implements Comparator<Obbj> {
    @Override
    public int compare(Obbj o1, Obbj o2) {
        if (o1.getValue() > o2.getValue()) {
            return 1;
        } else if (o1.getValue() < o2.getValue()) {
            return -1;
        }
        return 0;
    }
}