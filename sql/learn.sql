
-- learning sql

-- this is a comment line

-- operations
\l -- list database
\c dbname -- connect database
\dn -- list schemas
\dt -- list tables in the default schema in search_path
\dt schema1.* -- list tables in the given schema
\dt *.* -- list all tables in all schemas
\d schema1.student -- show table definition
\d schema1.* -- show table definition for all the tables in schema1


-- CREATE TABLE
CREATE TABLE student (
id INT PRIMARY KEY NOT NULL,
name TEXT NOT NULL,
age INT NOT NULL
);


CREATE TABLE teacher (
id INT NOT NULL,
name TEXT NOT NULL,
age INT NOT NULL,

PRIMARY KEY (id)
);

CREATE TABLE hod (
id INT SERIAL,
name TEXT NOT NULL,
subject_id INT NOT NULL,

PRIMARY KEY (id)
);

-- ALERT TABLE
ALTER TABLE teacher ADD subject_id int;
ALTER TABLE teacher DROP COLUMN age;
Alter table teacher ALTER column class TYPE varchar;
Alter table teacher ALTER column class TYPE integer USING (id::integer);

INSERT INTO student (id, age, name) VALUES (1, 20, 'fury');
INSERT INTO hod (name, subject_id) VALUES ('Nirmala', 2); -- auto increment id column


-- get row from table;
SELECT * FROM student;

-- better to have limit, otherwise your query might return too many rows
SELECT * FROM student limit 50;
select id,name from student where id <= 9 limit 3;
select id,name from student fetch first 5 rows only;

-- this query returns only name & id values
SELECT name, id FROM student;

--WHERE clause:
-- returns the number of students whose age is more than 20.
select * from student where id>=3 and id<=7;
select * from student where age BETWEEN 20 AND 24;
select * from student where id<>4;
SELECT * from student where age IN (20, 25, 26);
SELECT * from student where name IN ('slay', 'saravanan');
select * from student where name like '%a' AND age = 25;
select * from student where name like '%a' OR  age = 25;
select * from student where NOT name like 's%';
select * from student WHERE (NOT(name like 's%' OR age >= 25)) AND age >= 20;
select name from subject where grade > 2 and description is not null; -- non null description rows are returned
select name from subject where description is null; -- null description rows are returned

-- ORDER BY
select * from student ORDER BY age; -- order ascending by default
select * from student ORDER BY name ASC; -- ascending
select * from student ORDER BY age DESC; -- descending
select * from student ORDER BY age, name; --multiple columns ascending
select * from student ORDER BY age DESC, name DESC; --multiple columns descending


-- UPDATE
UPDATE subject SET grade=3 WHERE name='tamil';
UPDATE subject SET grade=1,description='descr' WHERE id<5;

-- DELETE
DELETE FROM student WHERE id=7;

-- TRUNCATE
TRUNCATE TABLE book; -- deletes the values in a table


-- MIN, MAX
select MIN(age) from student;
select MIN(age), MIN(id)  from student;
select MIN(age) as min_age, MIN(id) as min_id from student;
select MAX(age) from student;
select MAX(age) as max_age, MIN(id) as min_id from student;

-- this query returns the distinct age from the student table.
sElECT DIsTinct age FrOm student;

-- returns the count of rows
SELECT COUNT(*) FROM student;
select COUNT(*) from student WHERE age > 20;

-- return the count of distinct names in the student table.
SELECT COUNT(DISTINCT name) FROM student;

-- AVERAGE, SUM
select AVG(age) from student;
select AVG(age) from student WHERE age >= 20;
select SUM(age) from student WHERE age >= 20;


-- LIKE
select * from student where name LIKE 's%';
select * from student where name like '%ay';
select name from student where name like '%a%';
select * from student where name like '__a%';
select * from student where name like '%a%y';


-- JOIN
SELECT teacher.id, teacher.name as teacher_name, subject.name as subject_name FROM teacher INNER JOIN subject ON teacher.subject_id=subject.id; -- INNER JOIN

SELECT teacher.id, teacher.name as teacher_name, subject.name as subject_name FROM teacher LEFT JOIN subject ON teacher.subject_id=subject.id; -- LEFT JOIN

SELECT teacher.id, teacher.name as teacher_name, subject.name as subject_name FROM teacher RIGHT JOIN subject ON teacher.subject_id=subject.id; -- RIGHT JOIN

SELECT teacher.id, teacher.name as teacher_name, subject.name as subject_name FROM teacher FULL JOIN subject ON teacher.subject_id=subject.id; -- OUTER JOIN

SELECT teacher.id, teacher.name as teacher_name, subject.name as subject_name
, hod.name as hod_name
FROM 
((teacher LEFT JOIN subject ON subject.id=teacher.subject_id) 
LEFT JOIN hod ON subject.id=hod.subject_id); -- THREE TABLES


select a.name as t1, b.name as t2, b.class from teacher a, teacher b where a.id<>b.id AND a.class=b.class; -- SELF JOIN

-- UNION
select class from teacher UNION select class from subject order by class; --classes in the school
select class from teacher UNION ALL select class from subject order by class; -- UNION ALL
select class, section from teacher where class=12 UNION select class, section from subject where class=12 order by section;

-- GROUP BY
select COUNT(class), name from subject GROUP BY name;
select subject.name, count(teacher.id) as teacher_count from subject left join teacher on teacher.subject_id=subject.id group by subject.name;

-- HAVING
select subject.name, count(teacher.id) as teacher_count from subject left join teacher on teacher.subject_id=subject.id group by subject.name having count(teacher.id) > 0;

-- SELECT, COUNT, JOIN, GROUP BY, HAVING, ORDER BY, LIMIT
SELECT subject.name, COUNT(teacher.id) AS teacher_count FROM subject LEFT JOIN teacher ON teacher.subject_id=subject.id GROUP BY subject.name HAVING COUNT(teacher.id) > 0 ORDER BY teacher_count ASC, name ASC LIMIT 2;

--EXISTS
select name from subject where EXISTS (select name from teacher where teacher.subject_id=subject.id and class >= 10);

-- SUB-QUERY
SELECT * from teacher where subject_id in (select id from subject where grade > 1);
INSERT INTO grade_teacher SELECT * from teacher where subject_id in (select id from subject where grade > 1);
UPDATE teacher SET salary=30000 WHERE subject_id in (select id from subject where grade > 1);

-- STORED PROCEDURE


-- TRANSACTION
-- BEGIN TRANSACTION, BEGIN, COMMIT, END TRANSACTION, ROLLBACK
BEGIN;
INSERT INTO book (name, subject_id) VALUES ('Geeky Publications', 3);
INSERT INTO book (name, subject_id) VALUES ('Geeky Publications', 4);
ROLLBACK;

BEGIN;
DELETE FROM book WHERE subject_id=2;
DELETE FROM book WHERE subject_id=3;
COMMIT;

-- PRIVILEGE
-- syntax: GRANT privilege[, ...] ON object[, ...] TO {PUBLIC | GROUP groupName | username}
-- privilege: SELECT, INSERT, UPDATE, DELETE, RULE, ALL
-- object: table, view, sequence
CREATE USER nila WITH PASSWORD 'password';
GRANT ALL ON student TO nila;
SET ROLE nila;
REVOKE ALL ON student, teacher FROM nila;
DROP USER nila;

-- MISC
SHOW search_path;
SET search_path TO schema1;
select * from public.student;
SET search_path TO public, schema1;
DROP SCHEMA schema1; -- Won't delete if there are objects inside the schema
DROP SCHEMA schema1 CASCADE; -- delete schema and the contents
CREATE VIEW teacher_data TEMP AS SELECT name,class from teacher; -- create a VIEW
CREATE TEMP VIEW teacher_data AS SELECT name,class from teacher; -- create a temporary view
DROP VIEW teacher_data; -- drops a view
SELECT CURRENT_TIME;
SELECT CURRENT_DATE;
SELECT CURRENT_TIMESTAMP;
SELECT CURRENT_TIMESTAMP(2);
SELECT LOCALTIMESTAMP;
SELECT date_part('day', TIMESTAMP '2022-11-11 08:04:46');
SELECT date_trunc('year', TIMESTAMP '2022-11-11 08:04:46');
SELECT EXTRACT(CENTURY FROM TIMESTAMP '1898-11-11 08:04:46');
SELECT isfinite(timestamp '987-11-11');
SELECT isfinite(interval '2 hours');
SELECT justify_hours(interval '49 hours 70 minutes');
SELECT AGE(timestamp '2022-11-11 10:30', timestamp '2001-01-01 22:13');





















