package co.edu.icesi.driso.matrices;

import co.edu.icesi.driso.matrices.Common;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.amelia.dsl.lib.DescriptorGraph;
import org.amelia.dsl.lib.Subsystem;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import org.amelia.dsl.lib.util.Arrays;
import org.amelia.dsl.lib.util.Commands;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Execute the NMatrices multiplication strategy.
 */
@SuppressWarnings("all")
public class NMatrices extends Subsystem.Deployment {
  private String common;
  
  private String artifact;
  
  private Iterable<String> libpath;
  
  private Common $co$edu$icesi$driso$matrices$Common;
  
  public final CommandDescriptor[] init = new CommandDescriptor[1];
  
  public final CommandDescriptor[] knowledge = new CommandDescriptor[1];
  
  public final CommandDescriptor[] processor7 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] processor1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] processor2 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] distributor = new CommandDescriptor[1];
  
  public final CommandDescriptor[] processor3 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] processor4 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] processor5 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] processor6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] dispatcher = new CommandDescriptor[1];
  
  public final CommandDescriptor[] control = new CommandDescriptor[1];
  
  public NMatrices() {
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common();
    
  }
  
  public NMatrices(final Map<String, Host> $co$edu$icesi$driso$matrices$Common$hosts) {
    
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common($co$edu$icesi$driso$matrices$Common$hosts);
    
  }
  
  private void init() {
    this.common = initCommon();
    this.artifact = initArtifact();
    this.libpath = initLibpath();
    init[0] = initInit0();
    knowledge[0] = initKnowledge0();
    processor7[0] = initProcessor70();
    processor1[0] = initProcessor10();
    processor2[0] = initProcessor20();
    distributor[0] = initDistributor0();
    processor3[0] = initProcessor30();
    processor4[0] = initProcessor40();
    processor5[0] = initProcessor50();
    processor6[0] = initProcessor60();
    dispatcher[0] = initDispatcher0();
    control[0] = initControl0();
    
  }
  
  @Override
  public void setup() {
    $co$edu$icesi$driso$matrices$Common.setup();
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    init[0].runsOn(hosts0);
    List<Host> hosts1 = Lists.newArrayList(getHost1());
    knowledge[0].runsOn(hosts1);
    knowledge[0].dependsOn(init[0]);
    processor7[0].runsOn(hosts1);
    processor7[0].dependsOn(knowledge[0]);
    List<Host> hosts2 = Lists.newArrayList(getHost2());
    processor1[0].runsOn(hosts2);
    processor1[0].dependsOn(knowledge[0]);
    processor2[0].runsOn(hosts2);
    processor2[0].dependsOn(knowledge[0]);
    distributor[0].runsOn(hosts2);
    distributor[0].dependsOn(dispatcher[0]);
    List<Host> hosts3 = Lists.newArrayList(getHost3());
    processor3[0].runsOn(hosts3);
    processor3[0].dependsOn(knowledge[0]);
    processor4[0].runsOn(hosts3);
    processor4[0].dependsOn(knowledge[0]);
    List<Host> hosts4 = Lists.newArrayList(getHost4());
    processor5[0].runsOn(hosts4);
    processor5[0].dependsOn(knowledge[0]);
    processor6[0].runsOn(hosts4);
    processor6[0].dependsOn(knowledge[0]);
    dispatcher[0].runsOn(hosts4);
    dispatcher[0].dependsOn(processor1[0], processor2[0], processor3[0], processor4[0], processor5[0], processor6[0], processor7[0]);
    List<Host> hosts5 = Lists.newArrayList(getHost5());
    control[0].runsOn(hosts5);
    control[0].dependsOn(distributor[0]);
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
  
  private String initCommon() {
    return "mcm-common";
  }
  
  public String getCommon() {
    return this.common;
  }
  
  private String initArtifact() {
    return "mcm-nmatrices";
  }
  
  public String getArtifact() {
    return this.artifact;
  }
  
  private Iterable<String> initLibpath() {
    return Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("" + this.Common().getBuiltsFolder() + "/" + this.common + ".jar", "" + this.Common().getBuiltsFolder() + "/" + this.artifact + ".jar"));
  }
  
  public Iterable<String> getLibpath() {
    return this.libpath;
  }
  
  private CommandDescriptor initInit0() {
    return Commands.cd(this.Common().getBuiltsFolder());
  }
  
  private Iterable<Host> getHost0() {
    final Function1<Host, Boolean> _function = new Function1<Host, Boolean>() {
      @Override
      public Boolean apply(final Host h) {
        return Boolean.valueOf(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("grid11", "grid1", "grid2", "grid7", "grid5")).contains(h.identifier()));
      }
    };
    Iterable<Host> _filter = IterableExtensions.<Host>filter(this.Common().getHosts().values(), _function);
    return _filter;
  }
  
  private CommandDescriptor initKnowledge0() {
    return Commands.run()
        .withComposite("KnowledgeBase")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initProcessor70() {
    return Commands.run()
        .withComposite("Processor7")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost1() {
    Host _get = this.Common().getHosts().get("grid11");
    return _get;
  }
  
  private CommandDescriptor initProcessor10() {
    return Commands.run()
        .withComposite("Processor1")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initProcessor20() {
    return Commands.run()
        .withComposite("Processor2")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initDistributor0() {
    return Commands.run()
        .withComposite("Distributor")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost2() {
    Host _get = this.Common().getHosts().get("grid1");
    return _get;
  }
  
  private CommandDescriptor initProcessor30() {
    return Commands.run()
        .withComposite("Processor3")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initProcessor40() {
    return Commands.run()
        .withComposite("Processor4")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost3() {
    Host _get = this.Common().getHosts().get("grid2");
    return _get;
  }
  
  private CommandDescriptor initProcessor50() {
    return Commands.run()
        .withComposite("Processor5")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initProcessor60() {
    return Commands.run()
        .withComposite("Processor6")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initDispatcher0() {
    return Commands.run()
        .withComposite("Dispatcher")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost4() {
    Host _get = this.Common().getHosts().get("grid7");
    return _get;
  }
  
  private CommandDescriptor initControl0() {
    return Commands.run()
        .withComposite("Control")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost5() {
    Host _get = this.Common().getHosts().get("grid5");
    return _get;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      init,
      knowledge,
      processor7,
      processor1,
      processor2,
      distributor,
      processor3,
      processor4,
      processor5,
      processor6,
      dispatcher,
      control,
      $co$edu$icesi$driso$matrices$Common.getAllRules()
    );
  }
}
