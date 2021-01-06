public class Fork {
    private int holder;

    public Fork() {
        this.holder = 0;
    }

    public Fork(int place) {
        this.holder = place;
    }

    public int getOwner() {
        return holder;
    }

    public void setOwner(int owner) {
        this.holder = holder;
    }

    public boolean isTaking() {
        if(holder > 0  && holder <= 5)
            return true;
        return false;
    }
}