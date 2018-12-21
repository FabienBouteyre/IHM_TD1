package tlcom.td1;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager INSTANCE;

    private List<String> name;

    private DataManager(){
        name = new ArrayList<>();
    }

    public static DataManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public List<String> getName(){
        return name;
    }
    public void addName(String n ){
        this.name.add(n);
    }
}
