
package KTGK;

import java.util.Vector;

abstract class Switcher implements Switchable {
    public Vector devide[];
    public boolean state;
    public Switcher(boolean state){
        this.state=state;
    }
    
}
