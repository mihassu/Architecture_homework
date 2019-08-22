package builder;

import java.util.ArrayList;
import java.util.List;

public class AutoBook {

    private static List<MyNote> instance;

    private AutoBook() {}

    public static List<MyNote> getInstance() {
        List<MyNote> localInstance = instance;

        if (localInstance == null) {
            synchronized (AutoBook.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new ArrayList<MyNote>();
                }
            }
        }
        return localInstance;
    }

    public static void printBook() {
        for (MyNote n: instance) {
            System.out.println(n.toString());
        }
    }
}
