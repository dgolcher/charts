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
 * Series for range type data
 */
public class RangeSeries extends AbstractSeries {
    private Number[][] data;

    private Number yAxis;

    /**
     * Default constructor
     */
    public RangeSeries() {
    }

    /**
     * Construct RangeSeries with given name
     * 
     * @param name
     */
    public RangeSeries(String name) {
        super(name);
    }

    /**
     * Construct RangeSeries with given values
     * 
     * @param name
     */
    public RangeSeries(Number[]... numbers) {
        data = numbers;
    }

    /**
     * Construct RangeSeries with given name and values
     * 
     * @param name
     */
    public RangeSeries(String name, Number[]... numbers) {
        this(name);
        data = numbers;
    }

    /**
     * Get numeric data
     * 
     * @return
     */
    public Number[][] getData() {
        return data;
    }

    /**
     * Set numeric data
     * 
     * @param data
     */
    public void setData(Number[]... data) {
        this.data = data;
    }

    /**
     * @see #setyAxis(Number)
     * @return Y Axis number or null if not defined
     */
    public Number getyAxis() {
        return yAxis;
    }

    /**
     * When using dual or multiple y axes, this number defines which yAxis the
     * particular series is connected to. It refers to the index of the axis in
     * the yAxis array, with 0 being the first. Defaults to 0.
     * 
     * @param yAxis
     */
    public void setyAxis(Number yAxis) {
        this.yAxis = yAxis;
    }
}
