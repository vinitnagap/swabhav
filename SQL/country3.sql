SELECT countries.COUNTRY_NAME,locations.STATE_PROVINCE,regions.region_name
FROM locations INNER JOIN countries ON locations.COUNTRY_ID=countries.COUNTRY_ID
INNER JOIN regions ON regions.region_id= countries.REGION_ID