-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 01, 2023 at 07:46 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `practical2`
--

-- --------------------------------------------------------

--
-- Table structure for table `mathquiz`
--

CREATE TABLE `mathquiz` (
  `No.` int(11) NOT NULL,
  `Question` text NOT NULL,
  `Answer` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mathquiz`
--

INSERT INTO `mathquiz` (`No.`, `Question`, `Answer`) VALUES
(1, '10 x 10', 100),
(2, '7 x 2', 14),
(3, '12 / 3', 4),
(4, '100 / 2', 50),
(5, '60 + 7', 67),
(6, '1 + 10', 11),
(7, '24 - 12', 12),
(8, '18 - 10', 8),
(9, '10 x 23', 230),
(10, '10 x 1', 10);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
