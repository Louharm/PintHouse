delete from Beer;
delete from Translation_Beer_Type;
delete from Translation_Beer_Color;
delete from Translation_Brewery;
delete from Translation_Country;
delete from Language;
delete from User;
delete from City;
delete from Country;
delete from Brewery;
delete from Beer_Color;
delete from Beer_Type;

INSERT INTO Language (name) VALUES ('fr');
INSERT INTO Language (name) VALUES ('en');

INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Germany','en',1);
INSERT INTO Translation_Country (name, Language, item) VALUES('Allemagne','fr',1);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Austria','en',2);
INSERT INTO Translation_Country (name, Language, item) VALUES('Autriche','fr',2);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Belgium','en',3);
INSERT INTO Translation_Country (name, Language, item) VALUES('Belgique','fr',3);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Bulgaria','en',4);
INSERT INTO Translation_Country (name, Language, item) VALUES('Bulgarie','fr',4);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Cyprus','en',5);
INSERT INTO Translation_Country (name, Language, item) VALUES('Chypre','fr',5);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Croatia','en',6);
INSERT INTO Translation_Country (name, Language, item) VALUES('Croatie','fr',6);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Denmark','en',7);
INSERT INTO Translation_Country (name, Language, item) VALUES('Danemark','fr',7);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Spain','en',8);
INSERT INTO Translation_Country (name, Language, item) VALUES('Espagne','fr',8);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Estonia','en',9);
INSERT INTO Translation_Country (name, Language, item) VALUES('Estonie','fr',9);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Finland','en',10);
INSERT INTO Translation_Country (name, Language, item) VALUES('Finlande','fr',10);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('France','en',11);
INSERT INTO Translation_Country (name, Language, item) VALUES('France','fr',11);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Greece','en',12);
INSERT INTO Translation_Country (name, Language, item) VALUES('Grèce','fr',12);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Hungary','en',13);
INSERT INTO Translation_Country (name, Language, item) VALUES('Hongrie','fr',13);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Ireland','en',14);
INSERT INTO Translation_Country (name, Language, item) VALUES('Irlande','fr',14);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Italy','en',15);
INSERT INTO Translation_Country (name, Language, item) VALUES('Italie','fr',15);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Latvia','en',16);
INSERT INTO Translation_Country (name, Language, item) VALUES('Lettonie','fr',16);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Lithuania','en',17);
INSERT INTO Translation_Country (name, Language, item) VALUES('Lituanie','fr',17);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Luxembourg','en',18);
INSERT INTO Translation_Country (name, Language, item) VALUES('Luxembourg','fr',18);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Malta','en',19);
INSERT INTO Translation_Country (name, Language, item) VALUES('Malte','fr',19);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Norway','en',20);
INSERT INTO Translation_Country (name, Language, item) VALUES('Norvège','fr',20);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Netherlands','en',21);
INSERT INTO Translation_Country (name, Language, item) VALUES('Pays-Bas','fr',21);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Poland','en',22);
INSERT INTO Translation_Country (name, Language, item) VALUES('Pologne','fr',22);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Portugal','en',23);
INSERT INTO Translation_Country (name, Language, item) VALUES('Portugal','fr',23);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Romania','en',24);
INSERT INTO Translation_Country (name, Language, item) VALUES('Roumanie','fr',24);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('United Kingdom','en',25);
INSERT INTO Translation_Country (name, Language, item) VALUES('Royaume-Uni','fr',25);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Slovakia','en',26);
INSERT INTO Translation_Country (name, Language, item) VALUES('Slovaquie','fr',26);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Slovenia','en',27);
INSERT INTO Translation_Country (name, Language, item) VALUES('Slovénie','fr',27);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Sweden','en',28);
INSERT INTO Translation_Country (name, Language, item) VALUES('Suède','fr',28);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Switzerland','en',29);
INSERT INTO Translation_Country (name, Language, item) VALUES('Suisse','fr',29);
INSERT INTO Country VALUES();
INSERT INTO Translation_Country (name, Language, item) VALUES('Czechia','en',30);
INSERT INTO Translation_Country (name, Language, item) VALUES('Tchéquie','fr',30);

INSERT INTO City (name, postCode, Country) VALUES ('Barvaux', '6940', 3);

INSERT INTO User (lastName, firstName, password, email, street, numhouseBox, phoneNumber, CityId, authorities, non_expired, non_locked, credentials_non_expired, enabled) 
	VALUES ('Delaive','Benjamin', '$2a$10$6CMz3BnY21aIN6eaI9K8bOBdom697QmXU6O/iSdqOFj3K.RUGQY.u', 'etu41778@henallux.be', 'Avenue des Tilleuls',54,'+32 496/94.80.92',1,'ROLE_ADMIN',1,1,1,1);
-- mot de passe = password
INSERT INTO City (name, postCode, Country) VALUES ('Bovesse', '5081', 3);
INSERT INTO User (lastName, firstName, password, email, street, numhouseBox, phoneNumber, CityId, authorities, non_expired, non_locked, credentials_non_expired, enabled) 
	VALUES ('Harmand Pierard','Louise', '$2a$10$l928MI5t4KVYKM2XYkGbzeHszIvhWpyl9YEJs5fKcopL8A9vDvSNO', 'etu39951@henallux.be', 'Rue de Temploux',6,'+32 476/91.87.88',2,'ROLE_ADMIN',1,1,1,1);
-- mot de passe = password

INSERT INTO Beer_Color () VALUES ();
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Blond','en',1);
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Blonde','fr',1);
INSERT INTO Beer_Color () VALUES ();
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Amber','en',2);
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Ambrée','fr',2);
INSERT INTO Beer_Color () VALUES ();
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Red','en',3);
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Rousse','fr',3);
INSERT INTO Beer_Color () VALUES ();
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Dark','en',4);
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Brune','fr',4);
INSERT INTO Beer_Color () VALUES ();
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Black','en',5);
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('noire','fr',5);
INSERT INTO Beer_Color () VALUES ();
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('White','en',6);
INSERT INTO Translation_Beer_Color (name, Language, item) VALUES ('Blanche','fr',6);

INSERT INTO Beer_Type () VALUES ();
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Abbey','en',1);
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Abbaye','fr',1);
INSERT INTO Beer_Type () VALUES ();
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Tripler','en',2);
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Triple','fr',2);
INSERT INTO Beer_Type () VALUES ();
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Trappist','en',3);
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Trappiste','fr',3);
INSERT INTO Beer_Type () VALUES ();
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Fruity','en',4);
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Fruité','fr',4);
INSERT INTO Beer_Type () VALUES ();
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('High fermentation','en',5);
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Haute fermentation','fr',5);
INSERT INTO Beer_Type () VALUES ();
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Pils','en',6);
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Pils','fr',6);
INSERT INTO Beer_Type () VALUES ();
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Table','en',7);
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Table','fr',7);
INSERT INTO Beer_Type () VALUES ();
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Doppelbock','en',8);
INSERT INTO Translation_Beer_Type (name, Language, item) VALUES ('Doppelbock','fr',8);

INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Jupiler Brewery','en',1);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Brasserie Jupiler','fr',1);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Duvel Brewery','en',2);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Brasserie Duvel','fr',2);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Artois Brewery','en',3);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Brasserie Artois','fr',3);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Bosteels Brewery','en',4);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Brasserie Bosteels','fr',4);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Achouffe Brewery','en',5);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Brasserie d\'Achouffe','fr',5);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Notre-Dame de Scourmont abbey','en',6);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Abbaye Notre-Dame de Scourmont','fr',6);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Cistercian abbey','en',7);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Abbaye cistercienne','fr',7);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Bockor Brewery','en',8);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Brasserie Bockor','fr',8);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Grimbergen abbey','en',9);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Abbaye de Grimbergen','fr',9);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Orval Brewery','en',10);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Brasserie d\'Orval','fr',10);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Lindemans','en',11);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Lindemans','fr',11);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Van Honsebrouck Brewery','en',12);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Brasserie Van Honsebrouck','fr',12);
INSERT INTO Brewery () VALUES ();
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Ayinger Brewery','en',13);
INSERT INTO Translation_Brewery (name, Language, item) VALUES ('Brasserie Ayinger','fr',13);

INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('JUPILER','5.2', 25, 0.5, 1, 3, 6, 1);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('DUVEL bière blonde','8.5', 33, 0.8, 2, 3, 5, 1);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('DUVEL Tripel hop citra','9.5', 33, 0.84, 2, 3, 5, 1);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('STELLA ARTOIS pils','5.2', 25, 0.7, 3, 3, 6, 1);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('LEFFE blonde','6.6', 33, 0.75, 3, 3, 1, 1);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('TRIPEL KARMELIET','8.4', 33, 0.85, 4, 3, 5, 1);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('LA CHOUFFE bière blonde','8.0', 33, 0.75, 5, 3, 2, 1);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('CHIMAY bleu',9, 33, 0.7, 6, 3, 3, 4);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('CHIMAY trappiste triple',8, 33, 0.68, 6, 3, 3, 1);
INSERT INTO Beer (name, description, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('WESTMALLE trappiste trip','Il est préférable de conserver la bière debout à l\'abri de la lumière, à une température constante de 8 à 14 °C. Laissez la bouteille reposer pendant au moins une semaine avant de la servir. Ainsi, la levure descend dans le fond de la bouteille et la bière que vous verserez dans le verre sera limpide.','9.5', 33, 0.85, 7, 3, 3, 1);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('OMER Blonde',8, 33, 0.6, 8, 3, 3, 1);
INSERT INTO Beer (name, description, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('PIEDBOEUF Brune','Conserver dans un endroit frais et sombre','1.1', 33, 0.6, 1, 3, 7, 4);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('GRIMBERGEN bière abb. bl.','6.7', 33, 0.7, 9, 3, 1, 1);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('ORVAL trappiste','6.2', 33, 0.56, 10, 3, 3, 2);
INSERT INTO Beer (name, description,alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('LINDEMANS kriek','Gout : cerise','3.5', 25, 0.47, 11, 3, 4, 6);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('KASTEEL bière rouge',8, 33, 0.58, 12, 3, 4, 6);
INSERT INTO Beer (name, alcoholPerc, capaCityCl, price, Brewery, Country, Beer_Type, Beer_Color) 
	VALUES ('Ayinger Celebrator Doppelbock', 6.7, 33, 2.5, 13, 1, 8, 4);