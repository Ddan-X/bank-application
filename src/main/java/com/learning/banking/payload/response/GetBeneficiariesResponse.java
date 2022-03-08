package com.learning.banking.payload.response;

import com.learning.banking.entity.Beneficiary;
import com.learning.banking.entity.BeneficiaryStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * GetBeneficiariesResponse
 *
 * @author bryan
 * @date Mar 6, 2022-5:33:50 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBeneficiariesResponse {
	private long beneficiaryAccountNo;
	private String beneficiaryName;
	private BeneficiaryStatus active;
	
	public GetBeneficiariesResponse(Beneficiary beneficiary) {
		this.beneficiaryAccountNo = beneficiary.getAccount().getAccountNumber();
		this.beneficiaryName = beneficiary.getAccount().getCustomer().getFullName();
		this.active = beneficiary.getActive();
	}
}
