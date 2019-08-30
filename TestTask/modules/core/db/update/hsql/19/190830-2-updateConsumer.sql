update TESTTASK_CONSUMER set ADRESS = '' where ADRESS is null ;
alter table TESTTASK_CONSUMER alter column ADRESS set not null ;
-- update TESTTASK_CONSUMER set USER_ID = <default_value> where USER_ID is null ;
alter table TESTTASK_CONSUMER alter column USER_ID set not null ;
-- update TESTTASK_CONSUMER set METER_ID = <default_value> where METER_ID is null ;
alter table TESTTASK_CONSUMER alter column METER_ID set not null ;
