-- Create Coach Table
CREATE TABLE coach (
                       coach_id SERIAL PRIMARY KEY,
                       coach_name VARCHAR(100) NOT NULL,
                       email VARCHAR(100) UNIQUE
);

-- Create Team Table (One-to-One with Coach)
CREATE TABLE team (
                      team_id SERIAL PRIMARY KEY,
                      team_name VARCHAR(100) NOT NULL,
                      coach_id INT UNIQUE,  -- UNIQUE ensures one-to-one
                      CONSTRAINT fk_coach
                          FOREIGN KEY (coach_id)
                              REFERENCES coach(coach_id)
                              ON DELETE SET NULL
);

-- Create Player Table (Many-to-One with Team)
CREATE TABLE player (
                        player_id SERIAL PRIMARY KEY,
                        player_name VARCHAR(100) NOT NULL,
                        salary DECIMAL(10,2),
                        team_id INT,
                        CONSTRAINT fk_team
                            FOREIGN KEY (team_id)
                                REFERENCES team(team_id)
                                ON DELETE SET NULL
);