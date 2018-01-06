package com.jaja.calendarview.listener;

import com.jaja.calendarview.CalendarDay;
import com.jaja.calendarview.MaterialCalendarView;

/**
 * The callback used to indicate the user changes the displayed month
 */
public interface OnMonthChangedListener {

    /**
     * Called upon change of the selected day
     *
     * @param widget the view associated with this listener
     * @param date   the month picked, as the first day of the month
     */
    void onMonthChanged(MaterialCalendarView widget, CalendarDay date);
}
