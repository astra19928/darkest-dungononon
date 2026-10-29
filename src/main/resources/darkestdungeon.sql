DROP DATABASE IF EXISTS darkestdungeon;
CREATE DATABASE darkestdungeon;
USE darkestdungeon;

CREATE TABLE heroi(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(20),
    classe VARCHAR(15)
);

CREATE TABLE arma(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	id_heroi INT,
	nome VARCHAR(30),
    descricao VARCHAR(100),
    poder INT NOT NULL,
    foreign key(id_heroi) references heroi(id)
);

CREATE TABLE skill(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    id_heroi INT,
    nome VARCHAR(30),
    descricao VARCHAR(50)
);

CREATE TABLE quirk(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30),
    efeito VARCHAR(50)
);

CREATE TABLE quirk_heroi(
	id_heroi INT NOT NULL,
    id_quirk INT NOT NULL,
    FOREIGN KEY(id_heroi) REFERENCES heroi(id),
    FOREIGN KEY(id_quirk) REFERENCES quirk(id),
    PRIMARY KEY(id_heroi, id_quirk)
);