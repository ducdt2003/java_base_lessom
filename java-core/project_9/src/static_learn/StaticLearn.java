package static_learn;

public class StaticLearn {
    public static int id = 500;
    private int mID;

    public StaticLearn() {
        mID = id++;
    }

    public StaticLearn(int mID) {
        this.mID = mID;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public static void showStatic(){
        System.out.println(" id " + id);
    }
}
