package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordAmountBlock;
import org.bian.dto.CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecord;
import org.bian.dto.CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordManagedPositionLimits;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecord
 */
public class CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecord   {
  private CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecord interestApplicationRecord = null;

  private CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordManagedPositionLimits managedPositionLimits = null;

  private CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordAmountBlock amountBlock = null;

  private String status = null;


  /**
   * Get interestApplicationRecord
   * @return interestApplicationRecord
  **/

  public CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecord getInterestApplicationRecord() {
    return interestApplicationRecord;
  }

  public void setInterestApplicationRecord(CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecord interestApplicationRecord) {
    this.interestApplicationRecord = interestApplicationRecord;
  }


  /**
   * Get managedPositionLimits
   * @return managedPositionLimits
  **/

  public CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordManagedPositionLimits getManagedPositionLimits() {
    return managedPositionLimits;
  }

  public void setManagedPositionLimits(CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordManagedPositionLimits managedPositionLimits) {
    this.managedPositionLimits = managedPositionLimits;
  }


  /**
   * Get amountBlock
   * @return amountBlock
  **/

  public CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordAmountBlock getAmountBlock() {
    return amountBlock;
  }

  public void setAmountBlock(CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordAmountBlock amountBlock) {
    this.amountBlock = amountBlock;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the log entry (e.g. active, in-suspense etc.) 
   * @return status
  **/

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


}

