package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogControlInputModelFinancialPositionLogControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogControlInputModel
 */
public class CRFinancialPositionLogControlInputModel   {
  private String positionKeepingServicingSessionReference = null;

  private String financialPositionLogInstanceReference = null;

  private Object financialPositionLogControlActionTaskRecord = null;

  private CRFinancialPositionLogControlInputModelFinancialPositionLogControlActionRequest financialPositionLogControlActionRequest = null;


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
   * Get financialPositionLogControlActionRequest
   * @return financialPositionLogControlActionRequest
  **/

  public CRFinancialPositionLogControlInputModelFinancialPositionLogControlActionRequest getFinancialPositionLogControlActionRequest() {
    return financialPositionLogControlActionRequest;
  }

  public void setFinancialPositionLogControlActionRequest(CRFinancialPositionLogControlInputModelFinancialPositionLogControlActionRequest financialPositionLogControlActionRequest) {
    this.financialPositionLogControlActionRequest = financialPositionLogControlActionRequest;
  }


}

