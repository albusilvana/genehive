CREATE KEYSPACE mykeyspace
WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };


CREATE TABLE patients (
  user_id int PRIMARY KEY,
  fname text,
  lname text
);

INSERT INTO
patients
(user_id, fname, lname)  VALUES (1745, 'john', 'smith'); INSERT INTO
patients
(user_id, fname, lname)  VALUES (1744, 'john', 'doe'); INSERT INTO
patients
(user_id, fname, lname)  VALUES (1746, 'john', 'smith');
SELECT * FROM
patients
;

CREATE INDEX ON
patients
(lname);  SELECT * FROM patients WHERE lname = 'smith';