package central;

import org.javalite.activejdbc.Model;

public class Cat extends Model {
    static{
        validatePresenceOf("name", "color");
    }
}