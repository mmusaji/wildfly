/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.as.ejb3.component.singleton;

import org.jboss.as.ejb3.component.session.SessionBeanComponentInstance;
import org.jboss.invocation.Interceptor;
import org.jboss.invocation.InterceptorFactoryContext;

import java.io.Serializable;
import java.util.List;

/**
 * @author  Jaikiran Pai
 */
public class SingletonComponentInstance extends SessionBeanComponentInstance {

    /**
     * Construct a new instance.
     *
     * @param component the component
     * @param instance  the object instance
     */
    public SingletonComponentInstance(final SingletonComponent component, final Object instance, final List<Interceptor> preDestroyInterceptors, final InterceptorFactoryContext factoryContext) {
        super(component, instance, preDestroyInterceptors, factoryContext);
    }

    @Override
    protected Serializable getId() {
        return null;
    }
}
