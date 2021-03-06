/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudformation.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateStackSetRequest Marshaller
 */

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStackSetRequestMarshaller implements Marshaller<Request<CreateStackSetRequest>, CreateStackSetRequest> {

    public Request<CreateStackSetRequest> marshall(CreateStackSetRequest createStackSetRequest) {

        if (createStackSetRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateStackSetRequest> request = new DefaultRequest<CreateStackSetRequest>(createStackSetRequest, "AmazonCloudFormation");
        request.addParameter("Action", "CreateStackSet");
        request.addParameter("Version", "2010-05-15");
        request.setHttpMethod(HttpMethodName.POST);

        if (createStackSetRequest.getStackSetName() != null) {
            request.addParameter("StackSetName", StringUtils.fromString(createStackSetRequest.getStackSetName()));
        }

        if (createStackSetRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createStackSetRequest.getDescription()));
        }

        if (createStackSetRequest.getTemplateBody() != null) {
            request.addParameter("TemplateBody", StringUtils.fromString(createStackSetRequest.getTemplateBody()));
        }

        if (createStackSetRequest.getTemplateURL() != null) {
            request.addParameter("TemplateURL", StringUtils.fromString(createStackSetRequest.getTemplateURL()));
        }

        com.amazonaws.internal.SdkInternalList<Parameter> parametersList = (com.amazonaws.internal.SdkInternalList<Parameter>) createStackSetRequest
                .getParameters();
        if (parametersList.isEmpty() && !parametersList.isAutoConstruct()) {
            request.addParameter("Parameters", "");
        }
        if (!parametersList.isEmpty() || !parametersList.isAutoConstruct()) {
            int parametersListIndex = 1;

            for (Parameter parametersListValue : parametersList) {

                if (parametersListValue.getParameterKey() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".ParameterKey",
                            StringUtils.fromString(parametersListValue.getParameterKey()));
                }

                if (parametersListValue.getParameterValue() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".ParameterValue",
                            StringUtils.fromString(parametersListValue.getParameterValue()));
                }

                if (parametersListValue.getUsePreviousValue() != null) {
                    request.addParameter("Parameters.member." + parametersListIndex + ".UsePreviousValue",
                            StringUtils.fromBoolean(parametersListValue.getUsePreviousValue()));
                }
                parametersListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> capabilitiesList = (com.amazonaws.internal.SdkInternalList<String>) createStackSetRequest
                .getCapabilities();
        if (capabilitiesList.isEmpty() && !capabilitiesList.isAutoConstruct()) {
            request.addParameter("Capabilities", "");
        }
        if (!capabilitiesList.isEmpty() || !capabilitiesList.isAutoConstruct()) {
            int capabilitiesListIndex = 1;

            for (String capabilitiesListValue : capabilitiesList) {
                if (capabilitiesListValue != null) {
                    request.addParameter("Capabilities.member." + capabilitiesListIndex, StringUtils.fromString(capabilitiesListValue));
                }
                capabilitiesListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createStackSetRequest.getTags();
        if (tagsList.isEmpty() && !tagsList.isAutoConstruct()) {
            request.addParameter("Tags", "");
        }
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Key", StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter("Tags.member." + tagsListIndex + ".Value", StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        request.addParameter("ClientRequestToken", IdempotentUtils.resolveString(createStackSetRequest.getClientRequestToken()));

        return request;
    }

}
