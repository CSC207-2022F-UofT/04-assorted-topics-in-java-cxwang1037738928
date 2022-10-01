/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.*;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */
    public boolean addDrivable(String id, Drivable obj){
        if(((drivable_map.get(id)) == null)){
            drivable_map.put(id, obj);
            return true;
        }
        return false;
    }



    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */
    public boolean hasFasterThan(int speed){
        Object[] all_driv = drivable_map.values().toArray();
        for(int i = 0; i<= all_driv.length - 1; i+= 1) {
            if (((Drivable) all_driv[i]).getMaxSpeed() >= speed) {
                return true;
            }
        }
        return false;
    }





    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */
    public List<Tradable> getTradable() {
        ArrayList<Tradable> trade_able = new ArrayList<Tradable>();
        Object[] all_driv = drivable_map.values().toArray();
        for(int i = 0; i<= all_driv.length - 1; i+= 1){
            if(all_driv[i] instanceof Tradable){
                trade_able.add((Tradable) all_driv[i]);
            }
        }
        return trade_able;
    }



    
}