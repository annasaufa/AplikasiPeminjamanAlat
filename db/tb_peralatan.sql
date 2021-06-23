-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 30 Jan 2018 pada 16.20
-- Versi Server: 5.5.27
-- Versi PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `db_peminjaman`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peralatan`
--

CREATE TABLE IF NOT EXISTS `tb_peralatan` (
  `id_barang` varchar(15) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `spek` text NOT NULL,
  `no_inventaris` varchar(50) NOT NULL,
  `mac` varchar(50) NOT NULL,
  `stok_barang` int(15) NOT NULL,
  `dana` varchar(50) NOT NULL,
  `tahun` int(4) NOT NULL,
  `kategori` enum('Alat','Bahan','Barang') NOT NULL,
  PRIMARY KEY (`id_barang`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_peralatan`
--

INSERT INTO `tb_peralatan` (`id_barang`, `nama_barang`, `spek`, `no_inventaris`, `mac`, `stok_barang`, `dana`, `tahun`, `kategori`) VALUES
('123', 'Router', 'RB-951', '1w2ed', 'acqw', 11, 'hibah', 2017, 'Barang');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
