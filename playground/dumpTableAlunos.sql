DROP TABLE IF EXISTS ALUNOS;
CREATE TABLE ALUNOS(ID INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, NOME NOT NULL, CURSO NOT NULL);
INSERT INTO ALUNOS(ID,NOME,CURSO) VALUES('1','AILTON ANTONIO DE ARAUJO','PREPARATORIO SERPRO23'),('2','JOAO DA SILVA SAURO','PREPARATORIO DATAPREV');