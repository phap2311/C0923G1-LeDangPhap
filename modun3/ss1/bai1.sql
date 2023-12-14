create database student_management;
use student_management;
create table class(
id_class int primary key,
name_class varchar(50)
);
create table teacher (
id_teacher int,
name_teacher varchar(200),
age int,
country varchar(50),
primary key(id_teacher)
);

