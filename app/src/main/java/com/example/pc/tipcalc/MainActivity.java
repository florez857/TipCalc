package com.example.pc.tipcalc;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.pc.tipcalc.R.id.propina;

public class MainActivity extends AppCompatActivity {

    private Button incrementar,decrementar,borrar,calcular;
    private EditText total,porcentaje;
    private TextView monto;
    static final String PorcentajeFijo="10";
    private Dialog dialogo;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcular=(Button)findViewById(R.id.calcular);
        monto=(TextView)findViewById(R.id.textView);
        total=(EditText)findViewById(propina);
        porcentaje=(EditText)findViewById(R.id.porcentaje);
        builder = new AlertDialog.Builder(this);

        builder.setTitle("Error")
                .setMessage("debe ingresar un monto a pagar ")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Acciones
                            }
                        });
        builder.create();






        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcular();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()== R.id.About){
            Intent intent=new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("www.google.com.ar"));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public int getPorcentaje(){
        return 10;
    }

    public void calcular(){

       String montoPagar=total.getText().toString();
       if(!montoPagar.isEmpty()){
           Double pagar=  Double.valueOf( montoPagar.trim());
           Double total=(getPorcentaje()*pagar)/100;
           monto.setText(total.toString());
           Log.d("salida de datos",total.toString());
           monto.setVisibility(View.VISIBLE);
       } else {

         builder.show();
       }
    }


    public void mostrarDialogo(){


    };

}
