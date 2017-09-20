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
public class Compilation extends Subsystem.Deployment {
  private Host host;
  
  private List<Host> associatedHosts;
  
  private String codeSourcesFolder;
  
  private String projectName;
  
  private String monitoringProjectName;
  
  public final CommandDescriptor[] directory = new CommandDescriptor[1];
  
  public final CommandDescriptor[] compilation = new CommandDescriptor[2];
  
  public final CommandDescriptor[] localCopy = new CommandDescriptor[2];
  
  public final CommandDescriptor[] remoteCopy = new CommandDescriptor[2];
  
  public Compilation() {
    
  }
  
  public Compilation(final Host host, final List<Host> associatedHosts) {
    this.host = host;
    this.associatedHosts = associatedHosts;
    
  }
  
  private void init() {
    this.codeSourcesFolder = initCodeSourcesFolder();
    this.projectName = initProjectName();
    this.monitoringProjectName = initMonitoringProjectName();
    directory[0] = initDirectory0();
    compilation[0] = initCompilation0();
    compilation[1] = initCompilation1();
    localCopy[0] = initLocalCopy0();
    localCopy[1] = initLocalCopy1();
    remoteCopy[0] = initRemoteCopy0();
    remoteCopy[1] = initRemoteCopy1();
    
  }
  
  @Override
  public void setup() {
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    directory[0].runsOn(hosts0);
    compilation[0].runsOn(hosts0);
    compilation[0].dependsOn(directory[0]);
    compilation[1].runsOn(hosts0);
    compilation[1].dependsOn(compilation[0]);
    localCopy[0].runsOn(hosts0);
    localCopy[0].dependsOn(compilation[1]);
    localCopy[1].runsOn(hosts0);
    localCopy[1].dependsOn(localCopy[0]);
    List<Host> hosts1 = Lists.newArrayList(getHost1());
    remoteCopy[0].runsOn(hosts1);
    remoteCopy[0].dependsOn(localCopy[1]);
    remoteCopy[1].runsOn(hosts1);
    remoteCopy[1].dependsOn(remoteCopy[0]);
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
  
  public List<Host> getAssociatedHosts() {
    return this.associatedHosts;
  }
  
  private String initCodeSourcesFolder() {
    return "/home/carvajal/nfs/carvajal/sourcecode";
  }
  
  public String getCodeSourcesFolder() {
    return this.codeSourcesFolder;
  }
  
  private String initProjectName() {
    return "Procedimientos_PDG_Reactor_REST";
  }
  
  public String getProjectName() {
    return this.projectName;
  }
  
  private String initMonitoringProjectName() {
    return "Monitoring";
  }
  
  public String getMonitoringProjectName() {
    return this.monitoringProjectName;
  }
  
  private CommandDescriptor initDirectory0() {
    return Commands.cd(this.codeSourcesFolder);
  }
  
  private CommandDescriptor initCompilation0() {
    return Commands.compile("" + this.projectName + "/Server/src", "" + this.projectName + "/jars/xmlServerReactorRest", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("" + this.projectName + "/lib/vtd-xml.jar", "" + this.projectName + "/lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "" + this.projectName + "/lib/new-personalized-events-with-carvajal.jar", "" + this.projectName + "/lib/ojdbc6.jar", "" + this.projectName + "/lib/javax.ws.rs-api-2.0.jar", "" + this.projectName + "/lib/commons-codec-1.10.jar", "" + this.projectName + "/lib/xdb6.jar")));
  }
  
  private CommandDescriptor initCompilation1() {
    return Commands.compile("" + this.monitoringProjectName + "/src", "monitoring", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("" + this.monitoringProjectName + "/lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "" + this.monitoringProjectName + "/lib/new-personalized-events-with-carvajal.jar", "" + this.monitoringProjectName + "/lib/slf4j-api-1.7.10.jar", "" + this.monitoringProjectName + "/lib/sigar.jar")));
  }
  
  private CommandDescriptor initLocalCopy0() {
    return Commands.generic("cp -rf " + this.projectName + "/jars /home/carvajal/nfs/Carvajal/");
  }
  
  private CommandDescriptor initLocalCopy1() {
    return Commands.generic("cp monitoring.jar /home/carvajal/nfs/Carvajal/jars");
  }
  
  private Host getHost0() {
    return this.host;
  }
  
  private CommandDescriptor initRemoteCopy0() {
    return Commands.generic("cp -rf /home/carvajal/nfs/Carvajal/jars /home/carvajal/Documents/carvajal");
  }
  
  private CommandDescriptor initRemoteCopy1() {
    return Commands.generic("cp -rf /home/carvajal/nfs/Carvajal/lib /home/carvajal/Documents/carvajal");
  }
  
  private List<Host> getHost1() {
    return this.associatedHosts;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      directory,
      compilation,
      localCopy,
      remoteCopy
    );
  }
}
