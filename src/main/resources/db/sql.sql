CREATE TABLE `book` (
  `bookid` int(11) NOT NULL AUTO_INCREMENT,
  `bookname` varchar(255) NOT NULL,
  `authors` varchar(255) NOT NULL,
  `info` varchar(255) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `year_publication` datetime NOT NULL,
  PRIMARY KEY (`bookid`),
  KEY `year_publication` (`year_publication`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

