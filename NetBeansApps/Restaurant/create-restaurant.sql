-- If you wish to start all over, you can drop all the tables and then the database/schema by uncommenting the code.
--drop table restaurantDB.Users;

-- Create a table using the following syntac or interactively via the IDE
create table restaurantDB.Users (
  FullName                   VARCHAR(50),
  Username                    VARCHAR(15),
  FavoriteStore               VARCHAR(30),
  Password                    VARCHAR(15),
  Birthday                    VARCHAR(10),
  WantNewsEmail               VARCHAR(3),
  email				VARCHAR(50)
);

--drop table reviews;
create table reviews(
	id int not null generated always as identity (start with 1, increment by 1),
	store_name varchar(50),
	author varchar(100),
	rating int,
	review_text varchar(2000),
	timestamp varchar(50),
	PRIMARY KEY(id)
);

--drop table food_items;
create table food_items (
    id int not null generated always as identity (start with 1, increment by 1),
    name varchar(45),
    description varchar(2000),
    price real,
    category varchar(50),
    img_path varchar(50),
    PRIMARY KEY(id)
);

--drop table food_feedback;
create table food_feedback (
    comment_id      int     not null generated always as identity(start with 1, increment by 1),
    food_id         int     not null,
    username        varchar(100),
    comment_date    timestamp,
    content         varchar(500),
    score           double,
    PRIMARY KEY(comment_id),
    FOREIGN KEY(food_id) references food_items(id)
);

create table reservations(
	id            int     not null generated always as identity(start with 1, increment by 1),
	reserve_store varchar(20),
	reserve_name  varchar(50),
	date	        varchar(15),
	num_guest 	  int,
	time		  varchar(5),
	PRIMARY KEY(id)
);

--insert into food_items values(default, 'name', 'description', 2.5, 'appetizer', './resources/img.jpg');
insert into food_items values(default, 'Mozarella Sticks', 'Mozarella Sticks', 5.5, 'appetizer', './resources/moz_sticks.jpg');
insert into food_items values(default, 'Nachos', 'Tortilla chips covered with Nacho cheese', 4.5, 'appetizer', './resources/nachos.jpg');
insert into food_items values(default, 'House Salad', 'Simple salad with your choice of dressing', 3.75, 'salad', './resources/HouseSalad.jpg');
insert into food_items values(default, 'Caesar Salad', 'Salad with Caesar dressing, croutons, and Parmesan cheese', 4.95, 'salad', './resources/caesar.jpg');
insert into food_items values(default, 'Spaghetti', 'Spaghetti noodles with marinara sauce and option of meatballs', 8.95, 'entree', './resources/spaghetti.jpg');
insert into food_items values(default, 'Jalapeno Poppers', 'Battered Jalapeno peppers served with a special blend of spices and cheese of your choice.', 5.49, 'appetizer', './resources/japop.jpg');
insert into food_items values(default, 'Stuffed Mushrooms', 'Fresh mushrooms stuffed with Parmesan cheese, green peppers, onions, and a special spice blend.', 4.5, 'appetizer', './resources/stuffed_mushrooms.jpg');
insert into food_items values(default, 'Chicken Florentine', 'Breaded chicken topped with fresh spinach.', 10.5, 'entree', './resources/chicken_florentine.jpg');
insert into food_items values(default, 'Bacon Cheeseburger', 'Topped with hickory smoked bacon, your choice of cheese, lettuce, and tomatoes.  Served with french fries.', 7.5, 'entree', './resources/bacon_cheeseburger.jpg');
insert into food_items values(default, 'Home-style Meatloaf', 'Our special meatloaf recipe.  ', 8.5, 'entree', './resources/meatloaf.jpg');
insert into food_items values(default, 'Taco Salad', 'All the standards: tomatoes, lettuce, salsa, served in our tortilla bowl.', 6.5, 'salad', './resources/taco_salad.jpg');
insert into food_items values(default, 'Pizza', 'Thin crust pizza with your choice of toppings.  Available in small, medium, and large sizes.  Add $2.00 for medium, $5.00 for large.', 7.95, 'entree', './resources/pizza.jpg');
