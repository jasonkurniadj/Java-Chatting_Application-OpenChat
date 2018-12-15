-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 15, 2018 at 06:24 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `open_chat`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
`user_id` int(10) NOT NULL,
  `name` varchar(25) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(6) NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(40) NOT NULL,
  `register` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `name`, `dob`, `gender`, `address`, `email`, `phone`, `username`, `password`, `register`) VALUES
(1, 'Admin', '0000-00-00', '', 'OpenChat Office Tower', 'admin@openchat.com', '62764299', 'admin', 'admin123', '2018-05-18 11:59:46'),
(2, 'Jason', '1999-07-06', 'male', 'Pesanggrahan Raya No.88', NULL, NULL, 'jasonkurniadj', 'jason011', '2018-05-18 12:01:01'),
(3, 'Roslynlia', '1999-04-26', 'female', 'Way 20, North Meruya', NULL, NULL, 'roslyn', 'roslyn001', '2018-05-18 13:02:25'),
(4, 'User', '0000-00-00', '', 'OpenChat Office Tower', 'user@openchat.com', '62764299', 'user', 'user123', '2018-06-18 13:01:46');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
 ADD PRIMARY KEY (`user_id`), ADD UNIQUE KEY `email` (`email`,`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
