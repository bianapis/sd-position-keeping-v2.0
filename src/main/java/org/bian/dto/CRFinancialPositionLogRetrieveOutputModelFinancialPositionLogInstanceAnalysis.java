package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceAnalysis
 */
public class CRFinancialPositionLogRetrieveOutputModelFinancialPositionLogInstanceAnalysis   {
  private String financialPositionLogInstanceAnalysisData = null;

  private String financialPositionLogInstanceAnalysisReportType = null;

  private Object financialPositionLogInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return financialPositionLogInstanceAnalysisData
  **/

  public String getFinancialPositionLogInstanceAnalysisData() {
    return financialPositionLogInstanceAnalysisData;
  }

  public void setFinancialPositionLogInstanceAnalysisData(String financialPositionLogInstanceAnalysisData) {
    this.financialPositionLogInstanceAnalysisData = financialPositionLogInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return financialPositionLogInstanceAnalysisReportType
  **/

  public String getFinancialPositionLogInstanceAnalysisReportType() {
    return financialPositionLogInstanceAnalysisReportType;
  }

  public void setFinancialPositionLogInstanceAnalysisReportType(String financialPositionLogInstanceAnalysisReportType) {
    this.financialPositionLogInstanceAnalysisReportType = financialPositionLogInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return financialPositionLogInstanceAnalysisReport
  **/

  public Object getFinancialPositionLogInstanceAnalysisReport() {
    return financialPositionLogInstanceAnalysisReport;
  }

  public void setFinancialPositionLogInstanceAnalysisReport(Object financialPositionLogInstanceAnalysisReport) {
    this.financialPositionLogInstanceAnalysisReport = financialPositionLogInstanceAnalysisReport;
  }


}

