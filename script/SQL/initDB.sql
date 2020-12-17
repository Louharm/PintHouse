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
ALTER TABLE Promotion AUTO_INCREMENT = 1;

CREATE TABLE BeerColor(
	nameEn varchar(255) NOT NULL,
	constraint nameColorEnPK PRIMARY KEY (nameEn),
	nameFr varchar(255) NOT NULL
);

CREATE TABLE BeerType(
	nameEn varchar(255) NOT NULL,
	constraint typeNameEnPK PRIMARY KEY (nameEn),
	nameFr varchar(255) NOT NULL
);

CREATE TABLE Brewery(
	nameEn varchar(255) NOT NULL,
	constraint nameEnPK PRIMARY KEY (nameEn),
	nameFr varchar(255) NOT NULL
);

CREATE TABLE Country(
	nameEn varchar(255) NOT NULL,
	constraint nameEnCountryPK PRIMARY KEY (nameEn),
	nameFr varchar(255) NOT NULL
);

CREATE TABLE Beer(
	name varchar(255) NOT NULL,
	constraint namePK PRIMARY KEY (name),
	description varchar(500),
	alcoholPerc float NOT NULL,
	capacityCl float NOT NULL,
	price float NOT NULL,
	breweryName varchar(255) NOT NULL,
	constraint BreweryNameFK FOREIGN KEY (breweryName) REFERENCES Brewery (nameEn),
	countryName varchar(255) NOT NULL,
	constraint CountryNameFK FOREIGN KEY (countryName) REFERENCES Country (nameEn),
	beerTypeName varchar(255) NOT NULL,
	constraint BeerTypeNameFK FOREIGN KEY (beerTypeName) REFERENCES BeerType (nameEn),
	beerColor varchar(255) NOT NULL,
	constraint BeerColorFK FOREIGN KEY (beerColor) REFERENCES BeerColor(nameEn)
);

CREATE TABLE Beer_Promotion(
	beerName varchar(255) NOT NULL,
	constraint beerNameFK FOREIGN KEY (beerName) REFERENCES Beer (name),
	promotionId integer NOT NULL,
	constraint beer_promotionPK PRIMARY KEY (promotionId, beerName),
	constraint promotionIdFK FOREIGN KEY (promotionId) REFERENCES Promotion (id)
); 

CREATE TABLE City(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPK PRIMARY KEY (id),
	name varchar(255) NOT NULL,
	postCode integer NOT NULL,
	countryName varchar(255) NOT NULL,
	constraint city_countryNameFK FOREIGN KEY (countryName) REFERENCES Country (nameEn)
);
ALTER TABLE City AUTO_INCREMENT = 1;

CREATE TABLE User(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPK PRIMARY KEY (id),
	lastname varchar(255) NOT NULL,
	firstname varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
	email varchar(255) NOT NULL UNIQUE,
	birthdate date NOT NULL,
	street varchar(255) NOT NULL,
	numhouse integer NOT NULL,
	phonenumber varchar(255),
	cityid integer NOT NULL,
	constraint cityIdFK FOREIGN KEY (cityid) REFERENCES City (id) ,
    authorities varchar(255),
    non_expired boolean,
    non_locked boolean,
    credentials_non_expired boolean,
    enabled boolean
);
ALTER TABLE User AUTO_INCREMENT = 1;

CREATE TABLE Commande(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPK PRIMARY KEY (id),
	commandeDate date NOT NULL,
	userId integer NOT NULL,
	constraint userIdFK FOREIGN KEY (userId) REFERENCES User(id) 
);
ALTER TABLE Commande AUTO_INCREMENT = 1;

CREATE TABLE CommandeLine(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPK PRIMARY KEY (id),
	realPrice float NOT NULL,
	beerName varchar(255) NOT NULL,
	constraint beerFK FOREIGN KEY (beerName) REFERENCES Beer (name),
	commandeId integer NOT NULL,
	constraint commandeIdFK FOREIGN KEY (commandeId) REFERENCES Commande (id)
);
ALTER TABLE CommandeLine AUTO_INCREMENT = 1;