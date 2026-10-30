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

INSERT INTO heroi (nome, classe) VALUES
("Dismas", "Salteador"),
("Pithou", "Leproso"),
("Reynauld", "Cruzado"),
("Paracelsus", "Doutor da Peste");

INSERT INTO arma (id_heroi, nome, descricao, poder) VALUES
(1, "Pederneira & Adaga", "Uma adaga enferrujada e pistola antiquada", 5),
(2, "Espada Partida", "Uma espada pesada com história", 13),
(3, "Montante Gasta", "Uma espada padrão para cruzados", 6),
(4, "Granadas Tóxicas", "Preparos letais de uma mente excêntrica", 6);

INSERT INTO skill (id_heroi, nome, descricao) VALUES
(1, "Tiro de Pistola", "Atira com sua pederneira"),
(1, "Abrir Veia", "Corta rapidamente com sua adaga"),
(2, "Corte", "Lança um golpe com todo o peso da espada"),
(2, "Intimidação", "Ameaça um inimigo com seu porte e aparência"),
(3, "Golpe Castigador", "Castiga inimigos impuros com sua espada"),
(3, "Lança Sagrada", "Desfere um golpe veloz que o movimenta"),
(4, "Remédio Herbal", "Medica seus parceiros do que os afligem"),
(4, "Arremesso de Granada", "Lança uma granada envenenada");

INSERT INTO quirk (nome, efeito) VALUES
("Cleptomaníaco", "Rouba itens ocasionalmente"),
("Temerário", "Reflexos aguçados pelo risco"),
("Morte nos olhos", "Mais afetado por estar perto da morte"),
("Compulsão", "Pode interagir automaticamente com itens"),
("Retirante", "Não se incomoda de precisar recuar"),
("Claustrofóbico", "Tem medo de espaços fechados"),
("Invicto", "Mesmo no seu limite, pode voltar ainda melhor"),
("Desastrado", "Ruim de desviar de golpes"),
("Inadequado", "Desiste de agir mais facilmente"),
("Hipocrático", "Habilidoso em medicar seus parceiros");

INSERT INTO quirk_heroi (id_heroi, id_quirk) VALUES
(1, 1),
(1, 2),
(2, 6),
(2, 7),
(2, 2),
(3, 5),
(3, 8),
(4, 3),
(4, 4),
(4, 10);
