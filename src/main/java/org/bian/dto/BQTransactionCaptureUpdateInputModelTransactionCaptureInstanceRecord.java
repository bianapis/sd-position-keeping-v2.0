package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord
 */
public class BQTransactionCaptureUpdateInputModelTransactionCaptureInstanceRecord   {
  private String postingDescription = null;

  private String postingTransaction = null;

  private String postingValueDate = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The description of purpose of the financial transaction 
   * @return postingDescription
  **/

  public String getPostingDescription() {
    return postingDescription;
  }

  public void setPostingDescription(String postingDescription) {
    this.postingDescription = postingDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The logged financial transaction. Note the log can be structured with double entry representations (i.e. capture credit/debit pair) 
   * @return postingTransaction
  **/

  public String getPostingTransaction() {
    return postingTransaction;
  }

  public void setPostingTransaction(String postingTransaction) {
    this.postingTransaction = postingTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date of the transaction  
   * @return postingValueDate
  **/

  public String getPostingValueDate() {
    return postingValueDate;
  }

  public void setPostingValueDate(String postingValueDate) {
    this.postingValueDate = postingValueDate;
  }


}

