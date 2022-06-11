-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jun 11, 2022 at 06:07 AM
-- Server version: 5.7.30-0ubuntu0.18.04.1-log
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `exodus`
--

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `Student ID` int(11) NOT NULL,
  `First Name` varchar(128) NOT NULL,
  `Middle Name` varchar(128) NOT NULL,
  `Last Name` varchar(128) NOT NULL,
  `Suffix` varchar(10) NOT NULL,
  `Age` varchar(3) NOT NULL,
  `Birthdate` varchar(128) NOT NULL,
  `Birthplace` varchar(128) NOT NULL,
  `LRN` varchar(15) NOT NULL,
  `Year Level` varchar(128) NOT NULL,
  `Course` varchar(256) NOT NULL,
  `Sex` varchar(100) NOT NULL,
  `Contact Number` varchar(15) NOT NULL,
  `City` varchar(128) NOT NULL,
  `Address` varchar(256) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`Student ID`, `First Name`, `Middle Name`, `Last Name`, `Suffix`, `Age`, `Birthdate`, `Birthplace`, `LRN`, `Year Level`, `Course`, `Sex`, `Contact Number`, `City`, `Address`) VALUES
(48, 'Faith Kaye', 'Abool', 'Superior', 'NA', '20', 'October 12, 2001', 'Tagum City', '123456789012', 'First Year', 'BS in Information Technology (BSIT)', 'Female', '096525422236', 'Panabo City', 'Evelyn Subd. Brgy. New Visayas'),
(63, 'John', 'Suave', 'Garcia', 'III', '19', 'May 6, 2003', 'Tagum City', '463829456391', 'Second Year', 'BS in Disaster Resiliency and Management (BSDRM)', 'Male', '09109067040', 'Tagum City', 'Poblacion'),
(64, 'Kimberly Marie', 'Ocon', 'Arias', 'NA', '18', 'August 6, 2003', 'Tagum City', '482936478291', 'Second Year', 'BS in Agro-Forestry (BSAF)', 'Female', '09109067040', 'New Corella', 'New Cortez');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`) VALUES
(1, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`Student ID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `Student ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
