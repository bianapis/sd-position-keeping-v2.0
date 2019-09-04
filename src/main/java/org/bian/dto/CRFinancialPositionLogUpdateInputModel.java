package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogUpdateInputModel
 */
public class CRFinancialPositionLogUpdateInputModel   {
  private String positionKeepingServicingSessionReference = null;

  private String financialPositionLogInstanceReference = null;

  private CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord = null;

  private Object financialPositionLogUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return positionKeepingServicingSessionReference
  **/

  public String getPositionKeepingServicingSessionReference() {
    return positionKeepingServicingSessionReference;
  }

  public void setPositionKeepingServicingSessionReference(String positionKeepingServicingSessionReference) {
    this.positionKeepingServicingSessionReference = positionKeepingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Financial Position Log instance 
   * @return financialPositionLogInstanceReference
  **/

  public String getFinancialPositionLogInstanceReference() {
    return financialPositionLogInstanceReference;
  }

  public void setFinancialPositionLogInstanceReference(String financialPositionLogInstanceReference) {
    this.financialPositionLogInstanceReference = financialPositionLogInstanceReference;
  }


  /**
   * Get cRFinancialPositionLogInstanceRecord
   * @return cRFinancialPositionLogInstanceRecord
  **/

  public CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord getCRFinancialPositionLogInstanceRecord() {
    return cRFinancialPositionLogInstanceRecord;
  }

  public void setCRFinancialPositionLogInstanceRecord(CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord) {
    this.cRFinancialPositionLogInstanceRecord = cRFinancialPositionLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return financialPositionLogUpdateActionTaskRecord
  **/

  public Object getFinancialPositionLogUpdateActionTaskRecord() {
    return financialPositionLogUpdateActionTaskRecord;
  }

  public void setFinancialPositionLogUpdateActionTaskRecord(Object financialPositionLogUpdateActionTaskRecord) {
    this.financialPositionLogUpdateActionTaskRecord = financialPositionLogUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

