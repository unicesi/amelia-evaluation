package co.edu.icesi.driso.matrices.deployments;

import co.edu.icesi.driso.matrices.Allocation;
import co.edu.icesi.driso.matrices.BlockReduce;
import co.edu.icesi.driso.matrices.Common;
import co.edu.icesi.driso.matrices.Compile;
import co.edu.icesi.driso.matrices.classes.Strategy;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.amelia.dsl.lib.Subsystem;
import org.amelia.dsl.lib.SubsystemGraph;
import org.amelia.dsl.lib.descriptors.Host;
import org.amelia.dsl.lib.util.Hosts;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Deploy the BlockReduce strategy once and then
 * stop the executed components.
 */
@SuppressWarnings("all")
public class SimpleBlockReduce {
  private HashMap<String, List<Subsystem>> ＿subsystems = new HashMap<String, List<Subsystem>>();
  
  public static void main(final String[] args) throws Exception {
    System.setProperty("java.util.logging.config.file", "logging.properties");
    SimpleBlockReduce main = new SimpleBlockReduce();
    main.init();
    main.custom();
  }
  
  private void custom() {
    try {
      final Function1<Host, String> _function = new Function1<Host, String>() {
        @Override
        public String apply(final Host h) {
          return h.identifier();
        }
      };
      final Map<String, Host> hosts = IterableExtensions.<String, Host>toMap(Hosts.hosts("hosts.txt"), _function);
      Host _get = hosts.get("grid1");
      Host _get_1 = hosts.get("grid2");
      Host _get_2 = hosts.get("grid3");
      Host _get_3 = hosts.get("grid4");
      Host _get_4 = hosts.get("grid5");
      Host _get_5 = hosts.get("grid6");
      final List<Host> executionHosts = Collections.<Host>unmodifiableList(CollectionLiterals.<Host>newArrayList(_get, _get_1, _get_2, _get_3, _get_4, _get_5));
      Common _common = new Common(hosts);
      this.add(_common);
      Compile _compile = new Compile(Strategy.BLOCK_REDUCE, hosts);
      this.add(_compile);
      Allocation _allocation = new Allocation(executionHosts, hosts);
      this.add(_allocation);
      BlockReduce _blockReduce = new BlockReduce(executionHosts, hosts);
      this.add(_blockReduce);
      this.start(true);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void add(final Subsystem.Deployment deployment) {
    String clazz = deployment.getClass().getCanonicalName();
    if (＿subsystems.containsKey(clazz)) {
      ＿subsystems.get(clazz).add(new Subsystem(clazz, deployment));
    } else {
    	throw new RuntimeException("Subsystem '" + clazz + "' has not been included in " + 
    		"deployment 'co.edu.icesi.driso.matrices.deployments.SimpleBlockReduce'");
    }
  }
  
  private void init() throws Exception {
    ＿subsystems.put("co.edu.icesi.driso.matrices.Common", new ArrayList());
    ＿subsystems.put("co.edu.icesi.driso.matrices.Compile", new ArrayList());
    ＿subsystems.put("co.edu.icesi.driso.matrices.Allocation", new ArrayList());
    ＿subsystems.put("co.edu.icesi.driso.matrices.BlockReduce", new ArrayList());
  }
  
  private boolean start(final boolean stopExecutedComponents, final boolean shutdownAfterDeployment) throws Exception {
    SubsystemGraph graph = SubsystemGraph.getInstance();
    for (Subsystem s : ＿subsystems.get("co.edu.icesi.driso.matrices.Allocation")) {
    	s.dependsOn(
    		Iterables.toArray(
    			Iterables.concat(
    				＿subsystems.get("co.edu.icesi.driso.matrices.Compile")
    			),
    			Subsystem.class
    		)
    	);
    }
    for (Subsystem s : ＿subsystems.get("co.edu.icesi.driso.matrices.BlockReduce")) {
    	s.dependsOn(
    		Iterables.toArray(
    			Iterables.concat(
    				＿subsystems.get("co.edu.icesi.driso.matrices.Allocation")
    			),
    			Subsystem.class
    		)
    	);
    }
    Subsystem[] subs = Lists.newArrayList(Iterables.concat(＿subsystems.values())).toArray(new Subsystem[0]);
    for(Subsystem s : subs) {
      s.deployment().setup();
    }
    graph.addSubsystems(subs);
    boolean successful = graph.execute(stopExecutedComponents, shutdownAfterDeployment);
    return successful;
  }
  
  private boolean start(final boolean stopExecutedComponents) throws Exception {
    return start(stopExecutedComponents, true);
  }
}
