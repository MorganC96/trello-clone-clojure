FROM mysql:8.0.17
COPY . .
ADD /resources/sql/prepare_schema.sql /docker-entrypoint-initdb.d
ADD /resources/sql/prepare_test_data.sql /docker-entrypoint-initdb.d