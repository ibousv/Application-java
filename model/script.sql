/**
* Additional script 
**/
CREATE DATABASE ags;
USE ags;

CREATE TABLE cours ( nom varchar(20) PRIMARY KEY,
                     enseignant varchar(100)
                    );

CREATE TABLE administrateurs(login  varchar(20) PRIMARY KEY,
                             nom varchar(50),
                             prenom varchar(50),
                             motpasse varchar(50)
                             );

CREATE TABLE etudiants( login varchar(20) PRIMARY KEY,
                       nom varchar(50),
                       prenom varchar(50),
                       motpasse varchar(50)
                    );

CREATE TABLE notes( valeur int,
                   nom_cours varchar(50),
                   login_etudiant varchar(20),
                   FOREIGN KEY(nom_cours) REFERENCES cours(nom) on update cascade on delete cascade,
                   FOREIGN KEY(login_etudiant) REFERENCES etudiants(login) on update cascade on delete cascade
                   );

                   

