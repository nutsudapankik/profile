package app.it.profile797;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class Edit extends Activity implements OnClickListener {
	EditText E1,E2,E3,E4,E5,E6;
	 TextView tv1,tv2,tv3,tv4,tv5,tv6;
	 Button B1;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.edit);
	d();
	}
private void d() {
	// TODO Auto-generated method stub
	E1= (EditText) findViewById(R.id.editText1);
	E2= (EditText) findViewById(R.id.editText2);
	E3= (EditText) findViewById(R.id.editText3);
	E4= (EditText) findViewById(R.id.editText4);
	E5= (EditText) findViewById(R.id.editText5);
	E6= (EditText) findViewById(R.id.editText6);
	
	tv1 = (TextView) findViewById(R.id.textView1);
	tv2 = (TextView) findViewById(R.id.textView2);
	tv3 = (TextView) findViewById(R.id.textView3);
	tv4 = (TextView) findViewById(R.id.textView4);
	tv5 = (TextView) findViewById(R.id.textView5);
	tv6 = (TextView) findViewById(R.id.textView6);
	
	B1 = (Button) findViewById(R.id.button1);
	B1.setOnClickListener(this);
	
}
@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	switch (v.getId()) {
	case R.id.button1:
	Intent f = new Intent(Edit.this,MainActivity797.class);
		
		
		String name = E1.getText().toString();
		String name1 = E2.getText().toString();
		String name2 = E3.getText().toString();
		String name3 = E4.getText().toString();
		String name4 = E5.getText().toString();
		String name5 = E6.getText().toString();
		
		
	//	ttt.setText(name);
	
		f.putExtra( "s1",name);
		f.putExtra( "s2",name1);
		f.putExtra( "s3",name2);
		f.putExtra( "s4",name3);
		f.putExtra( "s5",name4);
		f.putExtra( "s6",name5);
		
		startActivity(f);
		break;

	default:
		break;
	}
}
}
