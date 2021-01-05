use springboot;
drop table if exists user;
create table user (
	id int primary key, 
    username varchar(20), 
    password varchar(30)
);

insert into user values(100, 'scpark', '1111');
insert into user values(101, 'gdhong', '2222');
insert into user values(102, 'chsung', '3333');