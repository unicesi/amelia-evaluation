package edu.icesi.amelia.validation.cts.classes;

import org.amelia.dsl.lib.descriptors.CommandDescriptor;

public class IceInteraction {

	private static final String RELEASE_EXP_EXTERNALP = "The RabbitMQ consumer memory-monitor has started successfully";
	private static final String RELEASE_EXP_QUEUE = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_SPPROCESSOR = "Activando adaptador, esperando peticiones...";
	private static final String RELEASE_EXP_XMLPROCESSOR = "Servidor xml iniciado...";
	private static final String RELEASE_EXP_INTERMEDIATE = "Activando adaptador, esperando peticiones...";
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
	
	
}
