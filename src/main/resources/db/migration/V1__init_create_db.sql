CREATE TABLE users(
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    role VARCHAR(20) NOT NULL,
    login VARCHAR(20) NOT NULL,
    password VARCHAR(20) NOT NULL
);

CREATE TABLE robots(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    status VARCHAR(10) NOT NULL,
    afo_id INTEGER REFERENCES afos(id)
);

CREATE TABLE afos(
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    status VARCHAR(10) NOT NULL,
    line_product_id INTEGER REFERENCES line_products(id)
);

CREATE TABLE line_products(
    id SERIAL PRIMARY KEY,
    status VARCHAR(10) NOT NULL,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE reports(
    id SERIAL PRIMARY KEY,
    team_leader_id INTEGER REFERENCES users(id),
    operator_id INTEGER REFERENCES users(id),
    time_begin TIMESTAMP NOT NULL,
    time_finish TIMESTAMP,
    description TEXT,
    breakdown_type_id INTEGER REFERENCES breakdown_types(id)
);

CREATE TABLE scheduler_work_line_products_team_leaders(
    id SERIAL PRIMARY KEY,
    line_product_id INTEGER REFERENCES line_products(id) NOT NULL,
    team_leader_id INTEGER REFERENCES users(id) NOT NULL,
    date_time_work TIMESTAMP NOT NULL,
    duration INTEGER NOT NULL
);

CREATE TABLE scheduler_work_afos_operators(
    id SERIAL PRIMARY KEY,
    afo_id INTEGER REFERENCES afos(id) NOT NULL,
    operator_id INTEGER REFERENCES users(id) NOT NULL,
    date_time_work TIMESTAMP NOT NULL,
    duration INTEGER NOT NULL
);

CREATE TABLE breakdown_types(
    id SERIAL PRIMARY KEY,
    name VARCHAR(200) NOT KEY,
    afo_id INTEGER REFERENCES afos(id) NOT NULL
);