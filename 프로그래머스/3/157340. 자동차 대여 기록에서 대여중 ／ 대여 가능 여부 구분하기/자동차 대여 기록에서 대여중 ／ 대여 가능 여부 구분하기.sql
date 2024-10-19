SELECT 
    CAR_ID,
    NVL2(
        MAX(
            CASE 
                WHEN TO_DATE('2022-10-16','YYYY-MM-DD') BETWEEN START_DATE AND END_DATE
                    THEN 1
                    ELSE NULL
            END
        )
        ,'대여중','대여 가능'
    ) AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC