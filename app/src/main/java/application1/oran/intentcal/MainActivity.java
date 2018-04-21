package application1.oran.intentcal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText t1,t2;
Button b1;
TextView txt;
Float r,r2;
int RESULT_SELECT =0;
;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        t1 = (EditText) findViewById (R.id.editText);
        t2 = (EditText) findViewById (R.id.editText2);
        b1 =(Button) findViewById (R.id.button);
        txt = (TextView)findViewById (R.id.textView3);

        b1.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                String val1 = t1.getText ().toString ();
                String val2 = t2.getText ().toString ();
                float r=Float.parseFloat (val1);
                float r2=Float.parseFloat (val2);


                Intent intent = new Intent (MainActivity.this,Main2Activity.class);
                intent.putExtra ("val",r);
                intent.putExtra ("val2",r2);
                startActivityForResult (intent,RESULT_SELECT);

            }



        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

         if(requestCode ==RESULT_SELECT){
        if (resultCode == RESULT_OK) {
            float r = data.getFloatExtra ("val3", 0);
            if (r != 0) {

                txt.setText ("" + r);
                super.onActivityResult (requestCode, resultCode, data);
            }
        }}
    }}

