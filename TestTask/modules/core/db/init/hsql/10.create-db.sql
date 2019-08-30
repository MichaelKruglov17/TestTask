-- begin TESTTASK_CONSUMER
create table TESTTASK_CONSUMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ADRESS varchar(100) not null,
    USER_ID varchar(36) not null,
    METER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end TESTTASK_CONSUMER
-- begin TESTTASK_METER
create table TESTTASK_METER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SERIAL varchar(100) not null,
    READING varchar(100) not null,
    IS_USED boolean,
    --
    primary key (ID)
)^
-- end TESTTASK_METER
