create database manufacturing_fruit_product_management;

use  manufacturing_fruit_product_management;

create table registration
(
 id int primary key,
 name varchar(100),
 address varchar(200),
 city varchar(50),
 postalcode int(10),
 dob varchar(50),
 gender varchar(50),
 contact bigint(50),
 email_id varchar(100),
 aadhar_no bigint(100)
);

create table loginpage
(
 username varchar(50),
 password varchar(30),
 date varchar(50),
 time varchar(50)
);

create table employeedetails
( 
id int primary key,
name varchar(100),
address varchar(200),
city varchar(50),
postalcode int(10),
designation varchar(100),
salary varchar(100),
contact bigint(50),
dateofjoining varchar(50),
aadhar_no bigint(100),
qualification varchar(100)
);

create table paymentdetails
(
 invoiceno int primary key,
 customername varchar(100),
 modeofpayment varchar(100),
 netamount varchar(100),
 paidamount varchar(50),
 remainingamount varchar(50),
 paymentstatus varchar(100),
 date varchar(50),
 time varchar(50)
 );

create table saleinformation
(
invocenum int primary key,
customername varchar(100),
companyname varchar(100),
date varchar(50),
time varchar(50),
productname varchar(100),
productcategory varchar(100),
productspecification varchar(100),
price varchar(20),
quantity bigint(10),
totalamount varchar(100),
amount varchar(100),
netamount varchar(100),
discount varchar(100),
gst varchar(50)
);

create table purchaseinformation
(
invocenum int primary key,
supplierrname varchar(100),
companyname varchar(100),
date varchar(50),
time varchar(50),
productname varchar(100),
mfg_date varchar(50),
exp_date varchar(50),
price varchar(20),
quantity bigint(10),
totalamount varchar(100),
amount varchar(100),
netamount varchar(100),
discount varchar(50),
alltaxes varchar(50)
);

create table productinformation
(
id int primary key,
name varchar(100),
category varchar(200),
specification varchar(200),
quantity bigint(50),
price varchar(100),
mfg_date varchar(100),
exp_date varchar(100)
);

create table supplierinformation
(
id int primary key,
name varchar(100),
companyname varchar(100),
city varchar(50),
supplyitem varchar(100),
dateofentry varchar(50),
contact bigint(50)
);

create table purchasedetails1
(
invoiceno int primary key,
 suppliername varchar(100),
 companyname varchar(100),
 date varchar(50),
 time varchar(50),
 productname varchar(100), 
 price varchar(50),
 quantity varchar(50), 
 totalamount varchar(100)
 );

create table saleinformation1
(
invocenum int primary key,
customername varchar(100),
companyname varchar(100),
date varchar(50),
time varchar(50),
productname varchar(100),
productcategory varchar(100),
productspecification varchar(100),
price varchar(100),
quantity bigint(50),
totalamount varchar(100)
);

create table employee_payment
(
id int primary key,
name varchar(100),
workingdays bigint(50),
absentdays bigint(50),
perdaysalary varchar(50),
salary varchar(50),
totalsalary varchar(50),
date varchar(50),
time varchar(50)
);

create table rawmaterial_info
(
id int primary key,
productname varchar(100),
companyname varchar(100),
price varchar(100),
quantity bigint(50),
mfg_date varchar(50),
exp_date varchar(50)
);

create table stock
(
id int primary key,
name varchar(100),
category varchar(200),
specification varchar(200),
quantity bigint(50),
date varchar(50),
exp_date varchar(100)
);

create table rawmaterial_stock
(
id int primary key,
productname varchar(100),
quantity varchar(50),
date varchar(50),
exp_date varchar(100)
);

create table supplier_paymentdetails
(
 invoiceno int primary key,
 suppliername varchar(100),
 modeofpayment varchar(100),
 netamount varchar(100),
 paidamount varchar(50),
 remainingamount varchar(50),
 paymentstatus varchar(100),
 date varchar(50),
 time varchar(50)
 );



