SELECT
    p.ID,
    count(c.ID) AS CHILD_COUNT
FROM
    ECOLI_DATA c
    RIGHT JOIN ECOLI_DATA p on c.PARENT_ID = p.ID
GROUP BY
    p.ID
ORDER BY 
    p.id