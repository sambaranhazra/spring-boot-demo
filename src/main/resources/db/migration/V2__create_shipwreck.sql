create TABLE SHIPWRECK(
ID INT AUTO_INCREMENT PRIMARY KEY ,
NAME VARCHAR(255),
DESCRIPTION VARCHAR(2000),
SHIP_CONDITION VARCHAR(255),
DEPTH FLOAT,
LATITUDE FLOAT,
LONGITUDE FLOAT,
YEAR_DISCOVERED INT
)