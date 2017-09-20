package edu.icesi.amelia.validation.cts.subsystems;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import org.amelia.dsl.lib.DescriptorGraph;
import org.amelia.dsl.lib.Subsystem;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import org.amelia.dsl.lib.util.Arrays;
import org.amelia.dsl.lib.util.CommandExtensions;
import org.amelia.dsl.lib.util.Commands;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class JMeter_12NO extends Subsystem.Deployment {
  private Host host;
  
  private Host hostRabbit;
  
  private Integer jmeterMB;
  
  private String meterfileName;
  
  private String reportLoc;
  
  public final CommandDescriptor[] jMeterDirectory = new CommandDescriptor[1];
  
  public final CommandDescriptor[] call = new CommandDescriptor[1];
  
  public final CommandDescriptor[] directory = new CommandDescriptor[1];
  
  public final CommandDescriptor[] report = new CommandDescriptor[1];
  
  public JMeter_12NO() {
    
  }
  
  public JMeter_12NO(final Host host, final Host hostRabbit, final Integer jmeterMB) {
    this.host = host;
    this.hostRabbit = hostRabbit;
    this.jmeterMB = jmeterMB;
    
  }
  
  private void init() {
    this.meterfileName = initMeterfileName();
    this.reportLoc = initReportLoc();
    jMeterDirectory[0] = initJMeterDirectory0();
    call[0] = initCall0();
    directory[0] = initDirectory0();
    report[0] = initReport0();
    
  }
  
  @Override
  public void setup() {
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    jMeterDirectory[0].runsOn(hosts0);
    call[0].runsOn(hosts0);
    call[0].dependsOn(jMeterDirectory[0]);
    List<Host> hosts1 = Lists.newArrayList(getHost1());
    directory[0].runsOn(hosts1);
    directory[0].dependsOn(call[0]);
    report[0].runsOn(hosts1);
    report[0].dependsOn(directory[0]);
  }
  
  public void deploy(final String ＿subsystem, final List<Subsystem> ＿dependencies) throws Exception {
    super.graph = new DescriptorGraph(＿subsystem);
    super.graph.addDescriptors(getAllRules());
    super.graph.execute(true);
  }
  
  public static void main(final String[] args) throws Exception {
    throw new Exception("Subsystems with dependencies or non-initialized" 
    	+ " parameters cannot be executed without using a deployment descriptor");
  }
  
  public Host getHost() {
    return this.host;
  }
  
  public Host getHostRabbit() {
    return this.hostRabbit;
  }
  
  public Integer getJmeterMB() {
    return this.jmeterMB;
  }
  
  private String initMeterfileName() {
    return (("XML-REST-" + this.jmeterMB) + "MB.jmx");
  }
  
  public String getMeterfileName() {
    return this.meterfileName;
  }
  
  private String initReportLoc() {
    return "/home/carvajal/Documents/new_Carvajal/REPORTE/";
  }
  
  public String getReportLoc() {
    return this.reportLoc;
  }
  
  private CommandDescriptor initJMeterDirectory0() {
    return Commands.cd("/home/carvajal/Documents/carvajal/apache-jmeter-2.13/bin");
  }
  
  private CommandDescriptor initCall0() {
    final Procedure1<CommandDescriptor.Builder> _function = (CommandDescriptor.Builder it) -> {
      it.withoutTimeout();
    };
    CommandDescriptor _doubleArrow = CommandExtensions.operator_doubleArrow(
      new CommandDescriptor.Builder()
          .withCommand((("./jmeter -n -t " + "/home/carvajal/Documents/carvajal/ArchivosJmeterXML/") + this.meterfileName)), _function);
    return _doubleArrow;
  }
  
  private Host getHost0() {
    return this.host;
  }
  
  private CommandDescriptor initDirectory0() {
    return Commands.cd("/home/carvajal/Documents/carvajal");
  }
  
  private CommandDescriptor initReport0() {
    final Procedure1<Commands.RunBuilder> _function = (Commands.RunBuilder it) -> {
      it.withoutTimeout();
    };
    CommandDescriptor _doubleArrow = CommandExtensions.operator_doubleArrow(
      Commands.run()
          .withComposite("reporter")
          .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/monitoring.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/slf4j-api-1.7.10.jar", "lib/sigar.jar")))
          .withService("generateReports")
          .withMethod("generateGeneralReport")
          .withArguments(this.reportLoc), _function);
    return _doubleArrow;
  }
  
  private Host getHost1() {
    return this.hostRabbit;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      jMeterDirectory,
      call,
      directory,
      report
    );
  }
}
