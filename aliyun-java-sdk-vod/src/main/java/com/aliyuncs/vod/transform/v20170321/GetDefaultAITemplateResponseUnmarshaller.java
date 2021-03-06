/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetDefaultAITemplateResponse;
import com.aliyuncs.vod.model.v20170321.GetDefaultAITemplateResponse.TemplateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDefaultAITemplateResponseUnmarshaller {

	public static GetDefaultAITemplateResponse unmarshall(GetDefaultAITemplateResponse getDefaultAITemplateResponse, UnmarshallerContext context) {
		
		getDefaultAITemplateResponse.setRequestId(context.stringValue("GetDefaultAITemplateResponse.RequestId"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setTemplateId(context.stringValue("GetDefaultAITemplateResponse.TemplateInfo.TemplateId"));
		templateInfo.setTemplateType(context.stringValue("GetDefaultAITemplateResponse.TemplateInfo.TemplateType"));
		templateInfo.setTemplateName(context.stringValue("GetDefaultAITemplateResponse.TemplateInfo.TemplateName"));
		templateInfo.setTemplateConfig(context.stringValue("GetDefaultAITemplateResponse.TemplateInfo.TemplateConfig"));
		templateInfo.setSource(context.stringValue("GetDefaultAITemplateResponse.TemplateInfo.Source"));
		templateInfo.setIsDefault(context.stringValue("GetDefaultAITemplateResponse.TemplateInfo.IsDefault"));
		templateInfo.setCreationTime(context.stringValue("GetDefaultAITemplateResponse.TemplateInfo.CreationTime"));
		templateInfo.setModifyTime(context.stringValue("GetDefaultAITemplateResponse.TemplateInfo.ModifyTime"));
		getDefaultAITemplateResponse.setTemplateInfo(templateInfo);
	 
	 	return getDefaultAITemplateResponse;
	}
}