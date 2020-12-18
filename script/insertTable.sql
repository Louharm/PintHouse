delete from beer;
delete from brewery;
delete from user;
delete from city;
delete from country;
delete from beercolor;
delete from beertype;

INSERT INTO country (nameFr, nameEn) VALUES ('Allemagne','Germany');
INSERT INTO country (nameFr, nameEn) VALUES ('Autriche','Austria');
INSERT INTO country (nameFr, nameEn) VALUES ('Belgique','Belgium');
INSERT INTO country (nameFr, nameEn) VALUES ('Bulgarie','Bulgaria');
INSERT INTO country (nameFr, nameEn) VALUES ('Chypre','Cyprus');
INSERT INTO country (nameFr, nameEn) VALUES ('Croatie','Croatia');
INSERT INTO country (nameFr, nameEn) VALUES ('Danemark','Denmark');
INSERT INTO country (nameFr, nameEn) VALUES ('Espagne','Spain');
INSERT INTO country (nameFr, nameEn) VALUES ('Estonie','Estonia');
INSERT INTO country (nameFr, nameEn) VALUES ('Finlande','Finland');
INSERT INTO country (nameFr, nameEn) VALUES ('France','France');
INSERT INTO country (nameFr, nameEn) VALUES ('Grèce','Greece');
INSERT INTO country (nameFr, nameEn) VALUES ('Hongrie','Hungary');
INSERT INTO country (nameFr, nameEn) VALUES ('Irlande','Ireland');
INSERT INTO country (nameFr, nameEn) VALUES ('Italie','Italy');
INSERT INTO country (nameFr, nameEn) VALUES ('Lettonie','Latvia');
INSERT INTO country (nameFr, nameEn) VALUES ('Lituanie','Lithuania');
INSERT INTO country (nameFr, nameEn) VALUES ('Luxembourg','Luxembourg');
INSERT INTO country (nameFr, nameEn) VALUES ('Malte','Malta');
INSERT INTO country (nameFr, nameEn) VALUES ('Norvège','Norway');
INSERT INTO country (nameFr, nameEn) VALUES ('Pays-Bas','Netherlands');
INSERT INTO country (nameFr, nameEn) VALUES ('Pologne','Poland');
INSERT INTO country (nameFr, nameEn) VALUES ('Portugal','Portugal');
INSERT INTO country (nameFr, nameEn) VALUES ('Roumanie','Romania');
INSERT INTO country (nameFr, nameEn) VALUES ('Royaume-Uni','United Kingdom');
INSERT INTO country (nameFr, nameEn) VALUES ('Slovaquie','Slovakia');
INSERT INTO country (nameFr, nameEn) VALUES ('Slovénie','Slovenia');
INSERT INTO country (nameFr, nameEn) VALUES ('Suède','Sweden');
INSERT INTO country (nameFr, nameEn) VALUES ('Suisse','Switzerland');
INSERT INTO country (nameFr, nameEn) VALUES ('Tchéquie','Czechia');

INSERT INTO city (name, postCode, countryName) VALUES ('Barvaux', '6940', 'Belgium');

INSERT INTO user (lastName, firstName, password, email, street, numHouse, phoneNumber, cityId, authorities, non_expired, non_locked, credentials_non_expired, enabled) 
	VALUES ('Delaive','Benjamin', '$2a$10$6CMz3BnY21aIN6eaI9K8bOBdom697QmXU6O/iSdqOFj3K.RUGQY.u', 'etu41778@henallux.be', 'Avenue des Tilleuls',54,'+32 496/94.80.92',1,'ROLE_ADMIN',1,1,1,1);
-- mot de passe = password
INSERT INTO city (name, postCode, countryName) VALUES ('Bovesse', '5081', 'Belgium');
INSERT INTO user (lastName, firstName, password, email, street, numHouse, phoneNumber, cityId, authorities, non_expired, non_locked, credentials_non_expired, enabled) 
	VALUES ('Harmand Pierard','Louise', '$2a$10$l928MI5t4KVYKM2XYkGbzeHszIvhWpyl9YEJs5fKcopL8A9vDvSNO', 'etu39951@henallux.be', 'Rue de Temploux',6,'+32 476/91.87.88',2,'ROLE_ADMIN',1,1,1,1);
-- mot de passe = password

INSERT INTO beercolor (nameEn, nameFr) VALUES ('blond','blonde');
INSERT INTO beercolor (nameEn, nameFr) VALUES ('amber','ambrée');
INSERT INTO beercolor (nameEn, nameFr) VALUES ('red','rousse');
INSERT INTO beercolor (nameEn, nameFr) VALUES ('dark','brune');
INSERT INTO beercolor (nameEn, nameFr) VALUES ('black','noire');
INSERT INTO beercolor (nameEn, nameFr) VALUES ('white','blanche');

INSERT INTO beertype (nameEn, nameFr) VALUES ('abbey','abbaye');
INSERT INTO beertype (nameEn, nameFr) VALUES ('tripler','triple');
INSERT INTO beertype (nameEn, nameFr) VALUES ('trappist','trappiste');
INSERT INTO beertype (nameEn, nameFr) VALUES ('fruity','fruité');
INSERT INTO beertype (nameEn, nameFr) VALUES ('high fermentation','haute fermentation');
INSERT INTO beertype (nameEn, nameFr) VALUES ('pils','pils');
INSERT INTO beertype (nameEn, nameFr) VALUES ('table','table');

INSERT INTO brewery (nameEn, nameFr) VALUES ('Jupiler brewery','Brasserie Jupiler');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Duvel brewery','Brasserie Duvel');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Artois brewery','Brasserie Artois ');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Bosteels brewery','Brasserie Bosteels');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Achouffe brewery','Brasserie d\'Achouffe');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Notre-Dame de Scourmont abbey','abbaye Notre-Dame de Scourmont');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Cistercian abbey','Abbaye cistercienne');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Bockor brewery','Brasserie Bockor');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Grimbergen abbey','Abbaye de Grimbergen');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Orval brewery','Brasserie d\'Orval');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Lindemans', 'Lindemans');
INSERT INTO brewery (nameEn, nameFr) VALUES ('Van Honsebrouck brewery', 'Brasserie Van Honsebrouck');

INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('JUPILER','5.2', 25, 0.5, 'Jupiler brewery', 'Belgium', 'pils', 'blond');
INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('DUVEL bière blonde','8.5', 33, 0.8, 'Duvel brewery', 'Belgium', 'high fermentation', 'blond');
INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('DUVEL Tripel hop citra','9.5', 33, 0.84, 'Duvel brewery', 'Belgium', 'high fermentation', 'blond');
INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('STELLA ARTOIS pils','5.2', 25, 0.7, 'Artois brewery', 'Belgium', 'pils', 'blond');

INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('LEFFE blonde','6.6', 33, 0.75, 'Artois brewery', 'Belgium', 'abbey', 'blond');
INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('TRIPEL KARMELIET','8.4', 33, 0.85, 'Bosteels brewery', 'Belgium', 'high fermentation', 'blond');
INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('LA CHOUFFE bière blonde','8.0', 33, 0.75, 'Achouffe brewery', 'Belgium', 'tripler', 'blond');
INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('CHIMAY bleu','9', 33, 0.7, 'Notre-Dame de Scourmont abbey', 'Belgium', 'trappist', 'dark');

INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('CHIMAY trappiste triple','8', 33, 0.68, 'Notre-Dame de Scourmont abbey', 'Belgium', 'trappist', 'blond');
INSERT INTO beer (name, description, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('WESTMALLE trappiste trip','Il est préférable de conserver la bière debout à l\'abri de la lumière, à une température constante de 8 à 14 °C. Laissez la bouteille reposer pendant au moins une semaine avant de la servir. Ainsi, la levure descend dans le fond de la bouteille et la bière que vous verserez dans le verre sera limpide.','9.5', 33, 0.85, 'Cistercian abbey', 'Belgium', 'trappist', 'blond');
INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('OMER Blonde','8', 33, 0.6, 'Bockor brewery', 'Belgium', 'trappist', 'blond');
INSERT INTO beer (name, description, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('PIEDBOEUF Brune','Conserver dans un endroit frais et sombre','1.1', 33, 0.6, 'Jupiler brewery', 'Belgium', 'table', 'dark');

INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('GRIMBERGEN bière abb. bl.','6.7', 33, 0.7, 'Grimbergen abbey', 'Belgium', 'abbey', 'blond');
INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('ORVAL trappiste','6.2', 33, 0.56, 'Orval brewery', 'Belgium', 'trappist', 'amber');
INSERT INTO beer (name, description,alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('LINDEMANS kriek','Gout : cerise','3.5', 25, 0.47, 'Lindemans', 'Belgium', 'fruity', 'white');
INSERT INTO beer (name, alcoholPerc, capacityCl, price, breweryName, countryName, beerTypeName, beerColor) 
	VALUES ('KASTEEL bière rouge','8', 33, 0.58, 'Van Honsebrouck brewery', 'Belgium', 'fruity', 'white');