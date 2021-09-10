-- Databse for dactylo app
DROP DATABASE IF EXISTS dactylo_db;
CREATE DATABASE dactylo_db;
USE dactylo_db;

-- Create Table

CREATE TABLE t_user (
    user_id             int(4)          PRIMARY KEY AUTO_INCREMENT,
    user_name         varchar(16)     NOT NULL,
    user_password       varchar(32)     NOT NULL,
    user_typing_speed   float(3,2)      NOT NULL DEFAULT 0,
    UNIQUE(user_name)
) ENGINE = InnoDB;

CREATE TABLE t_lesson (
    lesson_id           int(4)          PRIMARY KEY AUTO_INCREMENT,
    lesson_name         varchar(64)     NOT NULL,
    lesson_text         text(512)       NOT NULL,
    lesson_image        varchar(100)    NOT NULL,
    UNIQUE(lesson_name)
) ENGINE = InnoDB;

CREATE TABLE t_word (
    word_id             int(4)          PRIMARY KEY AUTO_INCREMENT,
    word_name           varchar(32)     NOT NULL,
    UNIQUE(word_name)
) ENGINE = InnoDB;

CREATE TABLE t_sentence (
    sentence_id         int(4)          PRIMARY KEY AUTO_INCREMENT,
    sentence_name       varchar(64)     NOT NULL,
    sentence_text       text(512)       NOT NULL,
    UNIQUE(sentence_name)
) ENGINE = InnoDB;

CREATE TABLE belong (
    lesson_id INT,
    word_id INT,
    PRIMARY KEY(lesson_id, word_id),
    FOREIGN KEY(lesson_id) REFERENCES t_lesson(lesson_id),
    FOREIGN KEY(word_id) REFERENCES t_word(word_id)
) ENGINE = InnoDB;

CREATE TABLE appertain(
   lesson_id INT,
   sentence_id INT,
   PRIMARY KEY(lesson_id, sentence_id),
   FOREIGN KEY(lesson_id) REFERENCES t_lesson(lesson_id),
   FOREIGN KEY(sentence_id) REFERENCES t_sentence(sentence_id)
) ENGINE = InnoDB;




CREATE TABLE learn (
    user_id INT,
    lesson_id INT,
    PRIMARY KEY(user_id, lesson_id),
    FOREIGN KEY(user_id) REFERENCES T_user(user_id),
    FOREIGN KEY(lesson_id) REFERENCES t_lesson(lesson_id)
) ENGINE = InnoDB;