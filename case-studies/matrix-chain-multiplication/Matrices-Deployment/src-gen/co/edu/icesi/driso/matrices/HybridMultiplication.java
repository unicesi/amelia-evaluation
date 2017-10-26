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

/**
 * Execute the Hybrid multiplication strategy.
 */
@SuppressWarnings("all")
public class HybridMultiplication extends Subsystem.Deployment {
  private String common;
  
  private String artifact;
  
  private Iterable<String> libpath;
  
  private Common $co$edu$icesi$driso$matrices$Common;
  
  public final CommandDescriptor[] reducer0 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] control = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer2 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer3 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer4 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer5 = new CommandDescriptor[1];
  
  public HybridMultiplication() {
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common();
    
  }
  
  public HybridMultiplication(final Map<String, Host> $co$edu$icesi$driso$matrices$Common$hosts) {
    
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common($co$edu$icesi$driso$matrices$Common$hosts);
    
  }
  
  private void init() {
    this.common = initCommon();
    this.artifact = initArtifact();
    this.libpath = initLibpath();
    reducer0[0] = initReducer00();
    reducer1[0] = initReducer10();
    control[0] = initControl0();
    reducer2[0] = initReducer20();
    reducer3[0] = initReducer30();
    reducer4[0] = initReducer40();
    reducer5[0] = initReducer50();
    
  }
  
  @Override
  public void setup() {
    $co$edu$icesi$driso$matrices$Common.setup();
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    reducer0[0].runsOn(hosts0);
    reducer1[0].runsOn(hosts0);
    control[0].runsOn(hosts0);
    control[0].dependsOn(reducer0[0], reducer1[0], reducer2[0], reducer3[0], reducer4[0], reducer5[0]);
    List<Host> hosts1 = Lists.newArrayList(getHost1());
    reducer2[0].runsOn(hosts1);
    List<Host> hosts2 = Lists.newArrayList(getHost2());
    reducer3[0].runsOn(hosts2);
    List<Host> hosts3 = Lists.newArrayList(getHost3());
    reducer4[0].runsOn(hosts3);
    List<Host> hosts4 = Lists.newArrayList(getHost4());
    reducer5[0].runsOn(hosts4);
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
    return "mcm-hybrid-multiplication";
  }
  
  public String getArtifact() {
    return this.artifact;
  }
  
  private Iterable<String> initLibpath() {
    return Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("" + this.Common().getBuiltsFolder() + "/" + this.artifact + ".jar", "" + this.Common().getBuiltsFolder() + "/" + this.common + ".jar"));
  }
  
  public Iterable<String> getLibpath() {
    return this.libpath;
  }
  
  private CommandDescriptor initReducer00() {
    return Commands.run()
        .withComposite("BlocksMultiplicator0")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initReducer10() {
    return Commands.run()
        .withComposite("BlocksMultiplicator1")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initControl0() {
    return Commands.run()
        .withComposite("HybridMultiplication")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost0() {
    Host _get = this.Common().getHosts().get("grid5");
    return _get;
  }
  
  private CommandDescriptor initReducer20() {
    return Commands.run()
        .withComposite("BlocksMultiplicator2")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost1() {
    Host _get = this.Common().getHosts().get("grid3");
    return _get;
  }
  
  private CommandDescriptor initReducer30() {
    return Commands.run()
        .withComposite("BlocksMultiplicator3")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost2() {
    Host _get = this.Common().getHosts().get("grid7");
    return _get;
  }
  
  private CommandDescriptor initReducer40() {
    return Commands.run()
        .withComposite("BlocksMultiplicator4")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost3() {
    Host _get = this.Common().getHosts().get("grid6");
    return _get;
  }
  
  private CommandDescriptor initReducer50() {
    return Commands.run()
        .withComposite("BlocksMultiplicator5")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost4() {
    Host _get = this.Common().getHosts().get("grid4");
    return _get;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      reducer0,
      reducer1,
      control,
      reducer2,
      reducer3,
      reducer4,
      reducer5,
      $co$edu$icesi$driso$matrices$Common.getAllRules()
    );
  }
}
