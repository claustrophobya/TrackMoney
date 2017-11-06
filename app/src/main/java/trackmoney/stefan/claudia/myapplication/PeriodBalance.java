package trackmoney.stefan.claudia.myapplication;


import android.os.Bundle;
import android.content.Intent;
import android.icu.text.IDNA;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.CheckBox;



public class PeriodBalance extends AppCompatActivity {
    Database myDB;
    public Button Balance;
    public EditText iBalance;
    public Button CurrentBalance;
    public TextView currentb;
    public TextView PeriodTime;
    public Spinner periodspiner;
    public CheckBox weeklycheck;
    public CheckBox montlycheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period_balance);
        myDB = new Database(this);

        Balance = (Button) findViewById(R.id.Balancebutton);
        iBalance = (EditText) findViewById(R.id.insertBalance);
        CurrentBalance = (Button) findViewById(R.id.CurrentBalance);
        currentb = (TextView) findViewById(R.id.currentb);
        PeriodTime = (Button)findViewById(R.id.PeriodTime);
        periodspiner = (Spinner) findViewById(R.id.periodspiner);
        weeklycheck = (CheckBox) findViewById(R.id.weeklycheck);
        montlycheck = (CheckBox) findViewById(R.id.montlycheck);
    }

    //get the spinner from the xml.
    // Spinner dropdown = (Spinner) findViewById(R.id.periodspiner);
    //create a list of items for the spinner.
   //  String[] items = new String[]{"weekly", "montly"};
    //create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
     // ArrayAdapter<String> Adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.


}



