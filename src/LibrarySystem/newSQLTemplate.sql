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
