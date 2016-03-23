--insert into food_items values(default, 'name', 'description', 2.5, 'appetizer', './resources/img.jpg');
insert into food_items values(default, 'Jalapeno Poppers', 'Battered Jalapeno peppers served with a special blend of spices and cheese of your choice.', 5.49, 'appetizer', './resources/japop.jpg');
insert into food_items values(default, 'Stuffed Mushrooms', 'Fresh mushrooms stuffed with Parmesan cheese, green peppers, onions, and a special spice blend.', 4.5, 'appetizer', './resources/stuffed_mushrooms.jpg');
insert into food_items values(default, 'Chicken Florentine', 'Breaded chicken topped with fresh spinach.', 10.5, 'entree', './resources/chicken_florentine.jpg');
insert into food_items values(default, 'Bacon Cheeseburger', 'Topped with hickory smoked bacon, your choice of cheese, lettuce, and tomatoes.  Served with french fries.', 7.5, 'entree', './resources/bacon_cheeseburger.jpg');
insert into food_items values(default, 'Home-style Meatloaf', 'Our special meatloaf recipe.  ', 8.5, 'entree', './resources/meatloaf.jpg');
insert into food_items values(default, 'Taco Salad', 'All the standards: tomatoes, lettuce, salsa, served in our tortilla bowl.', 6.5, 'salad', './resources/taco_salad.jpg');
delete from food_items where name='Small Pizza';
insert into food_items values(default, 'Pizza', 'Thin crust pizza with your choice of toppings.  Available in small, medium, and large sizes.  Add $2.00 for medium, $5.00 for large.', 7.95, 'entree', './resources/pizza.jpg');