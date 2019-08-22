package builder;

public class Main {

    public static void main(String[] args) {

        MyNoteBuilder myNoteBuilder1 = new MyNoteBuilder();
        myNoteBuilder1.date("12.04.2019").mileage(53000).note("Замена масла").build();
        MyNoteBuilder myNoteBuilder2 = new MyNoteBuilder();
        myNoteBuilder2.date("22.06.2019").mileage(55000).note("Замена колодок").build();



        AutoBook.printBook();
    }

}
