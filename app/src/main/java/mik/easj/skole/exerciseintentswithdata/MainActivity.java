package mik.easj.skole.exerciseintentswithdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText NameFelt;
    private EditText AdresseFelt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NameFelt = findViewById(R.id.NameFelt);
        AdresseFelt = findViewById(R.id.AdresseFelt);
    }

    public void Send(View view) {
        String _navn = NameFelt.getText().toString();
        String _adresse = AdresseFelt.getText().toString();

        Intent myIntent = new Intent(this, AnotherActivity.class);
        myIntent.putExtra(AnotherActivity.NAME, _navn);
        myIntent.putExtra(AnotherActivity.ADRESSE, _adresse);
        startActivity(myIntent);
    }
}
