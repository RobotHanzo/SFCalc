package io.github.seggan.sfcalc;

/*
 * Copyright (C) 2020 Seggan
 * Email: segganew@gmail.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
public final class Util {

    private Util() {}

    static String format(String s, long a, String i) {
        return s.replace("%d", Long.toString(a)).replace("%s", i);
    }

    static int getSlots(int c) {
        int n = 9;
        while (n < c) {
            n *= 2;
        }
        return n;
    }
}
