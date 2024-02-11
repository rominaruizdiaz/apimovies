INSERT INTO years (id_year, creation_year) values 
(default, 2023),
(default, 1994),
(default, 2010),
(default, 2004),
(default, 2004);

INSERT INTO genres (id_genre, genre_name) values 
(default, 'comedy'),
(default, 'drama'),
(default, 'superheroes'),
(default, 'anime'),
(default, 'fantasy');

INSERT INTO movies (id_movie, title, description, running_time, year_id) VALUES 
(default, 'Barbie', 'Barbie (Margot Robbie) leads an ideal life in Barbieland, there everything is perfect, with chupi parties full of music and color, and every day is the best day.', 114, 1),
(default, 'Forrest Gump', 'Forrest Gump (Tom Hanks) has suffered from a certain mental retardation since he was a child. Nevertheless, thanks to his tenacity and his good heart, he will be the protagonist of crucial events in his country for several decades.', 142, 2),
(default, 'Kick Ass', 'Dave Lizewski, a high school student who goes unnoticed among his classmates. Passionate about comic books, one day he conceives the idea of becoming a superhero, even though he has no superpowers.', 117, 3),
(default, 'Hauru no Ugoku Shiro', 'It tells the story of Sophie, a young girl who is cursed with a horrible curse that gives her the appearance of an old woman.', 119, 4),
(default, 'Harry Potter and the Prisoner of Azkaban', 'When Harry Potter and his friends return to Hogwarts for their third year of studies, they become embroiled in a mystery: Sirius Black has escaped from Azkaban prison for wizards.', 137, 5);

INSERT INTO genres_movies (movie_id, genre_id) VALUES 
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(2, 4),
(2, 5),
(3, 5);