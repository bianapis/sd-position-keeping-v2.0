package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlock;
import org.bian.dto.CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordManagedPositionLimits;
import org.bian.dto.CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecord;

import javax.validation.Valid;
  
/**
 * CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord
 */
public class CRFinancialPositionLogUpdateInputModelCRFinancialPositionLogInstanceRecord   {
  private String transactionLogType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String counterpartyReference = null;

  private String baseCurrency = null;

  private CRFinancialPositionLogInitiateOutputModelCRFinancialPositionLogInstanceRecordInterestApplicationRecord interestApplicationRecord = null;

  private CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordManagedPositionLimits managedPositionLimits = null;

  private CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlock amountBlock = null;

  private String initiationDate = null;

  private String status = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of financial transaction log (e.g. customer transactions) 
   * @return transactionLogType
  **/

  public String getTransactionLogType() {
    return transactionLogType;
  }

  public void setTransactionLogType(String transactionLogType) {
    this.transactionLogType = transactionLogType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The product/service for which this is a financial transaction log 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the product or service account holder/customer for the log if appropriate 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a counterparty for the log if appropriate (e.g. merchant reference, card network reference) 
   * @return counterpartyReference
  **/

  public String getCounterpartyReference() {
    return counterpartyReference;
  }

  public void setCounterpartyReference(String counterpartyReference) {
    this.counterpartyReference = counterpartyReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The currency for the logged transactions 
   * @return baseCurrency
  **/

  public String getBaseCurrency() {
    return baseCurrency;
  }

  public void setBaseCurrency(String baseCurrency) {
    this.baseCurrency = baseCurrency;
  }


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

  public CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordManagedPositionLimits getManagedPositionLimits() {
    return managedPositionLimits;
  }

  public void setManagedPositionLimits(CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordManagedPositionLimits managedPositionLimits) {
    this.managedPositionLimits = managedPositionLimits;
  }


  /**
   * Get amountBlock
   * @return amountBlock
  **/

  public CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlock getAmountBlock() {
    return amountBlock;
  }

  public void setAmountBlock(CRFinancialPositionLogInitiateInputModelCRFinancialPositionLogInstanceRecordAmountBlock amountBlock) {
    this.amountBlock = amountBlock;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date and time the log was initiated. Note the log will have a complex internal calendar structure for extract and reporting 
   * @return initiationDate
  **/

  public String getInitiationDate() {
    return initiationDate;
  }

  public void setInitiationDate(String initiationDate) {
    this.initiationDate = initiationDate;
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

