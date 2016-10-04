package singltondemo.ranjeet.android.com.singltondemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Show the string value defined by the private constructor
        Toast.makeText(getApplicationContext(),Singletonclass.getInstance().getString(), Toast.LENGTH_LONG).show();



        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Change the string value and launch intent to Demo
                Singletonclass.getInstance().setString("Singleton");
                Intent intent = new Intent(getApplicationContext(),Demo.class);
                startActivity(intent);

            }
        });

    }
}
