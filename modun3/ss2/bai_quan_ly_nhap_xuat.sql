drop database if exists quan_ly_nhap_xuat;
create database if not exists quan_ly_nhap_xuat;
use quan_ly_nhap_xuat;
create table phieu_xuat(
so_px int primary key auto_increment,
ngay_xuat datetime not null
);
create table vat_tu(
ma_vtu varchar(20) primary key not null,
ten_vtu varchar(20) not null
);
create table phieu_nhap(
so_pn int primary key auto_increment not null,
ngay_nhap datetime not null
);

create table nha_cc(
ma_ncc varchar(20) primary key  not null,
ten_ncc varchar (30) not null,
dia_chi varchar(50) not null

);
create table don_dh(
so_dh int primary key auto_increment not null,
ngay_dh datetime not null,
ma_ncc varchar(20),
foreign key (ma_ncc) references nha_cc (ma_ncc)
);
create table nhacc_sdt(
ma_ncc varchar(20) not null,
sdt int unique,
primary key(ma_ncc,sdt),
foreign key (ma_ncc) references nha_cc(ma_ncc)
);
create table chi_tiet_phieu_xuat(
dg_xuat long not null,
sl_xuat int not null,
so_px int not null,
ma_vtu varchar(20) not null,
primary key (so_px,ma_vtu),
foreign key (so_px) references phieu_xuat(so_px),
foreign key (ma_vtu) references vat_tu(ma_vtu)

);
create table chi_tiet_phieu_nhap(
dg_nhap long not null,
sl_nhap int not null,
ma_vtu varchar(20) not null,
so_pn int not null,
primary key (ma_vtu,so_pn),
foreign key (ma_vtu) references vat_tu(ma_vtu),
foreign key (so_pn) references phieu_nhap(so_pn)
);
create table chi_tiet_dat_hang(
ma_vtu varchar(20) not null,
so_dh int not null,
primary key(ma_vtu,so_dh),
foreign key (ma_vtu) references vat_tu(ma_vtu),
foreign key (so_dh) references don_dh(so_dh)

);