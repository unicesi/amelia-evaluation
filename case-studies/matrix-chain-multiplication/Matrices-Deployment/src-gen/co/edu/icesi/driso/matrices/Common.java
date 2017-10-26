package co.edu.icesi.driso.matrices;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.amelia.dsl.lib.DescriptorGraph;
import org.amelia.dsl.lib.Subsystem;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * Common definitions for all of the deployments/subsystems.
 */
@SuppressWarnings("all")
public class Common extends Subsystem.Deployment {
  /**
   * All hosts.
   */
  private Map<String, Host> hosts;
  
  /**
   * Compilation host.
   */
  private Host compilationHost;
  
  /**
   * Sources to compile.
   */
  private String commonSources;
  
  private String blockRSources;
  
  private String hybridSources;
  
  private String nMatricesSources;
  
  private String strassenSources;
  
  /**
   * Compilation sources.
   */
  private List<String> sources;
  
  /**
   * Built sources folder (The site where compilation artifacts are located).
   */
  private String builtFolder;
  
  /**
   * The folder in the execution nodes where artifacts are allocated.
   */
  private String allocationTargetFolder;
  
  /**
   * Target sources folder in the execution nodes
   * (The site where the jars are executed).
   */
  private String builtsFolder;
  
  public Common() {
    
  }
  
  public Common(final Map<String, Host> hosts) {
    this.hosts = hosts;
    
  }
  
  private void init() {
    this.compilationHost = initCompilationHost();
    this.commonSources = initCommonSources();
    this.blockRSources = initBlockRSources();
    this.hybridSources = initHybridSources();
    this.nMatricesSources = initNMatricesSources();
    this.strassenSources = initStrassenSources();
    this.sources = initSources();
    this.builtFolder = initBuiltFolder();
    this.allocationTargetFolder = initAllocationTargetFolder();
    this.builtsFolder = initBuiltsFolder();
    
  }
  
  @Override
  public void setup() {
    init();
  }
  
  public void deploy(final String ＿subsystem, final List<Subsystem> ＿dependencies) throws Exception {
    super.graph = new DescriptorGraph(＿subsystem);
    super.graph.addDescriptors(getAllRules());
    
  }
  
  public static void main(final String[] args) throws Exception {
    throw new Exception("Subsystems with dependencies or non-initialized" 
    	+ " parameters cannot be executed without using a deployment descriptor");
  }
  
  public Map<String, Host> getHosts() {
    return this.hosts;
  }
  
  private Host initCompilationHost() {
    Host _get = this.hosts.get("grid0");
    return _get;
  }
  
  public Host getCompilationHost() {
    return this.compilationHost;
  }
  
  private String initCommonSources() {
    return "/home/sas1/LF_RIVERA/workspace-matrices/org.driso.matrices.common";
  }
  
  public String getCommonSources() {
    return this.commonSources;
  }
  
  private String initBlockRSources() {
    return "/home/sas1/LF_RIVERA/workspace-matrices/org.driso.matrices.blockreduce";
  }
  
  public String getBlockRSources() {
    return this.blockRSources;
  }
  
  private String initHybridSources() {
    return "/home/sas1/LF_RIVERA/workspace-matrices/org.driso.matrices.hybrid_multiplication";
  }
  
  public String getHybridSources() {
    return this.hybridSources;
  }
  
  private String initNMatricesSources() {
    return "/home/sas1/LF_RIVERA/workspace-matrices/org.driso.matrices.nmatrices";
  }
  
  public String getNMatricesSources() {
    return this.nMatricesSources;
  }
  
  private String initStrassenSources() {
    return "/home/sas1/LF_RIVERA/workspace-matrices/org.driso.matrices.strassen";
  }
  
  public String getStrassenSources() {
    return this.strassenSources;
  }
  
  private List<String> initSources() {
    return Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(this.commonSources, this.blockRSources, this.hybridSources, this.nMatricesSources, this.strassenSources));
  }
  
  public List<String> getSources() {
    return this.sources;
  }
  
  private String initBuiltFolder() {
    return "/home/sas1/LF_RIVERA/workspace-matrices/built-sources";
  }
  
  public String getBuiltFolder() {
    return this.builtFolder;
  }
  
  private String initAllocationTargetFolder() {
    return "/home/sas1/";
  }
  
  public String getAllocationTargetFolder() {
    return this.allocationTargetFolder;
  }
  
  private String initBuiltsFolder() {
    return "" + this.allocationTargetFolder + "built-sources";
  }
  
  public String getBuiltsFolder() {
    return this.builtsFolder;
  }
  
  public CommandDescriptor[] getAllRules() {
    return new CommandDescriptor[0];
  }
}
