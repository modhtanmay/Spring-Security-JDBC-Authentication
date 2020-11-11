insert into users (username,password,enabled) values ('user','user',true);

insert into users (username,password,enabled) values ('admin','admin',true);

insert into authorities(username,authority) values ('user','ROLE_USER');

insert into authorities(username,authority) values ('admin','ROLE_ADMIN');