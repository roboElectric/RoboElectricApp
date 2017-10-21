package id.roboelectric.apps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void launchHome(View v){
        Intent i = new Intent(this,HomeActivity.class);
        startActivity(i);
        finish();
    }

    public void openTokopedia(View v){
        Intent i = getPackageManager().getLaunchIntentForPackage("com.tokopedia.tkpd");
        if (i != null){
            startActivity(i);
        }
    }
}
