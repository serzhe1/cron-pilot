CREATE SCHEMA IF NOT EXISTS test_schema AUTHORIZATION postgres;
ALTER DATABASE db SET search_path TO test_schema, public;