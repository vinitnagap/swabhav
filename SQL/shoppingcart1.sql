Select * from Customer inner join orders on customer.order_id = orders.order_id
inner join lineitem on orders.lineitem_id = lineitem.lineitem_id
inner join product on lineitem.product_id = product.product_id
where cust_name = 'Sachin'