drop table if exists city;
drop table if exists hotel;

create table city (
   `id` int not null
 , `name` varchar(30)
 , `state` varchar(6)
 , `country` varchar(6)
 , primary key(id)
) engine = INNODB;

create table hotel (
    `id` int not null
  , `city` int not null
  , `name` varchar(60)
  , `address` varchar(60)
  , `zip` varchar(12)
  , primary key(id)
) engine = INNODB;

insert into city (id, name, state, country) values (1, 'San Francisco', 'CA', 'US');
insert into city (id, name, state, country) values (2, 'New York City', 'NY', 'US');
insert into city (id, name, state, country) values (3, 'Los Angeles', 'CA', 'US');
insert into city (id, name, state, country) values (4, 'Chicago', 'IL', 'US');
insert into city (id, name, state, country) values (5, 'Houston', 'TX', 'US');

insert into hotel(id, city, name, address, zip) values (1, 1, 'Conrad Treasury Place', 'William & George Streets', '4001');
insert into hotel(id, city, name, address, zip) values (2, 1, 'The Westin St. Francis San Francisco on Union Square', 'Powell Street, Union Square, San Francisco, CA', '335');
insert into hotel(id, city, name, address, zip) values (3, 1, 'The Fairmont San Francisco', 'Mason Street, San Francisco, CA', '950');
