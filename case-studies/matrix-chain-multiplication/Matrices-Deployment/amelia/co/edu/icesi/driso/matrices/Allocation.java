package co.edu.icesi.driso.matrices;

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
  
  private co.edu.icesi.driso.matrices.Common $co$edu$icesi$driso$matrices$Common;
  
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
  
  public List<Host> getExecutionHosts() {
    return this.executionHosts;
  }
  
  private CommandDescriptor initMove0() {
    Host _compilationHost = this.getCompilationHost();
    String _hostname = _compilationHost.hostname();
    Host _compilationHost_1 = this.getCompilationHost();
    String _password = _compilationHost_1.password();
    String _builtFolder = this.getBuiltFolder();
    String _allocationTargetFolder = this.getAllocationTargetFolder();
    CommandDescriptor _scpCommand = SCPLogin.scpCommand(_hostname, _password, _builtFolder, _allocationTargetFolder);
    return _scpCommand;
  }
  
  private List<Host> getHost0() {
    return this.executionHosts;
  }
  
  public Map<String, Host> getHosts() {
    return this.$co$edu$icesi$driso$matrices$Common.getHosts();
  }
  
  public Host getCompilationHost() {
    return this.$co$edu$icesi$driso$matrices$Common.getCompilationHost();
  }
  
  public String getCommonSources() {
    return this.$co$edu$icesi$driso$matrices$Common.getCommonSources();
  }
  
  public String getBlockRSources() {
    return this.$co$edu$icesi$driso$matrices$Common.getBlockRSources();
  }
  
  public String getHybridSources() {
    return this.$co$edu$icesi$driso$matrices$Common.getHybridSources();
  }
  
  public String getNMatricesSources() {
    return this.$co$edu$icesi$driso$matrices$Common.getNMatricesSources();
  }
  
  public String getStrassenSources() {
    return this.$co$edu$icesi$driso$matrices$Common.getStrassenSources();
  }
  
  public List<String> getSources() {
    return this.$co$edu$icesi$driso$matrices$Common.getSources();
  }
  
  public String getBuiltFolder() {
    return this.$co$edu$icesi$driso$matrices$Common.getBuiltFolder();
  }
  
  public String getAllocationTargetFolder() {
    return this.$co$edu$icesi$driso$matrices$Common.getAllocationTargetFolder();
  }
  
  public String getBuiltsFolder() {
    return this.$co$edu$icesi$driso$matrices$Common.getBuiltsFolder();
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      move,
      $co$edu$icesi$driso$matrices$Common.getAllRules()
    );
  }
}
