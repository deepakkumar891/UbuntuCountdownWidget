/*
 * Ubuntu Countdown Widget
 * Copyright (C) 2023 Roberto Leinardi
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

package com.leinardi.ubuntucountdownwidget.ui.annotation

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

/**
 * Multipreview annotation that represents light and dark themes. Add this annotation to a
 * composable to render both themes.
 */
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "1. Light theme",
    showBackground = true,
    backgroundColor = 0xFFFBFCFF,
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "2. Dark theme",
    showBackground = true,
    backgroundColor = 0xFF001E2E,
)
annotation class ThemePreviews
