## activejdbc003_mysql

this is a 'hello world' project using gradle to load dependencies for activejdbc using mysql. It anticipates a local installation of mysql, a user called 'jdbc' and database called 'java_database', which user 'jdbc' has all privileges granted. There should be a table called cats with auto incrementing int column 'id', and text 'name' and 'color' columns. Sql commands to create these things are below.

Note: I had to set the timezone for mysql, the command for doing that included below.

select @@global.time_zone;

set global time_zone = 'America/Denver';

create user 'jdbc_user'@'localhost' identified by 'password123';

create database java_database;

grant all privileges on java_database.* to 'jdbc_user'@'localhost';

create table cats (id int not null auto_increment primary key, name text, color text);

--

run program, it should connect to the database and add a row to the 'cats' table. Query the 'cats' table and you should see the new entry.

use java_database;

select * from cats;
+----+---------+-------+
| id | name    | color |
+----+---------+-------+
|  1 | toodles | brown |
+----+---------+-------+
1 row in set (0.00 sec)
