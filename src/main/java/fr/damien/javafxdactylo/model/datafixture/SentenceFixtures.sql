USE dactylo_db;

-- Insert data Fixtures

Insert INTO t_sentence (sentence_id, sentence_name, sentence_text) VALUES (1, 'Classe Abstraite', 'En programmation orientée objet (POO), une classe abstraite est une classe dont l''implémentation n''est pas complète et qui n''est pas instanciable. Elle sert de base à d''autres classes dérivées (héritées).');
Insert INTO t_sentence (sentence_id, sentence_name, sentence_text) VALUES (2,'Interface',' Une interface décrit un ensemble de méthodes en fournissant uniquement leur signature. Une interface introduit un nouveau type d''abstraction qui définit à travers ces méthodes un ensemble d''interactions autorisées. Une classe peut ensuite implémenter une ou plusieurs interfaces.');
Insert INTO t_sentence (sentence_id, sentence_name, sentence_text) VALUES (3,'Classe','La classe est la description d''un objet. Un objet est une instance d''une classe. Pour chaque instance d''une classe, le code est le même, seules les données sont différentes à chaque objet.');
