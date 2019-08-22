package builder;

import java.util.ArrayList;
import java.util.List;

public class AutoBook {

    private static AutoBook instance;
    private List<MyNote> book;

    private AutoBook() {
        this.book = new ArrayList<MyNote>();
    }

    public static AutoBook getInstance() {
        AutoBook localInstance = instance;

        if (localInstance == null) {
            synchronized (AutoBook.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new AutoBook();
                }
            }
        }
        return localInstance;
    }

    public static void printBook() {
        for (MyNote n: AutoBook.getInstance().getBook()) {
            System.out.println(n.toString());
        }
    }

    public List<MyNote> getBook() {
        return book;
    }
}
