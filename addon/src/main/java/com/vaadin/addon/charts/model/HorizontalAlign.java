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
 * Alignment of the title relative to the axis values and more generically
 * horizontal alignment. Possible values are RIGHT("right"), CENTER("center") or
 * LEFT("left")
 */
public enum HorizontalAlign implements ChartEnum {
    RIGHT("right"), CENTER("center"), LEFT("left");

    private final String align;

    private HorizontalAlign(String align) {
        this.align = align;
    }

    @Override
    public String toString() {
        return getAlign();
    }

    public String getAlign() {
        return align;
    }
}
