package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogInitiateOutputModel
 */
public class CRFinancialPositionLogInitiateOutputModel   {
  private String financialPositionLogInstanceReference = null;

  private String financialPositionLogInitiateActionReference = null;

  private Object financialPositionLogInitiateActionRecord = null;

  private String financialPositionLogInstanceStatus = null;

  private CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return financialPositionLogInitiateActionReference
  **/

  public String getFinancialPositionLogInitiateActionReference() {
    return financialPositionLogInitiateActionReference;
  }

  public void setFinancialPositionLogInitiateActionReference(String financialPositionLogInitiateActionReference) {
    this.financialPositionLogInitiateActionReference = financialPositionLogInitiateActionReference;
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

  public CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecord getCRFinancialPositionLogInstanceRecord() {
    return cRFinancialPositionLogInstanceRecord;
  }

  @JsonProperty("cRFinancialPositionLogInstanceRecord")
  public void setCRFinancialPositionLogInstanceRecord(CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord) {
    this.cRFinancialPositionLogInstanceRecord = cRFinancialPositionLogInstanceRecord;
  }


}

