package co.edu.icesi.driso.matrices;

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

@SuppressWarnings("all")
public class BlockReduce extends Subsystem.Deployment {
  private List<Host> executionHosts;
  
  private String common;
  
  private String artifact;
  
  private Iterable<String> libpath;
  
  private co.edu.icesi.driso.matrices.Common $co$edu$icesi$driso$matrices$Common;
  
  public final CommandDescriptor[] init = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer0 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] control = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer2 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer3 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] matrixBuilder = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer4 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] reducer5 = new CommandDescriptor[1];
  
  public BlockReduce() {
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common();
    
  }
  
  public BlockReduce(final List<Host> executionHosts, final Map<String, Host> $co$edu$icesi$driso$matrices$Common$hosts) {
    this.executionHosts = executionHosts;
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common($co$edu$icesi$driso$matrices$Common$hosts);
    
  }
  
  private void init() {
    this.common = initCommon();
    this.artifact = initArtifact();
    this.libpath = initLibpath();
    init[0] = initInit0();
    reducer0[0] = initReducer00();
    control[0] = initControl0();
    reducer1[0] = initReducer10();
    reducer2[0] = initReducer20();
    reducer3[0] = initReducer30();
    matrixBuilder[0] = initMatrixBuilder0();
    reducer4[0] = initReducer40();
    reducer5[0] = initReducer50();
    
  }
  
  @Override
  public void setup() {
    $co$edu$icesi$driso$matrices$Common.setup();
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    init[0].runsOn(hosts0);
    List<Host> hosts1 = Lists.newArrayList(getHost1());
    reducer0[0].runsOn(hosts1);
    reducer0[0].dependsOn(matrixBuilder[0]);control[0].runsOn(hosts1);
    control[0].dependsOn(reducer0[0], reducer1[0], reducer2[0], reducer3[0], reducer4[0], reducer5[0]);
    List<Host> hosts2 = Lists.newArrayList(getHost2());
    reducer1[0].runsOn(hosts2);
    reducer1[0].dependsOn(matrixBuilder[0]);
    List<Host> hosts3 = Lists.newArrayList(getHost3());
    reducer2[0].runsOn(hosts3);
    reducer2[0].dependsOn(matrixBuilder[0]);
    List<Host> hosts4 = Lists.newArrayList(getHost4());
    reducer3[0].runsOn(hosts4);
    reducer3[0].dependsOn(matrixBuilder[0]);
    List<Host> hosts5 = Lists.newArrayList(getHost5());
    matrixBuilder[0].runsOn(hosts5);
    matrixBuilder[0].dependsOn(init[0]);reducer4[0].runsOn(hosts5);
    reducer4[0].dependsOn(matrixBuilder[0]);
    List<Host> hosts6 = Lists.newArrayList(getHost6());
    reducer5[0].runsOn(hosts6);
    reducer5[0].dependsOn(matrixBuilder[0]);
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
  
  private String initCommon() {
    return "mcm-common";
  }
  
  public String getCommon() {
    return this.common;
  }
  
  private String initArtifact() {
    return "mcm-blockreduce";
  }
  
  public String getArtifact() {
    return this.artifact;
  }
  
  private Iterable<String> initLibpath() {
    return Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("" + this.getBuiltsFolder() + "/" + this.common + ".jar", "" + this.getBuiltsFolder() + "/" + this.artifact + ".jar"));
  }
  
  public Iterable<String> getLibpath() {
    return this.libpath;
  }
  
  private CommandDescriptor initInit0() {
    return Commands.cd(this.getBuiltsFolder());
  }
  
  private List<Host> getHost0() {
    return this.executionHosts;
  }
  
  private CommandDescriptor initReducer00() {
    return Commands.run()
        .withComposite("BlocksMultiplicator0")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initControl0() {
    return Commands.run()
        .withComposite("Blockreduce")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost1() {
    Map<String, Host> _hosts = this.getHosts();
    Host _get = _hosts.get("grid1");
    return _get;
  }
  
  private CommandDescriptor initReducer10() {
    return Commands.run()
        .withComposite("BlocksMultiplicator1")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost2() {
    Map<String, Host> _hosts = this.getHosts();
    Host _get = _hosts.get("grid2");
    return _get;
  }
  
  private CommandDescriptor initReducer20() {
    return Commands.run()
        .withComposite("BlocksMultiplicator2")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost3() {
    Map<String, Host> _hosts = this.getHosts();
    Host _get = _hosts.get("grid3");
    return _get;
  }
  
  private CommandDescriptor initReducer30() {
    return Commands.run()
        .withComposite("BlocksMultiplicator3")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost4() {
    Map<String, Host> _hosts = this.getHosts();
    Host _get = _hosts.get("grid4");
    return _get;
  }
  
  private CommandDescriptor initMatrixBuilder0() {
    return Commands.run()
        .withComposite("FinalMatrixBuilder")
        .withLibpath(this.libpath).build();
  }
  
  private CommandDescriptor initReducer40() {
    return Commands.run()
        .withComposite("BlocksMultiplicator4")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost5() {
    Map<String, Host> _hosts = this.getHosts();
    Host _get = _hosts.get("grid5");
    return _get;
  }
  
  private CommandDescriptor initReducer50() {
    return Commands.run()
        .withComposite("BlocksMultiplicator5")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost6() {
    Map<String, Host> _hosts = this.getHosts();
    Host _get = _hosts.get("grid6");
    return _get;
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
      init,
      reducer0,
      control,
      reducer1,
      reducer2,
      reducer3,
      matrixBuilder,
      reducer4,
      reducer5,
      $co$edu$icesi$driso$matrices$Common.getAllRules()
    );
  }
}
