package edu.icesi.amelia.validation.cts.reboot;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.amelia.dsl.lib.DescriptorGraph;
import org.amelia.dsl.lib.Subsystem;
import org.amelia.dsl.lib.SubsystemGraph;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import org.amelia.dsl.lib.util.Arrays;
import org.amelia.dsl.lib.util.Commands;
import org.amelia.dsl.lib.util.Hosts;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Reboot extends Subsystem.Deployment {
  private Map<String, Host> allHosts;
  
  private List<Host> rebootHosts;
  
  public final CommandDescriptor[] reboot = new CommandDescriptor[1];
  
  public Reboot() {
    
  }
  
  private void init() {
    this.allHosts = initAllHosts();
    this.rebootHosts = initRebootHosts();
    reboot[0] = initReboot0();
    
  }
  
  @Override
  public void setup() {
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    reboot[0].runsOn(hosts0);
  }
  
  public void deploy(final String ＿subsystem, final List<Subsystem> ＿dependencies) throws Exception {
    super.graph = new DescriptorGraph(＿subsystem);
    super.graph.addDescriptors(getAllRules());
    super.graph.execute(true);
  }
  
  public static void main(final String[] args) throws Exception {
    Subsystem subsystem = new Subsystem("edu.icesi.amelia.validation.cts.reboot.Reboot", new Reboot());
    subsystem.deployment().setup();
    SubsystemGraph graph = SubsystemGraph.getInstance();
    graph.addSubsystems(subsystem);
    graph.execute(true, false);
  }
  
  private Map<String, Host> initAllHosts() {
    try {
      final Function1<Host, String> _function = (Host h) -> {
        return h.identifier();
      };
      Map<String, Host> _map = IterableExtensions.<String, Host>toMap(Hosts.hosts("/home/carvajal/Documents/LF_RIVERA/Workspace_Neon/REST-CTS-XML-Amelia_Reactor/src/hostsReboot.txt"), _function);
      return _map;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Map<String, Host> getAllHosts() {
    return this.allHosts;
  }
  
  private List<Host> initRebootHosts() {
    Host _get = this.allHosts.get("grid1");
    Host _get_1 = this.allHosts.get("grid4");
    Host _get_2 = this.allHosts.get("grid5");
    Host _get_3 = this.allHosts.get("grid6");
    Host _get_4 = this.allHosts.get("grid7");
    Host _get_5 = this.allHosts.get("grid8");
    Host _get_6 = this.allHosts.get("grid9");
    Host _get_7 = this.allHosts.get("grid10");
    Host _get_8 = this.allHosts.get("grid11");
    Host _get_9 = this.allHosts.get("grid13");
    Host _get_10 = this.allHosts.get("grid14");
    Host _get_11 = this.allHosts.get("grid16");
    Host _get_12 = this.allHosts.get("grid17");
    Host _get_13 = this.allHosts.get("grid18");
    Host _get_14 = this.allHosts.get("grid20");
    return Collections.<Host>unmodifiableList(CollectionLiterals.<Host>newArrayList(_get, _get_1, _get_2, _get_3, _get_4, _get_5, _get_6, _get_7, _get_8, _get_9, _get_10, _get_11, _get_12, _get_13, _get_14));
  }
  
  public List<Host> getRebootHosts() {
    return this.rebootHosts;
  }
  
  private CommandDescriptor initReboot0() {
    return Commands.generic("reboot");
  }
  
  private List<Host> getHost0() {
    return this.rebootHosts;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      reboot
    );
  }
}
