SELECT ANIMAL_ID
     , NAME
  FROM ANIMAL_INS
 WHERE Lower(NAME) LIKE '%el%'
   AND ANIMAL_TYPE = 'Dog'
 ORDER BY NAME;