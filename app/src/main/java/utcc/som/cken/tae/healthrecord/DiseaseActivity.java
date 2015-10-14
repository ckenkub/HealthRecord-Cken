package utcc.som.cken.tae.healthrecord;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DiseaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);
    }//onCreate


    public void clickHeart(View view) {
        startActivity(new Intent(this, HeartActivity.class));
    }
    public void clickhighpressure(View view) {
        startActivity(new Intent(this, highpressureActivity.class));
    }
    public void clickLowpressure(View view) {
        startActivity(new Intent(this, LowpressureActivity.class));
    }
    public void clickdiabetes(View view) {
        startActivity(new Intent(this, diabetesActivity.class));
    }

}//main class
