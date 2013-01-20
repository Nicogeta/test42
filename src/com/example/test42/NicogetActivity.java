package com.example.test42;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NicogetActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button) findViewById((R.id.Bbli));
        Button buttPlus = (Button) findViewById(R.id.Bplus);
        Button buttRaz = (Button) findViewById(R.id.Braz);
        final EditText nbOne = (EditText)findViewById(R.id.nbOne);
        final EditText nbTwo = (EditText) findViewById(R.id.nbTwo);
        final EditText resul = (EditText) findViewById(R.id.resultat);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                //To change body of implemented methods use File | Settings | File Templates.
                Toast msg = Toast.makeText(NicogetActivity.this, "Je confirme !", Toast.LENGTH_LONG);
                msg.setGravity(Gravity.CENTER, msg.getXOffset()/2, msg.getYOffset()/2);
                msg.show();
            }
        });

        buttPlus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                      int nbOneInt = Integer.parseInt(nbOne.getText().toString());
                      int nbTwoInt = Integer.parseInt(nbTwo.getText().toString());
                      int resulInt =  Integer.parseInt(resul.getText().toString());
                      resulInt = resulInt + (nbOneInt+nbTwoInt);
                      resul.setText(String.valueOf(resulInt));
                }   catch (Exception err) {
                    Toast msg = Toast.makeText(NicogetActivity.this, err.getMessage(), Toast.LENGTH_LONG);
                    msg.setGravity(Gravity.CENTER, msg.getXOffset()/2, msg.getYOffset()/2);
                    msg.show();
                }
            }
        });

        buttRaz.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                resul.setText("0");
            }
        });
    }



}
