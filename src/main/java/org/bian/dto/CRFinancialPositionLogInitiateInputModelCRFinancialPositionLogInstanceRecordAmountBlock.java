package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlockDateType;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlock
 */
public class CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlock   {
  private String amountBlockType = null;

  private String priority = null;

  private String amount = null;

  private CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlockDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of block applied to the tracked position (e.g. pending, final) 
   * @return amountBlockType
  **/

  public String getAmountBlockType() {
    return amountBlockType;
  }

  public void setAmountBlockType(String amountBlockType) {
    this.amountBlockType = amountBlockType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Priority classification for the block 
   * @return priority
  **/

  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: The amount of the block 
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


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

