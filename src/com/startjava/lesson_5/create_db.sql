CREATE DATABASE Jaegers;
CREATE TABLE Jaegers
(
    id SERIAL primary key,
    modelName text,
    mark text,
    height real,
    weight real,
    status text,
    origin text,
    launch DATE,
    kaijuKill int
);

