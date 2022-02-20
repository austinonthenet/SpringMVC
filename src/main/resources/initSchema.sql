
DROP TABLE IF EXISTS test_categories;
DROP TABLE IF EXISTS tests;
DROP TABLE IF EXISTS questions;
DROP TABLE IF EXISTS answers;

CREATE TABLE test_categories(
	category_id SERIAL PRIMARY KEY,
	category_name VARCHAR(50),
	deccription VARCHAR(200)
	
);

CREATE TABLE tests (
    test_id SERIAL PRIMARY KEY,
    name VARCHAR(50) not null,
    deccription VARCHAR(200),
    category_id int,
    date_created TIMESTAMP,
    passing_score int,
    time_limit_mins int,
    questions_limit int
);

CREATE TABLE questions(
	question_id SERIAL PRIMARY KEY,
	test_id int,
	question_text TEXT,
	question_type int,
	difficulty_level int
);

CREATE TABLE answers(
	answer_id SERIAL PRIMARY KEY,
	question_id int,
	answer_text TEXT,
	is_correct_answer boolean,
	marks int
);


