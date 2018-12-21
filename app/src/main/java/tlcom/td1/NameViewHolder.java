package tlcom.td1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    TextView nom;

    public NameViewHolder (@NonNull View itemView){
        super(itemView);

        nom = itemView.findViewById(R.id.activity_editPage_editText);
    }


    public void setContent(String name){
        this.nom.setText(name);
    }

}