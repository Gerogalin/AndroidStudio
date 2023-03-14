-- phpMyAdmin SQL Dump
-- version 5.0.3
-- hhtps://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 28, 2022 at 01:24 AM
-- Server verion: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: 'tonyDB'
--

-- ---------------------------------------------

--
-- Table structure for table 'custtbl'
--

CREATE TABLE 'custtbl' (
'ID' int(100) NOT NUTT,
'Fullname' varchar(500) NOT NULL,
'Gender' varchar(500) NOT NULL,
'CivilStatus' varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table 'custtbl'
--

INSERT INTO 'custtbl' ('ID', 'Fullname', 'Gender', 'CivilStatus') VALUES
(1, 'Julie Ann Makilan', 'Female', 'Single'),
(2, 'Anthony Gallego', 'Male', 'Married,);

--
-- Indexes for dumped tables
--

--
-- Indexes for table 'custtbl'
--
ALTER TABL 'custtbl'
  ADD PRIMARY KEY ('ID');
  
  --
  -- AUTO_INCREMENT for dumped tables
  --
  
  --
  -- AUTO_INCREMENT for table 'tbl_people'
  --
  ALTER TABLE 'custtbl'
    MODIFY 'ID' int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
    COMMIT;
    
    /*!40101 SET CHARACTER_SET_CLIENT=@CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@COLLATION_CONNECTION */;
   
