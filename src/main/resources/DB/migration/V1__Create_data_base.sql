CREATE TABLE users(
  uuid VARCHAR(1000) PRIMARY KEY  NOT NULL,
  login VARCHAR(600),
  password VARCHAR(3000),
  name VARCHAR(400),
  surname varchar(1000),
  role varchar(10)
);

CREATE TABLE common_dict(
  id INTEGER,
  id_parent INTEGER,
  name varchar(100)
);

CREATE TABLE clients(
  uuid VARCHAR(1000) PRIMARY KEY  NOT NULL,
  name varchar(500) not null,
  middle_name varchar(500),
  last_name varchar(1000),
  phone varchar(2000),
  email varchar(1000)
);

CREATE TABLE addresses(
  uuid VARCHAR(1000) PRIMARY KEY  NOT NULL,
  uuid_client VARCHAR(1000),
  area varchar(200),
  region varchar(200),
  city_name VARCHAR(200),
  street varchar(400),
  house varchar(20),
  flat INTEGER
);

