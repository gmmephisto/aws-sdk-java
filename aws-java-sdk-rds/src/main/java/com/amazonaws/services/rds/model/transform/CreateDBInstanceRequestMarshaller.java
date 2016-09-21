/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * CreateDBInstanceRequest Marshaller
 */

public class CreateDBInstanceRequestMarshaller implements
        Marshaller<Request<CreateDBInstanceRequest>, CreateDBInstanceRequest> {

    public Request<CreateDBInstanceRequest> marshall(
            CreateDBInstanceRequest createDBInstanceRequest) {

        if (createDBInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<CreateDBInstanceRequest> request = new DefaultRequest<CreateDBInstanceRequest>(
                createDBInstanceRequest, "AmazonRDS");
        request.addParameter("Action", "CreateDBInstance");
        request.addParameter("Version", "2014-10-31");
        request.setHttpMethod(HttpMethodName.POST);

        if (createDBInstanceRequest.getDBName() != null) {
            request.addParameter("DBName",
                    StringUtils.fromString(createDBInstanceRequest.getDBName()));
        }

        if (createDBInstanceRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils
                    .fromString(createDBInstanceRequest
                            .getDBInstanceIdentifier()));
        }

        if (createDBInstanceRequest.getAllocatedStorage() != null) {
            request.addParameter("AllocatedStorage", StringUtils
                    .fromInteger(createDBInstanceRequest.getAllocatedStorage()));
        }

        if (createDBInstanceRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils
                    .fromString(createDBInstanceRequest.getDBInstanceClass()));
        }

        if (createDBInstanceRequest.getEngine() != null) {
            request.addParameter("Engine",
                    StringUtils.fromString(createDBInstanceRequest.getEngine()));
        }

        if (createDBInstanceRequest.getMasterUsername() != null) {
            request.addParameter("MasterUsername", StringUtils
                    .fromString(createDBInstanceRequest.getMasterUsername()));
        }

        if (createDBInstanceRequest.getMasterUserPassword() != null) {
            request.addParameter("MasterUserPassword",
                    StringUtils.fromString(createDBInstanceRequest
                            .getMasterUserPassword()));
        }

        com.amazonaws.internal.SdkInternalList<String> dBSecurityGroupsList = (com.amazonaws.internal.SdkInternalList<String>) createDBInstanceRequest
                .getDBSecurityGroups();
        if (!dBSecurityGroupsList.isEmpty()
                || !dBSecurityGroupsList.isAutoConstruct()) {
            int dBSecurityGroupsListIndex = 1;

            for (String dBSecurityGroupsListValue : dBSecurityGroupsList) {
                if (dBSecurityGroupsListValue != null) {
                    request.addParameter(
                            "DBSecurityGroups.DBSecurityGroupName."
                                    + dBSecurityGroupsListIndex,
                            StringUtils.fromString(dBSecurityGroupsListValue));
                }
                dBSecurityGroupsListIndex++;
            }
        }

        com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIdsList = (com.amazonaws.internal.SdkInternalList<String>) createDBInstanceRequest
                .getVpcSecurityGroupIds();
        if (!vpcSecurityGroupIdsList.isEmpty()
                || !vpcSecurityGroupIdsList.isAutoConstruct()) {
            int vpcSecurityGroupIdsListIndex = 1;

            for (String vpcSecurityGroupIdsListValue : vpcSecurityGroupIdsList) {
                if (vpcSecurityGroupIdsListValue != null) {
                    request.addParameter(
                            "VpcSecurityGroupIds.VpcSecurityGroupId."
                                    + vpcSecurityGroupIdsListIndex, StringUtils
                                    .fromString(vpcSecurityGroupIdsListValue));
                }
                vpcSecurityGroupIdsListIndex++;
            }
        }

        if (createDBInstanceRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils
                    .fromString(createDBInstanceRequest.getAvailabilityZone()));
        }

        if (createDBInstanceRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils
                    .fromString(createDBInstanceRequest.getDBSubnetGroupName()));
        }

        if (createDBInstanceRequest.getPreferredMaintenanceWindow() != null) {
            request.addParameter("PreferredMaintenanceWindow", StringUtils
                    .fromString(createDBInstanceRequest
                            .getPreferredMaintenanceWindow()));
        }

        if (createDBInstanceRequest.getDBParameterGroupName() != null) {
            request.addParameter("DBParameterGroupName", StringUtils
                    .fromString(createDBInstanceRequest
                            .getDBParameterGroupName()));
        }

        if (createDBInstanceRequest.getBackupRetentionPeriod() != null) {
            request.addParameter("BackupRetentionPeriod", StringUtils
                    .fromInteger(createDBInstanceRequest
                            .getBackupRetentionPeriod()));
        }

        if (createDBInstanceRequest.getPreferredBackupWindow() != null) {
            request.addParameter("PreferredBackupWindow", StringUtils
                    .fromString(createDBInstanceRequest
                            .getPreferredBackupWindow()));
        }

        if (createDBInstanceRequest.getPort() != null) {
            request.addParameter("Port",
                    StringUtils.fromInteger(createDBInstanceRequest.getPort()));
        }

        if (createDBInstanceRequest.getMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils
                    .fromBoolean(createDBInstanceRequest.getMultiAZ()));
        }

        if (createDBInstanceRequest.getEngineVersion() != null) {
            request.addParameter("EngineVersion", StringUtils
                    .fromString(createDBInstanceRequest.getEngineVersion()));
        }

        if (createDBInstanceRequest.getAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils
                    .fromBoolean(createDBInstanceRequest
                            .getAutoMinorVersionUpgrade()));
        }

        if (createDBInstanceRequest.getLicenseModel() != null) {
            request.addParameter("LicenseModel", StringUtils
                    .fromString(createDBInstanceRequest.getLicenseModel()));
        }

        if (createDBInstanceRequest.getIops() != null) {
            request.addParameter("Iops",
                    StringUtils.fromInteger(createDBInstanceRequest.getIops()));
        }

        if (createDBInstanceRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils
                    .fromString(createDBInstanceRequest.getOptionGroupName()));
        }

        if (createDBInstanceRequest.getCharacterSetName() != null) {
            request.addParameter("CharacterSetName", StringUtils
                    .fromString(createDBInstanceRequest.getCharacterSetName()));
        }

        if (createDBInstanceRequest.getPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils
                    .fromBoolean(createDBInstanceRequest
                            .getPubliclyAccessible()));
        }

        com.amazonaws.internal.SdkInternalList<Tag> tagsList = (com.amazonaws.internal.SdkInternalList<Tag>) createDBInstanceRequest
                .getTags();
        if (!tagsList.isEmpty() || !tagsList.isAutoConstruct()) {
            int tagsListIndex = 1;

            for (Tag tagsListValue : tagsList) {

                if (tagsListValue.getKey() != null) {
                    request.addParameter("Tags.Tag." + tagsListIndex + ".Key",
                            StringUtils.fromString(tagsListValue.getKey()));
                }

                if (tagsListValue.getValue() != null) {
                    request.addParameter(
                            "Tags.Tag." + tagsListIndex + ".Value",
                            StringUtils.fromString(tagsListValue.getValue()));
                }
                tagsListIndex++;
            }
        }

        if (createDBInstanceRequest.getDBClusterIdentifier() != null) {
            request.addParameter("DBClusterIdentifier", StringUtils
                    .fromString(createDBInstanceRequest
                            .getDBClusterIdentifier()));
        }

        if (createDBInstanceRequest.getStorageType() != null) {
            request.addParameter("StorageType", StringUtils
                    .fromString(createDBInstanceRequest.getStorageType()));
        }

        if (createDBInstanceRequest.getTdeCredentialArn() != null) {
            request.addParameter("TdeCredentialArn", StringUtils
                    .fromString(createDBInstanceRequest.getTdeCredentialArn()));
        }

        if (createDBInstanceRequest.getTdeCredentialPassword() != null) {
            request.addParameter("TdeCredentialPassword", StringUtils
                    .fromString(createDBInstanceRequest
                            .getTdeCredentialPassword()));
        }

        if (createDBInstanceRequest.getStorageEncrypted() != null) {
            request.addParameter("StorageEncrypted", StringUtils
                    .fromBoolean(createDBInstanceRequest.getStorageEncrypted()));
        }

        if (createDBInstanceRequest.getKmsKeyId() != null) {
            request.addParameter("KmsKeyId", StringUtils
                    .fromString(createDBInstanceRequest.getKmsKeyId()));
        }

        if (createDBInstanceRequest.getDomain() != null) {
            request.addParameter("Domain",
                    StringUtils.fromString(createDBInstanceRequest.getDomain()));
        }

        if (createDBInstanceRequest.getCopyTagsToSnapshot() != null) {
            request.addParameter("CopyTagsToSnapshot", StringUtils
                    .fromBoolean(createDBInstanceRequest
                            .getCopyTagsToSnapshot()));
        }

        if (createDBInstanceRequest.getMonitoringInterval() != null) {
            request.addParameter("MonitoringInterval", StringUtils
                    .fromInteger(createDBInstanceRequest
                            .getMonitoringInterval()));
        }

        if (createDBInstanceRequest.getMonitoringRoleArn() != null) {
            request.addParameter("MonitoringRoleArn", StringUtils
                    .fromString(createDBInstanceRequest.getMonitoringRoleArn()));
        }

        if (createDBInstanceRequest.getDomainIAMRoleName() != null) {
            request.addParameter("DomainIAMRoleName", StringUtils
                    .fromString(createDBInstanceRequest.getDomainIAMRoleName()));
        }

        if (createDBInstanceRequest.getPromotionTier() != null) {
            request.addParameter("PromotionTier", StringUtils
                    .fromInteger(createDBInstanceRequest.getPromotionTier()));
        }

        if (createDBInstanceRequest.getTimezone() != null) {
            request.addParameter("Timezone", StringUtils
                    .fromString(createDBInstanceRequest.getTimezone()));
        }

        return request;
    }

}
