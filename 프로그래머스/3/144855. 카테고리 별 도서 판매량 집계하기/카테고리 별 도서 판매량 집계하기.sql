SELECT B.CATEGORY
     , SUM(S.SALES) AS TOTAL_SALES
  FROM BOOK B
     , BOOK_SALES S
 WHERE B.BOOK_ID = S.BOOK_ID
   AND TO_CHAR(SALES_DATE, 'YYYYMM') = '202201'
 GROUP BY B.CATEGORY
 ORDER BY B.CATEGORY