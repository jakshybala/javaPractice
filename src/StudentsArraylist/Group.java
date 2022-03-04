package StudentsArraylist;

public enum Group {
    JS("Frontend Developers"),
    JAVA("Backend Developers");

    private final String text;

    public String getText() {
        return text;
    }

    Group(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
