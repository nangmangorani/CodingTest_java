SELECT DISTINCT U.USER_ID
     , U.NICKNAME
     , U.CITY || ' ' || U.STREET_ADDRESS1 || ' ' || U.STREET_ADDRESS2 "전체주소"
     , SUBSTR(TLNO,0,3) || '-' || SUBSTR(TLNO,4,4) || '-' || SUBSTR(TLNO,8,4) "전화번호"
  FROM USED_GOODS_BOARD B
     , USED_GOODS_USER U
 WHERE B.WRITER_ID = U.USER_ID
   AND U.USER_ID IN ( 
                      SELECT WRITER_ID
                        FROM USED_GOODS_BOARD 
                       GROUP BY WRITER_ID
                      HAVING COUNT(*) >= 3)
 ORDER BY U.USER_ID DESC;