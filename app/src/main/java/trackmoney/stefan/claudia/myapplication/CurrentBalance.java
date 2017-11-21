package trackmoney.stefan.claudia.myapplication;

import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static trackmoney.stefan.claudia.myapplication.R.layout.second_activity;

/**
 * Created by Xibalba on 19-Nov-17.
 */

public class CurrentBalance extends PeriodBalance {

    public Button CurrentBalance;
    public TextView currentb;
    public Button rentb;
    public EditText renti;
    public Button foodb;
    public EditText foodi;
    public Button utilb;
    public EditText utili;
    public Button funb;
    public EditText funi;

    //currentb == (iBalance - renti - foodi -utili -funi);


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        myDB = new Database(this);

        CurrentBalance = (Button) findViewById(R.id.CurrentBalance);
        currentb = (TextView) findViewById(R.id.currentb);
        rentb = (Button) findViewById(R.id.rentb);
        renti = (EditText) findViewById(R.id.renti);
        foodb = (Button) findViewById(R.id.foodb);
        foodi = (EditText) findViewById(R.id.foodi);
        utilb = (Button) findViewById(R.id.utilb);
        utili = (EditText) findViewById(R.id.utili);
        funb = (Button) findViewById(R.id.funb);
        funi = (EditText) findViewById(R.id.funi);

        AddData();
}
}
