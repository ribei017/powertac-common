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

package org.powertac.common.interfaces;

import java.util.List;

/**
 * Interface for a liquidity provider.
 *
 * @author David Dauer, Carsten Block
 * @version 0.1 - January 2nd, 2011
 */
public interface LiquidityProvider extends CompetitionBaseEvents {

  /**
   * This is method is called in order to make the LiquidityProvider
   * module generate quotes (i.e. buy and sell shouts) for all products
   * in all timeslots of a particular competition
   *
   * @param competitionId the competition to generate quotes for
   * @return List of {@link org.powertac.common.command.ShoutDoCreateCmd}, {@link org.powertac.common.command.ShoutDoUpdateCmd}, and {@link org.powertac.common.command.ShoutDoDeleteCmd} objects to be processed by the auctioneer later on
   */
  public List createAllQuotesFor (String competitionId);

  /**
   * This is method is called in order to make the LiquidityProvider
   * module respond to a specific transaction that occurred in the market.
   *
   * @param transactionLogId the id of the transactionLog to respond to
   * @return List of {@link org.powertac.common.command.ShoutDoCreateCmd}, {@link org.powertac.common.command.ShoutDoUpdateCmd}, and {@link org.powertac.common.command.ShoutDoDeleteCmd} objects to be processed by the auctioneer later on
   */
  public List createQuoteFor(String transactionLogId);

  /**
   * This is method is called in order to make the LiquidityProvider
   * module generate / update its quote (i.e. buy and sell orders) for
   * a particular product in a particular timeslot.
   *
   * @param productId the id of the product to generate a quote for
   * @param timeslotId the id of the timeslot to generate a quote for
   * @return List of {@link org.powertac.common.command.ShoutDoCreateCmd}, {@link org.powertac.common.command.ShoutDoUpdateCmd}, and {@link org.powertac.common.command.ShoutDoDeleteCmd} objects to be processed by the auctioneer later on
   */
  public List createQuoteFor(String productId, String timeslotId);

}