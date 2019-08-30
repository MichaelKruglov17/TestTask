package com.company.testtask.web.screens.meter;

import com.haulmont.cuba.gui.screen.*;
import com.company.testtask.entity.Meter;

@UiController("testtask_Meter.edit")
@UiDescriptor("meter-edit.xml")
@EditedEntityContainer("meterDc")
@LoadDataBeforeShow
public class MeterEdit extends StandardEditor<Meter> {
}