DROP TABLE IF EXISTS Beer_Promotion CASCADE;
DROP TABLE IF EXISTS Command_Line CASCADE;
DROP TABLE IF EXISTS Beer CASCADE;
DROP TABLE IF EXISTS Promotion CASCADE;
DROP TABLE IF EXISTS Translation_Beer_Color CASCADE;
DROP TABLE IF EXISTS Translation_Beer_Type CASCADE;
DROP TABLE IF EXISTS Translation_Brewery CASCADE;
DROP TABLE IF EXISTS Translation_Country CASCADE;
DROP TABLE IF EXISTS Language CASCADE;
DROP TABLE IF EXISTS Beer_Color CASCADE;
DROP TABLE IF EXISTS Beer_Type CASCADE;
DROP TABLE IF EXISTS Brewery CASCADE;
DROP TABLE IF EXISTS Command CASCADE;
DROP TABLE IF EXISTS User CASCADE;
DROP TABLE IF EXISTS City CASCADE;
DROP TABLE IF EXISTS Country CASCADE;

CREATE TABLE Language(
	name varchar(2) NOT NULL,
	constraint LanguagePK PRIMARY KEY (name)
);

CREATE TABLE Beer_Color(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idBeerColorPK PRIMARY KEY (id)
);
ALTER TABLE Beer_Color AUTO_INCREMENT = 1;

CREATE TABLE Translation_Beer_Color(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idTranslationPK PRIMARY KEY (id),
	name varchar(255) NOT NULL,
    language varchar(2) NOT NULL,
	constraint languageTranslationBeerColorFK FOREIGN KEY (language) REFERENCES Language (name),
    item integer NOT NULL,
	constraint itemTranslationBeerColorFK FOREIGN KEY (item) REFERENCES Beer_Color (id)
);
ALTER TABLE Translation_Beer_Color AUTO_INCREMENT = 1;

CREATE TABLE Beer_Type(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idBeerTypePK PRIMARY KEY (id)
);
ALTER TABLE Beer_Type AUTO_INCREMENT = 1;

CREATE TABLE Translation_Beer_Type(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idTranslationPK PRIMARY KEY (id),
	name varchar(255) NOT NULL,
    language varchar(2) NOT NULL,
	constraint languageTranslationBeerTypeFK FOREIGN KEY (language) REFERENCES Language (name),
    item integer NOT NULL,
	constraint itemTranslationBeerTypeFK FOREIGN KEY (item) REFERENCES Beer_Type (id)
);
ALTER TABLE Translation_Beer_Type AUTO_INCREMENT = 1;

CREATE TABLE Brewery(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idBreweryPK PRIMARY KEY (id)
);
ALTER TABLE Brewery AUTO_INCREMENT = 1;

CREATE TABLE Translation_Brewery(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idTranslationPK PRIMARY KEY (id),
	name varchar(255) NOT NULL,
    language varchar(2) NOT NULL,
	constraint languageTranslationBreweryFK FOREIGN KEY (language) REFERENCES Language (name),
    item integer NOT NULL,
	constraint itemTranslationBreweryFK FOREIGN KEY (item) REFERENCES Brewery (id)
);
ALTER TABLE Translation_Brewery AUTO_INCREMENT = 1;

CREATE TABLE Country(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idCountryPK PRIMARY KEY (id)
);
ALTER TABLE Country AUTO_INCREMENT = 1;

CREATE TABLE Translation_Country(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idTranslationPK PRIMARY KEY (id),
	name varchar(255) NOT NULL,
    language varchar(2) NOT NULL,
	constraint languageTranslationCountryFK FOREIGN KEY (language) REFERENCES Language (name),
    item integer NOT NULL,
	constraint itemTranslationCountryFK FOREIGN KEY (item) REFERENCES Country (id)
);
ALTER TABLE Translation_Brewery AUTO_INCREMENT = 1;

CREATE TABLE Beer(
	name varchar(255) NOT NULL,
	constraint namePK PRIMARY KEY (name),
	description varchar(500),
	alcoholPerc float NOT NULL,
    CONSTRAINT alcoholdPerc_ck CHECK (alcoholPerc >= 0 and alcoholPerc <= 100),
	capacityCl float NOT NULL,
    CONSTRAINT capacity_ck CHECK (capacityCl > 0),
	price float NOT NULL,
    CONSTRAINT price_ck CHECK (price > 0),
	brewery integer(255) NOT NULL,
	constraint BreweryNameFK FOREIGN KEY (brewery) REFERENCES Brewery (id),
	country integer NOT NULL,
	constraint BeerCountryFK FOREIGN KEY (country) REFERENCES Country (id),
	Beer_Type integer NOT NULL,
	constraint BeerTypeNameFK FOREIGN KEY (Beer_Type) REFERENCES Beer_Type (id),
	Beer_Color integer(255) NOT NULL,
	constraint BeerColorFK FOREIGN KEY (Beer_Color) REFERENCES Beer_Color(id)
);

CREATE TABLE Promotion(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPromotionPK PRIMARY KEY (id),
	dateStart date NOT NULL,
	dateEnd date NOT NULL,
	value integer NOT NULL
);
ALTER TABLE Promotion AUTO_INCREMENT = 1;

CREATE TABLE Beer_Promotion(
	beerName varchar(255) NOT NULL,
	constraint beerNameFK FOREIGN KEY (beerName) REFERENCES Beer (name),
	promotionId integer NOT NULL,
	constraint beerPromotionPK PRIMARY KEY (promotionId, beerName),
	constraint promotionIdFK FOREIGN KEY (promotionId) REFERENCES Promotion (id)
); 

CREATE TABLE City(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPK PRIMARY KEY (id),
	name varchar(255) NOT NULL,
	postCode integer NOT NULL,
	country integer NOT NULL,
	constraint cityCountryFK FOREIGN KEY (country) REFERENCES Country (id),
    CONSTRAINT cityname_ck check(name not like ('[0-9]%'))
);
ALTER TABLE City AUTO_INCREMENT = 1;

CREATE TABLE User(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPK PRIMARY KEY (id),
	lastname varchar(255) NOT NULL,
	firstname varchar(255) NOT NULL,
	password varchar(255) NOT NULL,
	email varchar(255) NOT NULL UNIQUE,
	street varchar(255) NOT NULL,
	numhouseBox varchar(10) NOT NULL,
	phonenumber varchar(255),
	cityid integer NOT NULL,
	constraint cityIdFK FOREIGN KEY (cityid) REFERENCES City (id) ,
    authorities varchar(255),
    non_expired boolean,
    non_locked boolean,
    credentials_non_expired boolean,
    enabled boolean,
    CONSTRAINT phone_ck check(phonenumber like ('+__ ___/__.__.__') or phonenumber is null),
    CONSTRAINT email_ck check(email like ('%@%.%')),
    constraint lastname_ck check (lastname not like ('[0-9]%')),
    CONSTRAINT firstname_ck check(firstname not like ('[0-9]%')),
    CONSTRAINT street_ck check(street not like ('[0-9]%'))
);
ALTER TABLE User AUTO_INCREMENT = 1;

CREATE TABLE Command(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPK PRIMARY KEY (id),
	order_date date NOT NULL,
	user_id integer NOT NULL,
	constraint userIdFK FOREIGN KEY (user_id) REFERENCES User(id)
);
ALTER TABLE Command AUTO_INCREMENT = 1;

CREATE TABLE Command_Line(
	id integer NOT NULL AUTO_INCREMENT,
	constraint idPK PRIMARY KEY (id),
	real_price float NOT NULL,
	quantity integer NOT NULL,
	beer_name varchar(255) NOT NULL,
	constraint beerFK FOREIGN KEY (beer_name) REFERENCES Beer (name),
	command_id integer NOT NULL,
	constraint commandIdFK FOREIGN KEY (command_id) REFERENCES Command (id),
    CONSTRAINT realprice_ck check(real_price > 0)
);
ALTER TABLE Command_Line AUTO_INCREMENT = 1;