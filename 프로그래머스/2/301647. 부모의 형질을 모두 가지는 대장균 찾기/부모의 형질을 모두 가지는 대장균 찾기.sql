SELECT
    c.ID,
    c.GENOTYPE,
    p.GENOTYPE as PARENT_GENOTYPE
FROM
    ECOLI_DATA p
    JOIN ECOLI_DATA c on p.ID = c.PARENT_ID
WHERE
    p.GENOTYPE & c.GENOTYPE = p.GENOTYPE
ORDER BY
    c.ID