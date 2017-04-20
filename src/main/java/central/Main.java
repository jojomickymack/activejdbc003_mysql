package central;

import org.javalite.activejdbc.Base;

public class Main {
    public static void main(String[] args) {
        Base.open("com.mysql.cj.jdbc.Driver", "jdbc:mysql://localhost/java_database?useSSL=false&nullNamePatternMatchesAll=true", "jdbc_user", "password123");

        Cat cat = new Cat();
        cat.set("name", "toodles");
        cat.set("color", "brown");
        cat.saveIt();
    }
}



