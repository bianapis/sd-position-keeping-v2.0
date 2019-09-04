package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceAnalysis
 */
public class CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceAnalysis   {
  private String financialPositionLogInstanceAnalysisReference = null;

  private String financialPositionLogInstanceAnalysisReportType = null;

  private String financialPositionLogInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return financialPositionLogInstanceAnalysisReference
  **/

  public String getFinancialPositionLogInstanceAnalysisReference() {
    return financialPositionLogInstanceAnalysisReference;
  }

  public void setFinancialPositionLogInstanceAnalysisReference(String financialPositionLogInstanceAnalysisReference) {
    this.financialPositionLogInstanceAnalysisReference = financialPositionLogInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return financialPositionLogInstanceAnalysisParameters
  **/

  public String getFinancialPositionLogInstanceAnalysisParameters() {
    return financialPositionLogInstanceAnalysisParameters;
  }

  public void setFinancialPositionLogInstanceAnalysisParameters(String financialPositionLogInstanceAnalysisParameters) {
    this.financialPositionLogInstanceAnalysisParameters = financialPositionLogInstanceAnalysisParameters;
  }


}

