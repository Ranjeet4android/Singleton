package singltondemo.ranjeet.android.com.singltondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by ranjeet on 4/10/16.
 */


public class Demo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
        //Show the string value of the singleton
        Toast.makeText(getApplicationContext(),Singletonclass.getInstance().getString(), Toast.LENGTH_SHORT).show();
    }
}
