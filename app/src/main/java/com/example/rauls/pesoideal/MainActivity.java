package com.example.rauls.pesoideal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //1.- Creamos objetos de componentes a utilizar en este activity. Luego los vinculamos
    //Con la definición en el archivo de layout.
    EditText edtEdad;
    EditText edtNombre;
    TextView txvResultado;
    EditText edtPesoActual;
    Button btnCalcular;
    Button btnInstrucciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2.- Asociamos los objetos de la clase con los elementos de la interfaz
        edtEdad = (EditText) findViewById(R.id.edt_edad);
        edtNombre = (EditText) findViewById(R.id.edt_nombre);
        txvResultado = (TextView) findViewById(R.id.txv_resultado);
        edtPesoActual = (EditText) findViewById(R.id.edt_peso_actual);
        btnCalcular = (Button) findViewById(R.id.btn_calcular);
        btnInstrucciones = (Button) findViewById(R.id.btn_instrucciones);
        //3.- Habilitamos la posibilidad de que un elemento de la interfaz ejecute una acción en el evento click (tap)
        btnCalcular.setOnClickListener(this);
        btnInstrucciones.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_calcular:
                abrirResultado();
                break;
            case R.id.btn_instrucciones:
                abrirInstrucciones();
                break;

        }
    }

    public void abrirResultado() {

        //4.- Capturamos el valor ingresado en edtEdad
        int edadIngresada = Integer.parseInt(edtEdad.getText().toString());
        int pesoIngresado = Integer.parseInt(edtPesoActual.getText().toString());
        String nombreIngresado = edtNombre.getText().toString();
        /*int pesoIdeal       = edadIngresada * 2 + 8 ;
        txvResultado.setText("El peso ideal es "+pesoIdeal);*/
        //5. Establecemos un intento para abrir un nuevo activity (ResultadoActivity)
        Intent intento = new Intent(MainActivity.this, ResultadoActivity.class);
        //6. Especificamos los datos que queremos enviar al activity ResultadoActivity.
        intento.putExtra("p_edad", edadIngresada);
        intento.putExtra("p_nombre", nombreIngresado);
        intento.putExtra("p_peso_actual", pesoIngresado);
        //7. Ejecutamos el activity con startActivity especificando cual es el objeto
        // de la clase Intent que define el destino y los datos a transportar.
        startActivity(intento);
    }

    public void abrirInstrucciones() {

        Intent intento = new Intent(MainActivity.this, InstruccionesActivity.class);

        startActivity(intento);
    }
}