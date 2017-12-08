/*
 * Copyright 2017 Courtanet
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
package io.doov.core.dsl.field;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

import java.util.Collection;
import java.util.function.*;

import io.doov.core.dsl.DslField;
import io.doov.core.dsl.impl.DefaultCondition;
import io.doov.core.dsl.impl.IntegerCondition;
import io.doov.core.dsl.lang.StepCondition;

public interface BaseFieldInfo<T> extends DslField {

    // null

    default StepCondition isNull() {
        return getDefaultCondition().isNull();
    }

    default StepCondition isNotNull() {
        return getDefaultCondition().isNotNull();
    }

    // eq

    default StepCondition eq(T value) {
        return getDefaultCondition().eq(value);
    }

    default StepCondition eq(BaseFieldInfo<T> value) {
        return getDefaultCondition().eq(value);
    }

    default StepCondition eq(Supplier<T> value) {
        return getDefaultCondition().eq(value);
    }

    default StepCondition notEq(T value) {
        return getDefaultCondition().notEq(value);
    }

    default StepCondition notEq(BaseFieldInfo<T> value) {
        return getDefaultCondition().notEq(value);
    }

    // any match

    default StepCondition anyMatch(Predicate<T> value) {
        return getDefaultCondition().anyMatch(singletonList(value));
    }

    @SuppressWarnings("unchecked")
    default StepCondition anyMatch(T... values) {
        return getDefaultCondition().anyMatch(asList(values));
    }

    default StepCondition anyMatch(Collection<T> values) {
        return getDefaultCondition().anyMatch(values);
    }

    // all match

    default StepCondition allMatch(Predicate<T> value) {
        return getDefaultCondition().allMatch(singletonList(value));
    }

    @SuppressWarnings("unchecked")
    default StepCondition allMatch(T... values) {
        return getDefaultCondition().allMatch(asList(values));
    }

    default StepCondition allMatch(Collection<T> values) {
        return getDefaultCondition().allMatch(values);
    }

    // none match

    default StepCondition noneMatch(Predicate<T> value) {
        return getDefaultCondition().noneMatch(singletonList(value));
    }

    @SuppressWarnings("unchecked")
    default StepCondition noneMatch(T... values) {
        return getDefaultCondition().noneMatch(asList(values));
    }

    default StepCondition noneMatch(Collection<T> values) {
        return getDefaultCondition().noneMatch(values);
    }

    // map

    default IntegerCondition mapToInt(Function<T, Integer> mapper) {
        return getDefaultCondition().mapToInt(mapper);
    }

    // implementation

    DefaultCondition<T> getDefaultCondition();

}
