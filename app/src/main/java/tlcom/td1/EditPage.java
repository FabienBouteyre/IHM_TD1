package tlcom.td1;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EditPage extends AppCompatActivity {
    //textViewName = findViewById(R.id.activity_main_textview_name);
    //buttonName = findViewById(R.id.activity_main_button_name);
    //activity_editPage_editText

    TextInputEditText editText;
    Button savedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_page);

        initViews();
    }

    private void initViews(){
        editText = findViewById(R.id.activity_editPage_editText);
        savedButton = findViewById(R.id.activity_editPage_button);
        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
    }

    private void saveData(){
        //Intent intent= new Intent();
        //intent.putExtra("Username", editText.getText().toString());

        //setResult(RESULT_OK, intent);
        String name = editText.getText().toString();
        if (!name.isEmpty()){
            DataManager.getInstance().addName(name);
        } else {
            Toast.makeText(this, "Veuillez saisir votre nom", Toast.LENGTH_SHORT).show();
        }

        finish();
    }


}
