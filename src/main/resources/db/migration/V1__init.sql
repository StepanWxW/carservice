CREATE TABLE car_service(
                          id SERIAL PRIMARY KEY,
                          name VARCHAR(100) NOT NULL
);
CREATE TABLE client(
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       car VARCHAR(100) NOT NULL,
                       car_service_id int REFERENCES car_service(id)
);
CREATE TABLE worker(
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       profession VARCHAR(100) NOT NULL,
                       salary decimal,
                       car_service_id int REFERENCES car_service(id)
);
CREATE TABLE service(
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL,
                       cost decimal NOT NULL,
                       client_id int NOT NULL,
                       worker_id int NOT NULL,
                       car_service_id int REFERENCES car_service(id)
);

INSERT INTO car_service  (name)
VALUES
    ('Service on Lenina street'),
    ('Service on Pushkina street');

INSERT INTO client  (name, car, car_service_id)
VALUES
    ('Ivan Sergeevich', 'Honda accord', 1),
    ('Stepan Ivanovich', 'Honda civic', 2),
    ('John Petrovich', 'Toyota crown', 2),
    ('Petr Dmitrievich', 'Nissan sunny', 1),
    ('Irina Ivanova', 'Toyota tundra', 1),
    ('Oleg Petrovich', 'VAZ 2101', 1),
    ('Elena Aleksandrovna', 'Porsche cayenne', 2),
    ('Dima Dmitriev', 'Toyota corona', 1);
