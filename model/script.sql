CREATE TABLE cours ( id_cours int PRIMARY KEY ,
                    nom_cours varchar(20),
                    coeff int 
                    );

CREATE TABLE notes( id_notes int PRIMARY KEY,
                   valeur_notes int,
                   notes_cours int,
                   FOREIGN KEY(notes_cours) REFERENCES cours(id_cours)
                   );

CREATE TABLE etudiants( id_etudiants int PRIMARY KEY,
                       nom_etudiants varchar(50),
                       motpasse_etudiants varchar(50),
                       mes_notes int,
                       FOREIGN KEY(mes_notes) REFERENCES notes(id_notes)
                    );
CREATE TABLE administrateurs(id_etudiants int PRIMARY KEY,
                             nom_administrateurs varchar(50),
                             motpasse_administrateurs varchar(50),
                             les_notes int,
                             les_cours int,
                             FOREIGN KEY(les_notes) REFERENCES notes(id_notes),
                         	 FOREIGN KEY(les_cours) REFERENCES cours(id_cours)
                             );
