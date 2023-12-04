CREATE TABLE Student (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    age INT,
    parent VARCHAR(255),
    email VARCHAR(255)
);
--used to insert dummy values
INSERT INTO Student (name, age, parent, email)
VALUES ('John Doe', 20, 'Jane Doe', 'johndoe@example.com'),
       ('Alice Smith', 22, 'Bob Smith', 'alicesmith@example.com');

CREATE TABLE Group (
    id INT AUTO_INCREMENT PRIMARY KEY,
    groupName VARCHAR(255)
);

CREATE TABLE Group_Student (
    group_id INT,
    student_id INT,
    FOREIGN KEY (group_id) REFERENCES Group(id),
    FOREIGN KEY (student_id) REFERENCES Student(id),
    PRIMARY KEY (group_id, student_id)
);