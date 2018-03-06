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
package com.aliyuncs.cloudphoto.transform.v20170711;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.GetPrivateAccessUrlsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetPrivateAccessUrlsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPrivateAccessUrlsResponseUnmarshaller {

	public static GetPrivateAccessUrlsResponse unmarshall(GetPrivateAccessUrlsResponse getPrivateAccessUrlsResponse, UnmarshallerContext context) {
		
		getPrivateAccessUrlsResponse.setRequestId(context.stringValue("GetPrivateAccessUrlsResponse.RequestId"));
		getPrivateAccessUrlsResponse.setCode(context.stringValue("GetPrivateAccessUrlsResponse.Code"));
		getPrivateAccessUrlsResponse.setMessage(context.stringValue("GetPrivateAccessUrlsResponse.Message"));
		getPrivateAccessUrlsResponse.setAction(context.stringValue("GetPrivateAccessUrlsResponse.Action"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < context.lengthValue("GetPrivateAccessUrlsResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setCode(context.stringValue("GetPrivateAccessUrlsResponse.Results["+ i +"].Code"));
			result.setMessage(context.stringValue("GetPrivateAccessUrlsResponse.Results["+ i +"].Message"));
			result.setPhotoId(context.longValue("GetPrivateAccessUrlsResponse.Results["+ i +"].PhotoId"));
			result.setPhotoIdStr(context.stringValue("GetPrivateAccessUrlsResponse.Results["+ i +"].PhotoIdStr"));
			result.setAccessUrl(context.stringValue("GetPrivateAccessUrlsResponse.Results["+ i +"].AccessUrl"));

			results.add(result);
		}
		getPrivateAccessUrlsResponse.setResults(results);
	 
	 	return getPrivateAccessUrlsResponse;
	}
}