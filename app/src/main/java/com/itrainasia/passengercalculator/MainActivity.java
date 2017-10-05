package com.itrainasia.passengercalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    TextView textView;
    int counter = 0;

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.about_us:

                break;
            case R.id.reset:

                break;
            case R.id.exit:
                finish();

                break;
            case R.id.send_email:


                break;
            default:
                return super.onOptionsItemSelected(item);
        }
return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        //Disable  the button
        button2.setEnabled(false);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2.setEnabled(true);

                counter  ++;
                textView.setText(Integer.toString(counter));


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter == 0){
                    //Disable the button
                    button2.setEnabled(false);
                    //Show message to user
                    Toast.makeText(getApplicationContext(), "You have reached 0", Toast.LENGTH_SHORT).show();
                }
                else {
                    counter = counter - 1;
                    // counter--;
                    //counter=-1;
                    textView.setText(Integer.toString(counter));
                }
            }
        });

    }
}
