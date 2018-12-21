package tlcom.td1;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main extends AppCompatActivity implements View.OnClickListener {

    TextView textViewName;
    Button buttonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewName = findViewById(R.id.activity_main_textview_name);
        buttonName = findViewById(R.id.activity_main_button_name);

        buttonName.setOnClickListener(this);
    }

  /*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1){
            if (resultCode == RESULT_OK && data.getExtras() != null){
                Bundle args =data.getExtras();
                String name = args.getString("Username");
                textViewName.setText(name);
            } else {
                //handle error
            }
        }
    }
    */

    @Override
    protected void onResume() {
        super.onResume();
        String name = DataManager.getInstance().getName();
        textViewName.setText(name);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.activity_main_button_name:
                Intent intent= new Intent(this,editPage.class);
                startActivity(intent);
                break;
        }
    }

    private void initList(){
        final LinearLayoutManager linearLayoutManager = new L
    }
}
