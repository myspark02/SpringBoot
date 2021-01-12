use springsecurity;
drop table if exists user;

create table user (
	id int auto_increment primary key, 
    active bool default true, 
    password varchar(100), 
    roles varchar(100), 
    username varchar(50)
    );
    
insert into user(active, password, roles, username)
values(true, 'pass', 'ROLE_USER', 'user');
insert into user(active, password, roles, username)
values(true, 'pass', 'ROLE_ADMIN', 'scpark') 