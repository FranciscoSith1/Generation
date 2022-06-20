-- Inner join

select c.customerNumber, o.orderNumber ,c.customerName 
from customers c, orders o
where c.customerNumber = o.customerNumber 
and c.customerNumber = 496
order by c.customerNumber desc;

SELECT c.customerNumber, o.orderNumber ,c.customerName 
FROM customers c -- tabla A
INNER JOIN orders o -- tabla B
ON c.customerNumber = o.customerNumber
and c.customerNumber = 496
order by c.customerNumber desc;

SELECT o.orderNumber, p.productCode
FROM orders o
INNER JOIN products p
ON 