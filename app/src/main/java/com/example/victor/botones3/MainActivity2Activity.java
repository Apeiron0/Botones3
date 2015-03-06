package com.example.victor.botones3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Intent NI=getIntent();
        Bundle datos=NI.getExtras();
        String tam=datos.getString("tamaño");
        Button b=(Button) findViewById(R.id.btn);
        //String t=tamaño.toString();

        if (tam.equals("chico")){
            b.setText("BOTON CHICO");
            b.setWidth(50);
            b.setHeight(50);
        }
        if (tam.equals("mediano")){
            b.setText("BOTON MEDIANO");
            b.setHeight(200);
            b.setWidth(200);
        }
        if (tam.equals("grande")){
            b.setText("BOTON GRANDE");
            b.setHeight(400);
            b.setWidth(400);
        }

       /* switch (t){
            case "chico":

                break;
            case "mediano":

                break;
            case "grande":

                break;

        }*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
