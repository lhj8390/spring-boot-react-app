INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (4, 'ELECTRONIC', 'Camera', 135000, 'thum');
INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (64, 'ELECTRONIC', 'headphone', 40000, 'thum');
INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (27, 'FASHION', 'Dress', 40000, 'thum');
INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (129, 'BOOK', 'Fountain Pen', 50000, 'thum');
INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (2, 'ELECTRONIC', 'MacBook', 3500000, 'thum');
INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (53, 'FASHION', 'Necklace', 5000, 'thum');
INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (102, 'ELECTRONIC', 'Mouse', 20000, 'thum');
INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (252, 'BOOK', 'Crayon', 4000, 'thum');
INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (53, 'FASHION', 'Sneakers', 79000, 'thum');
INSERT INTO PRODUCTS(amount, category, name, price, thumnail) VALUES
    (8, 'ELECTRONIC', 'SmartWatch', 150000, 'thum');


INSERT INTO ROLES(name) VALUES ('ROLE_USER');
INSERT INTO ROLES(name) VALUES ('ROLE_ADMIN');

INSERT INTO USERS(username, email, password) VALUES
    ('test', 'test@test.com', '{bcrypt}$2a$10$blG3I2eS34cCEJfNOxYtx.V2U4HPcv1LF4J4t.5tcKZ/eFd71LYw6');

INSERT INTO USER_ROLES(user_id, role_id) VALUES (1, 2);