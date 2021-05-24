/*
 * Copyright (c) 2008, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Linda DeMichiel - 2.1
//     Linda DeMichiel - 2.0

package jakarta.persistence.criteria;

import jakarta.persistence.criteria.Order;

/**
 * An object that defines an ordering over the query results.
 *
 * @since 2.0
 */
public interface Order {

   /**
    * Switch the ordering.
    * @return a new <code>Order</code> instance with the reversed ordering
    */
    Order reverse();

   /**
    * Whether ascending ordering is in effect.
    * @return boolean indicating whether ordering is ascending
    */
    boolean isAscending();

   /**
    * Return the expression that is used for ordering.
    * @return expression used for ordering
    */
   Expression<?> getExpression();

   /**
    * Set nulls to be positioned first in the ordering.
    * <b>Note that this is a DataNucleus extension, post JPA2.1</b>
    * @return This instance
    */
   Order nullsFirst();

   /**
    * Set nulls to be positioned last in the ordering.
    * <b>Note that this is a DataNucleus extension, post JPA 2.1</b>
    * @return This instance
    */
   Order nullsLast();
}
