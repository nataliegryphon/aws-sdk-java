/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.config.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.config.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * Describe Delivery Channel Status Result JSON Unmarshaller
 */
public class DescribeDeliveryChannelStatusResultJsonUnmarshaller implements Unmarshaller<DescribeDeliveryChannelStatusResult, JsonUnmarshallerContext> {

    public DescribeDeliveryChannelStatusResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDeliveryChannelStatusResult describeDeliveryChannelStatusResult = new DescribeDeliveryChannelStatusResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null) token = context.nextToken();
        if (token == VALUE_NULL) return null;

        while (true) {
            if (token == null) break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("DeliveryChannelsStatus", targetDepth)) {
                    context.nextToken();
                    describeDeliveryChannelStatusResult.setDeliveryChannelsStatus(new ListUnmarshaller<DeliveryChannelStatus>(DeliveryChannelStatusJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }

            token = context.nextToken();
        }
        
        return describeDeliveryChannelStatusResult;
    }

    private static DescribeDeliveryChannelStatusResultJsonUnmarshaller instance;
    public static DescribeDeliveryChannelStatusResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeDeliveryChannelStatusResultJsonUnmarshaller();
        return instance;
    }
}
    