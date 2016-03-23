create table reservations(
	id            int     not null generated always as identity(start with 1, increment by 1),
	reserve_store varchar(20),
	reserve_name  varchar(50),
	date	        varchar(15),
	num_guest 	  int,
	time		  varchar(5),
	PRIMARY KEY(id)
)