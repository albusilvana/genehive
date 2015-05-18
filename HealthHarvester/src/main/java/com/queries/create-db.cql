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
    professionalExposures text,
    details text,
    mutationEntries text,
    physician text,
    PRIMARY KEY (identificationNumber, mutationEntries, countryCode)
) WITH
    comment='Patients with discovered entries' AND
    caching = 'NONE' AND
    compression={'sstable_compression': 'SnappyCompressor'};

CREATE TABLE Genes (
    geneCode text,
    geneName text,
    PRIMARY KEY (geneCode)
);

select * from entries_space.entries;