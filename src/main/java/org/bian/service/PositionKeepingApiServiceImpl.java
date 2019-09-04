/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class PositionKeepingApiServiceImpl implements PositionKeepingApiService {

	public SDPositionKeepingActivateOutputModel activate(SDPositionKeepingActivateInputModel request){
		return JsonReader.read("activate-SDPositionKeepingActivateOutputModel.json",new TypeReference<SDPositionKeepingActivateOutputModel>(){});
	}
	
	public BQTransactionCaptureCaptureOutputModel captureTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureCaptureInputModel request){
		return JsonReader.read("capture-BQTransactionCaptureCaptureOutputModel.json",new TypeReference<BQTransactionCaptureCaptureOutputModel>(){});
	}
	
	public SDPositionKeepingConfigureOutputModel configure(String sdReferenceId, SDPositionKeepingConfigureInputModel request){
		return JsonReader.read("configure-SDPositionKeepingConfigureOutputModel.json",new TypeReference<SDPositionKeepingConfigureOutputModel>(){});
	}
	
	public CRFinancialPositionLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialPositionLogControlInputModel request){
		return JsonReader.read("control-CRFinancialPositionLogControlOutputModel.json",new TypeReference<CRFinancialPositionLogControlOutputModel>(){});
	}
	
	public SDPositionKeepingFeedbackOutputModel feedback(String sdReferenceId, SDPositionKeepingFeedbackInputModel request){
		return JsonReader.read("feedback-SDPositionKeepingFeedbackOutputModel.json",new TypeReference<SDPositionKeepingFeedbackOutputModel>(){});
	}
	
	public CRFinancialPositionLogInitiateOutputModel initiate(String sdReferenceId, CRFinancialPositionLogInitiateInputModel request){
		return JsonReader.read("initiate-CRFinancialPositionLogInitiateOutputModel.json",new TypeReference<CRFinancialPositionLogInitiateOutputModel>(){});
	}
	
	public BQTransactionCaptureRetrieveOutputModel retrieveTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTransactionCaptureRetrieveOutputModel.json",new TypeReference<BQTransactionCaptureRetrieveOutputModel>(){});
	}
	
	public CRFinancialPositionLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRFinancialPositionLogRetrieveOutputModel.json",new TypeReference<CRFinancialPositionLogRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDPositionKeepingRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDPositionKeepingRetrieveOutputModel.json",new TypeReference<SDPositionKeepingRetrieveOutputModel>(){});
	}
	
	public CRFinancialPositionLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialPositionLogUpdateInputModel request){
		return JsonReader.read("update-CRFinancialPositionLogUpdateOutputModel.json",new TypeReference<CRFinancialPositionLogUpdateOutputModel>(){});
	}
	
	public BQTransactionCaptureUpdateOutputModel updateTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureUpdateInputModel request){
		return JsonReader.read("update-BQTransactionCaptureUpdateOutputModel.json",new TypeReference<BQTransactionCaptureUpdateOutputModel>(){});
	}
	
}
