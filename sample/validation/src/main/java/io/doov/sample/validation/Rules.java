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
package io.doov.sample.validation;

import static io.doov.core.dsl.DOOV.count;
import static io.doov.core.dsl.DOOV.matchAll;
import static io.doov.core.dsl.time.LocalDateSuppliers.firstDayOfThisYear;
import static io.doov.core.dsl.time.LocalDateSuppliers.today;
import static io.doov.core.dsl.time.TemporalAdjuster.firstDayOfYear;
import static io.doov.sample.field.SampleFieldIdInfo.*;
import static io.doov.sample.validation.id.AccountRulesId.VALID_ACCOUNT_01;
import static io.doov.sample.validation.id.AccountRulesId.VALID_ACCOUNT_02;
import static io.doov.sample.validation.id.AccountRulesId.VALID_EMAIL;
import static java.time.temporal.ChronoUnit.DAYS;

import io.doov.core.dsl.DOOV;
import io.doov.core.dsl.impl.DefaultRuleRegistry;
import io.doov.core.dsl.lang.RuleRegistry;
import io.doov.sample.model.Country;

public class Rules extends DefaultRuleRegistry {

    public static final RuleRegistry REGISTRY_ACCOUNT = new DefaultRuleRegistry();
    public static final RuleRegistry REGISTRY_USER = new DefaultRuleRegistry();

    static {
        DOOV.when(accountEmail().matches("\\w+[@]\\w+\\.com")
                        .or(accountEmail().matches("\\w+[@]\\w+\\.fr")))
                        .validate()
                        .withMessage("email finishes with .com or .fr")
                        .registerOn(REGISTRY_ACCOUNT, VALID_EMAIL);

        DOOV.when(matchAll(userBirthdate().ageAt(today()).greaterOrEquals(18),
                        accountEmail().length().lesserOrEquals(configurationMaxEmailSize()),
                        accountCountry().eq(Country.FR).and(accountPhoneNumber().startsWith("+33"))))
                        .validate()
                        .registerOn(REGISTRY_ACCOUNT, VALID_ACCOUNT_01);

        DOOV.when(userBirthdate().ageAt(today()).greaterOrEquals(18)
                        .and(accountEmail().length().lesserOrEquals(configurationMaxEmailSize()))
                        .and(accountCountry().eq(Country.FR))
                        .and(accountPhoneNumber().startsWith("+33")))
                        .validate()
                        .registerOn(REGISTRY_ACCOUNT, VALID_ACCOUNT_02);

        DOOV.when(count(userFirstName().isNotNull(),
                        userLastName().isNotNull().and(userLastName().matches("[A-Z]+")))
                        .greaterOrEquals(0))
                        .validate()
                        .registerOn(REGISTRY_USER);

        DOOV.when(userLastName().isNotNull().and(userLastName().matches("[A-Z]+")
                        .and(count(accountPhoneNumber().isNotNull(), accountEmail().isNotNull())
                                        .greaterThan(0))))
                        .validate()
                        .registerOn(REGISTRY_USER);

        DOOV.when(userBirthdate().ageAt(accountCreationDate()).greaterOrEquals(18))
                        .validate()
                        .registerOn(REGISTRY_ACCOUNT);

        DOOV.when(userBirthdate().ageAt(accountCreationDate().with(firstDayOfYear())).greaterOrEquals(18))
                        .validate()
                        .registerOn(REGISTRY_ACCOUNT);

        DOOV.when(userBirthdate().ageAt(firstDayOfThisYear()).greaterOrEquals(18))
                        .validate()
                        .registerOn(REGISTRY_ACCOUNT);
    }

    static {
        DOOV.when(userId().isNotNull())
                        .validate()
                        .registerOn(REGISTRY_USER);

        DOOV.when(userBirthdate().ageAt(today()).greaterOrEquals(18)).validate()
                        .registerOn(REGISTRY_USER);

        DOOV.when(userBirthdate().after(userBirthdate().minus(1, DAYS))).validate()
                        .registerOn(REGISTRY_USER);
    }

}
