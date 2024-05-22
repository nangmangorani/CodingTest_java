SELECT B.HOUR, NVL(COUNT, 0) COUNT
  FROM (
         SELECT TO_NUMBER(TO_CHAR(DATETIME, 'HH24')) HOUR, COUNT(*) COUNT
           FROM ANIMAL_OUTS
          GROUP BY TO_NUMBER(TO_CHAR(DATETIME, 'HH24'))
          ORDER BY HOUR
       ) A
     , (
         SELECT LEVEL-1 AS HOUR 
           FROM DUAL 
        CONNECT BY LEVEL<=24
       ) B
 WHERE B.HOUR = A.HOUR(+)
 ORDER BY B.HOUR



--SELECT LEVEL-1 AS hour FROM dual CONNECT BY LEVEL<=24