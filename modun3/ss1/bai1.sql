create database student_management;
use student_management;
create table Class(
id_c int primary key,
name_c varchar(50)
);
create table Teacher (
id int,
name_teacher varchar(200),
age int,
country varchar(50),
primary key(id)
);

