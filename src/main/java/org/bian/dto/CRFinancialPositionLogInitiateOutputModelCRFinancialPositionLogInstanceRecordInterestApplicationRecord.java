package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecordInterestTransaction;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecord
 */
public class CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecord   {
  private CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction = null;


  /**
   * Get interestTransaction
   * @return interestTransaction
  **/

  public CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecordInterestTransaction getInterestTransaction() {
    return interestTransaction;
  }

  public void setInterestTransaction(CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecordInterestTransaction interestTransaction) {
    this.interestTransaction = interestTransaction;
  }


}

