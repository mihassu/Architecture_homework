package builder;

public class MyNoteBuilder {

    private final MyNote myNote;

    public MyNoteBuilder() {
        this.myNote = new MyNote();

    }

    public MyNoteBuilder date(String date) {
        myNote.setDate(date);
        return this;
    }

    public MyNoteBuilder note(String note) {
        myNote.setNote(note);
        return this;
    }

    public MyNoteBuilder mileage(int mileage) {
        myNote.setMileage(mileage);
        return this;
    }

    public MyNote build() {
        AutoBook.getInstance().add(myNote);
        return myNote;
    }
}
