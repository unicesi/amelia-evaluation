package edu.icesi.amelia.validation.cts.classes;

import org.amelia.dsl.lib.descriptors.CommandDescriptor;

public class IceInteraction {

	private static final String RELEASE_EXP_EXTERNALP = "The RabbitMQ consumer memory-monitor has started successfully";
	private static final String RELEASE_EXP_LOADBALANCER = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_SP = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_BRIDGE = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_SERVER = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_REPORTER = "Todos Los Reportes Generados!";
	private static final String RELEASE_EXP_MONITOR = "Memory Monitor Started";
	
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
	
	
}
