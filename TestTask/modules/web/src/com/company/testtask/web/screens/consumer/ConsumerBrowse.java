package com.company.testtask.web.screens.consumer;

import com.haulmont.cuba.gui.screen.*;
import com.company.testtask.entity.Consumer;

@UiController("testtask_Consumer.browse")
@UiDescriptor("consumer-browse.xml")
@LookupComponent("consumersTable")
@LoadDataBeforeShow
public class ConsumerBrowse extends StandardLookup<Consumer> {
}