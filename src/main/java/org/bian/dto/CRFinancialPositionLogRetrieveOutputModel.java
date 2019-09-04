package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogRetrieveOutputModelCRFinancialPositionLogInstanceRecord;
import org.bian.dto.CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceAnalysis;
import org.bian.dto.CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogRetrieveOutputModel
 */
public class CRFinancialPositionLogRetrieveOutputModel   {
  private CRFinancialPositionLogRetrieveOutputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord = null;

  private String financialPositionLogRetrieveActionTaskReference = null;

  private Object financialPositionLogRetrieveActionTaskRecord = null;

  private String financialPositionLogRetrieveActionResponse = null;

  private CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceReportRecord financialPositionLogInstanceReportRecord = null;

  private CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceAnalysis financialPositionLogInstanceAnalysis = null;


  /**
   * Get cRFinancialPositionLogInstanceRecord
   * @return cRFinancialPositionLogInstanceRecord
  **/

  public CRFinancialPositionLogRetrieveOutputModelCRFinancialPositionLogInstanceRecord getCRFinancialPositionLogInstanceRecord() {
    return cRFinancialPositionLogInstanceRecord;
  }

  @JsonProperty("cRFinancialPositionLogInstanceRecord")
  public void setCRFinancialPositionLogInstanceRecord(CRFinancialPositionLogRetrieveOutputModelCRFinancialPositionLogInstanceRecord cRFinancialPositionLogInstanceRecord) {
    this.cRFinancialPositionLogInstanceRecord = cRFinancialPositionLogInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Financial Position Log instance retrieve service call 
   * @return financialPositionLogRetrieveActionTaskReference
  **/

  public String getFinancialPositionLogRetrieveActionTaskReference() {
    return financialPositionLogRetrieveActionTaskReference;
  }

  public void setFinancialPositionLogRetrieveActionTaskReference(String financialPositionLogRetrieveActionTaskReference) {
    this.financialPositionLogRetrieveActionTaskReference = financialPositionLogRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return financialPositionLogRetrieveActionTaskRecord
  **/

  public Object getFinancialPositionLogRetrieveActionTaskRecord() {
    return financialPositionLogRetrieveActionTaskRecord;
  }

  public void setFinancialPositionLogRetrieveActionTaskRecord(Object financialPositionLogRetrieveActionTaskRecord) {
    this.financialPositionLogRetrieveActionTaskRecord = financialPositionLogRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return financialPositionLogRetrieveActionResponse
  **/

  public String getFinancialPositionLogRetrieveActionResponse() {
    return financialPositionLogRetrieveActionResponse;
  }

  public void setFinancialPositionLogRetrieveActionResponse(String financialPositionLogRetrieveActionResponse) {
    this.financialPositionLogRetrieveActionResponse = financialPositionLogRetrieveActionResponse;
  }


  /**
   * Get financialPositionLogInstanceReportRecord
   * @return financialPositionLogInstanceReportRecord
  **/

  public CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceReportRecord getFinancialPositionLogInstanceReportRecord() {
    return financialPositionLogInstanceReportRecord;
  }

  public void setFinancialPositionLogInstanceReportRecord(CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceReportRecord financialPositionLogInstanceReportRecord) {
    this.financialPositionLogInstanceReportRecord = financialPositionLogInstanceReportRecord;
  }


  /**
   * Get financialPositionLogInstanceAnalysis
   * @return financialPositionLogInstanceAnalysis
  **/

  public CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceAnalysis getFinancialPositionLogInstanceAnalysis() {
    return financialPositionLogInstanceAnalysis;
  }

  public void setFinancialPositionLogInstanceAnalysis(CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceAnalysis financialPositionLogInstanceAnalysis) {
    this.financialPositionLogInstanceAnalysis = financialPositionLogInstanceAnalysis;
  }


}

