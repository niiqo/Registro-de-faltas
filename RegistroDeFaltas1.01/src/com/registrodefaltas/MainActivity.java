package com.registrodefaltas;


import com.registrodefaltas.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText txtAlum, txtDias, txtInas;
	private TextView lblAsis, lblInas, lblMedia, lblPor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtAlum= (EditText) findViewById(R.id.txtAlum);
		txtDias= (EditText) findViewById(R.id.txtDias);
		txtInas= (EditText) findViewById(R.id.txtInas);
		lblAsis= (TextView) findViewById(R.id.lblAsis);
		lblInas= (TextView) findViewById(R.id.lblInas);
		lblMedia= (TextView) findViewById(R.id.lblMedia);
		lblPor= (TextView) findViewById(R.id.lblPor);
		
	    
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
public void Calcular (View view){
		
		
		String sAlum= txtAlum.getText().toString();
		String sDias= txtDias.getText().toString();
		String sInas= txtInas.getText().toString();
		
		int iAlum= Integer.parseInt(sAlum);
		int iDias= Integer.parseInt(sDias);
		float iInas= Float.parseFloat(sInas);
		float asis =(iAlum*iDias)-iInas;
		float asist =  asis;
		float media= asist/iDias;
		float por= (asist*100)/(iAlum*iDias);
		lblAsis.setText("" + asis);
		lblInas.setText("" + iInas);
		lblMedia.setText("" + media + " %");
		lblPor.setText("" + por + " %");
		


}


public void limpiar (View view){
	
	txtAlum.setText("");
	txtDias.setText("");
	txtInas.setText("");
	lblAsis.setText("");
	lblInas.setText("");
	lblMedia.setText("");
	lblPor.setText("");

}


	
}






