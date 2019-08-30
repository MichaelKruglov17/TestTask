package com.company.testtask.web.screens.consumer;

import com.company.testtask.entity.Meter;
import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.testtask.entity.Consumer;
import com.haulmont.cuba.security.entity.User;
import com.haulmont.cuba.security.global.UserSession;

import javax.inject.Inject;
import java.util.Date;

@UiController("testtask_Consumer.edit")
@UiDescriptor("consumer-edit.xml")
@EditedEntityContainer("consumerDc")
@LoadDataBeforeShow
public class ConsumerEdit extends StandardEditor<Consumer> {

    @Inject
    private TextArea<String> area;
    @Inject
    private CollectionLoader<Meter> metersLc;
    @Inject
    private InstanceLoader<Consumer> consumerDl;
    @Inject
    private TimeSource timeSource;
    @Inject
    private UserSession userSession;
    @Inject
    private CollectionContainer<Meter> metersDc;

    public void onShowClick() {
        consumerDl.load();
        if (getEditedEntity().getMeter() == null){
            area.setValue("Нет счетчика");
        } else {
            String reading = getEditedEntity().getMeter().getReading();
            Date date = timeSource.currentTimestamp();
            User user = userSession.getUser();
            area.setValue(date.toString() + "  " + user.getName() + "  " + "Показания: " + reading);
        }
    }

    @Subscribe
    private void onAfterCommitChanges(AfterCommitChangesEvent event) {
        metersDc.getItem().setIs_used(true);
    }











}