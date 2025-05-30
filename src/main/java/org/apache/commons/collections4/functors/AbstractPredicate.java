/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections4.functors;

import org.apache.commons.collections4.Predicate;

/**
 * Abstract base class for predicates.
 *
 * @param <T> the type of the input to the predicate.
 * @since 4.5.0-M3
 */
public abstract class AbstractPredicate<T> implements Predicate<T> {

    /**
     * Constructs a new instance.
     */
    public AbstractPredicate() {
        // empty
    }

    @Override
    public boolean evaluate(final T object) {
        return test(object);
    }
}
