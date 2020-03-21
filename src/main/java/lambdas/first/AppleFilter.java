package lambdas.first;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class AppleFilter {
    public AppleFilter() {
    }

    public static void main(String... args) {
        Apple apple1 = new Apple("blau", "150");
        Apple apple2 = new Apple("rot", "150");
        List<Apple> apples = new ArrayList();
        apples.add(apple1);
        apples.add(apple2);
        AppleFilter filter = new AppleFilter();
        List<Apple> filtered = filter.filterApple(apples, (a) -> {
            return "rot".equals(a.getFarbe());
        });
        filter.filterWithMyFunctionInterface(apples, (a) -> {
            return "rot".equals(a.getFarbe());
        });
        Iterator var7 = filtered.iterator();

        while(var7.hasNext()) {
            Apple apple = (Apple)var7.next();
            System.out.println(apple);
        }

    }

    private List<Apple> filterApple(List<Apple> apples, Predicate<Apple> p) {
        List<Apple> result = new ArrayList();
        Iterator var4 = apples.iterator();

        while(var4.hasNext()) {
            Apple apple = (Apple)var4.next();
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    private List<Apple> filterWithMyFunctionInterface(List<Apple> apples, MyFunctionInterface myInterface) {
        List<Apple> result = new ArrayList();
        Iterator var4 = apples.iterator();

        while(var4.hasNext()) {
            Apple apple = (Apple)var4.next();
            if (myInterface.testAppel(apple)) {
                result.add(apple);
            }
        }

        return result;
    }
}
