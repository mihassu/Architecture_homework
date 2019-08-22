package builder;

public class MyNote {

    private String date;
    private int mileage;
    private String note;

    public void setDate(String date) {
        this.date = date;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Дата ").append(date).append("/").append("Пробег ").append(mileage).append("/").append(note);

        return sb.toString();
    }
}

