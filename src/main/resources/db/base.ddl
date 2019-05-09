CREATE TABLE place (
  id BIGSERIAL NOT NULL PRIMARY KEY,
  name VARCHAR(50) NOT NULL,
  sub_place BIGINT NOT NULL
);

CREATE TABLE plant (
    id BIGSERIAL NOT NULL,
    nick VARCHAR(50) NOT NULL,
    name VARCHAR(50) NOT NULL, -- take default ones? e.g. aglaonema, ficus etc
    type VARCHAR(50) NOT NULL, -- Araceae, succulent, etc
    last_irrigation DATE NOT NULL,
    irrigation_period INT NOT NULL,
    description VARCHAR,
    condition VARCHAR(50) NOT NULL,
    soil VARCHAR(50) -- can also be taken from outside
);