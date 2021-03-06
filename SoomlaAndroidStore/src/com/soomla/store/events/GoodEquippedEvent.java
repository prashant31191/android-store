/*
 * Copyright (C) 2012-2014 Soomla Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.soomla.store.events;

import com.soomla.store.domain.virtualGoods.EquippableVG;

/**
 * This event is fired when a specific <code>EquippableVG</code> has been equipped.
 *
 * Real Game Example:
 *  Example Inventory: { currency_coin: 100, Characters: Robot_X, Robot_Y }
 *  Suppose your user equips Robot_X.
 *  His/her new balance of Characters will be { Characters: Robot_Y }.
 *  A <code>GoodEquippedEvent</code> is fired.
 */
public class GoodEquippedEvent {
    /**
     * Constructor
     *
     * @param good
     */
    public GoodEquippedEvent(EquippableVG good) {
        mGood = good;
    }


    /** Setters and Getters */

    public EquippableVG getGood() {
        return mGood;
    }


    /** Private Members */

    private EquippableVG mGood;
}
