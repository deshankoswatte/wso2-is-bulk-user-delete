/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.custom.user.bulk.delete;

public class Constants {

    public static final String BULK_DELETE = "bulkDelete";

    public static final int DEFAULT_BULK_USER_DELETE_POOL_SIZE = 4;
    public static final String BULK_DELETE_LOG_PREFIX = "[CUSTOM BULK USER DELETER] =========================> ";
    public static final String FOLDER_PATH = "./repository/resources/identity/users/";
    public static final String CONFIG_FILE_NAME = "config.properties";
    public static final String CONFIG_FILE_PATH = FOLDER_PATH + CONFIG_FILE_NAME;
    public static final int DEFAULT_TIME_TO_WAIT_FOR = 30000;

    // MANDATORY
    public static final String TENANT_DOMAIN = "tenantDomain";
    public static final String IS_SECONDARY = "isSecondary";
    public static final String USERNAME_FIELD = "usernameField";

    // OPTIONAL OR MANDATORY BASED ON isSecondary
    public static final String SECONDARY_USER_DOMAIN = "secondaryUserDomain";
    public static final String TIME_TO_WAIT_FOR = "timeToWaitFor";
}
