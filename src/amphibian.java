
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditya
 */

class amphibian extends animal{
    
    private static final HashMap instances;
    
    static{
       instances = new HashMap(); 
    }
    
    amphibian(){
        this.species= "Amphibia";
        addToDB();
    }

    @Override
    public final void addToDB() {
        instances.put(this.hashCode(),this);
    }

    @Override
    public void removeFromDB() {
        instances.remove(this);
    }
    
    public amphibian getInstanceFromDB(int uniqueID) {
        return (amphibian) instances.get(uniqueID);
    }

    @Override
    public void assignCage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static public String display(){
        String labelText = new String();
	labelText = labelText + "Amphibians:\n";
        for (Object value : instances.values()) {
            labelText= labelText + "\n" + ((amphibian)value).hashCode();
        }
        return labelText;
    }
}
