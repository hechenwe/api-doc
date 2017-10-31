package com.sooncode.api.model.response;

import java.util.List;

import com.sooncode.api.entity.Interfac;
import com.sooncode.api.entity.Parameter;
import com.sooncode.api.entity.ParameterRetur;

public class GetAllInterfacesResponseModel {

	private Interfac interfac;
	
	private List<Parameter> parameters;
	private List<ParameterRetur> parameterReturns;

	public Interfac getInterfac() {
		return interfac;
	}

	public void setInterfac(Interfac interfac) {
		this.interfac = interfac;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	public List<ParameterRetur> getParameterReturns() {
		return parameterReturns;
	}

	public void setParameterReturns(List<ParameterRetur> parameterReturns) {
		this.parameterReturns = parameterReturns;
	}
	
	
	
}
