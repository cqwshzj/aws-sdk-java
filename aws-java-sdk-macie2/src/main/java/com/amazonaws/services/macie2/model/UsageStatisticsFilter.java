/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies criteria for filtering the results of a query for account quotas and usage data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01T00:00:00Z/UsageStatisticsFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UsageStatisticsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field to use to filter the results. The only supported value is accountId.
     * </p>
     */
    private String key;
    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the results.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * <p>
     * The field to use to filter the results. The only supported value is accountId.
     * </p>
     * 
     * @param key
     *        The field to use to filter the results. The only supported value is accountId.
     * @see UsageStatisticsFilterKey
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The field to use to filter the results. The only supported value is accountId.
     * </p>
     * 
     * @return The field to use to filter the results. The only supported value is accountId.
     * @see UsageStatisticsFilterKey
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The field to use to filter the results. The only supported value is accountId.
     * </p>
     * 
     * @param key
     *        The field to use to filter the results. The only supported value is accountId.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatisticsFilterKey
     */

    public UsageStatisticsFilter withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The field to use to filter the results. The only supported value is accountId.
     * </p>
     * 
     * @param key
     *        The field to use to filter the results. The only supported value is accountId.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatisticsFilterKey
     */

    public UsageStatisticsFilter withKey(UsageStatisticsFilterKey key) {
        this.key = key.toString();
        return this;
    }

    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the results.
     * </p>
     * 
     * @return An array that lists the AWS account ID for each account to include in the results.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the results.
     * </p>
     * 
     * @param values
     *        An array that lists the AWS account ID for each account to include in the results.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        An array that lists the AWS account ID for each account to include in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatisticsFilter withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that lists the AWS account ID for each account to include in the results.
     * </p>
     * 
     * @param values
     *        An array that lists the AWS account ID for each account to include in the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UsageStatisticsFilter withValues(java.util.Collection<String> values) {
        setValues(values);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UsageStatisticsFilter == false)
            return false;
        UsageStatisticsFilter other = (UsageStatisticsFilter) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public UsageStatisticsFilter clone() {
        try {
            return (UsageStatisticsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.UsageStatisticsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
