/*
 * Copyright 2009-2010 the original author or authors.
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

package org.powertac.common;

import java.math.RoundingMode;

/**
 * This class contains constant definitions used throughout
 * the project.
 *
 * @author Carsten Block
 * @version 1.0, Date: 13.12.10
 */
public class Constants {
    /**
     * DECIMALS constant is used to set the common decimal scaling in
     * BigDecimal numbers; for powertac this is set to 2 decimal digits
     */
    public static final int DECIMALS = 4;
    public static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;
}