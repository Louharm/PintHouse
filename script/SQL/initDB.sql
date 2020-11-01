DROP TABLE IF EXISTS Promotion CASCADE;
CREATE TABLE Promotion(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPromotionPK PRIMARY KEY (id),
	dateStart date NOT NULL,
	dateEnd date NOT NULL,
	value integer NOT NULL
);

DROP TABLE IF EXISTS BeerColor CASCADE;
CREATE TABLE BeerColor(
	nameColorEn varchar NOT NULL,
	constraint nameColorEnPK PRIMARY KEY (nameColorEn),
	nomFr varchar NOT NULL
);

DROP TABLE IF EXISTS BeerType CASCADE;
CREATE TABLE BeerType(
	typeNameEn varchar NOT NULL,
	constraint typeNameEnPK PRIMARY KEY (typeNameEn),
	nomFr varchar NOT NULL
);

DROP TABLE IF EXISTS Brewery CASCADE;
CREATE TABLE Brewery(
	nameEn varchar NOT NULL,
	constraint nameEnPK PRIMARY KEY (nameEn),
	nomFr varchar NOT NULL
);

DROP TABLE IF EXISTS Country CASCADE;
CREATE TABLE Country(
	nameEn varchar NOT NULL,
	constraint nameEnCountryPK PRIMARY KEY (nameEn),
	nomFr varchar NOT NULL
);

DROP TABLE IF EXISTS Beer CASCADE;
CREATE TABLE Beer(
	name varcher NOT NULL,
	constraint namePK PRIMARY KEY (name),
	description varchar,
	alcoholPerc float(4,2) NOT NULL,
	capacityCl float(4,2) NOT NULL,
	price float(6,2) NOT NULL,
	breweryName varchar NOT NULL,
	constraint BreweryNameFK FOREIGN KEY (breweryName) REFERENCES Brewery (nameEn),
	countryName varchar NOT NULL,
	constraint CountryNameFK FOREIGN KEY (countryName) REFERENCES Country (nameEn),
	beerTypeName varchar NOT NULL,
	constraint BeerTypeNameFK FOREIGN KEY (beerTypeName) REFERENCES BeerType (typeNameEn),
	beerColor varchar NOT NULL,
	constraint BeerColorFK FOREIGN KEY (beerColor) REFERENCES BeerColor(nameColorEn)
);

DROP TABLE IF EXISTS Beer_Promotion CASCADE;
CREATE TABLE Beer_Promotion(
	beerName varchar NOT NULL,
	constraint beerNamePK PRIMARY KEY (beerName),
	constraint beerNameFK FOREIGN KEY (beerName) REFERENCES Beer (name),
	promotionId integer NOT NULL,
	constraint promotionIdPK PRIMARY KEY (promotionId),
	constraint promotionIdFK FOREIGN KEY (promotionId) REFERENCES Promotion (id)
); 

DROP TABLE IF EXISTS City CASCADE;
CREATE TABLE City(
	id integer NOT NULL,
	constraint idPK PRIMARY KEY (id),
	name varchar NOT NULL,
	postCode integer NOT NULL,
	countryName varchar NOT	NULL,
	constraint countryNameFK FOREIGN KEY (countryName) REFERENCES Country (nameEn)
);

DROP TABLE IF EXISTS User CASCADE;
CREATE TABLE User(
	id integer NOT NULL,
	constraint idPK PRIMARY KEY (id),
	lastName varchar NOT NULL,
	firstName varchar NOT NULL,
	password varchar NOT NULL,
	email varchar NOT NULL UNIQUE,
	birthdate date NOT NULL,
	street varchar NOT NULL,
	numHouse integer NOT NULL,
	phoneNumber varchar
	cityId integer NOT NULL,
	constraint cityIdFK FOREIGN KEY cityId REFERENCES City (id) 
);

DROP TABLE IF EXISTS Commande CASCADE;
CREATE TABLE Commande(
	id integer NOT NULL,
	constraint idPK PRIMARY KEY (id),
	commandeDate date NOT NULL,
	userId integer NOT NULL,
	constraint userIdFK FOREIGN KEY userId REFERENCES User(id) 
);

DROP TABLE IF EXISTS CommandeLine CASCADE;
CREATE TABLE CommandeLine(
	id integer NOT NULL,
	constraint idPK PRIMARY KEY (id),
	realPrice float(8,2) NOT NULL,
	beerName varchar NOT NULL,
	constraint beerNameFK FOREIGN KEY beerName REFERENCES Beer (name),
	commandeId integer NOT NULL,
	constraint commandeIdFK FOREIGN KEY commandeId REFERENCES Commande (id)
);