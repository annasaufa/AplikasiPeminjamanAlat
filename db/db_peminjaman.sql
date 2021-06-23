-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 30 Jan 2018 pada 16.19
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
-- Struktur dari tabel `tb_admin`
--

CREATE TABLE IF NOT EXISTS `tb_admin` (
  `id_admin` varchar(30) NOT NULL,
  `nama_admin` varchar(50) NOT NULL,
  `no_telepon` varchar(30) NOT NULL,
  `alamat` text NOT NULL,
  `password` varchar(15) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`id_admin`),
  UNIQUE KEY `id_admin_2` (`id_admin`),
  KEY `id_admin` (`id_admin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_admin`
--

INSERT INTO `tb_admin` (`id_admin`, `nama_admin`, `no_telepon`, `alamat`, `password`, `email`) VALUES
('KJ.1516669', 'Annas Aufa', '085602164107', 'Mayongan, Trimurti, Srandakan, Bantul', 'aufa', 'annasaufa21@gmail.com');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peminjaman`
--

CREATE TABLE IF NOT EXISTS `tb_peminjaman` (
  `nis` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kelas` enum('10','11','12') NOT NULL,
  `jurusan` enum('MM','TKJ') NOT NULL,
  `jumlah_barang` int(15) NOT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `jam_pinjam` time DEFAULT NULL,
  `jam_kembali` time DEFAULT NULL,
  PRIMARY KEY (`nis`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_peminjamanguru`
--

CREATE TABLE IF NOT EXISTS `tb_peminjamanguru` (
  `nip` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `mapel` enum('Matematika','Bahasa Indonesia','Bahasa Inggris','Bahasa Jawa','Fisika','Seni Budaya','Sejarah','PAI','PPKN','Penjasorkes','Prakarya dan KWR','Kimia','Produktif') NOT NULL,
  `jumlah_barang` int(11) NOT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `jam_pinjam` time DEFAULT NULL,
  `jam_kembali` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_toolman`
--

CREATE TABLE IF NOT EXISTS `tb_toolman` (
  `id` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `no_telepon` varchar(30) NOT NULL,
  `alamat` text NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
