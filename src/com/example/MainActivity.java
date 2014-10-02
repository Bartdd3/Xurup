package com.example;

import android.support.v7.app.ActionBarActivity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        
        String[] atividades = new String[]{"atividade 1","atividade 2","sair"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, atividades);
        setListAdapter(adapter);
        
        
        
    }
    
    
    
    @Override     public void onListItemClick(ListView l, View v, int position, long id) { 
    	// Do something when a list item is clicked    }
    	Intent intent;
    	switch(position){
    	
    	case 0:
    		intent = new Intent(this,atividade1.class);
    		startActivity(intent);
    		break;
    	case 1:
    		intent = new Intent(this,atividade2.class);
    		startActivity(intent);	
    		break;
    	default:    		
    		finish();		
    	
    	}
    	
    	
    	
    	
    	/*
    	super.onListItemClick(l, v, position, id);
    	
    	
    	Object o = this.getListAdapter().getItem(position);
    	String item = o.toString();
    	Toast.makeText(this, item+" - "+position+" - "+id, Toast.LENGTH_LONG).show();*/
    }
    
    /*
    public void AcessarAtividade1(View view){
    	
    	Intent intent = new Intent(this,atividade1.class);
    	startActivity(intent);
    	
    }
    
    public void AcessarAtividade2(View view){
    	
    	Intent intent = new Intent(this,atividade2.class);
    	startActivity(intent);
    	
    }
    
    public void Sair(View view){
    	
    	finish();
    	
    }*/

   

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
