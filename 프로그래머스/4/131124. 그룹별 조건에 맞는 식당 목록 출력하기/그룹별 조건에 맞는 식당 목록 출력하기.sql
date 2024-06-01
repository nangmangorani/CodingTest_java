SELECT MEMBER_NAME
     , REVIEW_TEXT
     , TO_CHAR(REVIEW_DATE, 'YYYY-MM-DD') REVIEW_DATE
  FROM MEMBER_PROFILE M
     , REST_REVIEW R
 WHERE M.MEMBER_ID = R.MEMBER_ID
   AND M.MEMBER_ID IN (SELECT MEMBER_ID
                         FROM REST_REVIEW
                        GROUP BY MEMBER_ID
                       HAVING COUNT(*) = (SELECT MAX(COUNT(*))
                                            FROM REST_REVIEW
                                           GROUP BY MEMBER_ID))
                                           ORDER BY REVIEW_DATE, REVIEW_TEXT
