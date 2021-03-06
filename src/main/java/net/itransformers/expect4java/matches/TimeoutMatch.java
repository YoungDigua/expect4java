/*
 * TimeoutMatch.java
 *
 * Copyright 2016  iTransformers Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.itransformers.expect4java.matches;

import net.itransformers.expect4java.Closure;

public class TimeoutMatch extends Match{
    Long timeout;

    public TimeoutMatch(Long timeout) {
        this(timeout, null);
    }

    public TimeoutMatch(Closure closure) {
        this(null, closure);
    }

    public TimeoutMatch(Long timeout, Closure closure) {
        super(closure);
        this.timeout = timeout;
    }

    public Long getTimeout() {
        return timeout;
    }

    @Override
    public String toString() {
        return "TimeoutMatch{" +
                "timeout=" + timeout +
                '}';
    }
}
