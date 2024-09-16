SELECT DISTINCT A.CART_ID
  FROM (
         SELECT CART_ID
           FROM CART_PRODUCTS
          WHERE 1=1
            AND NAME = 'Yogurt'
       ) A
     , CART_PRODUCTS B
 WHERE A.CART_ID = B.CART_ID
   AND B.NAME = 'Milk'
 ORDER BY CART_ID
   