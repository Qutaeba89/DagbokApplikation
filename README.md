DagBokApplikation
Sql usename:dagbok_db
sql password:REDACTED_DB_PASSWORD

1- my plan for master key in application is Id for every dagbok user created. [ ] <br>
2- create database in sql [ ]<br>
3- start with creat dagbok class with [ ]<br>
  a. object id, rubrik, text, datum and deleted.[ ]<br>
  b. add getter and sitter for them.[ ]<br>
  c. connect it to sql by adding @Entity [ ]<br>
  d. connect id to generate auto number [ ]<br>
  e. create html to check if it everything works fine [ ]<br>
4-creat Dagbokrepositry to tell the program to use CrudeRepositry  [ ]<br>
  a. added query to make soft delete dagbok [ ]<br>
5-create dagbokcontroller [ ]<br>
  a.connect it to repositry [ ]<br>
  b.start with show all dagbok which is inside the database [ ]<br>
    a. create html to check if it everything works fine [ ]<br>
  c. create get new dag book and post save it in database [ ]<br>
    a.create html to check if it everything works fine [ ]<br>
  d.create get edit and post update it in database [ ]<br>
    a.create html to check if it everything works fine [ ]<br>
  e. ceate get delete and make it soft delete dagbok [ ]<br>
    a.create html to check if it everything works fine [ ]<br>
6- edit get show all by adding findNotDeleted to show dagbok which is not deleted [ ]<br>
