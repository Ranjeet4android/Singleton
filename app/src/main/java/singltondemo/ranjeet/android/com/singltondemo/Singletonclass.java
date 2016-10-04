package singltondemo.ranjeet.android.com.singltondemo;

/**
 * Created by ranjeet on 4/10/16.
 */


public class Singletonclass {
    private static Singletonclass mInstance = null;

    private String mString;

    private Singletonclass(){
        mString = "Say hello";
    }

    public static Singletonclass getInstance(){
        if(mInstance == null)
        {
            mInstance = new Singletonclass();
        }
        return mInstance;
    }

    public String getString(){
        return this.mString;
    }

    public void setString(String value){
        mString = value;
    }
}
