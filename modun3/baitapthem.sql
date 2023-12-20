use demo2006;
SELECT 
    name, age, time
FROM
    customer,
    `order`
WHERE
    `order`.customerId = customer.id;


use demo2006;


/* Mức 1 */
SELECT 
    *
FROM
    product
WHERE
    quantity >= 30;

/* 2 */
SELECT 
    *
FROM
    product
WHERE
    quantity >= 30
        AND price BETWEEN 100 AND 200;
 /* 3 */
SELECT 
    *
FROM
    customer
WHERE
    age > 18;
 /* 4 */
SELECT 
    *
FROM
    customer
WHERE
    name LIKE 'Nguyễn%' AND age > 20 5 */;
SELECT 
    *
FROM
    product
WHERE
    name LIKE 'M%';
   /* 6 */
SELECT 
    *
FROM
    product
WHERE
    name LIKE '%e' ;
    /*7 */
select * 
from product
order by quantity asc ;
/* 8 */
select * 
from product
order by price desc ;

/* Mức 2 */
/* 1 */
select customer.name , `order`.time
from customer 
join `order` on customer.id = `order`.customerId;
/* 2 */
SELECT 
    customer.name, product.name
FROM
    customer
        JOIN
    `order` ON customer.id = `order`.customerId
        JOIN
    orderdetail ON `order`.id = orderdetail.orderId
        JOIN
    product ON orderdetail.productId = product.id;

SELECT 
    `order`.*, product.name
FROM
    `order`
        JOIN
    orderdetail ON `order`.id = orderdetail.orderId
        JOIN
    product ON orderdetail.productId = product.id
WHERE
    time BETWEEN '2006-06-19' AND '2006-06-20';

