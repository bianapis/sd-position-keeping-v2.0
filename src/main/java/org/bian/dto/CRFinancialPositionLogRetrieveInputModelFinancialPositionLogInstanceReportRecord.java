package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceReportRecord
 */
public class CRFinancialPositionLogRetrieveInputModelFinancialPositionLogInstanceReportRecord   {
  private String financialPositionLogInstanceReportReference = null;

  private String financialPositionLogInstanceReportType = null;

  private String financialPositionLogInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return financialPositionLogInstanceReportReference
  **/

  public String getFinancialPositionLogInstanceReportReference() {
    return financialPositionLogInstanceReportReference;
  }

  public void setFinancialPositionLogInstanceReportReference(String financialPositionLogInstanceReportReference) {
    this.financialPositionLogInstanceReportReference = financialPositionLogInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return financialPositionLogInstanceReportParameters
  **/

  public String getFinancialPositionLogInstanceReportParameters() {
    return financialPositionLogInstanceReportParameters;
  }

  public void setFinancialPositionLogInstanceReportParameters(String financialPositionLogInstanceReportParameters) {
    this.financialPositionLogInstanceReportParameters = financialPositionLogInstanceReportParameters;
  }


}

