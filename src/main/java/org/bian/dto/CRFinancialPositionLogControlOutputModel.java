package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogControlOutputModel
 */
public class CRFinancialPositionLogControlOutputModel   {
  private String financialPositionLogControlActionTaskReference = null;

  private Object financialPositionLogControlActionTaskRecord = null;

  private String financialPositionLogControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Position Log instance control processing service call 
   * @return financialPositionLogControlActionTaskReference
  **/

  public String getFinancialPositionLogControlActionTaskReference() {
    return financialPositionLogControlActionTaskReference;
  }

  public void setFinancialPositionLogControlActionTaskReference(String financialPositionLogControlActionTaskReference) {
    this.financialPositionLogControlActionTaskReference = financialPositionLogControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return financialPositionLogControlActionTaskRecord
  **/

  public Object getFinancialPositionLogControlActionTaskRecord() {
    return financialPositionLogControlActionTaskRecord;
  }

  public void setFinancialPositionLogControlActionTaskRecord(Object financialPositionLogControlActionTaskRecord) {
    this.financialPositionLogControlActionTaskRecord = financialPositionLogControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return financialPositionLogControlActionResponse
  **/

  public String getFinancialPositionLogControlActionResponse() {
    return financialPositionLogControlActionResponse;
  }

  public void setFinancialPositionLogControlActionResponse(String financialPositionLogControlActionResponse) {
    this.financialPositionLogControlActionResponse = financialPositionLogControlActionResponse;
  }


}

