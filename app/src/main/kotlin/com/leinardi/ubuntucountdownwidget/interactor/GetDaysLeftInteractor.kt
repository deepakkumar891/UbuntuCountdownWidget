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

package com.leinardi.ubuntucountdownwidget.interactor

import java.time.LocalDate
import java.time.temporal.ChronoUnit
import javax.inject.Inject

class GetDaysLeftInteractor @Inject constructor(
    private val getReleaseDateInteractor: GetReleaseDateInteractor,
) {
    suspend operator fun invoke(releaseDate: LocalDate? = null): Long =
        ChronoUnit.DAYS.between(LocalDate.now(), releaseDate ?: getReleaseDateInteractor())
}
