/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2012 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
// Portions Copyright [2019] [Payara Foundation and/or its affiliates]
package com.sun.enterprise.deployment.runtime.web;

import com.sun.enterprise.deployment.runtime.common.SecurityRoleMapping;
import com.sun.enterprise.deployment.runtime.common.wls.SecurityRoleAssignment;

public interface SunWebApp {

    String SECURITY_ROLE_MAPPING = "SecurityRoleMapping";
    String SECURITY_ROLE_ASSIGNMENT = "SecurityRoleAssignment";
    String SERVLET = "Servlet";
    String SESSION_CONFIG = "SessionConfig";
    String CACHE = "Cache";
    String CLASS_LOADER = "ClassLoader";
    String JSP_CONFIG = "JspConfig";
    String LOCALE_CHARSET_INFO = "LocaleCharsetInfo";
    String PARAMETER_ENCODING = "ParameterEncoding";
    String FORM_HINT_FIELD = "FormHintField";
    String DEFAULT_CHARSET = "DefaultCharset";
    String IDEMPOTENT_URL_PATTERN = "IdempotentUrlPattern";
    String ERROR_URL = "ErrorUrl";
    String HTTPSERVLET_SECURITY_PROVIDER = "HttpServletSecurityProvider";
    String VALVE = "Valve";

    void setSecurityRoleMapping(int index, SecurityRoleMapping value);

    SecurityRoleMapping getSecurityRoleMapping(int index);

    void setSecurityRoleMapping(SecurityRoleMapping[] value);

    SecurityRoleMapping[] getSecurityRoleMapping();

    int sizeSecurityRoleMapping();

    int addSecurityRoleMapping(SecurityRoleMapping value);

    int removeSecurityRoleMapping(SecurityRoleMapping value);

    void setSecurityRoleAssignment(int index, SecurityRoleAssignment value);

    SecurityRoleAssignment getSecurityRoleAssignment(int index);

    void setSecurityRoleAssignments(SecurityRoleAssignment[] value);

    SecurityRoleAssignment[] getSecurityRoleAssignments();

    int sizeSecurityRoleAssignment();

    int addSecurityRoleAssignment(SecurityRoleAssignment value);

    int removeSecurityRoleAssignment(SecurityRoleAssignment value);

    void setIdempotentUrlPattern(int index, IdempotentUrlPattern value);

    IdempotentUrlPattern getIdempotentUrlPattern(int index);

    void setIdempotentUrlPatterns(IdempotentUrlPattern[] value);

    IdempotentUrlPattern[] getIdempotentUrlPatterns();

    int sizeIdempotentUrlPattern();

    int addIdempotentUrlPattern(IdempotentUrlPattern value);

    int removeIdempotentUrlPattern(IdempotentUrlPattern value);

    String getAttributeValue(String attributeName);
}
