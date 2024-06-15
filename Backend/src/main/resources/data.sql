-- INSERT INTO Image (image_id,alt)
-- VALUES
--     (1,'tomato'),
--     (2,'cucumber'),
--     (3,'bread'),
--     (4,'milk'),
--     (5,'cheese'),
--     (6,'cookie'),
--     (7,'apple'),
--     (8,'orange'),
--     (9,'meat'),
--     (10,'fish');

INSERT INTO Image (image, alt)
VALUES (
        "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAACXBIWXMAAAsTAAALEwEAmpwYAAAC0UlEQVR4nO2YWUhUURjHb4bRRkQ9FEUFPUTUQ0XRRttDRG9RcNTKosIszULbTM2FMgILi56KVERCTZQIhFaNwsKHItNWIjCSFi2ySW2s7BeHj5rAxplxdO4tzoGPYe5czvl+33Lv/xsLZfE/mGW3AwZEmYxYtpcPpkeU/ZHGZETZH11MRpT9ETUZURIEI1EIpByiwiFnFVTmQm0F1F2Gm0VQmAgJk/+B0ooYAPkJ0PqW36uzA9ztnu8/uqCmBOInORRk4wiovybOvn4GZ+Ng+wTP75tHQa6Chiq5x/UeDi13GMjaQVB/XRy8cFRKq6f7T0SCu00ylbbABhDtYNI0KE2HXVPgdAzsnwUnowSiOMX/vTKWwLdOaHkJ0cNCCKKdv1cJZ2LF6SMrobkRXtyFU9Hw4Kr0SCB7FqfIXmVZIQDZNBLiJoKrBR7f8g6SOj/w4KwfAp+a4UMTRA7sR5CIMHh4AzIW9wyiG7m3ma7Ol/2SZ/cjiG5KvXyB9BZCWZC3Q/YrPwzHVsu+W0YHCbJhuDSe7gcNUZjU/yC5im6r6zvcLpWSDhgkewW0fZQU68fi/UuhATm+Bl49grJMefrlxYsS0Kv1HeydEQDIwYVQkuap1VCCrBvsHfCrW87QleITJHUe1JbbB6J6sIKdcta5ZD9A7pwXYedEkKhwkTJ/OaM7iBZ4TgVRFtRdgS+f/QDRdehkkIYqaG/1A+TNc+eCRA+FDhc8rfED5Nfw40SQimw5S48EPkFix0F1gbNAIsKgaI8MYY11Mib4BNEWMyY4kN3T5RHZF3YxB5qeyBn608sk6f3NrmdpXWL7ZgYOotVvXy5XiwxoeuoMSjTqrOiBSWsdPY5qKZ+5FA7MgW3j5ZoWdumLIGUubB0r14K1rGWQONUvSW/+DsJhZtntgAFRJiOW7eWD6RFlf6QxGVH2RxeTEWV/RE1GlATBSBQcUE5/2k/dP1tzVRMSNgAAAABJRU5ErkJggg==",
        "soundcloud"
       );
-- INSERT INTO Product (product_id, title, image_id, description, price, discount_price, quantity_of_available, unit, delivery_days)
-- VALUES ('1', 'помидоры', '1', 'this is a description of a tomato', '841', '676', '35', 'кг', '1'),
--        ('2', 'огурцы', '2', 'this is a description of a cucumber', '907', '705', '77', 'кг', '5'),
--        ('3', 'хлеб', '3', 'this is a description of a bread', '64', '381', '28', 'шт', '3'),
--        ('4', 'печенье', '4', 'this is a description of a cookies', '559', '460', '0', 'кг', '3'),
--        ('5', 'молоко', '5', 'this is a description of a milk', '179', '671', '49', 'л', '5'),
--        ('6', 'сыр', '6', 'this is a description of a cheese', '189', '728', '76', 'кг', '4'),
--        ('7', 'яблоки', '7', 'this is a description of an apple', '222', '158', '74', 'кг', '4'),
--        ('8', 'апельсины', '8', 'this is a description of an oranges', '927', '1000', '91', 'кг', '3'),
--        ('9', 'курица', '9', 'this is a description of a chicken', '657', '584', '10', 'кг', '1'),
--        ('10', 'говядина', '10', 'this is a description of a beef', '608', '363', '90', 'кг', '5');

/* here users init from another file */
INSERT INTO Users (username, password, phone, role, email, user_discount, amount_spent, CVC, card_number)
VALUES ('Екатерина', '$2a$10$IW7rk4z4WhbiiUSk2rudMOyEF45AT3VZz4gJfZ6WqSBprmZvZXsKm', '+79633858899', 'USER', 'fedosa30@example.com', '13', '25371', '843', '2720798669527354'),
       ('Юлий', '$2a$10$/kJYbLpO0VvkFDgBi3fQb.ra0PAdxBKMYzw2SJR.VSyn.gCgHtdea', '+79094135414', 'ADMIN', 'dominika.seliverstova@example.org', '71', '23776', '779', '4485560063058'),
       ('Вениамин', '$2a$10$oMSuaCtQ/hMsIP1DNRuN6u1dEhyIg/ZIndUmPcebtqUd/W6y13aQu', '+79646488760', 'MANAGER', 'nelli63@example.net', '63', '31220', '691', '4929905157125'),
       ('Герасим', 'uQ4g2Lr45q', '+79514534211', 'USER', 'lisaev@example.org', '32', '30503', '195', '2720371264724162'),
       ('Розалина', 'XqnzbKRvs', '+79022687854', 'USER', 'ulia42@example.org', '3', '69451', '780', '2221409765921632'),
       ('Любовь', 'NaS5QZK8', '+79081236874', 'USER', 'galina48@example.net', '81', '67295', '160', '2720489795706373'),
       ('Жанна', 'qhxOpT561dC', '+79686714288', 'USER', 'petuhova.maria@example.org', '51', '45359', '653', '2221602006325429'),
       ('Любовь', 'F7J9UVHQ', '+79008885418', 'USER', 'rozalina35@example.net', '56', '40471', '790', '4929583927181110'),
       ('Галина', 'WsqC8ZglEHa', '+79669416090', 'USER', 'kononova.miroslav@example.com', '70', '12292', '477', '4716992085740202'),
       ('Антон', 'VhmXErhHBWB', '+79088772327', 'USER', 'pahomova.arsenij@example.org', '46', '38905', '496', '4024007159938793'),
       ('Доминика', 'kItT1W65AJd', '+79516310676', 'USER', 'oteterina@example.net', '23', '57971', '432', '5498050438754205'),
       ('Марта', '1xz0OaL8TUJu', '+79044516812', 'USER', 'artemij34@example.net', '68', '5295', '942', '4556735006803986'),
       ('Полина', '2NbshW2IytRH', '+79007259399', 'USER', 'danilova.makar@example.net', '24', '53754', '739', '3589990394327287'),
       ('Тимур', '9bBbCtG2yMj', '+79631916825', 'USER', 'silin.maja@example.com', '26', '7394', '613', '6011145208697935'),
       ('Елизавета', '1FPRjYW2fI6', '+79045971223', 'USER', 'gulaeva.izabella@example.org', '89', '18278', '407', '2623779474770445'),
       ('Тимофей', 'WvY24xsApn8L', '+79645183389', 'USER', 'alisa86@example.net', '26', '23606', '394', '4024007155937872'),
       ('Константин', 'G2HWCLNFqjfJ', '+79022402273', 'USER', 'ksestakova@example.org', '77', '30025', '990', '6011218659122461'),
       ('Алла', 'EAqMTZz0', '+79686075750', 'USER', 'polina84@example.net', '25', '84791', '806', '4485879777057772'),
       ('Борис', 'lbNtDOHV0AK', '+79026583602', 'USER', 'pteterin@example.org', '87', '45403', '922', '2720235574189269'),
       ('Вадим', 'EN8sIW8lDrI', '+79675788877', 'USER', 'svetlana99@example.com', '42', '68560', '589', '2570540460579585'),
       ('Оксана', 'NaARnrJ6', '+79081008589', 'USER', 'drozdov.anna@example.net', '64', '3341', '223', '6011195841246574'),
       ('Любовь', 'RwwJQmz6INj', '+79643794019', 'USER', 'cprohorov@example.net', '64', '45936', '987', '4929203172996027'),
       ('Светлана', 'TgoQLlOZ', '+79009126540', 'USER', 'cmisin@example.org', '13', '67421', '509', '2221375130903599'),
       ('Юлия', 'Gw8W7kMp', '+79098376382', 'USER', 'uromanov@example.com', '27', '89878', '896', '4024007133594'),
       ('Инга', 'UPDShuLfi1b5', '+79537948323', 'USER', 'tamara.sorokina@example.com', '90', '86638', '276', '4024007174986'),
       ('Игнатий', '8YE0h8Kz', '+79684098284', 'USER', 'dorofeeva.maria@example.org', '83', '65411', '612', '341232298553592'),
       ('Ульяна', 'h8d2u3unua', '+79507946075', 'USER', 'jturova@example.net', '75', '71394', '614', '4847638143107056'),
       ('Афанасий', 'K5PxmjfVXfl', '+79673258433', 'USER', 'viktor.noskov@example.org', '77', '54558', '839', '4556670251724'),
       ('Валентин', '6JoLldPX6r', '+79675243342', 'USER', 'boleslav.knazev@example.net', '90', '28712', '612', '4539565186749143'),
       ('Константин', 'a6toSWeo', '+79684560920', 'USER', 'cernova.margarita@example.net', '53', '72104', '162', '5499503032496937');


INSERT INTO Pickup_point (point_id, address, manager_id, income)
VALUES
    (1,'Красная ул., 100', 25, 10000),
    (2,'Ставропольская ул., 50', 26, 20000),
    (3,'Морская ул., 111', 27, 15000),
    (4,'Северная ул., 123', 28, 50000),
    (5,'Красная ул., 99', 29, 70000);

INSERT INTO Delivery_status (status_id,title)
VALUES
    (1,'В пути'),
    (2,'Готов'),
    (3,'Выдан'),
    (4,'Отказ');

-- INSERT INTO Orders (order_id, user_id, datetime, point_id, completed)
-- VALUES ('1', '5', '11.05.2024', '1', '0'),
--        ('2', '17', '11.05.2024', '2', '1'),
--        ('3', '2', '01.04.2024', '3', '0'),
--        ('4', '29', '11.04.2024', '4', '1'),
--        ('5', '10', '11.04.2024', '4', '0'),
--        ('6', '17', '10.04.2024', '1', '1'),
--        ('7', '4', '09.04.2024', '3', '0'),
--        ('8', '17', '01.05.2024', '3', '0'),
--        ('9', '29', '11.04.2024', '2', '1'),
--        ('10', '3', '11.05.2024', '4', '0'),
--        ('11', '23', '11.05.2024', '2', '0'),
--        ('12', '1', '09.05.2024', '3', '0'),
--        ('13', '8', '11.04.2024', '4', '0'),
--        ('14', '28', '11.04.2024', '3', '1'),
--        ('15', '22', '07.05.2024', '4', '0'),
--        ('16', '19', '07.05.2024', '4', '0'),
--        ('17', '10', '02.05.2024', '1', '1'),
--        ('18', '20', '11.05.2024', '4', '1'),
--        ('19', '1', '12.04.2024', '3', '0'),
--        ('20', '5', '07.04.2024', '1', '1');


INSERT INTO Ordered_product (order_id, product_id, count_product, discount_price, delivery_days, status_id, completion_date)
VALUES ('1', '1', '1', '686', '5', '1', '11.05.2024'),
       ('2', '1', '1', '258', '1', '4', '11.05.2024'),
       ('3', '1', '1', '999', '4', '1', '11.05.2024'),
       ('4', '2', '1', '400', '4', '3', '10.08.2024'),
       ('5', '2', '1', '188', '3', '2', '11.05.2024'),
       ('6', '2', '1', '935', '5', '3', '02.06.2024'),
       ('7', '3', '1', '966', '2', '4', '11.05.2024'),
       ('8', '3', '1', '334', '5', '1', '11.07.2024'),
       ('9', '3', '1', '721', '5', '4', '11.07.2024'),
       ('10', '4', '1', '583', '2', '4', '09.07.2024'),
       ('11', '5', '1', '808', '1', '1', '05.08.2024'),
       ('12', '5', '1', '377', '1', '1', '01.08.2024'),
       ('13', '6', '1', '399', '3', '1', '10.07.2024'),
       ('14', '7', '1', '280', '1', '4', '06.07.2024'),
       ('15', '7', '1', '164', '2', '4', '11.05.2024'),
       ('16', '7', '1', '689', '1', '4', '07.06.2024'),
       ('17', '8', '1', '952', '2', '4', '11.06.2024'),
       ('18', '9', '1', '621', '4', '4', '11.05.2024'),
       ('19', '9', '1', '487', '1', '2', '11.05.2024'),
       ('20', '10', '1', '553', '3', '4', '11.05.2024');

INSERT INTO Category (category_id,title)
VALUES
    (1,'Vegetables'),
    (2,'Bakery products'),
    (3,'Dairy products'),
    (4,'Fruits'),
    (5,'Meat,fish');