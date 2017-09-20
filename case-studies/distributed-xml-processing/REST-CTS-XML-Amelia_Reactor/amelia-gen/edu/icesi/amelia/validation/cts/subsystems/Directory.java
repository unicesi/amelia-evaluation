package edu.icesi.amelia.validation.cts.subsystems;

import com.google.common.collect.Lists;
import java.util.List;
import org.amelia.dsl.lib.DescriptorGraph;
import org.amelia.dsl.lib.Subsystem;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import org.amelia.dsl.lib.util.Arrays;
import org.amelia.dsl.lib.util.Commands;

@SuppressWarnings("all")
public class Directory extends Subsystem.Deployment {
  private List<Host> spHosts;
  
  public final CommandDescriptor[] directory = new CommandDescriptor[1];
  
  public Directory() {
    
  }
  
  public Directory(final List<Host> spHosts) {
    this.spHosts = spHosts;
    
  }
  
  private void init() {
    directory[0] = initDirectory0();
    
  }
  
  @Override
  public void setup() {
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    directory[0].runsOn(hosts0);
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
  
  public List<Host> getSpHosts() {
    return this.spHosts;
  }
  
  private CommandDescriptor initDirectory0() {
    return Commands.cd("/home/carvajal/Documents/carvajal/");
  }
  
  private List<Host> getHost0() {
    return this.spHosts;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      directory
    );
  }
}
