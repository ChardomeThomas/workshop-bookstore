
CREATE TABLE IF NOT EXISTS category (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS books (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    publication_year INT,
    category_id INT,
    FOREIGN KEY (category_id) REFERENCES category(ID) ON DELETE SET NULL
);

CREATE TABLE IF NOT EXISTS users (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    surname VARCHAR(100) NOT NULL,
    isAdmin BOOLEAN DEFAULT FALSE,
    mail VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE IF NOT EXISTS emprunts (
    id_book INT,
    id_user INT,
    date_emprunt DATE NOT NULL,
    date_retour DATE,
    PRIMARY KEY (id_book, id_user, date_emprunt),
    FOREIGN KEY (id_book) REFERENCES books(ID) ON DELETE CASCADE,
    FOREIGN KEY (id_user) REFERENCES users(ID) ON DELETE CASCADE
);
