CREATE TABLE users(
    id BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    role VARCHAR(20) NOT NULL,
    login VARCHAR(20) UNIQUE NOT NULL,
    password VARCHAR(20) UNIQUE NOT NULL
);

CREATE TABLE line_products(
    id BIGSERIAL PRIMARY KEY,
    status VARCHAR(10) NOT NULL,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE afos(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    status VARCHAR(10) NOT NULL,
    line_product_id BIGINT REFERENCES line_products(id)
);

CREATE TABLE robots(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    status VARCHAR(10) NOT NULL,
    afo_id BIGINT REFERENCES afos(id)
);

CREATE TABLE breakdown_types(
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(200) UNIQUE NOT NULL,
    afo_id BIGINT REFERENCES afos(id) NOT NULL
);

CREATE TABLE reports(
    id BIGSERIAL PRIMARY KEY,
    team_leader_id BIGINT REFERENCES users(id),
    operator_id BIGINT REFERENCES users(id),
    time_begin TIMESTAMP NOT NULL,
    time_finish TIMESTAMP,
    description TEXT,
    breakdown_type_id BIGINT REFERENCES breakdown_types(id)
);

CREATE TABLE scheduler_work_line_products_team_leaders(
    id BIGSERIAL PRIMARY KEY,
    line_product_id BIGINT REFERENCES line_products(id) NOT NULL,
    team_leader_id BIGINT REFERENCES users(id) NOT NULL,
    date_time_work TIMESTAMP NOT NULL,
    duration INTEGER NOT NULL
);

CREATE TABLE scheduler_work_afos_operators(
    id BIGSERIAL PRIMARY KEY,
    afo_id BIGINT REFERENCES afos(id) NOT NULL,
    operator_id BIGINT REFERENCES users(id) NOT NULL,
    date_time_work TIMESTAMP NOT NULL,
    duration INTEGER NOT NULL
);