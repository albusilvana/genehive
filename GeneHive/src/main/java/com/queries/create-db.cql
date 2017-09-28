CREATE KEYSPACE Entries_Space with replication ={'class':'SimpleStrategy', 'replication_factor':2};
USE Entries_Space;

CREATE TABLE Entries1 (
    name text,
    identificationNumber text,
    countryCode text,
    dateOfBirth timestamp,
    dateOfDiagnosis timestamp,
    dateOfDeath timestamp,
    gender text,
    professionalExposure text,
    professionalExposureTime bigint,
    details text,
    mutation text,
    locus text,
    disorder text,
    physician text,
    PRIMARY KEY (identificationNumber, mutation, countryCode)
) WITH
    comment='Patients with discovered entries' AND
    caching = {'keys': 'ALL', 'rows_per_partition': 'NONE'};




CREATE INDEX CountryIndex
   ON Entries_Space.Entries1 (countryCode);

CREATE INDEX GenderIndex1
   ON Entries_Space.Entries1 (gender);

CREATE INDEX MutationIndex
   ON Entries_Space.Entries1 (mutation);

CREATE INDEX disorderIndex
   ON Entries_Space.Entries1 (disorder);

CREATE INDEX professionalExposureIndex
   ON Entries_Space.Entries1 (professionalExposure);

CREATE INDEX locusIndex
   ON Entries_Space.Entries1 (locus);



// Userfull queries
DROP TABLE Entries_Space.Entries1;

select count(*) from entries_space.entries1;

 cd /usr/local/bin/
$ ./cqlsh 127.0.0.1 9042

select count(*) from Entries_Space.Entries where countryCode = 'RO' and gender = 'F' ALLOW FILTERING;

drop keyspace Entries;

truncate system_traces.events;
truncate system_traces.sessions;