package co.edu.icesi.driso.matrices.deploy;

import co.edu.icesi.driso.matrices.Allocation;
import co.edu.icesi.driso.matrices.Common;
import co.edu.icesi.driso.matrices.Compile;
import co.edu.icesi.driso.matrices.HybridMultiplication;
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
import org.amelia.dsl.lib.util.RetryableDeployment;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class DeployerHybrid {
  private HashMap<String, List<Subsystem>> ＿subsystems = new HashMap<String, List<Subsystem>>();
  
  public static void main(final String[] args) throws Exception {
    System.setProperty("java.util.logging.config.file", "logging.properties");
    DeployerHybrid main = new DeployerHybrid();
    main.init();
    main.custom();
  }
  
  private void custom() {
    try {
      final Integer strategy = Integer.valueOf(2);
      List<Host> _hosts = Hosts.hosts("hosts.txt");
      final Function1<Host, String> _function = new Function1<Host, String>() {
        @Override
        public String apply(final Host h) {
          return h.identifier();
        }
      };
      final Map<String, Host> hosts = IterableExtensions.<String, Host>toMap(_hosts, _function);
      Host _get = hosts.get("grid3");
      Host _get_1 = hosts.get("grid4");
      Host _get_2 = hosts.get("grid5");
      Host _get_3 = hosts.get("grid6");
      Host _get_4 = hosts.get("grid7");
      final List<Host> executionHosts = Collections.<Host>unmodifiableList(CollectionLiterals.<Host>newArrayList(_get, _get_1, _get_2, _get_3, _get_4));
      final RetryableDeployment deployHelper = new RetryableDeployment();
      IntegerRange _upTo = new IntegerRange(1, 1);
      for (final Integer i : _upTo) {
        final RetryableDeployment.Function<Boolean> _function_1 = new RetryableDeployment.Function<Boolean>() {
          @Override
          public Boolean apply() {
            try {
              boolean _xblockexpression = false;
              {
                Common _common = new Common(hosts);
                DeployerHybrid.this.add(_common);
                Compile _compile = new Compile(strategy, hosts);
                DeployerHybrid.this.add(_compile);
                Allocation _allocation = new Allocation(executionHosts, hosts);
                DeployerHybrid.this.add(_allocation);
                HybridMultiplication _hybridMultiplication = new HybridMultiplication(hosts);
                DeployerHybrid.this.add(_hybridMultiplication);
                _xblockexpression = DeployerHybrid.this.start(true);
              }
              return Boolean.valueOf(_xblockexpression);
            } catch (Throwable _e) {
              throw Exceptions.sneakyThrow(_e);
            }
          }
        };
        deployHelper.deploy(_function_1, 1);
      }
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
    		"deployment 'co.edu.icesi.driso.matrices.deploy.DeployerHybrid'");
    }
  }
  
  private void init() throws Exception {
    ＿subsystems.put("co.edu.icesi.driso.matrices.Common", new ArrayList());
    ＿subsystems.put("co.edu.icesi.driso.matrices.Compile", new ArrayList());
    ＿subsystems.put("co.edu.icesi.driso.matrices.Allocation", new ArrayList());
    ＿subsystems.put("co.edu.icesi.driso.matrices.HybridMultiplication", new ArrayList());
  }
  
  private boolean start(final boolean stopExecutedComponents, final boolean shutdownAfterDeployment) throws Exception {
    SubsystemGraph graph = SubsystemGraph.getInstance();
    for (Subsystem s : ＿subsystems.get("co.edu.icesi.driso.matrices.Allocation")) {
    	s.dependsOn(
    		＿subsystems.get("co.edu.icesi.driso.matrices.Compile").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("co.edu.icesi.driso.matrices.HybridMultiplication")) {
    	s.dependsOn(
    		＿subsystems.get("co.edu.icesi.driso.matrices.Allocation").toArray(new Subsystem[0])
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
