/**
 * Jenkins plugin for Coding https://coding.net
 *
 * Copyright (c) 2016-2018 Shuanglei Tao <tsl0922@gmail.com>
 * Copyright (c) 2016-present, Coding, Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.coding.jenkins.plugin.cause;

import hudson.triggers.SCMTrigger;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author tsl0922
 */
public class CodingWebHookCause extends SCMTrigger.SCMTriggerCause {
    private final CauseData data;

    public CodingWebHookCause(CauseData data) {
        super("");
        this.data = checkNotNull(data, "data must not be null");
    }

    public CauseData getData() {
        return data;
    }

    @Override
    public String getShortDescription() {
        return data.getShortDescription();
    }
}
