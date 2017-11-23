CREATE TABLE `Product` (
  `productId` int(11) NOT NULL AUTO_INCREMENT,
  `productName` varchar(45) DEFAULT NULL,
  `productPrice` float DEFAULT '0',
  `createdDate` datetime DEFAULT NULL,
  `description` varchar(150) DEFAULT NULL,
  `productImage` blob,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;



CREATE TABLE `User` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `emailId` varchar(45) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `loginDate` datetime DEFAULT NULL,
  `activeStatus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=big5;



CREATE TABLE `priceRequest` (
  `requestId` int(11) NOT NULL AUTO_INCREMENT,
  `productId` int(11) DEFAULT '0',
  `emailId` varchar(100) DEFAULT '0',
  `fromPrice` float DEFAULT '0',
  `toPrice` float DEFAULT '0',
  `selectDaysRange` int(11) DEFAULT '0',
  `comment` varchar(100) DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `toDate` datetime DEFAULT NULL,
  PRIMARY KEY (`requestId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=big5;