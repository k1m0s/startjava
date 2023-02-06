DROP DATABASE IF EXISTS jaegers;

CREATE DATABASE jaegers;

\c jaegers

CREATE TABLE jaegers (
    id          SERIAL PRIMARY KEY,
    modelName   TEXT,
    mark        INTEGER,
    height      REAL,
    weight      REAL,
    status      TEXT,
    origin      TEXT,
    launch      CHAR(10),
    kaijuKill   INTEGER
);

\ir 'init_db.sql';
\ir 'queries.sql';