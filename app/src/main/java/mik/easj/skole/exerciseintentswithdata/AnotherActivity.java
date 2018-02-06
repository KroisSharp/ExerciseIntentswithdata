package mik.easj.skole.exerciseintentswithdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    //dif til intent så vi kan få fat i den
    public static final String NAME = "name";
    public static final String ADRESSE = "adresse";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        //henter fra intent
        Intent myIntent = getIntent();
        String _name = myIntent.getStringExtra(NAME);
        String _adresse = myIntent.getStringExtra(ADRESSE);

        //for at ændre vores textview
        TextView textView = findViewById(R.id.ShowData);
        textView.setText("du skrev: " + _name + " "+ _adresse);
    }
}
