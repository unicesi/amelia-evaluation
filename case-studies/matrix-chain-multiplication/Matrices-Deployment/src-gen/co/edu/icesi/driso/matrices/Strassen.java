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
 * Execute the Strassen multiplication strategy.
 */
@SuppressWarnings("all")
public class Strassen extends Subsystem.Deployment {
  private String common;
  
  private String artifact;
  
  private Iterable<String> libpath;
  
  private Common $co$edu$icesi$driso$matrices$Common;
  
  public final CommandDescriptor[] cdRun = new CommandDescriptor[2];
  
  public Strassen() {
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common();
    
  }
  
  public Strassen(final Map<String, Host> $co$edu$icesi$driso$matrices$Common$hosts) {
    
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common($co$edu$icesi$driso$matrices$Common$hosts);
    
  }
  
  private void init() {
    this.common = initCommon();
    this.artifact = initArtifact();
    this.libpath = initLibpath();
    cdRun[0] = initCdRun0();
    cdRun[1] = initCdRun1();
    
  }
  
  @Override
  public void setup() {
    $co$edu$icesi$driso$matrices$Common.setup();
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    cdRun[0].runsOn(hosts0);
    cdRun[1].runsOn(hosts0);
    cdRun[1].dependsOn(cdRun[0]);
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
    return "mcm-strassen";
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
  
  private CommandDescriptor initCdRun0() {
    return Commands.cd(this.Common().getBuiltsFolder());
  }
  
  private CommandDescriptor initCdRun1() {
    return Commands.run()
        .withComposite("Strassen")
        .withLibpath(this.libpath).build();
  }
  
  private Host getHost0() {
    Host _get = this.Common().getHosts().get("grid1");
    return _get;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      cdRun,
      $co$edu$icesi$driso$matrices$Common.getAllRules()
    );
  }
}
