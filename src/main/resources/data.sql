INSERT INTO authority(name, id) VALUES ('ROLE_ADMIN', 1);
INSERT INTO authority(name, id) VALUES ('ROLE_USER', 2);

INSERT INTO user(id, username, password, name, registration_date) VALUES (1,'admin','$2a$10$jXlure/BaO7K9WSQ8AMiOu3Ih3Am3kmmnVkWWHZEcQryZ8QPO3FgC', 'adminName', '2020-07-21 14:14:54');
INSERT INTO user(id, username, password, name, registration_date) VALUES (2,'nonadmin','$2a$10$jXlure/BaO7K9WSQ8AMiOu3Ih3Am3kmmnVkWWHZEcQryZ8QPO3FgC', 'adminName','2020-07-21 15:14:54');

INSERT INTO user_roles(user_id, roles_id) VALUES (1, 1);


INSERT INTO answers (id, true_answer, first_answer, second_answer, third_answer, fourth_answer, fifth_answer, sixth_answer, seventh_answer, eighth_answer)
VALUES (1, 'четыре', 'один', 'два', 'три', 'четыре', null, null, null, null);
INSERT INTO answers (id, true_answer, first_answer, second_answer, third_answer, fourth_answer, fifth_answer, sixth_answer, seventh_answer, eighth_answer)
VALUES (2, 'три', 'один', 'два', 'три', 'четыре', null, null, null, null);
INSERT INTO answers (id, true_answer, first_answer, second_answer, third_answer, fourth_answer, fifth_answer, sixth_answer, seventh_answer, eighth_answer)
VALUES (3,'пять', 'один', 'два', 'три', 'четыре', 'пять', null, null, null);


INSERT INTO questions (id, question, answer_amount, answer_id) VALUES (1,'два плюс два', 4, 1);
INSERT INTO questions (id, question, answer_amount, answer_id) VALUES (2,'два плюс один', 4, 2);
INSERT INTO questions (id, question, answer_amount, answer_id) VALUES (3,'два плюс три', 5, 3);