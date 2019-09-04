package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceAnalysis;
import org.bian.dto.CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogRetrieveInputModel
 */
public class CRFinancialPositionLogRetrieveInputModel   {
  private Object financialPositionLogRetrieveActionTaskRecord = null;

  private String financialPositionLogRetrieveActionRequest = null;

  private CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceReportRecord financialPositionLogInstanceReportRecord = null;

  private CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceAnalysis financialPositionLogInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return financialPositionLogRetrieveActionRequest
  **/

  public String getFinancialPositionLogRetrieveActionRequest() {
    return financialPositionLogRetrieveActionRequest;
  }

  public void setFinancialPositionLogRetrieveActionRequest(String financialPositionLogRetrieveActionRequest) {
    this.financialPositionLogRetrieveActionRequest = financialPositionLogRetrieveActionRequest;
  }


  /**
   * Get financialPositionLogInstanceReportRecord
   * @return financialPositionLogInstanceReportRecord
  **/

  public CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceReportRecord getFinancialPositionLogInstanceReportRecord() {
    return financialPositionLogInstanceReportRecord;
  }

  public void setFinancialPositionLogInstanceReportRecord(CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceReportRecord financialPositionLogInstanceReportRecord) {
    this.financialPositionLogInstanceReportRecord = financialPositionLogInstanceReportRecord;
  }


  /**
   * Get financialPositionLogInstanceAnalysis
   * @return financialPositionLogInstanceAnalysis
  **/

  public CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceAnalysis getFinancialPositionLogInstanceAnalysis() {
    return financialPositionLogInstanceAnalysis;
  }

  public void setFinancialPositionLogInstanceAnalysis(CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceAnalysis financialPositionLogInstanceAnalysis) {
    this.financialPositionLogInstanceAnalysis = financialPositionLogInstanceAnalysis;
  }


}

