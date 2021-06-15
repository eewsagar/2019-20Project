-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2021 at 01:24 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.3.27



SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

DROP DATABASE IF EXISTS stock;
CREATE DATABASE stock;
USE stock;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stock`
--

-- --------------------------------------------------------

--
-- Table structure for table `currentstocks`
--

CREATE TABLE `currentstocks` (
  `pid` int(100) NOT NULL,
  `quantity` int(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `currentstocks`
--

INSERT INTO `currentstocks` (`pid`, `quantity`) VALUES
(1, 14),
(2, 32),
(3, 42);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `pid` int(30) NOT NULL,
  `productname` varchar(100) NOT NULL,
  `costprice` int(100) NOT NULL,
  `state` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`pid`, `productname`, `costprice`, `state`) VALUES
(1, 'Gram', 40, 'solid'),
(2, 'wheat', 123, 'solid'),
(3, 'sugar', 122, 'solid'),
(4, 'rice', 124, 'solid'),
(5, 'oil', 100, 'liquid'),
(6, 'sandwich', 567, 'solid'),
(7, 'salt', 120, 'solid');

-- --------------------------------------------------------

--
-- Table structure for table `sallary`
--

CREATE TABLE `sallary` (
  `sal_id` int(30) NOT NULL,
  `workername` varchar(100) NOT NULL,
  `sal` int(30) NOT NULL,
  `leave` int(30) NOT NULL,
  `acsalary` int(30) NOT NULL,
  `desalary` int(30) NOT NULL,
  `totalsalary` int(30) NOT NULL,
  `fromdate` date NOT NULL,
  `todate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `branch` varchar(50) NOT NULL,
  `year` varchar(50) NOT NULL,
  `mobileno` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`id`, `name`, `branch`, `year`, `mobileno`) VALUES
(3, 'priti', 'Computer Engineering', 'Third Year', 235680086),
(5, 'nivedita', 'Computer Engineering', 'Third Year', 235435436),
(6, 'gayatri b', 'Computer Engineering', 'First Year', 1234567890),
(8, 'shruti', 'Computer Engineering', 'First Year', 1234567890),
(9, 'sandhya', 'Computer Engineering', 'First Year', 1234567890);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `id` int(100) NOT NULL,
  `supname` varchar(100) NOT NULL,
  `address` varchar(100) NOT NULL,
  `phone` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`id`, `supname`, `address`, `phone`) VALUES
(3, 'gayatri', 'latur', '1234455323'),
(4, 'pirti', 'latur', '1234455323');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `securityQ` varchar(30) NOT NULL,
  `answer` varchar(30) NOT NULL,
  `mobileno` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`, `securityQ`, `answer`, `mobileno`, `name`) VALUES
('nivi', '123', '', '', '0', ''),
('pqr', '123', 'what is your name', 'pqr', '0', ''),
('Username', 'Password', 'securityQ', 'answer', 'MobileNo', 'Name'),
('+Username+', '+Password+', '+securityQ+', '+answer+', '+MobileNo+', '+Name+'),
('nini', 'dfyhhy', 'what is your name?', 'nini', '4567', 'dfhh'),
('VAISHU', '5678', 'what is your favourite color?', 'red', '9823521234', 'VAISHNAVI BIRAJDAR'),
('VAISHU', '5678', 'what is your favourite color?', 'red', '9823521234', 'VAISHNAVI BIRAJDAR'),
('prit', 'co4i', 'what is your name?', 'pillu', '2733944725', 'priti patil'),
('nivedita', 'nivu', 'what is your name?', 'nivedita', '1223445556', 'nivedita birajdar');

-- --------------------------------------------------------

--
-- Table structure for table `workers`
--

CREATE TABLE `workers` (
  `id` int(30) NOT NULL,
  `name` varchar(100) NOT NULL,
  `mobileno` int(100) NOT NULL,
  `address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `workers`
--

INSERT INTO `workers` (`id`, `name`, `mobileno`, `address`) VALUES
(1, 'abc', 243517847, 'latur'),
(3, 'abcde', 5432, 'osmanabad'),
(5, 'abcde', 5432, 'osmanabad');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `currentstocks`
--
ALTER TABLE `currentstocks`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `sallary`
--
ALTER TABLE `sallary`
  ADD PRIMARY KEY (`sal_id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `workers`
--
ALTER TABLE `workers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `currentstocks`
--
ALTER TABLE `currentstocks`
  MODIFY `pid` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `pid` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `sallary`
--
ALTER TABLE `sallary`
  MODIFY `sal_id` int(30) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `workers`
--
ALTER TABLE `workers`
  MODIFY `id` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
