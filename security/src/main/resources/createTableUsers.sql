use springboot;
drop table if exists user;
create table user (
	id int primary key, 
    username varchar(20), 
    password varchar(100)
);

insert into user values(100, 'scpark', '$2y$10$1PLVn5Y8RkB8RUP9QNU9cuXgfVTJvdalT4pLQpQ3.hB86FbvUZ5zK');
insert into user values(101, 'gdhong', '$2y$10$hk0y1k3S0EgnP2xHzyU2/u83EKgMTh9sX7uioIWlFX0Cz6xgpn/Gm');
insert into user values(102, 'chsung', '$2y$10$xEK88nBU.ggdpWx9nQxSuu29Z7Tp/8avFasT6WqolLWGdqhR8oSN6');