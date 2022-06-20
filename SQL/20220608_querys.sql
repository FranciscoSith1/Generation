USE generationg1;

SELECT * FROM customers c;

SELECT * FROM customers c
WHERE c.customerName LIKE '%toy%';

SELECT c.customerNumber, c.customerName, c.city 
FROM customers c 
WHERE c.city = 'Madrid';

-- obteniendo todos los registros de ambas tablas
SELECT * 
FROM customers c, orders o
ORDER BY c.customerNumber DESC;

SELECT * 
FROM customers c, orders o
WHERE c.customerNumber = o.customerNumber
ORDER BY c.customerNumber DESC;

-- obtener todas las ordenes por cliente
SELECT c.customerNumber, o.orderNumber, c.customerName
FROM customers c, orders o
WHERE c.customerNumber = o.customerNumber
AND c.customerNumber = 496
ORDER BY c.customerNumber DESC;

select * FROM customers c
WHERE c.customerNumber = 496;

SELECT * FROM orders o
WHERE o.customerNumber = 496;

-- consultar por productos
select * FROM products p;

SELECT * FROM productlines pl;

-- filtrar Motorcycle

select p.productName , pl.productLine 
from products p , productlines pl
where p.productLine  = pl.productLine
and pl.productLine = 'Motorcycles'  ;



SELECT p.productName, pl.productLine, p.quantityInStock
FROM products p , productlines pl
WHERE p.productName LIKE '%Ford%'
ORDER BY pl.productLine ASC;

