SELECT
    ID,
    n.FISH_NAME,
    LENGTH
FROM
    FISH_INFO f
    JOIN FISH_NAME_INFO n on f.FISH_TYPE = n.FISH_TYPE
WHERE
    (f.FISH_TYPE, f.LENGTH) IN (
        SELECT
            FISH_TYPE,
            MAX(LENGTH)
        FROM
            FISH_INFO
        GROUP BY
            FISH_TYPE
    )
ORDER BY 
    ID ASC