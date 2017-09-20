package edu.icesi.amelia.validation.cts.monitors;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import org.amelia.dsl.lib.DescriptorGraph;
import org.amelia.dsl.lib.Subsystem;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import org.amelia.dsl.lib.util.Arrays;
import org.amelia.dsl.lib.util.Commands;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Monitor_1 extends Subsystem.Deployment {
  private Host host;
  
  private String name;
  
  public final CommandDescriptor[] directory = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execute = new CommandDescriptor[1];
  
  public Monitor_1() {
    
  }
  
  public Monitor_1(final Host host, final String name) {
    this.host = host;
    this.name = name;
    
  }
  
  private void init() {
    directory[0] = initDirectory0();
    execute[0] = initExecute0();
    
  }
  
  @Override
  public void setup() {
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    directory[0].runsOn(hosts0);
    execute[0].runsOn(hosts0);
    execute[0].dependsOn(directory[0]);
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
  
  public String getName() {
    return this.name;
  }
  
  private CommandDescriptor initDirectory0() {
    return Commands.cd("/home/carvajal/Documents/carvajal/");
  }
  
  private CommandDescriptor initExecute0() {
    return Commands.run()
        .withComposite("memory-monitor")
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/monitoring.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/slf4j-api-1.7.10.jar", "lib/sigar.jar")))
        .withService("startMemoryMonitor")
        .withMethod("startMemoryMonitoring")
        .withArguments(this.name).build();
  }
  
  private Host getHost0() {
    return this.host;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      directory,
      execute
    );
  }
}
