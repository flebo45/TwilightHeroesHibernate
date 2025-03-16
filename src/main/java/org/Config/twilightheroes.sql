-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Creato il: Mar 14, 2025 alle 18:20
-- Versione del server: 10.4.32-MariaDB
-- Versione PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `twilightheroes`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `armors`
--

CREATE TABLE `armors` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `armorSet` varchar(255) NOT NULL,
  `part` varchar(255) NOT NULL,
  `stat` int(11) NOT NULL,
  `stat_ench` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `armors`
--

INSERT INTO `armors` (`id`, `description`, `name`, `armorSet`, `part`, `stat`, `stat_ench`) VALUES
(152, 'Un elmo che sprigiona un bagliore rossastro, incutendo timore ai nemici.', 'Elmo del Tizzone Ardente', 'Fiamma Eterna', 'elmo', 5, 'forza'),
(153, 'Una corazza ricoperta di creste simili a colate laviche indurite.', 'Corazza del Vulcano Dormiente', 'Fiamma Eterna', 'corazza', 5, 'forza'),
(154, 'Guanti che lasciano una scia di scintille con ogni movimento.', 'Guanti delle Scintille Furiose', 'Fiamma Eterna', 'guanti', 5, 'forza'),
(155, 'Gambali neri come carbone, leggeri e resistenti al calore.', 'Gambali della Cenere Immortale', 'Fiamma Eterna', 'gambali', 5, 'forza'),
(156, 'Un anello dorato con una fessura che sembra contenere lava in movimento.', 'Anello del Solco Infuocato', 'Fiamma Eterna', 'anello', 5, 'forza'),
(157, 'Un elmo decorato con simboli che evocano le nubi temporalesche.', 'Elmo del Fulmine Infinito', 'Guardiano delle Tempeste', 'elmo', 5, 'forza'),
(158, 'Una corazza che emette un basso rimbombo quando viene colpita.', 'Corazza del Rimbombo Celeste', 'Guardiano delle Tempeste', 'corazza', 5, 'forza'),
(159, 'Guanti adornati con piccole punte metalliche che ricordano fulmini.', 'Guanti delle Saette', 'Guardiano delle Tempeste', 'guanti', 5, 'forza'),
(160, 'Gambali che amplificano il rumore dei passi, intimidendo gli avversari.', 'Gambali del Tuono Ruggente', 'Guardiano delle Tempeste', 'gambali', 5, 'forza'),
(161, 'Un anello di metallo argentato, con un’onda scolpita lungo la sua superficie.', 'Anello della Tempesta Silente', 'Guardiano delle Tempeste', 'anello', 5, 'forza'),
(162, 'Un elmo a forma di cappuccio che avvolge il volto in ombra.', 'Cappuccio del Crepuscolo', 'Ombra Senza Fine', 'elmo', 5, 'forza'),
(163, 'Una corazza nera che sembra assorbire la luce circostante.', 'Corazza dell’Abisso Profondo', 'Ombra Senza Fine', 'corazza', 5, 'forza'),
(164, 'Guanti leggeri che permettono movimenti rapidi e precisi.', 'Guanti della Morsa Invisibile', 'Ombra Senza Fine', 'guanti', 5, 'forza'),
(165, 'Gambali rinforzati che non producono alcun rumore durante il movimento.', 'Gambali della Notte Silente', 'Ombra Senza Fine', 'gambali', 5, 'forza'),
(166, 'Un anello nero con un piccolo cerchio luminoso al centro.', 'Anello dell’Eclissi Incompleta', 'Ombra Senza Fine', 'anello', 5, 'forza'),
(167, 'Un elmo che simula la forma di radici nodose.', 'Elmo delle Radici Intrecciate', 'Quercia Antica', 'elmo', 5, 'forza'),
(168, 'Una corazza fatta di legno vivo, che pulsa leggermente al tatto.', 'Corazza della Corteccia Vivente', 'Quercia Antica', 'corazza', 5, 'forza'),
(169, 'Guanti ornati con foglie che sembrano cambiare colore con le stagioni.', 'Guanti delle Foglie Protettive', 'Quercia Antica', 'guanti', 5, 'forza'),
(170, 'Gambali decorati con incisioni che rappresentano tronchi di alberi.', 'Gambali delle Rami Forti', 'Quercia Antica', 'gambali', 5, 'forza'),
(171, 'Un anello con una piccola ghianda dorata incastonata nel metallo.', 'Anello della Ghianda Eterna', 'Quercia Antica', 'anello', 5, 'forza'),
(172, 'Un elmo che riproduce le sembianze di un drago con fauci spalancate.', 'Elmo della Testa di Drago', 'Drago Cremisi', 'elmo', 5, 'forza'),
(173, 'Una corazza coperta di scaglie rosse scintillanti come rubini.', 'Corazza delle Scaglie di Fuoco', 'Drago Cremisi', 'corazza', 5, 'forza'),
(174, 'Guanti che terminano in lame affilate simili ad artigli.', 'Guanti degli Artigli Ardenti', 'Drago Cremisi', 'guanti', 5, 'forza'),
(175, 'Gambali decorati con motivi che richiamano una coda di drago.', 'Gambali della Coda Possente', 'Drago Cremisi', 'gambali', 5, 'forza'),
(176, 'Un anello di pietra vulcanica con venature rosse luminose.', 'Anello del Respiro Infuocato', 'Drago Cremisi', 'anello', 5, 'forza'),
(177, 'Un elmo d’argento con un’aureola incisa nella sommità.', 'Elmo della Gloria Radiosa', 'Cavaliere Celestiale', 'elmo', 5, 'forza'),
(178, 'Una corazza che sembra riflettere la luce del sole nascente.', 'Corazza dell’Alba Dorata', 'Cavaliere Celestiale', 'corazza', 5, 'forza'),
(179, 'Guanti ricamati con rune dorate che emanano calore.', 'Guanti del Tocco Divino', 'Cavaliere Celestiale', 'guanti', 5, 'forza'),
(180, 'Gambali ornati con simboli angelici.', 'Gambali della Marcia Luminosa', 'Cavaliere Celestiale', 'gambali', 5, 'forza'),
(181, 'Un anello d’oro puro con un cristallo bianco al centro.', 'Anello della Grazia Immortale', 'Cavaliere Celestiale', 'anello', 5, 'forza'),
(182, 'Un elmo ornato con un’increspatura simile a quella delle onde.', 'Elmo della Cresta Oceanica', 'Mare Infinito', 'elmo', 5, 'forza'),
(183, 'Una corazza che riflette i colori del mare.', 'Corazza delle Correnti Profonde', 'Mare Infinito', 'corazza', 5, 'forza'),
(184, 'Guanti decorati con piccole perle bianche.', 'Guanti delle Perle Nascoste', 'Mare Infinito', 'guanti', 5, 'forza'),
(185, 'Gambali che sembrano essere stati modellati dal moto delle onde.', 'Gambali della Risacca', 'Mare Infinito', 'gambali', 5, 'forza'),
(186, 'Un anello con un piccolo frammento di corallo blu incastonato.', 'Anello del Corallo Azzurro', 'Mare Infinito', 'anello', 5, 'forza'),
(303, 'Un vecchio elmo di metallo ormai arrugginito, ma ancora abbastanza resistente.', 'Elmo Arrugginito', 'setbase', 'elmo', 3, 'difesa_fisica'),
(304, 'Una corazza di cuoio vecchio e consumato, ma ancora utile per proteggere.', 'Corazza Logora', 'setbase', 'corazza', 4, 'difesa_fisica'),
(305, 'Guanti di cuoio logorati dalla fatica, ma ancora abbastanza resistenti per bloccare gli attacchi.', 'Guanti Deteriorati', 'setbase', 'guanti', 1, 'difesa_fisica'),
(306, 'Un paio di gambali di metallo usurati dal tempo, che offrono una protezione minima.', 'Gambali Consunti', 'setbase', 'gambali', 2, 'difesa_fisica'),
(353, 'Un semplice elmo di stoffa, leggero ma quasi privo di protezione.', 'Elmo di Stoffa', 'setbase', 'elmo', 1, 'agilita'),
(354, 'Una corazza di pelle morbida ma resistente, ottima per la velocità e la destrezza.', 'Corazza Logora', 'setbase', 'corazza', 2, 'agilita'),
(355, 'Guanti di tela sottili che permettono una maggiore destrezza nelle azioni furtive.', 'Guanti Semplici', 'setbase', 'guanti', 2, 'agilita'),
(356, 'Gambali leggeri in cuoio, ideali per non compromettere la mobilità.', 'Gambali Sfilacciati', 'setbase', 'gambali', 3, 'agilita'),
(403, 'Un semplice elmo di stoffa, leggero ma quasi privo di protezione.', 'Elmo di Stoffa', 'setbase', 'elmo', 1, 'agilita'),
(404, 'Una corazza di pelle morbida ma resistente, ottima per la velocità e la destrezza.', 'Corazza Logora', 'setbase', 'corazza', 2, 'agilita'),
(405, 'Guanti di tela sottili che permettono una maggiore destrezza nelle azioni furtive.', 'Guanti Semplici', 'setbase', 'guanti', 2, 'agilita'),
(406, 'Gambali leggeri in cuoio, ideali per non compromettere la mobilità.', 'Gambali Sfilacciati', 'setbase', 'gambali', 3, 'agilita'),
(453, 'Un semplice elmo di legno, che offre poca protezione ma una leggera resistenza magica.', 'Elmo di Legno Usato', 'setbase', 'elmo', 1, 'difesa_magica'),
(454, 'Una tunica di lino che offre una protezione minima, ma che non ostacola i movimenti.', 'Corazza di Lino Stinto', 'setbase', 'corazza', 2, 'difesa_magica'),
(455, 'Guanti di cotone morbido, ideali per manipolare artefatti magici senza rischio di danneggiarli.', 'Guanti di Cotone', 'setbase', 'guanti', 1, 'difesa_magica'),
(456, 'Gambali di panno morbido, che non offrono molta protezione, ma sono leggeri.', 'Gambali di Panno', 'setbase', 'gambali', 1, 'difesa_magica'),
(503, 'Un elmo di ferro consumato dal tempo, che protegge poco ma è meglio di nulla.', 'Elmo di Ferro Deteriorato', 'setbase', 'elmo', 3, 'difesa_fisica'),
(504, 'Una corazza di cuoio rovinata che offre una protezione limitata.', 'Corazza di Cuoio Rovinata', 'setbase', 'corazza', 4, 'difesa_fisica'),
(505, 'Guanti di pelle strappata che non proteggono bene, ma sono abbastanza resistenti.', 'Guanti di Pelle Strappata', 'setbase', 'guanti', 2, 'difesa_fisica'),
(506, 'Gambali di metallo usurato, poco efficaci ma abbastanza resistenti per brevi periodi.', 'Gambali di Metallo Usurato', 'setbase', 'gambali', 2, 'difesa_fisica'),
(553, 'Un elmo di tela che non offre molta protezione, ma è leggero e confortevole.', 'Elmo di Tela', 'setbase', 'elmo', 1, 'agilita'),
(554, 'Corazza di pelle consumata che non offre molta difesa, ma è sufficientemente flessibile.', 'Corazza di Pelle Consumata', 'setbase', 'corazza', 2, 'agilita'),
(555, 'Guanti di pelle deteriorata che non offrono molta protezione, ma non ostacolano i movimenti.', 'Guanti di Pelle Deteriorata', 'setbase', 'guanti', 2, 'agilita'),
(556, 'Gambali di cuoio usurato che non proteggono molto, ma sono abbastanza comodi per correre.', 'Gambali di Cuoio Usurato', 'setbase', 'gambali', 2, 'agilita'),
(603, 'Un elmo di ferro arrugginito, pesante e poco resistente, ma protezione minima garantita.', 'Elmo di Ferro Arrugginito', 'setbase', 'elmo', 4, 'forza'),
(604, 'Corazza di ferro rovinata, che offre una protezione debole ma consente una buona forza d\'attacco.', 'Corazza di Ferro Rovinato', 'setbase', 'corazza', 5, 'forza'),
(605, 'Guanti di cuoio spesso che proteggono poco, ma offrono una presa forte per le armi.', 'Guanti di Cuoio Spesso', 'setbase', 'guanti', 2, 'forza'),
(606, 'Gambali di metallo usurato che non offrono grande protezione, ma danno una buona base per i combattimenti ravvicinati.', 'Gambali di Metallo Usurato', 'setbase', 'gambali', 3, 'forza'),
(653, 'Un elmo di metallo leggero, ormai arrugginito e poco efficace.', 'Elmo Sbiadito', 'setbase', 'elmo', 1, 'difesa_fisica'),
(654, 'Una tunica che ha visto giorni migliori, ormai sbiadita e con pochi segni di protezione.', 'Tunica Consumata', 'setbase', 'corazza', 1, 'difesa_fisica'),
(655, 'Guanti di stoffa rovinata, non offrono protezione ma consentono una certa libertà nei combattimenti.', 'Guanti Scuri', 'setbase', 'guanti', 1, 'agilita'),
(656, 'Gambali in tela che si sono deteriorati con il tempo, non adatti a difese ma comodi per il movimento.', 'Gambali Consumati', 'setbase', 'gambali', 1, 'agilita');

-- --------------------------------------------------------

--
-- Struttura della tabella `characters`
--

CREATE TABLE `characters` (
  `id` bigint(20) NOT NULL,
  `agility` int(11) NOT NULL,
  `healthPoints` int(11) NOT NULL,
  `luck` int(11) NOT NULL,
  `magicDefense` int(11) NOT NULL,
  `mana` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `physicalDefense` int(11) NOT NULL,
  `strength` int(11) NOT NULL,
  `weapon_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `characters`
--

INSERT INTO `characters` (`id`, `agility`, `healthPoints`, `luck`, `magicDefense`, `mana`, `name`, `physicalDefense`, `strength`, `weapon_id`) VALUES
(2, 4, 150, 3, 5, 50, 'Guerriero', 8, 10, 302),
(4, 10, 100, 8, 6, 90, 'Ladro', 5, 7, 402),
(5, 5, 80, 6, 12, 200, 'Mago', 3, 3, 452),
(6, 5, 130, 4, 8, 100, 'Paladino', 10, 8, 502),
(7, 9, 110, 7, 5, 70, 'Ranger', 6, 8, 552),
(8, 6, 160, 5, 3, 30, 'Berserker', 7, 12, 602),
(9, 8, 120, 6, 7, 100, 'Monaco', 8, 7, 652);

-- --------------------------------------------------------

--
-- Struttura della tabella `character_armor`
--

CREATE TABLE `character_armor` (
  `character_id` bigint(20) NOT NULL,
  `armor_id` bigint(20) NOT NULL,
  `armor_type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `character_armor`
--

INSERT INTO `character_armor` (`character_id`, `armor_id`, `armor_type`) VALUES
(2, 303, 'elmo'),
(2, 304, 'corazza'),
(2, 305, 'guanti'),
(2, 306, 'gambali'),
(4, 403, 'elmo'),
(4, 404, 'corazza'),
(4, 405, 'guanti'),
(4, 406, 'gambali'),
(5, 453, 'elmo'),
(5, 454, 'corazza'),
(5, 455, 'guanti'),
(5, 456, 'gambali'),
(6, 503, 'elmo'),
(6, 504, 'corazza'),
(6, 505, 'guanti'),
(6, 506, 'gambali'),
(7, 553, 'elmo'),
(7, 554, 'corazza'),
(7, 555, 'guanti'),
(7, 556, 'gambali'),
(8, 603, 'elmo'),
(8, 604, 'corazza'),
(8, 605, 'guanti'),
(8, 606, 'gambali'),
(9, 653, 'elmo'),
(9, 654, 'corazza'),
(9, 655, 'guanti'),
(9, 656, 'gambali');

-- --------------------------------------------------------

--
-- Struttura della tabella `consumables`
--

CREATE TABLE `consumables` (
  `type` varchar(31) NOT NULL,
  `id` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `effectType` varchar(255) DEFAULT NULL,
  `healthRestored` int(11) DEFAULT NULL,
  `manaRestored` int(11) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `value` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `consumables`
--

INSERT INTO `consumables` (`type`, `id`, `description`, `name`, `effectType`, `healthRestored`, `manaRestored`, `duration`, `value`) VALUES
('status', 1, 'Ripristina completamente la salute.', 'Essenza della Vitalità', NULL, 120, 0, NULL, NULL),
('time', 2, 'Aumenta la difesa di 5 per 5 turni.', 'Pozione del Sangue di Ferro', 'physic_DEF', NULL, NULL, 5, 5),
('time', 3, 'Rende difficili da colpire, aumentando l’evasione per 3 turni.', 'Gocce di Nebbia Oscura', 'agl', NULL, NULL, 5, 10),
('time', 4, 'Potenzia il danno di 5  per 3 turni.', 'Tonico del Ruggito del Drago', 'dmg', NULL, NULL, 3, 5),
('special', 5, 'Rende immune a danni per 1 turni.', 'Bacche delle Ombre', 'immune', NULL, NULL, NULL, NULL),
('time', 6, 'Aumenta la forza fisica di 5 per 2 turni.', 'Torta del Gigante', 'str', NULL, NULL, 3, 5),
('status', 7, 'Cura una ferita media.', 'Fiore del Rinvigorimento', NULL, 50, 0, NULL, NULL),
('special', 8, 'Infligge danni da fuoco ad area su consumo.', 'Radice del Vulcano Dormiente', 'magic', NULL, NULL, NULL, NULL),
('special', 9, 'Scatena una piccola scarica elettrica all’impatto.', 'Scheggia della Tempesta', 'magic', NULL, NULL, NULL, NULL),
('special', 10, 'Cura una ferita grave al costo di una piccola quantità di salute massima.', 'Cristallo del Sangue Sussurrante', 'hp', NULL, NULL, NULL, NULL),
('special', 11, 'Scatena un cono di fuoco frontale.', 'Pergamena del Soffio Ardente', 'magic', NULL, NULL, NULL, NULL),
('special', 12, 'Teletrasporta il consumatore all’ingresso del dungeon.', 'Sigillo della Fuga Sicura', 'teletrasporto', NULL, NULL, NULL, NULL),
('special', 13, 'Crea uno scudo che riduce il 50% del danno per 3 turni.', 'Pergamena dell’Ombra Protettiva', 'daamgeReduction', NULL, NULL, NULL, NULL),
('special', 14, 'Rallenta i movimenti di un nemico.', 'Olio della Lentezza Eterna', 'slow', NULL, NULL, NULL, NULL),
('special', 15, 'Rende difficili da colpire, riflettendo parte dei danni.', 'Olio della Rifrazione', 'reflect', NULL, NULL, NULL, NULL),
('time', 16, 'Trasforma temporaneamente la pelle in pietra, aumentando la difesa.', 'Unguento della Pelle di Pietra', 'physic_DEF', NULL, NULL, 2, 7),
('special', 17, 'Blocca il movimento di un nemico per 1 turno.', 'Polvere di Stasi', 'statue', NULL, NULL, NULL, NULL),
('special', 18, 'Causa accecamento temporaneo.', 'Cenere del Deserto', 'blind', NULL, NULL, NULL, NULL),
('special', 19, 'Rende un nemico vulnerabile ai danni per 3 trni.', 'Sabbia della Disperazione', 'vulnerable', NULL, NULL, NULL, NULL),
('special', 20, 'Aumenta il danno inflitto, ma riduce l’evasione.', 'Ampolla della Rabbia Controllata', 'special', NULL, NULL, NULL, NULL),
('status', 21, 'Recupera tutto il mana.', 'Siero della Concentrazione Profonda', NULL, 0, 0, NULL, NULL),
('special', 22, 'Raddoppia la forza per 3 turni.', 'Elisir della Forza Divina', 'special', NULL, NULL, NULL, NULL),
('special', 23, 'Rende immuni ai danni magici per 2 turni.', 'Tonico dell’Anima Protetta', 'magic_DEF', NULL, NULL, NULL, NULL),
('special', 24, 'Rianima il consumatore se sconfitto nei successivi 3 turni.', 'Frutto della Rinascita', 'ress', NULL, NULL, NULL, NULL),
('status', 25, 'Ripristina metà della salute.', 'Pane dei Re', NULL, 60, 0, NULL, NULL),
('status', 26, 'Recupera una piccola parte di mana.', 'Cioccolato delle Stelle', NULL, 0, 0, NULL, NULL),
('status', 27, 'Ripristina completamente salute e mana.', 'Acqua dell’Eternità', NULL, 100, 0, NULL, NULL),
('time', 28, 'Aumenta la potenza degli attacchi fisici per 2 turni, ma riduce la precisione.', 'Birra dell’Urlo del Gigante', 'dmg', NULL, NULL, 30, 20),
('special', 29, 'Infligge danni a chi attacca il consumatore.', 'Rosa delle Mille Spine', 'mirror', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Struttura della tabella `item`
--

CREATE TABLE `item` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Struttura della tabella `item_seq`
--

CREATE TABLE `item_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `item_seq`
--

INSERT INTO `item_seq` (`next_val`) VALUES
(751);

-- --------------------------------------------------------

--
-- Struttura della tabella `monsters`
--

CREATE TABLE `monsters` (
  `id` bigint(20) NOT NULL,
  `agility` int(11) NOT NULL,
  `currentHealtPoints` int(11) NOT NULL,
  `healtPoints` int(11) NOT NULL,
  `luck` int(11) NOT NULL,
  `magicDefense` int(11) NOT NULL,
  `mana` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `physicalDefense` int(11) NOT NULL,
  `strength` int(11) NOT NULL,
  `accuracy1` int(11) NOT NULL,
  `accuracy2` int(11) NOT NULL,
  `attack1` varchar(255) NOT NULL,
  `attack2` varchar(255) NOT NULL,
  `damage1` int(11) NOT NULL,
  `damage2` int(11) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `monsters`
--

INSERT INTO `monsters` (`id`, `agility`, `currentHealtPoints`, `healtPoints`, `luck`, `magicDefense`, `mana`, `name`, `physicalDefense`, `strength`, `accuracy1`, `accuracy2`, `attack1`, `attack2`, `damage1`, `damage2`, `description`) VALUES
(1, 5, 5, 5, 0, 5, 0, 'Ombra Strisciante', 5, 5, 100, 80, 'Abbraccio delle Tenebre', 'Oscurità Strisciante', 5, 5, 'Una creatura amorfa fatta di pura oscurità, si muove silenziosamente e avvolge le sue vittime nel buio eterno.'),
(2, 5, 5, 5, 0, 5, 0, 'Lupo della Nebbia', 5, 5, 100, 80, 'Artiglio Spettrale', 'Ritorno nella Nebbia', 5, 5, 'Un lupo spettrale che si dissolve in una fitta nebbia quando viene attaccato, per poi riapparire alle spalle del nemico.'),
(3, 5, 5, 5, 0, 5, 0, 'Drago Fossile', 5, 5, 100, 80, 'Fiato Fossile', 'Artiglio di Pietra', 5, 5, 'Un antico drago non morto, il cui corpo è costituito da ossa incrostate di pietra e minerali.'),
(4, 5, 5, 5, 0, 5, 0, 'Gigante della Frana', 5, 5, 100, 80, 'Pugno Frantumante', 'Valanga', 5, 5, 'Un colosso di roccia vivente, capace di scatenare valanghe con un solo movimento.'),
(5, 5, 5, 5, 0, 5, 0, 'Mietitore delle Anime', 5, 5, 100, 80, 'Taglio della Falce', 'Risucchio d’Anima', 5, 5, 'Una figura scheletrica con una falce incantata, si nutre delle anime dei caduti.'),
(6, 5, 5, 5, 0, 5, 0, 'Serpe Abissale', 5, 5, 100, 80, 'Morso Abissale', 'Tsunami Sottomarino', 5, 5, 'Un enorme serpente marino che emerge dagli abissi per attaccare chiunque osi avvicinarsi alle sue acque.'),
(7, 5, 5, 5, 0, 5, 0, 'Cavaliere Maledetto', 5, 5, 100, 80, 'Spada Maledetta', 'Grido della Dannazione', 5, 5, 'Un guerriero corazzato eternamente legato alla sua arma maledetta, che lo guida in battaglia contro la sua volontà.'),
(8, 5, 5, 5, 0, 5, 0, 'Vermi del Deserto', 5, 5, 100, 80, 'Assalto Sotterraneo', 'Rigurgito di Sabbia', 5, 5, 'Giganteschi vermi che scavano tunnel sotto le dune, pronti a divorare chi si avventura nel loro territorio.'),
(9, 5, 5, 5, 0, 5, 0, 'Arpia delle Lame', 5, 5, 100, 80, 'Danza delle Lame', 'Strillo Paralizzante', 5, 5, 'Una creatura alata con piume affilate come rasoi e un grido che paralizza i suoi nemici.'),
(10, 5, 5, 5, 0, 5, 0, 'Custode del Labirinto', 5, 5, 100, 80, 'Carica Furiosa', 'Colpo d’Ascia', 5, 5, 'Un essere minaccioso con corpo di toro e occhi che brillano di rosso, armato di un’ascia gigantesca.'),
(11, 5, 5, 5, 0, 5, 0, 'Spettro Urlante', 5, 5, 100, 80, 'Grido Straziante', 'Tocco Gelido', 5, 5, 'Un fantasma tormentato il cui grido straziante può spezzare la volontà dei più coraggiosi.'),
(12, 5, 5, 5, 0, 5, 0, 'Idra Venefica', 5, 5, 100, 80, 'Fiato Tossico', 'Morso Rigenerante', 5, 5, 'Una creatura a più teste che sputa veleno mortale, con ogni testa capace di rigenerarsi rapidamente.'),
(13, 5, 5, 5, 0, 5, 0, 'Ragno della Cripta', 5, 5, 100, 80, 'Ragnatela Oscura', 'Morso Necrotico', 5, 5, 'Un aracnide colossale che si nasconde nei cimiteri, avvolgendo le sue prede in ragnatele impregnate di magia oscura.'),
(14, 5, 5, 5, 0, 5, 0, 'Golem di Cristallo', 5, 5, 100, 80, 'Esplosione di Cristallo', 'Corazza Riflettente', 5, 5, 'Un colosso trasparente e scintillante, la cui pelle riflette la luce in accecanti raggi letali.'),
(15, 5, 5, 5, 0, 5, 0, 'Vampiro delle Ombre', 5, 5, 100, 80, 'Sussurro delle Ombre', 'Assorbimento Vitale', 5, 5, 'Un vampiro che si nutre non di sangue, ma dell’energia vitale delle sue vittime, lasciandole deboli e indifese.'),
(16, 5, 5, 5, 0, 5, 0, 'Basilisco del Gelo', 5, 5, 100, 80, 'Sguardo Letale', 'Fiato Ghiacciato', 5, 5, 'Un lucertolone gigantesco il cui sguardo pietrifica e il cui respiro congela tutto ciò che tocca.'),
(17, 5, 5, 5, 0, 5, 0, 'Fenice Oscura', 5, 5, 100, 80, 'Ali Infuocate', 'Rinascita delle Ceneri', 5, 5, 'Un uccello di fuoco nero che risorge ogni volta più potente, lasciando dietro di sé solo cenere e disperazione.'),
(18, 5, 5, 5, 0, 5, 0, 'Troll della Palude', 5, 5, 100, 80, 'Rigenerazione Viscida', 'Colpo Paludoso', 5, 5, 'Un essere massiccio che si mimetizza nel fango e si rigenera rapidamente, rendendolo difficile da uccidere.'),
(19, 5, 5, 5, 0, 5, 0, 'Cacciatore Silente', 5, 5, 100, 80, 'Assalto Invisibile', 'Artigli della Notte', 5, 5, 'Una bestia simile a una pantera, invisibile all’occhio umano finché non è troppo tardi.'),
(20, 5, 5, 5, 0, 5, 0, 'Demone del Caos', 5, 5, 100, 80, 'Metamorfosi Caotica', 'Sussurri Insani', 5, 5, 'Una creatura multiforme che cambia continuamente aspetto, confondendo e terrorizzando i suoi avversari.'),
(21, 5, 5, 5, 0, 5, 0, 'Elementale della Tempesta', 5, 5, 100, 80, 'Scarica Fulminante', 'Tornado Furioso', 5, 5, 'Un’entità composta da pura energia, con un corpo fatto di fulmini e nubi temporalesche.'),
(22, 5, 5, 5, 0, 5, 0, 'Serpente delle Radici', 5, 5, 100, 80, 'Soffocamento Verde', 'Morsa della Natura', 5, 5, 'Una creatura che si muove attraverso le radici degli alberi, avvolgendo le sue prede in un abbraccio soffocante.'),
(23, 5, 5, 5, 0, 5, 0, 'Guardia dell’Abisso', 5, 5, 100, 80, 'Taglio Infuocato', 'Presagio Oscuro', 5, 5, 'Un enorme guerriero con un’armatura nera come la notte e occhi roventi come il magma.'),
(24, 5, 5, 5, 0, 5, 0, 'Bestia Lunare', 5, 5, 100, 80, 'Ululato Lunare', 'Furia Celeste', 5, 5, 'Una creatura ferina che diventa sempre più forte sotto la luce della luna piena.'),
(25, 5, 5, 5, 0, 5, 0, 'Vampiro Cremisi', 5, 5, 100, 80, 'Bacio Cremisi', 'Danza del Sangue', 5, 5, 'Un nobile decaduto trasformatosi in una creatura della notte, il cui mantello è macchiato del sangue delle sue vittime.'),
(26, 5, 5, 5, 0, 5, 0, 'Titano di Pietra', 5, 5, 100, 80, 'Pugno Sismico', 'Frantumazione', 5, 5, 'Un colosso antico scolpito nella roccia, le cui mosse lente nascondono una forza devastante.'),
(27, 5, 5, 5, 0, 5, 0, 'Manticora Selvaggia', 5, 5, 100, 80, 'Morso Feroce', 'Dardo Avvelenato', 5, 5, 'Una bestia feroce con corpo di leone, ali di pipistrello e una coda letale ricoperta di spine velenose.'),
(28, 5, 5, 5, 0, 5, 0, 'Gargoyle di Ferro', 5, 5, 100, 80, 'Ali Taglienti', 'Artigli di Ferro', 5, 5, 'Una statua demoniaca che prende vita quando la notte cala, attaccando chiunque osi disturbare il suo riposo.'),
(29, 5, 5, 5, 0, 5, 0, 'Orco Sanguinario', 5, 5, 100, 80, 'Mazzata Brutale', 'Urlo di Guerra', 5, 5, 'Un guerriero brutale che combatte con pura furia, colpendo con una forza disumana.'),
(30, 5, 5, 5, 0, 5, 0, 'Drago Spettrale', 5, 5, 100, 80, 'Soffio Spettrale', 'Artigli Fantasma', 5, 5, 'Un drago etereo che si manifesta come un’ombra sfocata nel cielo notturno, il suo soffio è pura energia maledetta.'),
(31, 5, 5, 5, 0, 5, 0, 'Serpe del Terrore', 5, 5, 100, 80, 'Sguardo Ipnotico', 'Stretta Mortale', 5, 5, 'Un enorme serpente i cui occhi ipnotizzano le vittime, lasciandole inermi prima di essere divorate.'),
(32, 5, 5, 5, 0, 5, 0, 'Demone Infuocato', 5, 5, 100, 80, 'Esplosione Infernale', 'Fiammata Maledetta', 5, 5, 'Un’entità malvagia che brucia con fiamme infernali, incenerendo tutto ciò che tocca.'),
(33, 5, 5, 5, 0, 5, 0, 'Lupo Spettrale', 5, 5, 100, 80, 'Ululato Spettrale', 'Morso dell’Ombra', 5, 5, 'Un predatore ultraterreno che si muove silenzioso tra le ombre, impossibile da fermare.'),
(34, 5, 5, 5, 0, 5, 0, 'Satiro Ingannatore', 5, 5, 100, 80, 'Melodia Ipnotica', 'Danza Illusoria', 5, 5, 'Una creatura astuta che usa il suono del suo flauto incantato per confondere i suoi avversari.'),
(35, 5, 5, 5, 0, 5, 0, 'Cyclope Devastatore', 5, 5, 100, 80, 'Colpo Titanico', 'Urlo di Rabbia', 5, 5, 'Un gigante con un solo occhio capace di abbattere intere mura con un solo colpo del suo enorme martello.'),
(36, 5, 5, 5, 0, 5, 0, 'Chimera Furiosa', 5, 5, 100, 80, 'Furia Tripla', 'Soffio Fiammeggiante', 5, 5, 'Un mostro con le teste di leone, capra e drago, ognuna dotata di poteri letali.'),
(37, 5, 5, 5, 0, 5, 0, 'Revenant Vendicativo', 5, 5, 100, 80, 'Lama della Vendetta', 'Tocco Gelido', 5, 5, 'Uno spirito non morto animato da un odio eterno, in cerca di vendetta contro i vivi.');

-- --------------------------------------------------------

--
-- Struttura della tabella `rooms`
--

CREATE TABLE `rooms` (
  `id` bigint(20) NOT NULL,
  `room_description` varchar(255) NOT NULL,
  `room_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `rooms`
--

INSERT INTO `rooms` (`id`, `room_description`, `room_name`) VALUES
(1, 'Una stanza con pareti che sembrano muoversi, dando l\'illusione di ombre vive. ', 'Sala delle Ombre'),
(2, 'Un lungo corridoio le cui pareti sono crollate in alcuni punti, lasciando scie di polvere. ', 'Corridoio Rotto'),
(3, 'Un passaggio lungo e stretto dove il suono sembra non esistere. ', 'Galleria del Silenzio'),
(4, 'Un\'enorme stanza vuota, con il soffitto così alto che non si riesce a distinguere dove finisca. ', 'Sala del Vuoto'),
(5, 'Una caverna sotterranea senza alcuna fonte di luce, tranne i tuoi occhi. ', 'Caverna Oscura'),
(6, 'Un ambiente pieno di pietre infrante, resti di un\'antica struttura ormai distrutta. ', 'Stanza delle Pietre Rotte'),
(7, 'Un cortile circondato da mura di pietra, ricoperto di vegetazione selvaggia. ', 'Corte Abbandonata'),
(8, 'Una stanza in cui giacciono vecchi letti rovinati, con coperte strappate e polverose. ', 'Sala del Giaciglio'),
(9, 'Un\'area con rovine e detriti sparsi, resti di antichi manufatti. ', 'Stanza della Rovina'),
(10, 'Una stanza ricoperta di cenere, segno di un fuoco che bruciò tempo fa. ', 'Sala della Cenere'),
(11, 'Un passaggio stretto pieno di ragnatele spesse, trasudanti di mistero. ', 'Galleria delle Ragnatele'),
(12, 'Un luogo umido e gelido, dove gocce d\'acqua sembrano essere lacrime di antiche rovine. ', 'Caverna del Pianto'),
(13, 'Una stanza con armi abbandonate, tutte ricoperte di ruggine e segni di decadenza. ', 'Stanza delle Lame Arrugginite'),
(14, 'Un ambiente in cui ogni suono viene ripetuto in un eco che sembra provenire da lontano. ', 'Sala dell\'Eco'),
(15, 'Un passaggio che mostra vecchie impronte di piedi, forse appartenenti a chi una volta abitava queste terre. ', 'Corridoio delle Impronte'),
(16, 'Una stanza con una corrente d\'aria gelida che percorre l\'intero spazio. ', 'Sala del Respiro Gelido'),
(17, 'Un luogo dove il tempo sembra essersi fermato, ricoperto da uno spesso strato di polvere. ', 'Stanza della Polvere'),
(18, 'Un lungo corridoio nebbioso, dove il fumo si solleva da fessure invisibili nel pavimento. ', 'Galleria del Fumo'),
(19, 'Una stanza enorme, la cui acustica fa sembrare ogni rumore come un potente ruggito. ', 'Sala del Ruggito'),
(20, 'Una stanza dove le piume di corvo sono sparse, e il rumore delle ali echeggia nell\'aria. ', 'Camera del Corvo'),
(21, 'Un passaggio stretto, dove il terreno è crepato e quasi crollato. ', 'Passaggio del Crepaccio'),
(22, 'Un luogo silenzioso in cui si sentono voci sussurrate, difficili da comprendere. ', 'Stanza del Sussurro'),
(23, 'Una galleria dove la neve copre ogni angolo, sebbene non ci sia alcuna finestra. ', 'Galleria della Neve'),
(24, 'Un luogo dove la memoria sembra svanire, come se tutto ciò che accade qui fosse dimenticato. ', 'Caverna dell\'Oblio'),
(25, 'Una stanza dove giacciono resti di antichi crani, simbolo di battaglie passate. ', 'Sala del Teschio'),
(26, 'Un\'area dove il suono di un lamento lontano si fa sempre più forte. ', 'Camera del Lamento'),
(27, 'Una stanza in cui giacciono mummie avvolte in bende di lino, sepolte da tempo immemore. ', 'Sala della Mummia'),
(28, 'Un passaggio stretto dove il vento ulula attraverso fessure nel muro. ', 'Passaggio del Vento'),
(29, 'Un piccolo cortile dove un ruscello di acqua fresca scorre silenziosamente. ', 'Corte dell\'Acqua'),
(30, 'Una stanza coperta da una densa nebbia, che rende difficile vedere oltre pochi passi. ', 'Sala della Nebbia'),
(31, 'Un passaggio ricoperto di specchi antichi che riflettono strani scenari. ', 'Corridoio dei Specchi'),
(32, 'Una stanza che sembra sempre troppo scura, come se la luce stessa fuggisse via. ', 'Stanza della Luce Fuggente'),
(33, 'Una lunga galleria che porta ai resti di vecchi edifici e strutture. ', 'Galleria dei Resti'),
(34, 'Una caverna illuminata da cristalli che brillano come stelle nel buio. ', 'Cave di Cristallo'),
(35, 'Una stanza con un altare antico, coperto di muschio e segni di riti dimenticati. ', 'Sala del Vecchio Altare'),
(36, 'Un passaggio stretto con impronte di lupo incise nel pavimento. ', 'Passaggio del Lupo'),
(37, 'Una stanza piena di strani odori, come se una pozione velenosa fosse stata versata qui. ', 'Stanza del Veleno'),
(38, 'Una caverna che sembra ospitare il corpo di un drago dormiente, avvolto in un sonno eterno. ', 'Caverna del Drago Dormiente'),
(39, 'Una stanza con un antico pozzo nel centro, da cui proviene un rumore misterioso. ', 'Stanza del Pozzo'),
(40, 'Una stanza piena di rovi e spine che crescono ovunque, minacciando chiunque vi entri. ', 'Sala delle Spine'),
(41, 'Un corridoio in cui la luce che filtra sembra essere priva di vita, quasi fantasmagorica. ', 'Corridoio della Luce Morta'),
(42, 'Una sala macchiata di un oscuro liquido, testimone di antiche battaglie. ', 'Stanza del Sangue'),
(43, 'Una stanza in cui si possono sentire le voci di coloro che sono stati dimenticati nel tempo. ', 'Camera delle Voci Perdute'),
(44, 'Un passaggio fangoso che rende difficile ogni movimento, ogni passo è una fatica. ', 'Corridoio del Fango'),
(45, 'Una stanza piena di antiche catene arrugginite, come se un prigioniero fosse stato legato qui secoli fa. ', 'Sala delle Catene'),
(46, 'Un passaggio che emette un suono inquietante, come se qualcuno stesse piangendo. ', 'Passaggio del Lamento'),
(47, 'Una stanza in cui la luce del sole sembra diminuire, creando un\'atmosfera di decadenza. ', 'Sala del Sole Morente'),
(48, 'Un luogo dove si percepisce una presenza inquietante, come se un\'anima cercasse di liberarsi. ', 'Stanza dell\'Anima Perduta'),
(49, 'Una caverna buia dove non esiste giorno, solo un\'oscurità che avvolge tutto. ', 'Caverna dell\'Eterna Notte'),
(50, 'Un cortile silenzioso dove il tempo sembra fermarsi, intrappolato nell\'eternità. ', 'Corte dell\'Oblio'),
(51, 'Una stanza che provoca un senso di malessere, come se qualcosa di minaccioso stesse accadendo. ', 'Stanza dell\'Inquietudine'),
(52, 'Un passaggio che sembra condurre al cuore di una foresta misteriosa, popolata da lupi. ', 'Passaggio del Lupo Grigio'),
(53, 'Un cortile dove le ombre sono più vive e mobili di quanto dovrebbero essere. ', 'Corte delle Ombre'),
(54, 'Un ambiente che sembra aspettare la luce dell\'alba, con una calma surreale. ', 'Stanza dell\'Alba'),
(55, 'Un passaggio con ritratti di volti che sembrano osservarti mentre cammini. ', 'Galleria dei Mille Volti'),
(56, 'Una stanza piena di trappole nascoste, pronte a scattare al minimo errore. ', 'Sala della Trappola'),
(57, 'Una stanza dove il pavimento sembra corroso da un antico potere oscuro. ', 'Camera del Cuore Corroso'),
(58, 'Una sala in cui un fiume scorre al contrario, come se il tempo stesso fosse distorto. ', 'Sala del Fiume Invertito'),
(59, 'Un passaggio che sembra cambiare forma a ogni passo, ingannando chi vi entra. ', 'Corridoio dell\'Illusione'),
(60, 'Una stanza illuminata da una fiamma blu che non emette calore, ma una strana energia. ', 'Stanza della Fiamma Blu'),
(61, 'Un corridoio che porta a un antico tempio ormai distrutto. ', 'Passaggio del Tempio Caduto'),
(62, 'Una stanza dove antichi giuramenti sono stati fatti, lasciando dietro di sé un\'energia palpabile. ', 'Sala del Giuramento'),
(63, 'Una caverna dove le visioni oniriche prendono vita, confondendo la realtà. ', 'Caverna dei Sogni'),
(64, 'Un ambiente caotico, dove ogni angolo sembra disordinato e senza senso. ', 'Stanza del Caos'),
(65, 'Un corridoio che sembra attraversato da fiamme invisibili che bruciano senza consumarsi. ', 'Passaggio delle Fiamme'),
(66, 'Una stanza che mette alla prova la sanità mentale di chi vi entra, con suoni e visioni distorte. ', 'Sala della Follia'),
(67, 'Un cortile dove ogni respiro sembra trasformarsi in un sussurro inquietante. ', 'Corte dei Sospiri'),
(68, 'Un passaggio che emana una strana energia rossa, come se provenisse dalle profondità infernali. ', 'Galleria dell\'Inferno'),
(69, 'Un piccolo cortile illuminato da una luce che sembra provenire da un sole invisibile, ma che resta costantemente al tramonto. ', 'Corte del Sole Nascente'),
(70, 'Una stanza che emana un freddo glaciale, con lastre di ghiaccio che sembrano scolpite dalla mano di un antico artigiano. ', 'Sala del Gelo Eterni'),
(71, 'Un corridoio nascosto dietro una parete, che porta a una stanza dimenticata da tutti, ma piena di segreti. ', 'Passaggio del Segreto'),
(72, 'Un luogo che sembra un angolo del mondo dove il tempo si è fermato, ma qualcosa qui sembra essere in attesa di un risveglio imminente. ', 'Stanza del Risveglio'),
(73, 'Una grotta in cui venti irregolari soffiano da tutte le direzioni, trasportando echi lontani di voci incomprensibili. ', 'Caverna dei Venti Perduti'),
(74, 'Un passaggio avvolto da una fragranza sottile e misteriosa, che sembra provenire da una pianta estinta da secoli. ', 'Galleria del Profumo Dimenticato'),
(75, 'Una sala piena di specchi rotti, i cui frammenti riflettono immagini distorte di ciò che ti circonda. ', 'Sala dei Riflessi Distrutti'),
(76, 'Un lungo corridoio che sembra pulsare di energia, come se qualcosa di vitale fosse stato strappato via. ', 'Passaggio del Cuore Infranto'),
(77, 'Una grotta dove il suono di un lamento etereo sembra rimbombare dalle pareti rocciose. ', 'Caverna del Lamento'),
(78, 'Una stanza immersa nell\'oscurità, ma la luce pallida di una luna nera riesce comunque a filtrare attraverso fessure invisibili. ', 'Stanza della Luna Nera'),
(79, 'Una stanza il cui soffitto è come un cielo notturno, dove stelle di luce fredda sembrano cadere in un lento, continuo scorrere. ', 'Sala delle Stelle Cadenti'),
(80, 'Un passaggio umido, i cui muri sembrano piangere, con piccole gocce d\'acqua che scivolano lungo la pietra. ', 'Corridoio delle Lacrime'),
(81, 'Una stanza dove le pareti sono macchiate di rosso scuro, come se fossero state bagnate dalle lacrime di una sofferenza immensa. ', 'Stanza delle Lacrime di Sangue'),
(82, 'Un cortile coperto da una miriade di foglie secche che scricchiolano sotto i piedi di chi ci cammina sopra. ', 'Corte delle Foglie Cadute'),
(83, 'Un passaggio che sembra turbare chiunque lo percorra, come se l\'ambiente stesso stesse osservando ogni movimento. ', 'Passaggio dell\'Inquietudine'),
(84, 'Una sala avvolta in un\'oscurità che sembra inghiottire tutto ciò che vi entra, tranne chi ha il coraggio di affrontarla. ', 'Sala delle Tenebre Affamate'),
(85, 'Un buio profondo, dove piccole voci sembrano provenire dalle pietre, come se il mondo stesso volesse comunicare. ', 'Caverna dei Sussurri'),
(86, 'Una stanza che sembra priva di ogni valore, ma che nasconde misteri sotto il pavimento e tra le pareti. ', 'Stanza dei Segreti Celati'),
(87, 'Un passaggio adornato da fiori secchi, ormai privi di colore ma che sembrano raccontare storie di tempi lontani. ', 'Galleria dei Fiori Appassiti'),
(88, 'Un corridoio rosso, dove il pavimento sembra scolpito nel sangue, con tracce di antiche battaglie. ', 'Corridoio del Sangue Eterno'),
(89, 'Una stanza che emula l’ambiente di un deserto, con dune di sabbia che sembrano muoversi da sole. ', 'Sala del Deserto Nascosto'),
(90, 'Un luogo dove ogni oggetto sembra essere in bilico, come se il minimo movimento potesse distruggere l\'armonia dell\'ambiente. ', 'Stanza dell\'Equilibrio Perduto'),
(91, 'Un passaggio che è avvolto da una nebbia spessa, che distorce la realtà di chiunque vi passi attraverso. ', 'Galleria della Nebbia Oscura'),
(92, 'Un grande ambiente dove il pavimento e le pareti sembrano fatte di pietra viva, pulsando come se fossero una parte del cuore del mondo. ', 'Sala del Cuore di Pietra'),
(93, 'Un luogo dove le voci dei visitatori passati si perdono nell’aria, come se fossero evaporate insieme al tempo. ', 'Caverna delle Voci Scomparse'),
(94, 'Una stanza in cui la luce scompare lentamente, dando l’impressione che ogni raggio stia morendo nell\'oscurità. ', 'Stanza della Luce Morente'),
(95, 'Un corridoio buio dove il giorno non sembra mai arrivare, come se il ciclo delle ore fosse stato interrotto per sempre. ', 'Passaggio della Notte Eterna'),
(96, 'Una stanza in cui l\'ombra di qualcosa di grande e misterioso si staglia contro le pareti, ma nessuno sa da dove provenga. ', 'Stanza dell\'Ombra Gigante'),
(97, 'Un ambiente in cui un\'energia invisibile sembra fluttuare nell\'aria, creando una sensazione di pesantezza e inquietudine. ', 'Sala delle Forze Insondabili'),
(98, 'Un passaggio che sembra crollare lentamente, con pietre che si staccano continuamente dalle pareti. ', 'Corridoio della Rovina Crescente'),
(99, 'Una stanza dove una grande pietra lucente simula la forma di una lacrima, e si dice che chi la guarda possa intravedere il futuro. ', 'Stanza della Lacrima del Drago'),
(100, 'Un buco nel terreno, dove sembra non esserci niente se non il nulla stesso, un\'assenza che inghiotte ogni cosa. ', 'Caverna del Vuoto Assoluto'),
(101, 'Un passaggio che sembra sempre sospeso tra la luce del giorno e l\'oscurità della notte, un confine fra due mondi. ', 'Passaggio del Crepuscolo'),
(102, 'Un lungo corridoio il cui pavimento è decorato con simboli sconosciuti, come se fosse stato creato per guidare un\'anima smarrita. ', 'Galleria dell\'Anima Perduta'),
(103, 'Una stanza in cui una fiamma ardente splende intensamente, ma in modo instabile, come se stesse per spegnersi da un momento all\'altro. ', 'Sala della Fiamma Spezzata'),
(104, 'Un piccolo cortile dove il vento soffia in solitudine, senza essere disturbato da alcun altro suono. ', 'Corte del Vento Solitario'),
(105, 'Una grotta che possiede una finestra rossa attraverso la quale non si può vedere niente, tranne un bagliore inquietante. ', 'Caverna della Finestra Rossa'),
(106, 'Una stanza in cui una fonte di acqua silenziosa scorre lentamente, ma nessun suono accompagna il suo flusso. ', 'Stanza della Fonte Silenziosa'),
(107, 'Un luogo dove si trovano vecchi frammenti di storie e ricordi dimenticati, custoditi in antiche urne e scatole di legno. ', 'Sala delle Memorie Perdute'),
(108, 'Un passaggio dove ogni passo sembra condurre a una direzione che cambia all\'improvviso, come se il destino stesso fosse rotto. ', 'Passaggio del Destino Infranto'),
(109, 'Una stanza che contiene solo una porta sigillata, che non sembra aprirsi né essere mai stata utilizzata. ', 'Stanza della Porta Chiusa'),
(110, 'Un passaggio solitario, senza altri suoni che i tuoi passi, un posto dove nessun altro sembra mai passare. ', 'Galleria della Solitudine'),
(111, 'Un luogo che ospita rovine dimenticate da tutti, come se il tempo stesso avesse deciso di ignorarle. ', 'Caverna dei Resti Perduti'),
(112, 'Una stanza dove si dice che le ombre non siano solo ombre, ma manifestazioni di qualcosa che è stato perduto per sempre. ', 'Sala dell\'Anima Oscura'),
(113, 'Un corridoio dove le immagini e i suoni sembrano diventare sfocati, come se si stesse vivendo un sogno che sta svanendo. ', 'Passaggio del Sogno Infranto'),
(114, 'Una sala che ti offre visioni misteriose, che sembrano rivelare qualcosa di oscuro e antico, ma che subito svaniscono non appena tenti di comprenderle. ', 'Sala dell\'Oscura Rivelazione'),
(115, 'Un luogo dove ogni rumore si dissolve prima di essere percepito, lasciando un silenzio quasi insostenibile. ', 'Caverna del Silenzio Assoluto'),
(116, 'Una stanza in cui la luna si riflette sulla superficie di acqua, ma l\'immagine è distorta, come se la luce fosse piegata. ', 'Stanza della Luna Flessa'),
(117, 'Un cortile dove niente è come sembra, e dove le illusioni visive prendono il posto della realtà. ', 'Corte delle Illusioni'),
(118, 'Una sala dove una spada spezzata giace al centro, con il suo potere distrutto ma ancora avvolta da una forza misteriosa. ', 'Sala della Spada Infranta'),
(119, 'Un passaggio oscuro dove le ombre sembrano muoversi velocemente, come se avessero una vita propria, sfuggendo alla tua vista. ', 'Corridoio delle Ombre Fuggenti'),
(120, 'Una stanza dove un fiume scorre in aria, senza un letto visibile, e l’acqua fluisce senza mai toccare il suolo. ', 'Stanza del Fiume Sospeso'),
(121, 'Una grotta in cui le pietre emettono vibrazioni sottili, come se fossero ricoperte da una forza misteriosa. ', 'Caverna delle Pietre Vibranti'),
(122, 'Un passaggio oscuro dove lame appese alle pareti emettono sussurri leggeri, raccontando storie di battaglie passate. ', 'Galleria delle Lame Sussurranti'),
(123, 'Una stanza avvolta da una nebbia fitta che sembra inghiottire la luce, lasciando solo ombre indistinte. ', 'Sala della Nebbia Perduta'),
(124, 'Un corridoio che sembra non finire mai, con pareti che si estendono all’infinito, ingannando chi cerca di uscirne. ', 'Corridoio del Muro Infinito'),
(125, 'Una sala splendente, dove una grande pietra di cristallo batte come un cuore pulsante, illuminando l\'intero spazio. ', 'Stanza del Cuore di Cristallo'),
(126, 'Una sala decorata con frammenti di oggetti spezzati e antichi, che sembrano raccontare storie di tempi lontani, ora perduti. ', 'Sala dei Frammenti Dimenticati'),
(127, 'Una grotta con un pavimento cosparso di polvere scintillante, come se fosse stata depositata da stelle che si sono spente. ', 'Caverna della Polvere di Stelle'),
(128, 'Un corridoio avvolto in un’oscurità totale, dove le ombre non si muovono e sembrano essere intrappolate in un silenzio eterno. ', 'Passaggio delle Ombre Mute'),
(129, 'Una stanza dove la luce della luna sembra frantumarsi in mille pezzi, creando un’illusione di frammenti irregolari e inafferrabili. ', 'Stanza della Luna Spezzata'),
(130, 'Un passaggio in cui il sussurro di voci lontane sembra crescere di intensità, distorcendo la realtà e mettendo alla prova la sanità mentale. ', 'Galleria della Follia Sussurrante'),
(131, 'Un luogo dove il vento sferza forte ma senza fare rumore, creando un\'inquietante sensazione di calma in mezzo alla furia. ', 'Caverna della Tempesta Silenziosa'),
(132, 'Una stanza dove gocce di fuoco cadono dal soffitto, lasciando scie incandescenti che illuminano debolmente l\'ambiente. ', 'Stanza delle Lacrime di Fuoco'),
(133, 'Un corridoio che incute una sensazione di costante inquietudine, come se qualcosa stesse osservando ogni tuo movimento. ', 'Passaggio del Sospetto'),
(134, 'Una grotta dove una rugiada perenne scende dalle pareti, creando una costante umidità che permea l’aria. ', 'Caverna della Rugiada Perpetua'),
(135, 'Un vasto spazio in cui il tempo sembra rallentare, e l\'attesa di qualcosa di indefinito cresce con ogni passo che fai. ', 'Sala della Lunga Attesa'),
(136, 'Una stanza immersa in un’atmosfera onirica, dove immagini frammentate e sogni incompleti prendono forma nelle ombre. ', 'Stanza dei Sogni Spezzati'),
(137, 'Un passaggio dove l’acqua sembra fluire dalle pareti, coprendo il pavimento in un sottile strato che rende ogni passo scivoloso. ', 'Corridoio delle Acque Fluide'),
(138, 'Una stanza dove ogni riflesso nelle superfici lucide è distorto, mostrando scene che non corrispondono alla realtà. ', 'Sala dei Riflessi Distorti'),
(139, 'Una grotta in cui la luce sembra essere intrappolata in piccole sfere di cristallo, che brillano solo quando sono osservate. ', 'Caverna della Luce Imprigionata'),
(140, 'Un corridoio dove l’aria è densa di presenze invisibili, come se le anime di chi ha attraversato questo luogo fossero rimaste imprigionate. ', 'Passaggio delle Anime Svanite'),
(141, 'Una stanza dove un fiore di colore nero brillante emette una luce debole, come se fosse il cuore stesso della notte. ', 'Stanza del Fiore Della Notte'),
(142, 'Un passaggio in cui ogni suono che fai si ripete in un’eco lontana, ma ogni volta in modo diverso, come se il passato stesse rispondendo. ', 'Galleria dell’Eco Perduto'),
(143, 'Una stanza che sembra essere vuota, ma una porta appena visibile si apre senza che nessuno la tocchi, come se una presenza invisibile l\'avesse appena attraversata. ', 'Stanza della Porta Aperta'),
(144, 'Un passaggio dove l\'aria è umida e le ombre sembrano essere fatte di ruggine, distorte e minacciose. ', 'Corridoio delle Ombre Rugginose'),
(145, 'Una stanza dove la mente sembra svanire a ogni passo, come se ogni pensiero fosse risucchiato da un misterioso vuoto. ', 'Stanza dei Pensieri Perduti'),
(146, 'Una grotta dove si percepisce la presenza di desideri non esauditi, vibrazioni che oscillano tra speranza e disperazione. ', 'Caverna del Desiderio Non Ascoltato'),
(147, 'Una sala il cui pavimento è coperto da ceneri finissime, testimoni di un incendio che non ha mai cessato di ardere nel cuore della stanza. ', 'Sala delle Ceneri di Fuoco'),
(148, 'Un passaggio dove sembra che qualcosa ti stia osservando, ma ogni volta che cerchi di guardare, non riesci a individuare nulla di concreto. ', 'Galleria dell’Invisibile Presenza'),
(149, 'Un corridoio che sembra sussurrare senza fare rumore, come se l’aria stessa fosse piena di presenze che non vogliono essere sentite. ', 'Corridoio del Vento Muto'),
(150, 'Una stanza dove il tempo sembra essersi fermato, le immagini delle pareti raccontano storie che non hanno mai avuto un finale. ', 'Sala della Storia Sospesa'),
(151, 'Una grotta in cui i ricordi di chi l\'ha visitata svaniscono lentamente, lasciando solo ombre che raccontano storie mai vissute. ', 'Caverna dei Memori Perduti'),
(152, 'Una stanza che sembra essere priva di qualsiasi suono, come se l’infinito stesso si fosse fermato in questo angolo dimenticato. ', 'Stanza dell’Infinito Silenzioso'),
(153, 'Un passaggio illuminato solo dalla luce di una luna che sembra non essere mai al suo posto, confusa e smarrita nel cielo. ', 'Passaggio della Luna Smarrita'),
(154, 'Un luogo dove antiche ossa e carcasse giacciono in completa immobilità, testimoniando la caduta di qualcosa di grande e potente. ', 'Sala delle Carcasse Antiche'),
(155, 'Una grotta in cui il pavimento sembra respirare, gonfiandosi e sgonfiandosi come se fosse una creatura vivente. ', 'Caverna della Terra che Respira'),
(156, 'Una stanza dove un suono di pianto interminabile riecheggia dalle pareti, come se il dolore avesse preso forma in un lamento perpetuo. ', 'Stanza del Pianto Eterno'),
(157, 'Un passaggio che si illumina in modo innaturale, ma la luce è distorta e lontana dalla comprensione di chi ci entra. ', 'Galleria dell’Oscura Illuminazione'),
(158, 'Un corridoio dove il freddo è così intenso che l’aria sembra cristallizzarsi, come se l’alba fosse stata bloccata nel momento del suo arrivo. ', 'Passaggio dell’Alba Congelata'),
(159, 'Una stanza dove la polvere sembra sospesa nell’aria, ma ogni particella è immersa nell’ombra, creando una sensazione di vuoto incompleto. ', 'Sala della Polvere d’Ombra'),
(160, 'Un passaggio che ospita diverse porte, ma nessuna chiave può aprirle, rendendo ogni tentativo vano e frustrante. ', 'Corridoio delle Porte Senza Chiave'),
(161, 'Una stanza dove una luna di un verde brillante illumina l’ambiente, proiettando ombre che sembrano animarsi. ', 'Stanza della Luna Verde'),
(162, 'Un lungo passaggio in cui ogni pietra che tocca il suolo emette un suono profondo, ma il significato di quei suoni rimane misterioso. ', 'Galleria delle Pietre Insondabili'),
(163, 'Una grotta che sembra essere un frammento di cielo, con nuvole statiche che galleggiano nel buio, spezzando l’illusione di spazio aperto. ', 'Caverna dei Cieli Spezzati'),
(164, 'Un luogo dove l’aria sembra gelarsi al punto da fermarsi, come se ogni respiro diventasse cristallo di ghiaccio nell’istante in cui viene emesso. ', 'Stanza del Respiro di Ghiaccio'),
(165, 'Una stanza immersa in una nebbia fitta, dove non c’è traccia di vento, ma la sensazione che qualcosa stia cambiando nell’aria. ', 'Sala della Nuvola Silente'),
(166, 'Un corridoio dove il suono di un canto misterioso riempie l’aria, ma nessuna voce è mai udita. ', 'Passaggio del Canto Silenzioso'),
(167, 'Una stanza dove le voci di coloro che sono passati si sentono deboli, quasi impercettibili, ma sempre lì, come un’eco lontana. ', 'Stanza delle Voci Svanite'),
(168, 'Una grotta in cui il buio non è statico, ma pulsa, quasi come se fosse vivo e in continua evoluzione. ', 'Caverna del Buio Pulsante'),
(169, 'Una stanza dove ogni lacrima che è mai stata versata si è congelata, formando stalattiti di ghiaccio che riflettono una luce tenue. ', 'Stanza delle Lacrime Congelate'),
(170, 'Un passaggio che sembra respirare in modo regolare, come se l’intero spazio fosse vivo, ma privo di una forma visibile. ', 'Passaggio del Respiro Infinito'),
(171, 'Un corridoio dove fiamme danzanti scompaiono non appena si tenta di avvicinarsi, lasciando solo una scia di fumo che svanisce. ', 'Corridoio della Fiamma Fuggente'),
(172, 'Una sala in cui un fiume scorre nel buio, le acque nere si muovono come ombre, inghiottendo tutto ciò che vi entra. ', 'Sala del Fiume di Ombre'),
(173, 'Una grotta con pareti che sembrano immerse nell’acqua, ma nessun rumore di onde è mai udito, solo un silenzio gelido. ', 'Caverna dell’Oceano Silenzioso'),
(174, 'Un ambiente dove enormi radici di alberi antichi emergono dal pavimento, cercando di afferrare chi vi entra, ma mai arrivando a toccare. ', 'Stanza delle Radici Dimenticate'),
(175, 'Un passaggio con pareti di vetro che riflettono immagini distorte, mentre lame sottili di vetro si spezzano in silenzio lungo il pavimento. ', 'Galleria delle Lame di Vetro'),
(176, 'Una grotta dove un’energia invisibile sembra tener sospeso tutto ciò che vi entra, lasciando ogni oggetto nell’aria, senza mai toccare il suolo. ', 'Caverna della Forza Sospesa'),
(177, 'Un corridoio dove voci sinistre sembrano sussurrare nella tua mente, ma ogni parola resta indecifrabile, come se fossero lingue dimenticate. ', 'Passaggio delle Voci Oscure'),
(178, 'Una stanza dove il ghiaccio ricopre ogni superficie, ma nonostante il freddo, non si avverte alcuna sensazione di congelamento. ', 'Stanza del Gelo Impassibile'),
(179, 'Una sala avvolta nel silenzio, ma ogni suono che vi proviene sembra amplificato, come se il silenzio stesso fosse un messaggio. ', 'Sala del Silenzio Rivelatore'),
(180, 'Una grotta dove sembra che chiunque ci riposi non possa mai completare il suo sonno, come se fosse intrappolato in un sogno senza fine. ', 'Caverna del Sonno Eternamente Incompleto'),
(181, 'Un passaggio dove non si può sentire l’aria, ma qualcosa ti fa percepire che in realtà l’aria stessa è fuggita via, lasciandoti senza fiato. ', 'Passaggio del Respiro Inesistente'),
(182, 'Una stanza dove l’aria sembra essere troppo densa, come se un’energia invisibile pesasse su chiunque osi entrarvi. ', 'Stanza del Vuoto Pesante'),
(183, 'Un passaggio che è illuminato da una luce fioca, ma non c’è gioia in essa, solo una tristezza che permea ogni angolo. ', 'Galleria della Luce Triste'),
(184, 'Una grotta dove la rugiada che scende dalle pareti è nera, creando un contrasto inquietante con il resto dell’ambiente. ', 'Caverna della Rugiada Nera'),
(185, 'Una stanza dove tutto appare diverso da come è in realtà, le forme e le dimensioni sembrano cambiare ogni volta che guardi. ', 'Stanza della Percezione Distorta'),
(186, 'Un corridoio dove il tempo sembra essersi fermato, nessun passo rimbomba, nessun suono viene registrato, tutto rimane immobile. ', 'Passaggio del Tempo Congelato'),
(187, 'Una stanza dove un soffio freddo e misterioso sembra provenire da ogni direzione, ma non c’è alcuna fonte visibile di vento. ', 'Sala del Soffio Misterioso'),
(188, 'Un passaggio che conduce a una finestra che non mostra nulla all’esterno, solo un vuoto infinito e un senso di perdita. ', 'Corridoio della Finestra Vuota'),
(189, 'Una sala dove enormi pietre levitano nell’aria, sospese da una forza invisibile, creando un’atmosfera surreale e inquietante. ', 'Stanza della Pietra Sospesa'),
(190, 'Un passaggio decorato con immagini di epoche passate, che sembrano svanire e riapparire come un’illusione che sfugge alla comprensione. ', 'Galleria del Passato Lontano'),
(191, 'Una stanza dove i pensieri sembrano congelarsi nell’aria, intrappolando chi ci entra in un circolo vizioso di riflessioni. ', 'Sala della Mente Fissata'),
(192, 'Una grotta in cui una luce fioca illumina tutto, ma è fredda e senza vita, come se fosse l’ultima luce rimasta dopo la fine. ', 'Caverna della Luce Morta'),
(193, 'Un corridoio in cui il vento non si muove mai, ma una sensazione di aria in movimento ti accompagna come una presenza costante. ', 'Passaggio del Vento Fermato'),
(194, 'Una stanza dove le ombre non sono morbide e fluide, ma sembrano avere una consistenza visibile, crude e pesanti. ', 'Stanza delle Ombre Crude'),
(195, 'Una grotta che cambia continuamente, facendo sembrare ogni passaggio diverso ogni volta che si attraversa, ingannando il viaggiatore. ', 'Caverna dell’Inganno'),
(196, 'Un corridoio illuminato da luci intermittenti che svaniscono all\'improvviso, lasciando nel buio momenti di totale oscurità. ', 'Passaggio delle Luci Eclissate'),
(197, 'Una stanza che emana un’energia sconosciuta, che sembra spingere contro di te, cercando di sopraffarti con la sua forza invisibile. ', 'Stanza della Forza Oscura'),
(198, 'Un passaggio dove tutto sembra pesante ma, al contempo, una sensazione di leggerezza ti avvolge, come se la gravità non esistesse. ', 'Galleria del Peso Leggero');

-- --------------------------------------------------------

--
-- Struttura della tabella `traps`
--

CREATE TABLE `traps` (
  `id` bigint(20) NOT NULL,
  `damage` int(11) NOT NULL,
  `trap_description` varchar(255) NOT NULL,
  `trap_skillCheck` varchar(255) NOT NULL,
  `failure` varchar(255) NOT NULL,
  `trap_name` varchar(255) NOT NULL,
  `stat` varchar(255) NOT NULL,
  `success` varchar(255) NOT NULL,
  `value` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `traps`
--

INSERT INTO `traps` (`id`, `damage`, `trap_description`, `trap_skillCheck`, `failure`, `trap_name`, `stat`, `success`, `value`) VALUES
(1, 50, 'Un sottile strato di assi marce e foglie secche nasconde una voragine profonda. Appena ci si cammina sopra, il terreno cede di colpo.', 'Prova: Tiro di Agilità (Dado 16+) per scattare indietro un attimo prima di precipitare nel vuoto.', 'Il terreno cede di colpo sotto il tuo peso e precipiti nel buio. Un impatto doloroso ti lascia senza fiato mentre senti il sapore del sangue in bocca.', 'Pozzo Camuffato', 'agl', 'Ti fermi all\'ultimo istante, mentre il terreno sotto ai tuoi piedi si sgretola rivelando l\'abisso sottostante. Con un balzo all\'indietro, eviti la caduta mortale.', 16),
(2, 50, 'Piccoli fori sulle pareti rivelano la presenza di meccanismi pronti a scagliare dardi imbevuti di veleno al minimo movimento.', 'Prova: Tiro di fortuna (Dado 16+) per notare le fessure prima di attraversare il corridoio e aggirarle.', 'Un sibilo taglia l’aria, seguito da una fitta lancinante. Ti tocchi la spalla e senti il dardo conficcato nella carne, mentre il veleno inizia a farsi strada nelle tue vene.', 'Dardi Avvelenati', 'luck', 'Noti le sottili fessure nei muri e, con estrema cautela, schivi il passaggio letale senza far scattare i meccanismi.', 16),
(3, 50, 'Due enormi lame affilate emergono dalle pareti e si muovono in un movimento ritmico, pronte a tagliare in due chiunque non calcoli bene il tempismo.', 'Prova: Tiro di Agilità (Dado 18+) per eseguire un rapido scatto tra una lama e l’altra senza venire colpito.', 'Sbagli i tempi e una lama ti colpisce con violenza, lasciando un profondo taglio sul tuo fianco. Il dolore ti annebbi la vista, ma devi andare avanti.', 'Lame Oscillanti', 'agl', 'Aspetti il momento giusto e ti lanci tra le lame con una precisione perfetta. Il suono del metallo che sfiora l’aria è l’unica cosa che lasci alle tue spalle.', 18),
(4, 50, 'Un pesante masso viene rilasciato da una rampa nascosta nel soffitto, precipitando con forza schiacciante lungo il corridoio.', 'Prova: Tiro di Forza (Dado 17+) per spingere via un compagno o saltare in una nicchia laterale prima di essere travolto.', 'Tentando di correre, inciampi rovinosamente. Il masso ti colpisce di striscio, scaraventandoti a terra con una forza brutale.', 'Masso Rotolante', 'str', 'Il fragore alle tue spalle si fa sempre più forte, ma con un ultimo scatto ti getti in una nicchia sicura. Il masso passa oltre, mancando per un soffio la tua testa.', 17),
(5, 50, 'Alcune mattonelle del pavimento affondano sotto il peso di chi ci cammina sopra, attivando un meccanismo letale come frecce o punte che escono dal soffitto.', 'Prova: Tiro di fortuna (Dado 11+) per accorgersi della leggera differenza tra le mattonelle normali e quelle trappola.', 'Un leggero clic sotto il piede è l’unico avvertimento prima che una raffica di frecce ti colpisca di lato.', 'Pavimento a Pressione', 'luck', 'Il tuo sguardo attento individua la mattonella sospetta, e con attenzione scegli il percorso sicuro, evitando la trappola.', 11),
(6, 50, 'Fili quasi invisibili attraversano il passaggio, e una volta toccati fanno scattare una rete di ragnatela magica che immobilizza chiunque vi resti impigliato.', 'Prova: Tiro di Agilità (Dado 17+) per passare agilmente senza far scattare la trappola.', 'Uno strattone accidentale e in un istante la ragnatela ti avvolge. I tuoi arti sono bloccati e la sostanza appiccicosa ti impedisce di liberarti.', 'Ragnatela Appiccicosa', 'agl', 'Con movimenti leggeri e precisi, passi attraverso i fili sottili senza nemmeno sfiorarli. La trappola rimane silenziosa.', 17),
(7, 50, 'Un piedistallo di pietra rilascia improvvisamente una fiammata ardente quando un certo peso viene applicato sul pavimento.', 'Prova: Tiro di Resistenza Magica (Dado 16+) per resistere al calore e superare l’area senza riportare ustioni gravi.', 'Il fuoco esplode davanti a te, bruciandoti il braccio. L’odore di carne bruciata ti fa stringere i denti dal dolore.', 'Colonna di Fuoco', 'magic_d', 'Noti il piedistallo e ti sposti prima che la fiammata divampi. L’aria diventa rovente, ma ne esci illeso.', 16),
(8, 50, 'Una statua dall’aspetto inquietante emana una nebbia verdastra quando si varca la soglia, riempiendo l’aria con un veleno soffocante.', 'Prova: Tiro di Forza (Dado 18+) per trattenere il respiro e attraversare rapidamente l’area senza respirare il gas.', 'Ti manca il fiato e un colpo di tosse ti tradisce. Il veleno entra nei polmoni, facendoti girare la testa mentre le forze iniziano ad abbandonarti.', 'Gas Velenoso', 'str', 'Trattieni il respiro e corri attraverso la nebbia verdastra. L’aria tossica sfiora la tua pelle, ma riesci a non inalarne nemmeno un soffio.', 18),
(9, 50, 'Oscure catene si animano dal nulla e tentano di avvolgere i malcapitati, stringendosi con forza per immobilizzarli.', 'Prova: Tiro di Forza (Dado 14+) per spezzare le catene prima che si serrino del tutto.', 'Le catene si serrano con una forza innaturale, bloccandoti in una morsa d’acciaio. Più ti dimeni, più stringono.', 'Catene Animate', 'str', 'Con un colpo di forza bruta spezzi le catene prima che possano stringersi del tutto attorno a te. I resti metallici tintinnano ai tuoi piedi.', 14),
(10, 50, 'Il pavimento si apre improvvisamente, rivelando una fossa piena di spuntoni affilati, pronta a impalare chiunque cada dentro.', 'Prova: Tiro di Agilità (Dado 15+) per eseguire un salto acrobatico all’indietro e atterrare in sicurezza.', 'Il suolo sparisce sotto i tuoi piedi e precipiti. Riapri gli occhi dolorante tra le punte affilate, miracolosamente ancora in vita.', 'Trappola a Spuntoni', 'agl', 'Ti accorgi appena in tempo del pavimento che cede e con un’agile capriola atterri al sicuro, lontano dal baratro.', 15),
(11, 50, 'Una grata di ferro si sgancia dal soffitto e cade rapidamente, imprigionando chiunque si trovi sotto di essa.', 'Prova: Tiro di Agilità (Dado 13+) per scattare fuori dall’area prima che la trappola si chiuda.', 'Il metallo piomba su di te con un tonfo sordo. Ti ritrovi in una gabbia, senza via di fuga.', 'Gabbia Cadente', 'agl', 'Scatti in avanti, sentendo il rumore della grata che si schianta dietro di te. Un secondo più lento e saresti stato intrappolato.', 13),
(12, 50, 'Un sottile strato d’acqua copre il pavimento, e quando viene calpestato attiva una scarica elettrica mortale.', 'Prova: Tiro di Resistenza Magica (Dado 10+) per resistere al colpo senza svenire.', 'Il fulmine ti attraversa il corpo e cadi a terra tremante. Il mondo diventa un turbinio di dolore e fumo.', 'Corrente Letale', 'magic_d', 'Riconosci il pericolo e con un balzo superi la zona bagnata prima che la scarica elettrica possa colpirti.', 10),
(13, 50, 'Una statua con occhi di gemma si illumina improvvisamente, rilasciando una scarica di fulmini contro chiunque si trovi di fronte.', 'Prova: Tiro di Agilità (Dado 14+) per tuffarsi di lato ed evitare il colpo.', 'Il lampo ti colpisce in pieno petto. Un dolore lancinante ti attraversa, lasciandoti stordito e con il corpo fumante.', 'Statua Lanciafulmini', 'Agl', 'Quando gli occhi della statua si illuminano, ti tuffi lateralmente appena in tempo per evitare il fulmine mortale.', 14),
(14, 50, 'Radici e liane si muovono come serpenti e tentano di avvolgere chiunque si avventuri nella stanza.', 'Prova: Tiro di Forza (Dado 12+) per liberarsi rapidamente prima di essere intrappolato.', 'Le liane ti afferrano e ti trascinano a terra. Ti contorci, ma il loro abbraccio vegetale è implacabile.', 'Liane Viventi', 'str', 'Con una mossa rapida, eviti le liane che tentano di avvolgerti, sgattaiolando via prima che possano stringersi.', 12);

-- --------------------------------------------------------

--
-- Struttura della tabella `weapons`
--

CREATE TABLE `weapons` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `AttackP` varchar(255) NOT NULL,
  `AttackS` varchar(255) NOT NULL,
  `accuracyP` int(11) NOT NULL,
  `accuracyS` int(11) NOT NULL,
  `dmgP` int(11) NOT NULL,
  `dmgS` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dump dei dati per la tabella `weapons`
--

INSERT INTO `weapons` (`id`, `description`, `name`, `AttackP`, `AttackS`, `accuracyP`, `accuracyS`, `dmgP`, `dmgS`) VALUES
(1, 'Una spada leggendaria che brilla come il sole al tramonto.', 'Lama del Sole Infranto', 'Taglio Raggiante', 'Fendente della Luce Spezzata', 90, 75, 20, 25),
(2, 'Una spada corta avvolta da un\'aura di gelo eterno.', 'Mordigelo', 'Assalto Gelido', 'Raggio di Brina', 85, 60, 25, 27),
(3, 'Una spada lunga che sussurra segreti oscuri al suo portatore.', 'Furia delle Ombre', 'Danza dell’Ombra', 'Lacerazione Spettrale', 75, 50, 25, 30),
(4, 'Un’arma massiccia con un teschio inciso nella lama.', 'Ascia del Terrore', 'Squarcio del Terrore', 'Colpo Frantumante', 75, 60, 25, 27),
(5, 'Un’ascia doppia con venature che ricordano radici.', 'Rovina della Quercia', 'Colpo di Radice', 'Abbattimento Selvaggio', 75, 60, 25, 27),
(6, 'Un’ascia rituale che sembra cantare durante il combattimento.', 'Cantico del Sangue', 'Rapsodia Cremisi', 'Taglio Sanguinario', 75, 60, 25, 27),
(7, 'Una lancia che emette scariche elettriche.', 'Lancia dei Cieli Tempestosi', 'Fulmine Penetrante', 'Carica della Tempesta', 80, 80, 24, 24),
(8, 'Una lancia decorata con scaglie di serpente.', 'Punta della Serpe', 'Morso Velenoso', 'Colpo Avvelenato', 75, 60, 25, 27),
(9, 'Una lancia dorata con un\'aura protettiva.', 'Custode della Luce', 'Giuramento del Guardiano', 'Spinta Celestiale', 75, 60, 25, 27),
(10, 'Un arco che emette un suono quasi impercettibile quando scocca frecce.', 'Arco del Sussurro Silente', 'Freccia Silenziosa', 'Colpo dell’Invisibile', 75, 60, 25, 27),
(11, 'Un arco ricurvo, decorato con zanne e artigli.', 'Artiglio del Cacciatore', 'Freccia Predatoria', 'Assalto del Branco', 75, 60, 25, 27),
(12, 'Un arco magico che si mimetizza con la natura.', 'Eco della Foresta', 'Freccia della Radura', 'Assalto Arboreo', 75, 60, 25, 27),
(13, 'Un’arma pesante che scatena onde d’urto ad ogni colpo.', 'Martello del Tuono', 'Colpo Tonante', 'Impatto Risonante', 75, 60, 25, 27),
(14, 'Un martello ornato da simboli tribali.', 'Frantumatore d’Ossa', 'Colpo Brucia-Ossa', 'Martellata Selvaggia', 75, 60, 25, 27),
(15, 'Un martello gigante che sembra intagliato nella roccia.', 'Custode delle Montagne', 'Schianto della Terra', 'Frantumazione Rocciosa', 75, 60, 25, 27),
(16, 'Un bastone avvolto da una fiamma eterna.', 'Soffio del Drago Cremisi', 'Fiammata Ardente', 'Sibilo di Fuoco', 75, 60, 25, 27),
(17, 'Un bastone cresciuto naturalmente, carico di energia vitale.', 'Radice del Saggio', 'Vite Assalente', 'Rinvigorimento Selvaggio', 75, 60, 25, 27),
(18, 'Un bastone nero che emette un’energia misteriosa.', 'Cantore del Vuoto', 'Lamento del Vuoto', 'Impulso Oscuro', 75, 60, 25, 27),
(19, 'Un pugnale affilato che garantisce rapidità nei movimenti.', 'Artiglio del Ladro', 'Colpo Rapido', 'Fendente Furtivo', 75, 60, 25, 27),
(20, 'Un pugnale oscuro, affilato come i denti di una bestia.', 'Zanna dell’Abisso', 'Stoccata Mortale', 'Morso Letale', 75, 60, 25, 27),
(21, 'Un pugnale leggero e decorato con incisioni eleganti.', 'Danza della Morte', 'Danza del Predatore', 'Affondo Finale', 75, 60, 25, 27),
(22, 'Una frusta che emette scintille ad ogni movimento.', 'Serpe Incandescente', 'Frustata Fulminea', 'Colpo del Serpente', 75, 60, 25, 27),
(23, 'Una frusta avvolta da un’aura oscura.', 'Frusta delle Ombre', 'Stretta Oscura', 'Scatto dell’Abisso', 75, 60, 25, 27),
(24, 'Una frusta che sembra risucchiare la forza vitale dei nemici.', 'Legaccio dell’Anima', 'Stretta Vitale', 'Laccio Sanguinario', 75, 60, 25, 27),
(25, 'Una mazza pesante con spuntoni metallici.', 'Spaccacrani', 'Colpo Brutale', 'Devastazione Totale', 75, 60, 25, 27),
(26, 'Un’arma sacra che giudica i malvagi.', 'Mazza del Giudizio', 'Colpo Purificatore', 'Martello della Fede', 75, 60, 25, 27),
(27, 'Una mazza decorata con ossa e piume.', 'Furia Selvaggia', 'Schianto Primitivo', 'Assalto Frenetico', 75, 60, 25, 27),
(302, 'spada arrugginata, ideale per iniziare una nuova avventura', 'Spada arrugginita', 'Fendente ', 'Affondo', 90, 75, 15, 20),
(402, 'ideale per iniziare', 'pugnale arrugginito', 'Attaccoa', 'Affondo', 90, 75, 15, 20),
(452, 'ideale per iniziare', 'bacchetta rotta', 'Fendente ', 'Affondo', 90, 75, 15, 20),
(502, 'ideale per iniziare', 'Spada dimenticata', 'Fendente ', 'Affondo', 90, 75, 15, 20),
(552, 'ideal per iniziare', 'Arco', 'Fendente ', 'Affondo', 90, 75, 15, 20),
(602, 'in onore del meastro Kentaro Miura', 'Spadone spezzato', 'Fendente ', 'Affondo', 90, 75, 15, 20),
(652, 'ideale per iniziare', 'Tirapugni arrugginito', 'Fendente ', 'Affondo', 90, 75, 15, 20);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `armors`
--
ALTER TABLE `armors`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `characters`
--
ALTER TABLE `characters`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_78qk15nxavtdqqtvigmdyv7s8` (`weapon_id`);

--
-- Indici per le tabelle `character_armor`
--
ALTER TABLE `character_armor`
  ADD PRIMARY KEY (`character_id`,`armor_type`),
  ADD UNIQUE KEY `UK_5v301mxkgkwl6as9r1895f2q8` (`armor_id`);

--
-- Indici per le tabelle `consumables`
--
ALTER TABLE `consumables`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `monsters`
--
ALTER TABLE `monsters`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `rooms`
--
ALTER TABLE `rooms`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `traps`
--
ALTER TABLE `traps`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `weapons`
--
ALTER TABLE `weapons`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `characters`
--
ALTER TABLE `characters`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT per la tabella `consumables`
--
ALTER TABLE `consumables`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT per la tabella `monsters`
--
ALTER TABLE `monsters`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- AUTO_INCREMENT per la tabella `rooms`
--
ALTER TABLE `rooms`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=199;

--
-- AUTO_INCREMENT per la tabella `traps`
--
ALTER TABLE `traps`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Limiti per le tabelle scaricate
--

--
-- Limiti per la tabella `characters`
--
ALTER TABLE `characters`
  ADD CONSTRAINT `FKse7x517ka2i9s03eo9mdsjecc` FOREIGN KEY (`weapon_id`) REFERENCES `weapons` (`id`);

--
-- Limiti per la tabella `character_armor`
--
ALTER TABLE `character_armor`
  ADD CONSTRAINT `FKkrq73qqtvw8sf48roqotaokyd` FOREIGN KEY (`character_id`) REFERENCES `characters` (`id`),
  ADD CONSTRAINT `FKo5kkfadyv7b2g7ymp2172stpl` FOREIGN KEY (`armor_id`) REFERENCES `armors` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
