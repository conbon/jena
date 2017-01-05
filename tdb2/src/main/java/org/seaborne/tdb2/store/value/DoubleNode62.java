/*
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  See the NOTICE file distributed with this work for additional
 *  information regarding copyright ownership.
 */

package org.seaborne.tdb2.store.value;

import org.apache.jena.atlas.lib.NotImplemented;

public class DoubleNode62 {
    // 64 bits of value; collapses NaNs to a single value.

    public static long pack(double v) {
        throw new NotImplemented();
    }

    public static double unpack(long v) {
        throw new NotImplemented();
    }
}
