package com.company.testtask.web.screens.meter;

import com.haulmont.cuba.gui.screen.*;
import com.company.testtask.entity.Meter;

@UiController("testtask_Meter.browse")
@UiDescriptor("meter-browse.xml")
@LookupComponent("metersTable")
@LoadDataBeforeShow
public class MeterBrowse extends StandardLookup<Meter> {
}