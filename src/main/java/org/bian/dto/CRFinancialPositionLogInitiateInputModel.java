package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogInitiateInputModel
 */
public class CRFinancialPositionLogInitiateInputModel   {
  private String positionKeepingServicingSessionReference = null;

  private Object financialPositionLogInitiateActionRecord = null;

  private String financialPositionLogInstanceStatus = null;

  private CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return financialPositionLogInitiateActionRecord
  **/

  public Object getFinancialPositionLogInitiateActionRecord() {
    return financialPositionLogInitiateActionRecord;
  }

  public void setFinancialPositionLogInitiateActionRecord(Object financialPositionLogInitiateActionRecord) {
    this.financialPositionLogInitiateActionRecord = financialPositionLogInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Financial Position Log instance (e.g. initialised, pending, active) 
   * @return financialPositionLogInstanceStatus
  **/

  public String getFinancialPositionLogInstanceStatus() {
    return financialPositionLogInstanceStatus;
  }

  public void setFinancialPositionLogInstanceStatus(String financialPositionLogInstanceStatus) {
    this.financialPositionLogInstanceStatus = financialPositionLogInstanceStatus;
  }


  /**
   * Get cRFinancialPositionLogInstanceRecord
   * @return cRFinancialPositionLogInstanceRecord
  **/

  public CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecord getCRFinancialPositionLogInstanceRecord() {
    return cRFinancialPositionLogInstanceRecord;
  }

  public void setCRFinancialPositionLogInstanceRecord(CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord) {
    this.cRFinancialPositionLogInstanceRecord = cRFinancialPositionLogInstanceRecord;
  }


}

