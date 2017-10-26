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
package co.edu.icesi.driso.amelia.carvajal.xml.large.shared.ice.classes;

import org.amelia.dsl.lib.descriptors.CommandDescriptor;

/*
 * This class allows to define a set of user-defined commands for Ice middleware interaction.
 */
public class IceInteraction {

	/*
	 * Break message constants
	 */
	private static final String RELEASE_EXP_EXTERNALP = "The RabbitMQ consumer memory-monitor has started successfully";
	private static final String RELEASE_EXP_QUEUE = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_SPPROCESSOR = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_XMLPROCESSOR = "Servidor xml iniciado...";
	private static final String RELEASE_EXP_INTERMEDIATE = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_SERVER = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_REPORTER = "Todos Los Reportes Generados!";
	private static final String RELEASE_EXP_MONITOR = "Memory Monitor Started";
	private static final String RELEASE_EXP_LOADBALANCER = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_SP = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_BRIDGE = "Activando adaptador, esperando peticiones...";
	
	public static CommandDescriptor compileIce(final String artifact) {
		return new CommandDescriptor.Builder().withErrorText("BUILD FAILED")
				.withSuccessMessage("Artifact " + artifact + ".jar " + "was generated successfully")
				.withErrorMessage("Could not compile " + "artifact " + "'" + artifact + "'")
				.withCommand("ant "+ artifact)
				.build();
	}
	
	public static CommandDescriptor runExternalProbeIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar" + " &")
				.withReleaseRegexp(RELEASE_EXP_EXTERNALP)
				.withoutTimeout()
				.build();
	}
	
	public static CommandDescriptor runQueueIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar" + " &")
				.withReleaseRegexp(RELEASE_EXP_QUEUE)
				.withoutTimeout()
				.build();
	} 

	public static CommandDescriptor runSPProcessorIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar" + " &")
				.withReleaseRegexp(RELEASE_EXP_SPPROCESSOR)
				.withoutTimeout()
				.build();	
	}
	
	public static CommandDescriptor runXmlProcessorIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar" + " &")
				.withReleaseRegexp(RELEASE_EXP_XMLPROCESSOR)
				.withoutTimeout()
				.build();	
	}
	
	public static CommandDescriptor runIntermediateIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar" + " &")
				.withReleaseRegexp(RELEASE_EXP_INTERMEDIATE)
				.withoutTimeout()
				.build();
	}
	
	
	public static CommandDescriptor runServerIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar" + " &")
				.withReleaseRegexp(RELEASE_EXP_SERVER)
				.withoutTimeout()
				.build();	
	}
	
	public static CommandDescriptor runReporterIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar " + "/home/carvajal/Documents/new_Carvajal/REPORTE/" + " &")
				.withReleaseRegexp(RELEASE_EXP_REPORTER)
				.withoutTimeout()
				.build();	
	}
	
	public static CommandDescriptor runMonitorIce(final String monitorName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + "monitor" + ".jar")
				.withSuccessMessage("Monitor " + monitorName + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + "monitor" + ".jar")
				.withCommand("java -jar "+ "monitor" + ".jar " + monitorName + " &")
				.withReleaseRegexp(RELEASE_EXP_MONITOR)
				.withoutTimeout()
				.build();	
	}
	
	public static CommandDescriptor runLoadBalancerIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar" + " &")
				.withReleaseRegexp(RELEASE_EXP_LOADBALANCER)
				.withoutTimeout()
				.build();
	}
	
	public static CommandDescriptor runSPIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar" + " &")
				.withReleaseRegexp(RELEASE_EXP_SP)
				.withoutTimeout()
				.build();
	}
	
	public static CommandDescriptor runBridgeIce(final String jarName) {
		return new CommandDescriptor.Builder().withErrorText("Unable to access jarfile " + jarName + ".jar")
				.withSuccessMessage("Jar " + jarName + ".jar " + "was executed successfully")
				.withErrorMessage("Could not execute " + "jar " + jarName + ".jar")
				.withCommand("java -jar "+ jarName + ".jar" + " &")
				.withReleaseRegexp(RELEASE_EXP_BRIDGE)
				.withoutTimeout()
				.build();
	}
	
}
