package application1.oran.intentcal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
float v1,v2;
Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        final Intent intent = getIntent ();
        b1 = (Button)findViewById (R.id.button2);
        b2 = (Button)findViewById (R.id.button3);
        b3 = (Button)findViewById (R.id.button4);
        b4 = (Button)findViewById (R.id.button5);

        if(intent!= null){
            v1=intent.getFloatExtra ("val",0);
            v2=intent.getFloatExtra ("val2",0);

        }
        b1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                float resu = v1+v2;
                Intent data = new Intent ();
                data.putExtra ("val3",resu);
                setResult (RESULT_OK,data);

                finish ();
            }
        });
    }
}
