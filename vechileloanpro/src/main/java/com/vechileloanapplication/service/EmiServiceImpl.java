package com.vechileloanapplication.service;

public class EmiServiceImpl implements EmiService{

	@Override
	public double EMICalculate(double loanAmount, int terminYears, double interestRate) {
		int n=terminYears;
		interestRate=interestRate/n;
		double powfunc=Math.pow((1+(interestRate))/12, n);
		double emi=Math.round(loanAmount*(interestRate*12)*((powfunc)/(powfunc-1)));
		return emi;
	}


}