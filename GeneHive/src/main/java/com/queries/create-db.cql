CREATE KEYSPACE Entries_Space with replication ={'class':'SimpleStrategy', 'replication_factor':3};
USE Entries_Space;

CREATE TABLE Entries (
    name text,
    identificationNumber text,
    countryCode text,
    dateOfBirth timestamp,
    dateOfDiagnosis timestamp,
    dateOfDeath timestamp,
    gender text,
    professionalExposure text,
    professionaExposureTime timestamp,
    details text,
    mutation text,
    locus text,
    disorder text,
    physician text,
    PRIMARY KEY (identificationNumber, mutation, countryCode)
) WITH
    comment='Patients with discovered entries' AND
    caching = 'NONE' AND
    compression={'sstable_compression': 'SnappyCompressor'};

CREATE TABLE Genes (
    geneCode text,
    geneName text,
    PRIMARY KEY (geneCode)
);


CREATE INDEX CountryIndex
   ON Entries_Space.Entries (countryCode);

CREATE INDEX GenderIndex
   ON Entries_Space.Entries (gender);

CREATE INDEX MutationIndex
   ON Entries_Space.Entries (mutation);

CREATE INDEX disorderIndex
   ON Entries_Space.Entries (disorder);

CREATE INDEX professionalExposureIndex
   ON Entries_Space.Entries (professionalExposure);

CREATE INDEX locusIndex
   ON Entries_Space.Entries (locus);



// Userfull queries
DROP TABLE Entries_Space.Entries;

select count(*) from entries_space.entries;
$ ./cqlsh 127.0.0.1 9042

select count(*) from Entries_Space.Entries where countryCode = 'RO' and gender = 'F' ALLOW FILTERING;

drop keyspace Entries;