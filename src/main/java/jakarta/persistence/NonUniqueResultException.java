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

package jakarta.persistence;

/**
 * Thrown by the persistence provider when {@link Query#getSingleResult Query.getSingleResult()} or {@link TypedQuery#getSingleResult TypedQuery.getSingleResult()} is executed on a
 * query and there is more than one result from the query. This exception will not cause the current transaction, if one is active, to be marked for rollback.
 * @see Query#getSingleResult()
 * @see TypedQuery#getSingleResult()
 * @since 1.0
 */
public class NonUniqueResultException extends PersistenceException
{
    private static final long serialVersionUID = -4762263326851035194L;

    /**
     * Constructs a new <code>NonUniqueResultException</code> exception with <code>null</code> as its detail message.
     */
    public NonUniqueResultException()
    {
        super();
    }

    /**
     * Constructs a new <code>NonUniqueResultException</code> exception with <code>null</code> as its detail message.
     * @param cause Cause of this exception
     */
    public NonUniqueResultException(Exception cause)
    {
        super(cause);
    }

    /**
     * Constructs a new <code>NonUniqueResultException</code> exception with the specified detail message.
     * @param message the detail message.
     */
    public NonUniqueResultException(String message)
    {
        super(message);
    }

    /**
     * Constructs a new <code>NonUniqueResultException</code> exception with the specified detail message.
     * @param message the detail message.
     * @param cause Cause of this exception
     */
    public NonUniqueResultException(String message, Exception cause)
    {
        super(message, cause);
    }
}
