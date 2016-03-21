CREATE TABLE `books` (
  `title` varchar(30) NOT NULL,
  `author` varchar(50) NOT NULL,
  `publisher` varchar(50) NOT NULL,
  `edition` int(2) NOT NULL,
  `isbn` varchar(10) PRIMARY KEY,
  `pubDate` date NOT NULL,
  `loantime` int(2) NOT NULL,
  `avaliable` varchar(10) NOT NULL
)






INSERT INTO `library`.`books` (`title`, `author`, `publisher`, `edition`, `isbn`, `pubDate`, `loantime`, `avaliable`) 
VALUES ('Database', 'Column', 'London too', '3', '1234567545', '2015-10-06', '7', 'on shelf');





CREATE TABLE `users` (
id varchar(10) PRIMARY KEY,
userName varchar(20) NOT NULL,
userLastName varchar (20) NOT NULL,
userPassword varchar(40) NOT NULL,
userStatus varchar(10) NOT NULL
)

INSERT INTO `library`.`users` (`Id`, `userName`, `userLastName`, `userPassword`, `userStatus`)
VALUES ('98765433', 'John', 'Lame', 'qwerty', 'Student')


INSERT INTO library.users (`Id`, `userName`, `userLastName`, `userPassword`, `userStatus`)
VALUES ('12345678', 'Jurijs', 'Lepjaks', '12345', 'Admin')

CREATE TABLE readingList(
isbn varchar(10) NOT NULL,
id varchar(10) NOT NULL,
PRIMARY KEY (isbn, id),
FOREIGN KEY (isbn) REFERENCES books (isbn),
FOREIGN KEY (id) REFERENCES users (id)
)





CREATE TABLE requestsList(
isbn varchar(10) NOT NULL,
id varchar(10) NOT NULL,
dateRequested date NOT NULL,
PRIMARY KEY (isbn, id, dateRequested),
FOREIGN KEY (isbn) REFERENCES books (isbn),
FOREIGN KEY (id) 
)




CREATE TABLE landingList(
isbn varchar(10) NOT NULL,
id varchar(10) NOT NULL,
dateFrom date NOT NULL,
dateTill date NOT NULL,
PRIMARY KEY (isbn, id, dateFrom, dateTill),
FOREIGN KEY (isbn) REFERENCES books (isbn),
FOREIGN KEY (id) REFERENCES users (id)
)

