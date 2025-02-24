package collection.compare;

import java.util.Comparator;

public class IdComparator implements Comparator<MyUser> {
    @Override
    public int compare(MyUser o1, MyUser o2) {
        // compareTo 문자를 비교할 수 있도록 자바에서 만들어 두었음!
        return o1.getId().compareTo(o2.getId());
    }
}
