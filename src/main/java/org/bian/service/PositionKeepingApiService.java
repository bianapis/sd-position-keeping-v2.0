/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface PositionKeepingApiService {

	SDPositionKeepingActivateOutputModel activate(SDPositionKeepingActivateInputModel request);
	
	BQTransactionCaptureCaptureOutputModel captureTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureCaptureInputModel request);
	
	SDPositionKeepingConfigureOutputModel configure(String sdReferenceId, SDPositionKeepingConfigureInputModel request);
	
	CRFinancialPositionLogControlOutputModel control(String sdReferenceId, String crReferenceId, CRFinancialPositionLogControlInputModel request);
	
	SDPositionKeepingFeedbackOutputModel feedback(String sdReferenceId, SDPositionKeepingFeedbackInputModel request);
	
	CRFinancialPositionLogInitiateOutputModel initiate(String sdReferenceId, CRFinancialPositionLogInitiateInputModel request);
	
	BQTransactionCaptureRetrieveOutputModel retrieveTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRFinancialPositionLogRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDPositionKeepingRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRFinancialPositionLogUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRFinancialPositionLogUpdateInputModel request);
	
	BQTransactionCaptureUpdateOutputModel updateTransactioncapture(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTransactionCaptureUpdateInputModel request);
	
}
