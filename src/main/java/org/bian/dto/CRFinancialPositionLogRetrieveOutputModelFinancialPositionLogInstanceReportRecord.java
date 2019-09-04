package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceReportRecord
 */
public class CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceReportRecord   {
  private String financialPositionLogInstanceReportData = null;

  private String financialPositionLogInstanceReportType = null;

  private Object financialPositionLogInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return financialPositionLogInstanceReportData
  **/

  public String getFinancialPositionLogInstanceReportData() {
    return financialPositionLogInstanceReportData;
  }

  public void setFinancialPositionLogInstanceReportData(String financialPositionLogInstanceReportData) {
    this.financialPositionLogInstanceReportData = financialPositionLogInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return financialPositionLogInstanceReportType
  **/

  public String getFinancialPositionLogInstanceReportType() {
    return financialPositionLogInstanceReportType;
  }

  public void setFinancialPositionLogInstanceReportType(String financialPositionLogInstanceReportType) {
    this.financialPositionLogInstanceReportType = financialPositionLogInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return financialPositionLogInstanceReport
  **/

  public Object getFinancialPositionLogInstanceReport() {
    return financialPositionLogInstanceReport;
  }

  public void setFinancialPositionLogInstanceReport(Object financialPositionLogInstanceReport) {
    this.financialPositionLogInstanceReport = financialPositionLogInstanceReport;
  }


}

