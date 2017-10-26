package co.edu.icesi.driso.matrices;

import co.edu.icesi.driso.matrices.Common;
import co.edu.icesi.driso.matrices.classes.SCPLogin;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import org.amelia.dsl.lib.DescriptorGraph;
import org.amelia.dsl.lib.Subsystem;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import org.amelia.dsl.lib.util.Arrays;

@SuppressWarnings("all")
public class Allocation extends Subsystem.Deployment {
  private List<Host> executionHosts;
  
  private Common $co$edu$icesi$driso$matrices$Common;
  
  public final CommandDescriptor[] move = new CommandDescriptor[1];
  
  public Allocation() {
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common();
    
  }
  
  public Allocation(final List<Host> executionHosts, final Map<String, Host> $co$edu$icesi$driso$matrices$Common$hosts) {
    this.executionHosts = executionHosts;
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common($co$edu$icesi$driso$matrices$Common$hosts);
    
  }
  
  private void init() {
    move[0] = initMove0();
    
  }
  
  @Override
  public void setup() {
    $co$edu$icesi$driso$matrices$Common.setup();
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    move[0].runsOn(hosts0);
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
  
  public Common Common() {
    return this.$co$edu$icesi$driso$matrices$Common;
  }
  
  public List<Host> getExecutionHosts() {
    return this.executionHosts;
  }
  
  private CommandDescriptor initMove0() {
    CommandDescriptor _scpCommand = SCPLogin.scpCommand(
      this.Common().getCompilationHost().hostname(), 
      this.Common().getCompilationHost().password(), 
      this.Common().getBuiltFolder(), 
      this.Common().getAllocationTargetFolder());
    return _scpCommand;
  }
  
  private List<Host> getHost0() {
    return this.executionHosts;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      move,
      $co$edu$icesi$driso$matrices$Common.getAllRules()
    );
  }
}
