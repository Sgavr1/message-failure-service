CREATE TABLE users(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    role VARCHAR(20) NOT NULL
);

CREATE TABLE robots(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    afo_id INTEGER REFERENCES afos(id)
);

CREATE TABLE afos(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    line_product_id INTEGER REFERENCES line_products(id)
);

CREATE TABLE line_products(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE line_products_team_leaders(
    line_product_id INTEGER REFERENCES line_products(id) NOT NULL,
    team_leader_id INTEGER REFERENCES users(id) NOT NULL
);

CREATE TABLE afos_operators(
    afo_id INTEGER REFERENCES afos(id) NOT NULL,
    operator_id INTEGER REFERENCES users(id) NOT NULL
);

CREATE TABLE robots_operators(
    robot_id INTEGER REFERENCES robots(id) NOT NULL,
    operator_id INTEGER REFERENCES users(id) NOT NULL
);