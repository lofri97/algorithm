SELECT
    g3.ID
FROM
    (
        SELECT
            *
        FROM
            ECOLI_DATA 
        WHERE
            PARENT_ID IS NULL
    ) g1
    JOIN ECOLI_DATA g2 ON g2.PARENT_ID = g1.ID
    JOIN ECOLI_DATA g3 ON g3.PARENT_ID = g2.ID
ORDER BY
    g3.ID