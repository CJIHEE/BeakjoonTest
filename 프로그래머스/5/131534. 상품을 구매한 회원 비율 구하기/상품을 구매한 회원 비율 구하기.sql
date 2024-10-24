-- 코드를 입력하세요
-- 날짜,회원ID,상품ID PK

 select DATE_FORMAT(SALES_DATE, '%Y') as YEAR, 
        DATE_FORMAT(SALES_DATE, '%m') as MONTH,
        count(distinct a.USER_ID) as PURCHASED_USERS, 
        ROUND(count(distinct a.USER_ID) /(select count(*) from USER_INFO where JOINED like '%2021%'),1) as PUCHASED_RATIO
 from USER_INFO a
 INNER JOIN ONLINE_SALE as b
 on a.USER_ID = b.USER_ID
 WHERE joined like '%2021%' 
 GROUP BY YEAR, MONTH
 order by YEAR, MONTH asc

# SELECT DATE_FORMAT(O.SALES_DATE, '%Y') AS YEAR,
#         DATE_FORMAT(O.SALES_DATE, '%m') AS MONTH,
#         COUNT(DISTINCT U.USER_ID) AS PUCHASED_USERS,
#         ROUND(COUNT(DISTINCT U.USER_ID)/(SELECT COUNT(*) FROM USER_INFO WHERE joined LIKE '2021%'), 1) AS PUCHASED_RATIO
# FROM USER_INFO U
# JOIN ONLINE_SALE O
# ON U.USER_ID = O.USER_ID
# WHERE U.JOINED LIKE '2021%'
# GROUP BY YEAR, MONTH
# ORDER BY YEAR, MONTH


#  select *
#  from(
#      select DATE_FORMAT(SALES_DATE, '%Y') as YEAR, DATE_FORMAT(SALES_DATE, '%m') as MONTH, count(*) as purchaseUserCount
#      from USER_INFO a
#      INNER JOIN ONLINE_SALE as b
#      on a.USER_ID = b.USER_ID
#      WHERE joined like '%2021%' 
#      GROUP BY DATE_FORMAT(SALES_DATE, '%y'),DATE_FORMAT(SALES_DATE, '%m') 

#      )as a
# left join
#  ( 
#          select DATE_FORMAT(JOINED, '%Y') as YEAR, DATE_FORMAT(JOINED, '%m') as MONTH, count(*) as jounedUserCount
#          from USER_INFO
#          WHERE joined like '%2021%'
#          GROUP BY DATE_FORMAT(JOINED, '%y'),DATE_FORMAT(JOINED, '%m') 
#   )as b
#   on a.YEAR = b.YEAR and a.MONTH = b.MONTH


