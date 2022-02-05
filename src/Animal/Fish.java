package Animal;

public class Fish {
    private String fName;
    private String fKind;
    private int fSize;

    public void getFishInfo () {
        System.out.println("Fish name is: " + fName + "\nFish Kind is: " + fKind + "\nFish size is: " + fSize);

    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfKind() {
        return fKind;
    }

    public void setfKind(String fKind) {
        this.fKind = fKind;
    }

    public int getfSize() {
        return fSize;
    }

    public void setfSize(int fSize) {
        this.fSize = fSize;
    }
}
