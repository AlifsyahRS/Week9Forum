

public class Genus {
    private String name;
    Genus(String g){
        name = g;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return "Genus: " + getName();
    }

}
