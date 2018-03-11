package com.usc.activation;

import com.usc.activation.IActivationService;

interface IActivationService {

	boolean isActivated(int ProductType);
	boolean activate(String productID,int ProductType); 
}