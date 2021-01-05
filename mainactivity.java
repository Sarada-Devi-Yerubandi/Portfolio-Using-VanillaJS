private static final String[] Items = {"youTube Video", "PPT (from google drive)", "Pdf (from google drive)","html"};
public void SetSpinner()
{   
	spinner = findViewById(R.id.spinner1);
	ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,  android.R.layout.simple_spinner_item, Items);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinner.setAdapter(adapter);
	spinner.setOnItemSelectedListener(this);
}
@Override
public void onItemSelected(AdapterView<?> parent, View v, int position, long id)
{  
	uriKey = et.getText().toString();
	Toast.makeText(getApplicationContext(),String.valueOf(spinner.getSelectedItem()),Toast.LENGTH_LONG).show();
	switch (position) 
	{
		case 0:    break;
		case 1:   uriPath = "https://www.youtube.com/embed/" + uriKey;     break;
		case 2:   uriPath = "https://docs.google.com/presentation/d/" + uriKey+"/preview";   break;
		case 3:   uriPath = "https://docs.google.com/file/d/" + uriKey+"/preview";       break;
		case 4:   uriPath = uriKey;         break;
	}
}
@Override
public void onNothingSelected(AdapterView<?> parent) {
	// TODO Auto-generated method stub
}