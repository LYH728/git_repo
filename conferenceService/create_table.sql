CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL UNIQUE,
  affiliation VARCHAR(100),
  location VARCHAR(100),
  is_admin BOOLEAN NOT NULL DEFAULT FALSE
);

INSERT INTO users (username, password, email, affiliation, location, is_admin)
VALUES ('group9', 'fudanreview2023', 'admin@example.com', 'Fudan University', 'China', TRUE);
INSERT INTO users (username, password, email, affiliation, location, is_admin)
VALUES ('weilin-wan', 'weilin2023', 'wlwan23@m.fudan.edu.cn', 'Fudan University', 'China', FALSE);


CREATE TABLE roles (
  id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL UNIQUE
);

INSERT INTO roles (id, name) VALUES (1, 'chair');
INSERT INTO roles (id, name) VALUES (2, 'PC member');
INSERT INTO roles (id, name) VALUES (3, 'administrator');
INSERT INTO roles (id, name) VALUES (4, 'author');

CREATE TABLE conference_status (
  id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL UNIQUE
);

INSERT INTO conference_status (id, name) VALUES (1, 'Preparing');
INSERT INTO conference_status (id, name) VALUES (2, 'Submitting');
INSERT INTO conference_status (id, name) VALUES (3, 'Reviewing');
INSERT INTO conference_status (id, name) VALUES (4, 'Final Judgment');
INSERT INTO conference_status (id, name) VALUES (5, 'Review Completed');

CREATE TABLE conferences (
  id INT AUTO_INCREMENT PRIMARY KEY,
  short_name VARCHAR(50),
  full_name VARCHAR(200),
  start_date DATE,
  end_date DATE,
  location VARCHAR(100),
  submission_start_date DATE,
  submission_end_date DATE,
  status_id INT,
  chair_id INT,
  FOREIGN KEY (status_id) REFERENCES conference_status(id),
  FOREIGN KEY (chair_id) REFERENCES users(id)
);

CREATE TABLE user_conferences (
  user_id INT,
  conference_id INT,
  role_id INT,
  PRIMARY KEY (user_id, conference_id),
  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (conference_id) REFERENCES conferences(id),
  FOREIGN KEY (role_id) REFERENCES roles(id)
);

CREATE TABLE submissions (
  id INT AUTO_INCREMENT PRIMARY KEY,
  conference_id INT,
  title VARCHAR(50),
  abstract VARCHAR(800),
  submitter_id INT,
  pdf_file BLOB,
  status VARCHAR(50),
  FOREIGN KEY (conference_id) REFERENCES conferences(id),
  FOREIGN KEY (submitter_id) REFERENCES users(id)
);