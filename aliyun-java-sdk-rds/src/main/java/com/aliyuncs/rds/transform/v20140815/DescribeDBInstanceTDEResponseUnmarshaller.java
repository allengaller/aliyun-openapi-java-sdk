/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceTDEResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceTDEResponse.Database;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

public class DescribeDBInstanceTDEResponseUnmarshaller {

    public static DescribeDBInstanceTDEResponse unmarshall(
            DescribeDBInstanceTDEResponse describeDBInstanceTDEResponse,
            UnmarshallerContext context) {

        describeDBInstanceTDEResponse
                .setRequestId(context.stringValue("DescribeDBInstanceTDEResponse.RequestId"));
        describeDBInstanceTDEResponse
                .setTDEStatus(context.stringValue("DescribeDBInstanceTDEResponse.TDEStatus"));

        List<Database> databases = new ArrayList<Database>();
        for (int i = 0;
             i < context.lengthValue("DescribeDBInstanceTDEResponse.Databases.Length"); i++) {
            Database database = new Database();
            database.setDBName(context.stringValue(
                    "DescribeDBInstanceTDEResponse.Databases[" + i + "].DBName"));
            database.setTDEStatus(context.stringValue(
                    "DescribeDBInstanceTDEResponse.Databases[" + i + "].TDEStatus"));

            databases.add(database);
        }
        describeDBInstanceTDEResponse.setDatabases(databases);

        return describeDBInstanceTDEResponse;
    }
}
