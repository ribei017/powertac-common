/*
 * Copyright 2009-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an
 * "AS IS" BASIS,  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.powertac.common

import grails.test.GrailsUnitTestCase

class CashUpdateTests extends GrailsUnitTestCase {
  protected void setUp() {
    super.setUp()
    mockForConstraintsTests(CashUpdate)
  }

  protected void tearDown() {
    super.tearDown()
  }

  void testNullableValidationLogic() {
    CashUpdate cashUpdate = new CashUpdate(dateCreated: null)
    assertFalse(cashUpdate.validate())
    //assertEquals('nullable', cashUpdate.errors.getFieldError('id').getCode()) TODO: check nullable validation logic on cashUpdate id field
    assertEquals('nullable', cashUpdate.errors.getFieldError('transactionId').getCode())
    assertEquals('nullable', cashUpdate.errors.getFieldError('competition').getCode())
    assertEquals('nullable', cashUpdate.errors.getFieldError('broker').getCode())
    assertEquals('nullable', cashUpdate.errors.getFieldError('relativeChange').getCode())
    assertEquals('nullable', cashUpdate.errors.getFieldError('overallBalance').getCode())
    assertEquals('nullable', cashUpdate.errors.getFieldError('latest').getCode())
    assertEquals('nullable', cashUpdate.errors.getFieldError('dateCreated').getCode())
  }

  void testBlankValidationLogic() {
    CashUpdate cmd = new CashUpdate(id: '', transactionId: '')
    assertFalse(cmd.validate())
    assertEquals('blank', cmd.errors.getFieldError('id').getCode())
    assertEquals('blank', cmd.errors.getFieldError('transactionId').getCode())
  }
}
