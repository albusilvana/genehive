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
    professionaExposureTime text,
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


CREATE INDEX Entries
   ON Entries_Space.Entries (countryCode);

   CREATE INDEX Entries
      ON Entries_Space.Entries (gender);

      CREATE INDEX Entries
         ON Entries_Space.Entries (mutationEntries);


select count(*) from entries_space.entries;
$ ./cqlsh 127.0.0.1 9042

select * from Entries_Space.Entries where countryCode = 255 and gender = 'F';

drop keyspace Entries;