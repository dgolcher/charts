package com.vaadin.addon.charts.model;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 2.0
 * (CVALv2).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv2 along with this program.
 * If not, see <http://vaadin.com/license/cval-2.0>.
 * #L%
 */

/**
 * Plot options that are specific for ChartType.GAUGE charts
 */
public class PlotOptionsGauge extends AbstractPlotOptions {
    private Dial dial;

    /**
     * Options for the dial or arrow pointer of the gauge.
     * 
     * @param dial
     */
    public void setDial(Dial dial) {
        this.dial = dial;
    }

    /**
     * @see #setDial(Dial)
     * @return
     */
    public Dial getDial() {
        return dial;
    }

    @Override
    public ChartType getChartType() {
        return ChartType.GAUGE;
    }
}
