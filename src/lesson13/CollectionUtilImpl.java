package lesson13;

import java.util.*;

public class CollectionUtilImpl implements CollectionUtils {

    //1
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {
        LinkedList<Integer> union = new LinkedList<>();
        union.addAll(a);
        union.addAll(b);

        return union;
    }

    //2
    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {

        ArrayList<Integer> a2 = new ArrayList<>(); //вспомогательные коллекции
        ArrayList<Integer> b2 = new ArrayList<>(); //вспомогательные коллекции

        for (Integer elementA : a) {
            if (b.contains(elementA)) {
                a2.add(elementA);
            }
        }
        for (Integer elementB : b) {
            if (a.contains(elementB)) {
                b2.add(elementB);
            }
        }
        return this.union(a2, b2);
    }


    //3
    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {

        LinkedHashSet<Integer> unionWithoutDuplicate = new LinkedHashSet<>();

        unionWithoutDuplicate.addAll(a);
        unionWithoutDuplicate.addAll(b);
        return unionWithoutDuplicate;
    }

    //4
    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {

        LinkedHashSet<Integer> intersectionWithoutDuplicate = new LinkedHashSet<>();

        for (Integer elementA : a) {
            if (b.contains(elementA)) {
                intersectionWithoutDuplicate.add(elementA);
            }
        }
        return intersectionWithoutDuplicate;

    }

    //5
    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b)
            throws NullPointerException {

        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> b2 = new ArrayList<>();

        for (Integer elementA : a) {
            if (!b.contains(elementA)) {
                a2.add(elementA);
            }
        }
        for (Integer elementB : b) {
            if (!a.contains(elementB)) {
                b2.add(elementB);
            }
        }
        return this.union(a2, b2);
    }
}
