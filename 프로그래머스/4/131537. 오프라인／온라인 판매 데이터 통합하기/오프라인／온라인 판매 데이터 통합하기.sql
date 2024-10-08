SELECT TO_CHAR(SALES_DATE, 'YYYY-MM-DD') SALES_DATE
     , PRODUCT_ID
     , USER_ID
     , SALES_AMOUNT
  FROM (
         SELECT SALES_DATE
              , PRODUCT_ID
              , USER_ID
              , SALES_AMOUNT
           FROM ONLINE_SALE
          WHERE 1=1
            AND TO_CHAR(SALES_DATE,'YYYYMM') = '202203'
          UNION
         SELECT SALES_DATE
              , PRODUCT_ID
              , NULL
              , SALES_AMOUNT
           FROM OFFLINE_SALE
          WHERE 1=1
            AND TO_CHAR(SALES_DATE,'YYYYMM') = '202203'
       )
  ORDER BY SALES_DATE
         , PRODUCT_ID
         , USER_ID