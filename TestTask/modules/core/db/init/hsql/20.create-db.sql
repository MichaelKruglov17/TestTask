-- begin TESTTASK_CONSUMER
alter table TESTTASK_CONSUMER add constraint FK_TESTTASK_CONSUMER_ON_USER foreign key (USER_ID) references SEC_USER(ID)^
alter table TESTTASK_CONSUMER add constraint FK_TESTTASK_CONSUMER_ON_METER foreign key (METER_ID) references TESTTASK_METER(ID)^
create index IDX_TESTTASK_CONSUMER_ON_USER on TESTTASK_CONSUMER (USER_ID)^
create index IDX_TESTTASK_CONSUMER_ON_METER on TESTTASK_CONSUMER (METER_ID)^
-- end TESTTASK_CONSUMER
