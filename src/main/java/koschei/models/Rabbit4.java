package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    @Autowired
    private Duck5 duck;

   /* @Autowired
    public void Rabbit4 (Needle7 needle) {
        this.needle = needle;
    }*/

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }

    @Autowired
    public void setDuck(Duck5 duck) {
        this.duck = duck;
    }
}
