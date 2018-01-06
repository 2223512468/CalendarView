package com.jaja.calendarview.frag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jaja.calendarview.CalendarDay;
import com.jaja.calendarview.MaterialCalendarView;
import com.jaja.calendarview.R;
import com.jaja.calendarview.listener.OnDateChangedListener;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by ${Terry} on 2018/1/6.
 */
public class SimpleCalendarDialogFragment extends DialogFragment implements OnDateChangedListener {

    private static final DateFormat FORMATTER = SimpleDateFormat.getDateInstance();
    private TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_basic, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = (TextView) view.findViewById(R.id.textView);

        MaterialCalendarView widget = (MaterialCalendarView) view.findViewById(R.id.calendarView);

        widget.setOnDateChangedListener(this);
    }

    @Override
    public void onDateChanged(@NonNull MaterialCalendarView widget, CalendarDay date) {
        textView.setText(FORMATTER.format(date.getDate()));
    }
}
