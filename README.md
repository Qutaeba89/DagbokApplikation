DagBokApplikation<br>
Sql usename:dagbok_db<br>
sql password:REDACTED_DB_PASSWORD<br>

1- my plan for master key in application is Id for every dagbok user created. [X] <br>
2- create database in sql [X]<br>
3- start with creat dagbok class [X]<br>
  a. object id, rubrik, text, datum and deleted.[X]<br>
  b. add getter and sitter for them.[X]<br>
  c. connect it to sql by adding @Entity [X]<br>
  d. connect id to generate auto number [X]<br>
  e. create html to check if it everything works fine [X]<br>
4-creat Dagbokrepositry to tell the program to use CrudeRepositry  [X]<br>
  a. added query to make soft delete dagbok [ ]<br>
5-create dagbokcontroller [X]<br>
  a.connect it to repositry [X]<br>
  b.start with show all dagbok which is inside the database [X]<br>
    a. create html to check if it everything works fine [X]<br>
  c. create get new dag book and post save it in database [X]<br>
    a.create html to check if it everything works fine [X]<br>
  d.create get edit and post update it in database [ ]<br>
    a.create html to check if it everything works fine [ ]<br>
  e. ceate get delete and make it soft delete dagbok [ ]<br>
    a.create html to check if it everything works fine [ ]<br>
6- edit get show all by adding findNotDeleted to show dagbok which is not deleted [ ]<br>
