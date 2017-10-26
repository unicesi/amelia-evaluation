/**
 * Copyright 2017 Universidad Icesi
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
*/
package co.edu.icesi.driso.amelia.carvajal.xml.large.common.classes;

/*
 * This enum allows to describe the possible names for the compiled artifacts (RMI & REST).
 */

public enum ArtifactsNamesEnum {

	SERVER("xmlServer","xmlServerRest"),
	INTERMEDIATE("xmlIntermedio","xmlIntermedioRest"),
	QUEUE("xmlQueue","xmlQueueRest"),
	MONITORING("monitoring","monitoring"),
	SERVER_REACTOR("xmlServerReactor","xmlServerReactorRest");
	
	private String rmiName;
	private String restName;
	
	ArtifactsNamesEnum(String rmiName, String restName)
	{
		this.rmiName = rmiName;
		this.restName = restName;
	}
	
	public String value(CommunicationProtocolEnum protocol)
	{
		return protocol == CommunicationProtocolEnum.RMI ? rmiName : restName;
	}
	
	
}
