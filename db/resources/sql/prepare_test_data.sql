USE app;

INSERT INTO BOARD (NAME) 
    VALUES ("Test Board 1"), ("Test Board 2"), ("Test Board 3"), ("Test Board 4"), ("Test Board 5");

INSERT INTO TICKET (NAME, DESCRIPTION, BOARD_ID) 
    VALUES ("Test Ticket 1", "Description 1", 1), ("Test Ticket 2", "Description 2", 1), ("Test Ticket 3", "Description 3", 1),
        ("Test Ticket 4", "Description 4", 1), ("Test Ticket 5", "Description 5", 1);