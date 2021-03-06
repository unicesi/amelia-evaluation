package co.edu.icesi.driso.matrices;

import co.edu.icesi.driso.matrices.Common;
import co.edu.icesi.driso.matrices.classes.Strategy;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import org.amelia.dsl.lib.DescriptorGraph;
import org.amelia.dsl.lib.Subsystem;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import org.amelia.dsl.lib.util.Arrays;
import org.amelia.dsl.lib.util.Commands;

/**
 * Compile each strategy's source code.
 */
@SuppressWarnings("all")
public class Compile extends Subsystem.Deployment {
  /**
   * The multiplication strategy to compile.
   */
  private Strategy strategy;
  
  private Common $co$edu$icesi$driso$matrices$Common;
  
  public final CommandDescriptor[] compileCommon = new CommandDescriptor[3];
  
  public final CommandDescriptor[] strategy1 = new CommandDescriptor[3];
  
  public final CommandDescriptor[] strategy2 = new CommandDescriptor[3];
  
  public final CommandDescriptor[] strategy3 = new CommandDescriptor[3];
  
  public final CommandDescriptor[] strategy4 = new CommandDescriptor[3];
  
  public Compile() {
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common();
    
  }
  
  public Compile(final Strategy strategy, final Map<String, Host> $co$edu$icesi$driso$matrices$Common$hosts) {
    this.strategy = strategy;
    this.$co$edu$icesi$driso$matrices$Common = new co.edu.icesi.driso.matrices.Common($co$edu$icesi$driso$matrices$Common$hosts);
    
  }
  
  private void init() {
    compileCommon[0] = initCompileCommon0();
    compileCommon[1] = initCompileCommon1();
    compileCommon[2] = initCompileCommon2();
    strategy1[0] = initStrategy10();
    strategy1[1] = initStrategy11();
    strategy1[2] = initStrategy12();
    strategy2[0] = initStrategy20();
    strategy2[1] = initStrategy21();
    strategy2[2] = initStrategy22();
    strategy3[0] = initStrategy30();
    strategy3[1] = initStrategy31();
    strategy3[2] = initStrategy32();
    strategy4[0] = initStrategy40();
    strategy4[1] = initStrategy41();
    strategy4[2] = initStrategy42();
    
  }
  
  @Override
  public void setup() {
    $co$edu$icesi$driso$matrices$Common.setup();
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    compileCommon[0].runsOn(hosts0);
    compileCommon[1].runsOn(hosts0);
    compileCommon[1].dependsOn(compileCommon[0]);
    compileCommon[2].runsOn(hosts0);
    compileCommon[2].dependsOn(compileCommon[1]);
    List<Host> hosts1 = Lists.newArrayList(getHost1());
    strategy1[0].runsOn(hosts1);
    strategy1[0].addExecutionCondition(getHostCondition1());
    strategy1[0].dependsOn(compileCommon[2]);
    strategy1[1].runsOn(hosts1);
    strategy1[1].addExecutionCondition(getHostCondition1());
    strategy1[1].dependsOn(strategy1[0]);
    strategy1[2].runsOn(hosts1);
    strategy1[2].addExecutionCondition(getHostCondition1());
    strategy1[2].dependsOn(strategy1[1]);
    List<Host> hosts2 = Lists.newArrayList(getHost2());
    strategy2[0].runsOn(hosts2);
    strategy2[0].addExecutionCondition(getHostCondition2());
    strategy2[0].dependsOn(compileCommon[2]);
    strategy2[1].runsOn(hosts2);
    strategy2[1].addExecutionCondition(getHostCondition2());
    strategy2[1].dependsOn(strategy2[0]);
    strategy2[2].runsOn(hosts2);
    strategy2[2].addExecutionCondition(getHostCondition2());
    strategy2[2].dependsOn(strategy2[1]);
    List<Host> hosts3 = Lists.newArrayList(getHost3());
    strategy3[0].runsOn(hosts3);
    strategy3[0].addExecutionCondition(getHostCondition3());
    strategy3[0].dependsOn(compileCommon[2]);
    strategy3[1].runsOn(hosts3);
    strategy3[1].addExecutionCondition(getHostCondition3());
    strategy3[1].dependsOn(strategy3[0]);
    strategy3[2].runsOn(hosts3);
    strategy3[2].addExecutionCondition(getHostCondition3());
    strategy3[2].dependsOn(strategy3[1]);
    List<Host> hosts4 = Lists.newArrayList(getHost4());
    strategy4[0].runsOn(hosts4);
    strategy4[0].addExecutionCondition(getHostCondition4());
    strategy4[0].dependsOn(compileCommon[2]);
    strategy4[1].runsOn(hosts4);
    strategy4[1].addExecutionCondition(getHostCondition4());
    strategy4[1].dependsOn(strategy4[0]);
    strategy4[2].runsOn(hosts4);
    strategy4[2].addExecutionCondition(getHostCondition4());
    strategy4[2].dependsOn(strategy4[1]);
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
  
  public Strategy getStrategy() {
    return this.strategy;
  }
  
  private CommandDescriptor initCompileCommon0() {
    return Commands.cd(this.Common().getSources().get(0));
  }
  
  private CommandDescriptor initCompileCommon1() {
    return Commands.compile("src", "mcm-common");
  }
  
  private CommandDescriptor initCompileCommon2() {
    return Commands.generic("yes | cp -f mcm-common.jar " + this.Common().getBuiltFolder() + "/");
  }
  
  private Host getHost0() {
    Host _compilationHost = this.Common().getCompilationHost();
    return _compilationHost;
  }
  
  private CommandDescriptor initStrategy10() {
    return Commands.cd(this.Common().getSources().get(1));
  }
  
  private CommandDescriptor initStrategy11() {
    return Commands.compile("src", "mcm-blockreduce", "" + this.Common().getBuiltFolder() + "/mcm-common.jar");
  }
  
  private CommandDescriptor initStrategy12() {
    return Commands.generic("yes | cp -f mcm-blockreduce.jar " + this.Common().getBuiltFolder() + "");
  }
  
  private Host getHost1() {
    Host _compilationHost = this.Common().getCompilationHost();
    return _compilationHost;
  }
  
  public boolean getHostCondition1() {
    boolean _equals = Objects.equal(this.strategy, Strategy.BLOCK_REDUCE);
    return _equals;
  }
  
  private CommandDescriptor initStrategy20() {
    return Commands.cd(this.Common().getSources().get(2));
  }
  
  private CommandDescriptor initStrategy21() {
    return Commands.compile("src", "mcm-hybrid-multiplication", "" + this.Common().getBuiltFolder() + "/mcm-common.jar");
  }
  
  private CommandDescriptor initStrategy22() {
    return Commands.generic("yes | cp -f mcm-hybrid-multiplication.jar " + this.Common().getBuiltFolder() + "");
  }
  
  private Host getHost2() {
    Host _compilationHost = this.Common().getCompilationHost();
    return _compilationHost;
  }
  
  public boolean getHostCondition2() {
    boolean _equals = Objects.equal(this.strategy, Strategy.HYBRID_MULTIPLICATION);
    return _equals;
  }
  
  private CommandDescriptor initStrategy30() {
    return Commands.cd(this.Common().getSources().get(3));
  }
  
  private CommandDescriptor initStrategy31() {
    return Commands.compile("src", "mcm-nmatrices", "" + this.Common().getBuiltFolder() + "/mcm-common.jar");
  }
  
  private CommandDescriptor initStrategy32() {
    return Commands.generic("yes | cp -f mcm-nmatrices.jar " + this.Common().getBuiltFolder() + "");
  }
  
  private Host getHost3() {
    Host _compilationHost = this.Common().getCompilationHost();
    return _compilationHost;
  }
  
  public boolean getHostCondition3() {
    boolean _equals = Objects.equal(this.strategy, Strategy.N_MATRICES);
    return _equals;
  }
  
  private CommandDescriptor initStrategy40() {
    return Commands.cd(this.Common().getSources().get(4));
  }
  
  private CommandDescriptor initStrategy41() {
    return Commands.compile("src", "mcm-strassen", "" + this.Common().getBuiltFolder() + "/mcm-common.jar");
  }
  
  private CommandDescriptor initStrategy42() {
    return Commands.generic("yes | cp -f mcm-strassen.jar " + this.Common().getBuiltFolder() + "");
  }
  
  private Host getHost4() {
    Host _compilationHost = this.Common().getCompilationHost();
    return _compilationHost;
  }
  
  public boolean getHostCondition4() {
    boolean _equals = Objects.equal(this.strategy, Strategy.STRASSEN);
    return _equals;
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      compileCommon,
      strategy1,
      strategy2,
      strategy3,
      strategy4,
      $co$edu$icesi$driso$matrices$Common.getAllRules()
    );
  }
}
