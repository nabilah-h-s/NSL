PSQL command
## Create Database :
```sql
CREATE DATABASE databaseName;
```
## Create Table :
```sql
CREATE TABLE tableName (
 fieldName dataType, --comment if needed
 ... ... ... ...
); 
```
## Drop Table :
```sql
DROP TABLE tableName;
```
## Populating Values :
```sql
INSERT INTO tableName VALUES (serially all values here);
INSERT INTO weather (the fields we want to insert the vales)VALUES (the values of respective field);
```

## Quering a table :
```sql
SELECT * FROM tableName;
```
## Example :
```sql
CREATE DATABASE testDB;
CREATE TABLE weather (
 city varchar(80),
 temp_lo int, -- low temperature
 temp_hi int, -- high temperature
 prcp real, -- precipitation
 date date
); 

CREATE TABLE cities (
 name varchar(80),
 location point
);

DROP TABLE cities;

INSERT INTO weather VALUES ('San Francisco', 46, 50, 0.25,'1994-11-27');
INSERT INTO weather (city, temp_lo, temp_hi, prcp, date) VALUES ('San Francisco', 43, 57, 0.0, '1994-11-29');
INSERT INTO weather (date, city, temp_hi, temp_lo) VALUES ('1994-11-29', 'Hayward', 54, 37);


SELECT * FROM weather;

```