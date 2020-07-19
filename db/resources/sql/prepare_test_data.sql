USE app;

INSERT INTO BOARD (NAME) 
    VALUES ("Test Board 1"), ("Test Board 2"), ("Test Board 3"), ("Test Board 4"), ("Test Board 5");

INSERT INTO LANE (NAME, BOARD_ID, `INDEX`)
    VALUES ("Test Lane 1", 1, 0), ("Test Lane 2", 1, 1), ("Test Lane 3", 1, 2), ("Test Lane 4", 2, 1);

INSERT INTO TICKET (NAME, DESCRIPTION, LANE_ID, `INDEX`) 
    VALUES ("Test Ticket 1", "Description 1", 1, 0), ("Test Ticket 2", "Description 2", 1, 1), ("Test Ticket 3", "Description 3", 1, 2),
        ("Test Ticket 4", "Description 4", 2, 0), ("Test Ticket 5", "Description 5", 3, 0), ("Test Ticket 6", "Description 6", 4, 0), ("Test Ticket 7", "Description 7", 4, 1);