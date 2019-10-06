package mx.edu.tesoem.isc.cesar.p2njrc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent principal = new Intent(MainActivity.this, Main2Activity.class);

                startActivity(principal);
                finish();
            }
        },5000);
    }
}
