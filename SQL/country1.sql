SELECT regions.region_id,regions.region_name from regions INNER JOIN countries ON regions.region_id=countries.REGION_ID WHERE countries.COUNTRY_NAME IS null