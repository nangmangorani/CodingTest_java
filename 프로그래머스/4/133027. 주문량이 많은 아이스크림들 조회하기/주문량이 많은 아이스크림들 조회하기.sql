-- SELECT *
--   FROM (
--          SELECT F.FLAVOR
--            FROM FIRST_HALF F
--               , JULY J
--           WHERE 1=1
--             AND F.SHIPMENT_ID = J.SHIPMENT_ID
--           ORDER BY F.TOTAL_ORDER + J.TOTAL_ORDER DESC
--        )
--  WHERE ROWNUM <= 3
 
 
SELECT FLAVOR 
  FROM (
        SELECT A.FLAVOR AS FLAVOR , A.TOTAL_ORDER + B.TOTAL_ORDER AS TOTAL_ORDER 
          FROM 
              (SELECT FLAVOR , SUM(TOTAL_ORDER) AS TOTAL_ORDER 
                 FROM JULY
                GROUP BY FLAVOR) A 
                 LEFT JOIN FIRST_HALF B 
                   ON A.FLAVOR = B.FLAVOR 
                ORDER BY TOTAL_ORDER DESC)
         WHERE ROWNUM <=3
