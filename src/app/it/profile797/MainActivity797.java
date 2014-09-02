package app.it.profile797;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity797 extends Activity implements OnClickListener{
private TextView one;
private Button a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout797);
        kookkik ();
    }
	private void kookkik() {
		// TODO Auto-generated method stub
		one = (TextView) findViewById(R.id.textView1);
		a = (Button) findViewById(R.id.button2);
		
		a.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button2:
			Intent s = new Intent(MainActivity797.this,KIK.class);
			startActivity(s);
			break;
		case R.id.button1:
			
			break;

		default:
			break;
		}
		
	}
}
