package edu.icesi.amelia.validation.cts.deployments;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import edu.icesi.amelia.validation.cts.monitors.Monitor_1;
import edu.icesi.amelia.validation.cts.monitors.Monitor_10;
import edu.icesi.amelia.validation.cts.monitors.Monitor_11;
import edu.icesi.amelia.validation.cts.monitors.Monitor_12;
import edu.icesi.amelia.validation.cts.monitors.Monitor_13;
import edu.icesi.amelia.validation.cts.monitors.Monitor_2;
import edu.icesi.amelia.validation.cts.monitors.Monitor_3;
import edu.icesi.amelia.validation.cts.monitors.Monitor_4;
import edu.icesi.amelia.validation.cts.monitors.Monitor_5;
import edu.icesi.amelia.validation.cts.monitors.Monitor_6;
import edu.icesi.amelia.validation.cts.monitors.Monitor_7;
import edu.icesi.amelia.validation.cts.monitors.Monitor_8;
import edu.icesi.amelia.validation.cts.monitors.Monitor_9;
import edu.icesi.amelia.validation.cts.subsystems.Bridge_Server;
import edu.icesi.amelia.validation.cts.subsystems.Compilation;
import edu.icesi.amelia.validation.cts.subsystems.ExternalProbe;
import edu.icesi.amelia.validation.cts.subsystems.JMeter_12NO;
import edu.icesi.amelia.validation.cts.subsystems.LoadBalancer;
import edu.icesi.amelia.validation.cts.subsystems.StoreProcedures;
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
public class R_12CO_12NO_1MB {
  private HashMap<String, List<Subsystem>> ＿subsystems = new HashMap<String, List<Subsystem>>();
  
  public static void main(final String[] args) throws Exception {
    System.setProperty("java.util.logging.config.file", "logging.properties");
    R_12CO_12NO_1MB main = new R_12CO_12NO_1MB();
    main.init();
    main.custom();
  }
  
  private void custom() {
    try {
      final int bdConnection = 1;
      final int numComponents = 12;
      final int jMeterMB = 1;
      final Function1<Host, String> _function = (Host h) -> {
        return h.identifier();
      };
      final Map<String, Host> allHosts = IterableExtensions.<String, Host>toMap(Hosts.hosts("/home/carvajal/Documents/LF_RIVERA/Workspace_Neon/REST-CTS-XML-Amelia_Reactor/src/hosts.txt"), _function);
      final Host compilationHost = allHosts.get("compilationExternalProbe");
      final Host hostExternalProbe = allHosts.get("compilationExternalProbe");
      final Host componentsHost = allHosts.get("bridgeServerLoadBalancerJmeter");
      final Host spHost1 = allHosts.get("sp1");
      final Host spHost2 = allHosts.get("sp2");
      final Host spHost3 = allHosts.get("sp3");
      final Host spHost4 = allHosts.get("sp4");
      final Host spHost5 = allHosts.get("sp5");
      final Host spHost6 = allHosts.get("sp6");
      final Host spHost7 = allHosts.get("sp7");
      final Host spHost8 = allHosts.get("sp8");
      final Host spHost9 = allHosts.get("sp9");
      final Host spHost10 = allHosts.get("sp10");
      final Host spHost11 = allHosts.get("sp11");
      final Host spHost12 = allHosts.get("sp12");
      final List<Host> spHosts = Collections.<Host>unmodifiableList(CollectionLiterals.<Host>newArrayList(spHost1, spHost2, spHost3, spHost4, spHost5, spHost6, spHost7, spHost8, spHost9, spHost10, spHost11, spHost12));
      final List<Host> associatedHosts = IterableExtensions.<Host>toList(Iterables.<Host>concat(Collections.<Host>unmodifiableList(CollectionLiterals.<Host>newArrayList(componentsHost)), spHosts));
      final Host hostJmeter = componentsHost;
      final RetryableDeployment deployHelper = new RetryableDeployment();
      IntegerRange _upTo = new IntegerRange(1, 1);
      for (final Integer i : _upTo) {
        final RetryableDeployment.Function<Boolean> _function_1 = () -> {
          try {
            boolean _xblockexpression = false;
            {
              Compilation _compilation = new Compilation(compilationHost, associatedHosts);
              this.add(_compilation);
              ExternalProbe _externalProbe = new ExternalProbe(hostExternalProbe);
              this.add(_externalProbe);
              LoadBalancer _loadBalancer = new LoadBalancer(componentsHost);
              this.add(_loadBalancer);
              StoreProcedures _storeProcedures = new StoreProcedures(Integer.valueOf(bdConnection), Integer.valueOf(numComponents), spHost1, spHost2, spHost3, spHost4, spHost5, spHost6, spHost7, spHost8, spHost9, spHost10, spHost11, spHost12, spHosts);
              this.add(_storeProcedures);
              Bridge_Server _bridge_Server = new Bridge_Server(componentsHost, Integer.valueOf(numComponents));
              this.add(_bridge_Server);
              Monitor_1 _monitor_1 = new Monitor_1(spHost1, "sp1");
              this.add(_monitor_1);
              Monitor_2 _monitor_2 = new Monitor_2(spHost2, "sp2");
              this.add(_monitor_2);
              Monitor_3 _monitor_3 = new Monitor_3(spHost3, "sp3");
              this.add(_monitor_3);
              Monitor_4 _monitor_4 = new Monitor_4(spHost4, "sp4");
              this.add(_monitor_4);
              Monitor_5 _monitor_5 = new Monitor_5(spHost5, "sp5");
              this.add(_monitor_5);
              Monitor_6 _monitor_6 = new Monitor_6(spHost6, "sp6");
              this.add(_monitor_6);
              Monitor_7 _monitor_7 = new Monitor_7(spHost7, "sp7");
              this.add(_monitor_7);
              Monitor_8 _monitor_8 = new Monitor_8(spHost8, "sp8");
              this.add(_monitor_8);
              Monitor_9 _monitor_9 = new Monitor_9(spHost9, "sp9");
              this.add(_monitor_9);
              Monitor_10 _monitor_10 = new Monitor_10(spHost10, "sp10");
              this.add(_monitor_10);
              Monitor_11 _monitor_11 = new Monitor_11(spHost11, "sp11");
              this.add(_monitor_11);
              Monitor_12 _monitor_12 = new Monitor_12(spHost12, "sp12");
              this.add(_monitor_12);
              Monitor_13 _monitor_13 = new Monitor_13(componentsHost, "bridge");
              this.add(_monitor_13);
              JMeter_12NO _jMeter_12NO = new JMeter_12NO(hostJmeter, hostExternalProbe, Integer.valueOf(jMeterMB));
              this.add(_jMeter_12NO);
              _xblockexpression = this.start(true);
            }
            return Boolean.valueOf(_xblockexpression);
          } catch (Throwable _e) {
            throw Exceptions.sneakyThrow(_e);
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
    		"deployment 'edu.icesi.amelia.validation.cts.deployments.R_12CO_12NO_1MB'");
    }
  }
  
  private void init() throws Exception {
    ＿subsystems.put("edu.icesi.amelia.validation.cts.subsystems.ExternalProbe", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.subsystems.Compilation", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.subsystems.LoadBalancer", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.subsystems.StoreProcedures", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.subsystems.Bridge_Server", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.subsystems.JMeter_12NO", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_1", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_2", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_3", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_4", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_5", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_6", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_7", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_8", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_9", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_10", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_11", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_12", new ArrayList());
    ＿subsystems.put("edu.icesi.amelia.validation.cts.monitors.Monitor_13", new ArrayList());
  }
  
  private boolean start(final boolean stopExecutedComponents, final boolean shutdownAfterDeployment) throws Exception {
    SubsystemGraph graph = SubsystemGraph.getInstance();
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.ExternalProbe")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.Compilation").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.LoadBalancer")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.ExternalProbe").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.StoreProcedures")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.LoadBalancer").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.Bridge_Server")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.StoreProcedures").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.JMeter_12NO")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_13").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_1")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.subsystems.Bridge_Server").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_2")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_1").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_3")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_2").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_4")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_3").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_5")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_4").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_6")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_5").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_7")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_6").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_8")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_7").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_9")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_8").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_10")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_9").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_11")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_10").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_12")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_11").toArray(new Subsystem[0])
    	);
    }
    for (Subsystem s : ＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_13")) {
    	s.dependsOn(
    		＿subsystems.get("edu.icesi.amelia.validation.cts.monitors.Monitor_12").toArray(new Subsystem[0])
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
