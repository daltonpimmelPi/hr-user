insert into tb_user(name, email, password) values ('Nina Brown', 'nina@gmail.com', '$2a$10$7czPcALV25AKZx8i7456a.2z8kZuxgMiP4k4wlScIJoq9R.wN3WeG');
insert into tb_user(name, email, password) values ('Leia Red', 'leia@gmail.com', '$2a$10$7czPcALV25AKZx8i7456a.2z8kZuxgMiP4k4wlScIJoq9R.wN3WeG');

insert into tb_role(role_name) values ('ROLE_OPERATOR');
insert into tb_role(role_name) values ('ROLE_ADMIN');

insert into tb_user_role(user_id, role_id) values (1, 1);
insert into tb_user_role(user_id, role_id) values (2, 1);
insert into tb_user_role(user_id, role_id) values (2, 2);