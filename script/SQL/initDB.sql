DROP TABLE IF EXISTS Beer_Promotion CASCADE;
DROP TABLE IF EXISTS CommandeLine CASCADE;
DROP TABLE IF EXISTS Beer CASCADE;
DROP TABLE IF EXISTS Promotion CASCADE;
DROP TABLE IF EXISTS BeerColor CASCADE;
DROP TABLE IF EXISTS BeerType CASCADE;
DROP TABLE IF EXISTS Brewery CASCADE;
DROP TABLE IF EXISTS Commande CASCADE;
DROP TABLE IF EXISTS User CASCADE;
DROP TABLE IF EXISTS City CASCADE;
DROP TABLE IF EXISTS Country CASCADE;

CREATE TABLE Promotion(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPromotionPK PRIMARY KEY (id),
	dateStart date NOT NULL,
	dateEnd date NOT NULL,
	value integer NOT NULL
);

CREATE TABLE BeerColor(
	nameColorEn varchar(255) NOT NULL,
	constraint nameColorEnPK PRIMARY KEY (nameColorEn),
	nomFr varchar(255) NOT NULL
);

CREATE TABLE BeerType(
	typeNameEn varchar(255) NOT NULL,
	constraint typeNameEnPK PRIMARY KEY (typeNameEn),
	nomFr varchar(255) NOT NULL
);

CREATE TABLE Brewery(
	nameEn varchar(255) NOT NULL,
	constraint nameEnPK PRIMARY KEY (nameEn),
	nomFr varchar(255) NOT NULL
);

CREATE TABLE Country(
	nameEn varchar(255) NOT NULL,
	constraint nameEnCountryPK PRIMARY KEY (nameEn),
	nomFr varchar(255) NOT NULL
);

CREATE TABLE Beer(
	name varchar(255) NOT NULL,
	constraint namePK PRIMARY KEY (name),
	description varchar(255),
	alcoholPerc float(4,2) NOT NULL,
	capacityCl float(4,2) NOT NULL,
	price float(6,2) NOT NULL,
	breweryName varchar(255) NOT NULL,
	constraint BreweryNameFK FOREIGN KEY (breweryName) REFERENCES Brewery (nameEn),
	countryName varchar(255) NOT NULL,
	constraint CountryNameFK FOREIGN KEY (countryName) REFERENCES Country (nameEn),
	beerTypeName varchar(255) NOT NULL,
	constraint BeerTypeNameFK FOREIGN KEY (beerTypeName) REFERENCES BeerType (typeNameEn),
	beerColor varchar(255) NOT NULL,
	constraint BeerColorFK FOREIGN KEY (beerColor) REFERENCES BeerColor(nameColorEn)
);

CREATE TABLE Beer_Promotion(
	beerName varchar(255) NOT NULL,
	constraint beerNameFK FOREIGN KEY (beerName) REFERENCES Beer (name),
	promotionId integer NOT NULL,
	constraint beer_promotionPK PRIMARY KEY (promotionId, beerName),
	constraint promotionIdFK FOREIGN KEY (promotionId) REFERENCES Promotion (id)
); 

CREATE TABLE City(
	id integer NOT NULL,
	constraint idPK PRIMARY KEY (id),
	name varchar(255) NOT NULL,
	postCode integer NOT NULL,
	countryName varchar(255) NOT NULL,
	constraint city_countryNameFK FOREIGN KEY (countryName) REFERENCES Country (nameEn)
);

CREATE TABLE User(
	id integer NOT NULL,
	constraint idPK PRIMARY KEY (id),
	lastName varchar(255) NOT NULL,
	firstName varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
	email varchar(255) NOT NULL UNIQUE,
	birthdate date NOT NULL,
	street varchar(255) NOT NULL,
	numHouse integer NOT NULL,
	phoneNumber varchar(255),
	cityId integer NOT NULL,
	constraint cityIdFK FOREIGN KEY (cityId) REFERENCES City (id) 
);

CREATE TABLE Commande(
	id integer NOT NULL,
	constraint idPK PRIMARY KEY (id),
	commandeDate date NOT NULL,
	userId integer NOT NULL,
	constraint userIdFK FOREIGN KEY (userId) REFERENCES User(id) 
);

CREATE TABLE CommandeLine(
	id integer NOT NULL,
	constraint idPK PRIMARY KEY (id),
	realPrice float(8,2) NOT NULL,
	beerName varchar(255) NOT NULL,
	constraint beerFK FOREIGN KEY (beerName) REFERENCES Beer (name),
	commandeId integer NOT NULL,
	constraint commandeIdFK FOREIGN KEY (commandeId) REFERENCES Commande (id)
);