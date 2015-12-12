/*
 * Ubuntu Countdown Widget
 * Copyright (C) 2015 Roberto Leinardi
 *
 * This program is free software: you can redistribute it and/or modify it under the terms
 * of the GNU General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this
 * program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.leinardi.ubuntucountdownwidget.appwidgets;

import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;

import com.leinardi.ubuntucountdownwidget.R;

public class Widget1x1Provider extends WidgetProvider {
    @Override
    protected ComponentName getComponentName(Context context) {
        return new ComponentName(context, Widget1x1Provider.class);
    }

    @Override
    protected RemoteViews getRemoteViews(Context context, boolean isThemeDark) {
        return new RemoteViews(context.getPackageName(),
                isThemeDark ? R.layout.appwidget_1x1_dark : R.layout.appwidget_1x1_light);
    }
}