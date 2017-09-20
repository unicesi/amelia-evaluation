package edu.icesi.amelia.validation.cts.subsystems;

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
public class LoadBalancer extends Subsystem.Deployment {
  private Host host;
  
  public final CommandDescriptor[] directory = new CommandDescriptor[1];
  
  public final CommandDescriptor[] executeLoadBalancer = new CommandDescriptor[1];
  
  public LoadBalancer() {
    
  }
  
  public LoadBalancer(final Host host) {
    this.host = host;
    
  }
  
  private void init() {
    directory[0] = initDirectory0();
    executeLoadBalancer[0] = initExecuteLoadBalancer0();
    
  }
  
  @Override
  public void setup() {
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    directory[0].runsOn(hosts0);
    executeLoadBalancer[0].runsOn(hosts0);
    executeLoadBalancer[0].dependsOn(directory[0]);
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
  
  private CommandDescriptor initDirectory0() {
    return Commands.cd("/home/carvajal/Documents/carvajal/");
  }
  
  private CommandDescriptor initExecuteLoadBalancer0() {
    return Commands.run()
        .withComposite("loadBalancer")
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost0() {
    return this.host;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      directory,
      executeLoadBalancer
    );
  }
}
