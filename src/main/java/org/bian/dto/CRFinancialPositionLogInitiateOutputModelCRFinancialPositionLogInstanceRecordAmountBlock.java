package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlockDateType;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordAmountBlock
 */
public class CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordAmountBlock   {
  private CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlockDateType dateType = null;


  /**
   * Get dateType
   * @return dateType
  **/

  public CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlockDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlockDateType dateType) {
    this.dateType = dateType;
  }


}

