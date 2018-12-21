package tlcom.td1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity implements View.OnClickListener {

    //TextView textViewName;
    private RecyclerView recyclerView;
    private Button buttonName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonName = findViewById(R.id.activity_main_button_name);
        buttonName.setOnClickListener(this);

        initList();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //String name = DataManager.getInstance().getName();
        //textViewName.setText(name);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.activity_main_button_name:
                Intent intent= new Intent(this,EditPage.class);
                startActivity(intent);
                break;
        }
    }

    private void initList(){
        recyclerView = findViewById(R.id.activity_main_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new NameListAdapter());
    }
}
