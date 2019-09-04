package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogUpdateOutputModel
 */
public class CRFinancialPositionLogUpdateOutputModel   {
  private CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord = null;

  private String financialPositionLogUpdateActionTaskReference = null;

  private Object financialPositionLogUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get cRFinancialPositionLogInstanceRecord
   * @return cRFinancialPositionLogInstanceRecord
  **/

  public CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord getCRFinancialPositionLogInstanceRecord() {
    return cRFinancialPositionLogInstanceRecord;
  }

  @JsonProperty("cRFinancialPositionLogInstanceRecord")
  public void setCRFinancialPositionLogInstanceRecord(CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord) {
    this.cRFinancialPositionLogInstanceRecord = cRFinancialPositionLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return financialPositionLogUpdateActionTaskReference
  **/

  public String getFinancialPositionLogUpdateActionTaskReference() {
    return financialPositionLogUpdateActionTaskReference;
  }

  public void setFinancialPositionLogUpdateActionTaskReference(String financialPositionLogUpdateActionTaskReference) {
    this.financialPositionLogUpdateActionTaskReference = financialPositionLogUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

