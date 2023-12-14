drop database if exists quan_ly_ban_hang;
create database if not exists quan_ly_ban_hang;
use quan_ly_ban_hang;
create table customer(
c_id int primary key auto_increment not null,
c_name varchar(30) not null,
c_age int check (c_age>0)
);
create table order_goods(
o_id int primary key auto_increment not null,
c_id int,
o_date datetime not null,
o_total_price long not null,
foreign key (c_id) references customer (c_id)
);
create table product(
p_id int primary key ,
p_name varchar(30) not null,
p_price int check (p_price>0)
);
create table order_detail(
o_id int,
p_id int,
od_qty varchar(30),
primary key (o_id,p_id),
foreign key (o_id) references order_goods(o_id),
foreign key (p_id) references product(p_id)
);