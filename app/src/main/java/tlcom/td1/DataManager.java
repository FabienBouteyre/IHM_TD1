package tlcom.td1;

public class DataManager {
    private static DataManager INSTANCE;
    private String name;

    private DataManager(){

    }

    public static DataManager getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DataManager();
        }
        return INSTANCE;
    }

    public String getName(){
        return name;
    }
    public void setName(String n ){
        name=n;
    }
}
