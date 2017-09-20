package edu.icesi.amelia.validation.cts.subsystems;

import com.google.common.collect.Lists;
import edu.icesi.amelia.validation.cts.subsystems.Directory;
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
public class StoreProcedures extends Subsystem.Deployment {
  private Integer bdConnection;
  
  private Integer numCom;
  
  private Host hostSP1;
  
  private Host hostSP2;
  
  private Host hostSP3;
  
  private Host hostSP4;
  
  private Host hostSP5;
  
  private Host hostSP6;
  
  private Host hostSP7;
  
  private Host hostSP8;
  
  private Host hostSP9;
  
  private Host hostSP10;
  
  private Host hostSP11;
  
  private Host hostSP12;
  
  private Directory $edu$icesi$amelia$validation$cts$subsystems$Directory;
  
  public final CommandDescriptor[] execution1CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12CO1 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP1CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP1CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP1CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP1CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP1CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP1CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP3CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP3CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP3CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP3CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP3CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP3CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP4CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP4CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP4CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP4CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP4CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP4CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP7CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP7CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP7CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP7CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP7CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP7CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP10CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP10CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP10CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP10CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP10CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP10CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP11CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP11CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP11CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP11CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP11CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP11CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP2CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP2CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP2CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP2CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP2CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP2CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP5CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP5CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP5CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP5CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP5CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP5CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP6CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP6CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP6CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP6CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP6CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP6CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP8CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP8CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP8CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP8CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP8CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP8CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP9CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP9CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP9CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP9CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP9CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP9CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP12CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP12CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP12CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP12CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP12CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP12CO6 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP1CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP2CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP3CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP4CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP5CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP6CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP7CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP8CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP9CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP10CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP11CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution1SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution2SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution3SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution4SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution5SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution6SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution7SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution8SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution9SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution10SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution11SP12CO12 = new CommandDescriptor[1];
  
  public final CommandDescriptor[] execution12SP12CO12 = new CommandDescriptor[1];
  
  public StoreProcedures() {
    this.$edu$icesi$amelia$validation$cts$subsystems$Directory = new edu.icesi.amelia.validation.cts.subsystems.Directory();
    
  }
  
  public StoreProcedures(final Integer bdConnection, final Integer numCom, final Host hostSP1, final Host hostSP2, final Host hostSP3, final Host hostSP4, final Host hostSP5, final Host hostSP6, final Host hostSP7, final Host hostSP8, final Host hostSP9, final Host hostSP10, final Host hostSP11, final Host hostSP12, final List<Host> $edu$icesi$amelia$validation$cts$subsystems$Directory$spHosts) {
    this.bdConnection = bdConnection;
    this.numCom = numCom;
    this.hostSP1 = hostSP1;
    this.hostSP2 = hostSP2;
    this.hostSP3 = hostSP3;
    this.hostSP4 = hostSP4;
    this.hostSP5 = hostSP5;
    this.hostSP6 = hostSP6;
    this.hostSP7 = hostSP7;
    this.hostSP8 = hostSP8;
    this.hostSP9 = hostSP9;
    this.hostSP10 = hostSP10;
    this.hostSP11 = hostSP11;
    this.hostSP12 = hostSP12;
    this.$edu$icesi$amelia$validation$cts$subsystems$Directory = new edu.icesi.amelia.validation.cts.subsystems.Directory($edu$icesi$amelia$validation$cts$subsystems$Directory$spHosts);
    
  }
  
  private void init() {
    execution1CO1[0] = initExecution1CO10();
    execution2CO1[0] = initExecution2CO10();
    execution3CO1[0] = initExecution3CO10();
    execution4CO1[0] = initExecution4CO10();
    execution5CO1[0] = initExecution5CO10();
    execution6CO1[0] = initExecution6CO10();
    execution7CO1[0] = initExecution7CO10();
    execution8CO1[0] = initExecution8CO10();
    execution9CO1[0] = initExecution9CO10();
    execution10CO1[0] = initExecution10CO10();
    execution11CO1[0] = initExecution11CO10();
    execution12CO1[0] = initExecution12CO10();
    execution1SP1CO6[0] = initExecution1SP1CO60();
    execution2SP1CO6[0] = initExecution2SP1CO60();
    execution3SP1CO6[0] = initExecution3SP1CO60();
    execution4SP1CO6[0] = initExecution4SP1CO60();
    execution5SP1CO6[0] = initExecution5SP1CO60();
    execution6SP1CO6[0] = initExecution6SP1CO60();
    execution1SP3CO6[0] = initExecution1SP3CO60();
    execution2SP3CO6[0] = initExecution2SP3CO60();
    execution3SP3CO6[0] = initExecution3SP3CO60();
    execution4SP3CO6[0] = initExecution4SP3CO60();
    execution5SP3CO6[0] = initExecution5SP3CO60();
    execution6SP3CO6[0] = initExecution6SP3CO60();
    execution1SP4CO6[0] = initExecution1SP4CO60();
    execution2SP4CO6[0] = initExecution2SP4CO60();
    execution3SP4CO6[0] = initExecution3SP4CO60();
    execution4SP4CO6[0] = initExecution4SP4CO60();
    execution5SP4CO6[0] = initExecution5SP4CO60();
    execution6SP4CO6[0] = initExecution6SP4CO60();
    execution1SP7CO6[0] = initExecution1SP7CO60();
    execution2SP7CO6[0] = initExecution2SP7CO60();
    execution3SP7CO6[0] = initExecution3SP7CO60();
    execution4SP7CO6[0] = initExecution4SP7CO60();
    execution5SP7CO6[0] = initExecution5SP7CO60();
    execution6SP7CO6[0] = initExecution6SP7CO60();
    execution1SP10CO6[0] = initExecution1SP10CO60();
    execution2SP10CO6[0] = initExecution2SP10CO60();
    execution3SP10CO6[0] = initExecution3SP10CO60();
    execution4SP10CO6[0] = initExecution4SP10CO60();
    execution5SP10CO6[0] = initExecution5SP10CO60();
    execution6SP10CO6[0] = initExecution6SP10CO60();
    execution1SP11CO6[0] = initExecution1SP11CO60();
    execution2SP11CO6[0] = initExecution2SP11CO60();
    execution3SP11CO6[0] = initExecution3SP11CO60();
    execution4SP11CO6[0] = initExecution4SP11CO60();
    execution5SP11CO6[0] = initExecution5SP11CO60();
    execution6SP11CO6[0] = initExecution6SP11CO60();
    execution1SP2CO6[0] = initExecution1SP2CO60();
    execution2SP2CO6[0] = initExecution2SP2CO60();
    execution3SP2CO6[0] = initExecution3SP2CO60();
    execution4SP2CO6[0] = initExecution4SP2CO60();
    execution5SP2CO6[0] = initExecution5SP2CO60();
    execution6SP2CO6[0] = initExecution6SP2CO60();
    execution1SP5CO6[0] = initExecution1SP5CO60();
    execution2SP5CO6[0] = initExecution2SP5CO60();
    execution3SP5CO6[0] = initExecution3SP5CO60();
    execution4SP5CO6[0] = initExecution4SP5CO60();
    execution5SP5CO6[0] = initExecution5SP5CO60();
    execution6SP5CO6[0] = initExecution6SP5CO60();
    execution1SP6CO6[0] = initExecution1SP6CO60();
    execution2SP6CO6[0] = initExecution2SP6CO60();
    execution3SP6CO6[0] = initExecution3SP6CO60();
    execution4SP6CO6[0] = initExecution4SP6CO60();
    execution5SP6CO6[0] = initExecution5SP6CO60();
    execution6SP6CO6[0] = initExecution6SP6CO60();
    execution1SP8CO6[0] = initExecution1SP8CO60();
    execution2SP8CO6[0] = initExecution2SP8CO60();
    execution3SP8CO6[0] = initExecution3SP8CO60();
    execution4SP8CO6[0] = initExecution4SP8CO60();
    execution5SP8CO6[0] = initExecution5SP8CO60();
    execution6SP8CO6[0] = initExecution6SP8CO60();
    execution1SP9CO6[0] = initExecution1SP9CO60();
    execution2SP9CO6[0] = initExecution2SP9CO60();
    execution3SP9CO6[0] = initExecution3SP9CO60();
    execution4SP9CO6[0] = initExecution4SP9CO60();
    execution5SP9CO6[0] = initExecution5SP9CO60();
    execution6SP9CO6[0] = initExecution6SP9CO60();
    execution1SP12CO6[0] = initExecution1SP12CO60();
    execution2SP12CO6[0] = initExecution2SP12CO60();
    execution3SP12CO6[0] = initExecution3SP12CO60();
    execution4SP12CO6[0] = initExecution4SP12CO60();
    execution5SP12CO6[0] = initExecution5SP12CO60();
    execution6SP12CO6[0] = initExecution6SP12CO60();
    execution1SP1CO12[0] = initExecution1SP1CO120();
    execution2SP1CO12[0] = initExecution2SP1CO120();
    execution3SP1CO12[0] = initExecution3SP1CO120();
    execution4SP1CO12[0] = initExecution4SP1CO120();
    execution5SP1CO12[0] = initExecution5SP1CO120();
    execution6SP1CO12[0] = initExecution6SP1CO120();
    execution7SP1CO12[0] = initExecution7SP1CO120();
    execution8SP1CO12[0] = initExecution8SP1CO120();
    execution9SP1CO12[0] = initExecution9SP1CO120();
    execution10SP1CO12[0] = initExecution10SP1CO120();
    execution11SP1CO12[0] = initExecution11SP1CO120();
    execution12SP1CO12[0] = initExecution12SP1CO120();
    execution1SP2CO12[0] = initExecution1SP2CO120();
    execution2SP2CO12[0] = initExecution2SP2CO120();
    execution3SP2CO12[0] = initExecution3SP2CO120();
    execution4SP2CO12[0] = initExecution4SP2CO120();
    execution5SP2CO12[0] = initExecution5SP2CO120();
    execution6SP2CO12[0] = initExecution6SP2CO120();
    execution7SP2CO12[0] = initExecution7SP2CO120();
    execution8SP2CO12[0] = initExecution8SP2CO120();
    execution9SP2CO12[0] = initExecution9SP2CO120();
    execution10SP2CO12[0] = initExecution10SP2CO120();
    execution11SP2CO12[0] = initExecution11SP2CO120();
    execution12SP2CO12[0] = initExecution12SP2CO120();
    execution1SP3CO12[0] = initExecution1SP3CO120();
    execution2SP3CO12[0] = initExecution2SP3CO120();
    execution3SP3CO12[0] = initExecution3SP3CO120();
    execution4SP3CO12[0] = initExecution4SP3CO120();
    execution5SP3CO12[0] = initExecution5SP3CO120();
    execution6SP3CO12[0] = initExecution6SP3CO120();
    execution7SP3CO12[0] = initExecution7SP3CO120();
    execution8SP3CO12[0] = initExecution8SP3CO120();
    execution9SP3CO12[0] = initExecution9SP3CO120();
    execution10SP3CO12[0] = initExecution10SP3CO120();
    execution11SP3CO12[0] = initExecution11SP3CO120();
    execution12SP3CO12[0] = initExecution12SP3CO120();
    execution1SP4CO12[0] = initExecution1SP4CO120();
    execution2SP4CO12[0] = initExecution2SP4CO120();
    execution3SP4CO12[0] = initExecution3SP4CO120();
    execution4SP4CO12[0] = initExecution4SP4CO120();
    execution5SP4CO12[0] = initExecution5SP4CO120();
    execution6SP4CO12[0] = initExecution6SP4CO120();
    execution7SP4CO12[0] = initExecution7SP4CO120();
    execution8SP4CO12[0] = initExecution8SP4CO120();
    execution9SP4CO12[0] = initExecution9SP4CO120();
    execution10SP4CO12[0] = initExecution10SP4CO120();
    execution11SP4CO12[0] = initExecution11SP4CO120();
    execution12SP4CO12[0] = initExecution12SP4CO120();
    execution1SP5CO12[0] = initExecution1SP5CO120();
    execution2SP5CO12[0] = initExecution2SP5CO120();
    execution3SP5CO12[0] = initExecution3SP5CO120();
    execution4SP5CO12[0] = initExecution4SP5CO120();
    execution5SP5CO12[0] = initExecution5SP5CO120();
    execution6SP5CO12[0] = initExecution6SP5CO120();
    execution7SP5CO12[0] = initExecution7SP5CO120();
    execution8SP5CO12[0] = initExecution8SP5CO120();
    execution9SP5CO12[0] = initExecution9SP5CO120();
    execution10SP5CO12[0] = initExecution10SP5CO120();
    execution11SP5CO12[0] = initExecution11SP5CO120();
    execution12SP5CO12[0] = initExecution12SP5CO120();
    execution1SP6CO12[0] = initExecution1SP6CO120();
    execution2SP6CO12[0] = initExecution2SP6CO120();
    execution3SP6CO12[0] = initExecution3SP6CO120();
    execution4SP6CO12[0] = initExecution4SP6CO120();
    execution5SP6CO12[0] = initExecution5SP6CO120();
    execution6SP6CO12[0] = initExecution6SP6CO120();
    execution7SP6CO12[0] = initExecution7SP6CO120();
    execution8SP6CO12[0] = initExecution8SP6CO120();
    execution9SP6CO12[0] = initExecution9SP6CO120();
    execution10SP6CO12[0] = initExecution10SP6CO120();
    execution11SP6CO12[0] = initExecution11SP6CO120();
    execution12SP6CO12[0] = initExecution12SP6CO120();
    execution1SP7CO12[0] = initExecution1SP7CO120();
    execution2SP7CO12[0] = initExecution2SP7CO120();
    execution3SP7CO12[0] = initExecution3SP7CO120();
    execution4SP7CO12[0] = initExecution4SP7CO120();
    execution5SP7CO12[0] = initExecution5SP7CO120();
    execution6SP7CO12[0] = initExecution6SP7CO120();
    execution7SP7CO12[0] = initExecution7SP7CO120();
    execution8SP7CO12[0] = initExecution8SP7CO120();
    execution9SP7CO12[0] = initExecution9SP7CO120();
    execution10SP7CO12[0] = initExecution10SP7CO120();
    execution11SP7CO12[0] = initExecution11SP7CO120();
    execution12SP7CO12[0] = initExecution12SP7CO120();
    execution1SP8CO12[0] = initExecution1SP8CO120();
    execution2SP8CO12[0] = initExecution2SP8CO120();
    execution3SP8CO12[0] = initExecution3SP8CO120();
    execution4SP8CO12[0] = initExecution4SP8CO120();
    execution5SP8CO12[0] = initExecution5SP8CO120();
    execution6SP8CO12[0] = initExecution6SP8CO120();
    execution7SP8CO12[0] = initExecution7SP8CO120();
    execution8SP8CO12[0] = initExecution8SP8CO120();
    execution9SP8CO12[0] = initExecution9SP8CO120();
    execution10SP8CO12[0] = initExecution10SP8CO120();
    execution11SP8CO12[0] = initExecution11SP8CO120();
    execution12SP8CO12[0] = initExecution12SP8CO120();
    execution1SP9CO12[0] = initExecution1SP9CO120();
    execution2SP9CO12[0] = initExecution2SP9CO120();
    execution3SP9CO12[0] = initExecution3SP9CO120();
    execution4SP9CO12[0] = initExecution4SP9CO120();
    execution5SP9CO12[0] = initExecution5SP9CO120();
    execution6SP9CO12[0] = initExecution6SP9CO120();
    execution7SP9CO12[0] = initExecution7SP9CO120();
    execution8SP9CO12[0] = initExecution8SP9CO120();
    execution9SP9CO12[0] = initExecution9SP9CO120();
    execution10SP9CO12[0] = initExecution10SP9CO120();
    execution11SP9CO12[0] = initExecution11SP9CO120();
    execution12SP9CO12[0] = initExecution12SP9CO120();
    execution1SP10CO12[0] = initExecution1SP10CO120();
    execution2SP10CO12[0] = initExecution2SP10CO120();
    execution3SP10CO12[0] = initExecution3SP10CO120();
    execution4SP10CO12[0] = initExecution4SP10CO120();
    execution5SP10CO12[0] = initExecution5SP10CO120();
    execution6SP10CO12[0] = initExecution6SP10CO120();
    execution7SP10CO12[0] = initExecution7SP10CO120();
    execution8SP10CO12[0] = initExecution8SP10CO120();
    execution9SP10CO12[0] = initExecution9SP10CO120();
    execution10SP10CO12[0] = initExecution10SP10CO120();
    execution11SP10CO12[0] = initExecution11SP10CO120();
    execution12SP10CO12[0] = initExecution12SP10CO120();
    execution1SP11CO12[0] = initExecution1SP11CO120();
    execution2SP11CO12[0] = initExecution2SP11CO120();
    execution3SP11CO12[0] = initExecution3SP11CO120();
    execution4SP11CO12[0] = initExecution4SP11CO120();
    execution5SP11CO12[0] = initExecution5SP11CO120();
    execution6SP11CO12[0] = initExecution6SP11CO120();
    execution7SP11CO12[0] = initExecution7SP11CO120();
    execution8SP11CO12[0] = initExecution8SP11CO120();
    execution9SP11CO12[0] = initExecution9SP11CO120();
    execution10SP11CO12[0] = initExecution10SP11CO120();
    execution11SP11CO12[0] = initExecution11SP11CO120();
    execution12SP11CO12[0] = initExecution12SP11CO120();
    execution1SP12CO12[0] = initExecution1SP12CO120();
    execution2SP12CO12[0] = initExecution2SP12CO120();
    execution3SP12CO12[0] = initExecution3SP12CO120();
    execution4SP12CO12[0] = initExecution4SP12CO120();
    execution5SP12CO12[0] = initExecution5SP12CO120();
    execution6SP12CO12[0] = initExecution6SP12CO120();
    execution7SP12CO12[0] = initExecution7SP12CO120();
    execution8SP12CO12[0] = initExecution8SP12CO120();
    execution9SP12CO12[0] = initExecution9SP12CO120();
    execution10SP12CO12[0] = initExecution10SP12CO120();
    execution11SP12CO12[0] = initExecution11SP12CO120();
    execution12SP12CO12[0] = initExecution12SP12CO120();
    
  }
  
  @Override
  public void setup() {
    $edu$icesi$amelia$validation$cts$subsystems$Directory.setup();
    init();
    List<Host> hosts0 = Lists.newArrayList(getHost0());
    execution1CO1[0].runsOn(hosts0);
    execution1CO1[0].addExecutionCondition(getHostCondition0());
    execution1CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts1 = Lists.newArrayList(getHost1());
    execution2CO1[0].runsOn(hosts1);
    execution2CO1[0].addExecutionCondition(getHostCondition1());
    execution2CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts2 = Lists.newArrayList(getHost2());
    execution3CO1[0].runsOn(hosts2);
    execution3CO1[0].addExecutionCondition(getHostCondition2());
    execution3CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts3 = Lists.newArrayList(getHost3());
    execution4CO1[0].runsOn(hosts3);
    execution4CO1[0].addExecutionCondition(getHostCondition3());
    execution4CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts4 = Lists.newArrayList(getHost4());
    execution5CO1[0].runsOn(hosts4);
    execution5CO1[0].addExecutionCondition(getHostCondition4());
    execution5CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts5 = Lists.newArrayList(getHost5());
    execution6CO1[0].runsOn(hosts5);
    execution6CO1[0].addExecutionCondition(getHostCondition5());
    execution6CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts6 = Lists.newArrayList(getHost6());
    execution7CO1[0].runsOn(hosts6);
    execution7CO1[0].addExecutionCondition(getHostCondition6());
    execution7CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts7 = Lists.newArrayList(getHost7());
    execution8CO1[0].runsOn(hosts7);
    execution8CO1[0].addExecutionCondition(getHostCondition7());
    execution8CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts8 = Lists.newArrayList(getHost8());
    execution9CO1[0].runsOn(hosts8);
    execution9CO1[0].addExecutionCondition(getHostCondition8());
    execution9CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts9 = Lists.newArrayList(getHost9());
    execution10CO1[0].runsOn(hosts9);
    execution10CO1[0].addExecutionCondition(getHostCondition9());
    execution10CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts10 = Lists.newArrayList(getHost10());
    execution11CO1[0].runsOn(hosts10);
    execution11CO1[0].addExecutionCondition(getHostCondition10());
    execution11CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts11 = Lists.newArrayList(getHost11());
    execution12CO1[0].runsOn(hosts11);
    execution12CO1[0].addExecutionCondition(getHostCondition11());
    execution12CO1[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts12 = Lists.newArrayList(getHost12());
    execution1SP1CO6[0].runsOn(hosts12);
    execution1SP1CO6[0].addExecutionCondition(getHostCondition12());
    execution1SP1CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP1CO6[0].runsOn(hosts12);
    execution2SP1CO6[0].addExecutionCondition(getHostCondition12());
    execution2SP1CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP1CO6[0].runsOn(hosts12);
    execution3SP1CO6[0].addExecutionCondition(getHostCondition12());
    execution3SP1CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP1CO6[0].runsOn(hosts12);
    execution4SP1CO6[0].addExecutionCondition(getHostCondition12());
    execution4SP1CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP1CO6[0].runsOn(hosts12);
    execution5SP1CO6[0].addExecutionCondition(getHostCondition12());
    execution5SP1CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP1CO6[0].runsOn(hosts12);
    execution6SP1CO6[0].addExecutionCondition(getHostCondition12());
    execution6SP1CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts13 = Lists.newArrayList(getHost13());
    execution1SP3CO6[0].runsOn(hosts13);
    execution1SP3CO6[0].addExecutionCondition(getHostCondition13());
    execution1SP3CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP3CO6[0].runsOn(hosts13);
    execution2SP3CO6[0].addExecutionCondition(getHostCondition13());
    execution2SP3CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP3CO6[0].runsOn(hosts13);
    execution3SP3CO6[0].addExecutionCondition(getHostCondition13());
    execution3SP3CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP3CO6[0].runsOn(hosts13);
    execution4SP3CO6[0].addExecutionCondition(getHostCondition13());
    execution4SP3CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP3CO6[0].runsOn(hosts13);
    execution5SP3CO6[0].addExecutionCondition(getHostCondition13());
    execution5SP3CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP3CO6[0].runsOn(hosts13);
    execution6SP3CO6[0].addExecutionCondition(getHostCondition13());
    execution6SP3CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts14 = Lists.newArrayList(getHost14());
    execution1SP4CO6[0].runsOn(hosts14);
    execution1SP4CO6[0].addExecutionCondition(getHostCondition14());
    execution1SP4CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP4CO6[0].runsOn(hosts14);
    execution2SP4CO6[0].addExecutionCondition(getHostCondition14());
    execution2SP4CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP4CO6[0].runsOn(hosts14);
    execution3SP4CO6[0].addExecutionCondition(getHostCondition14());
    execution3SP4CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP4CO6[0].runsOn(hosts14);
    execution4SP4CO6[0].addExecutionCondition(getHostCondition14());
    execution4SP4CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP4CO6[0].runsOn(hosts14);
    execution5SP4CO6[0].addExecutionCondition(getHostCondition14());
    execution5SP4CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP4CO6[0].runsOn(hosts14);
    execution6SP4CO6[0].addExecutionCondition(getHostCondition14());
    execution6SP4CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts15 = Lists.newArrayList(getHost15());
    execution1SP7CO6[0].runsOn(hosts15);
    execution1SP7CO6[0].addExecutionCondition(getHostCondition15());
    execution1SP7CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP7CO6[0].runsOn(hosts15);
    execution2SP7CO6[0].addExecutionCondition(getHostCondition15());
    execution2SP7CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP7CO6[0].runsOn(hosts15);
    execution3SP7CO6[0].addExecutionCondition(getHostCondition15());
    execution3SP7CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP7CO6[0].runsOn(hosts15);
    execution4SP7CO6[0].addExecutionCondition(getHostCondition15());
    execution4SP7CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP7CO6[0].runsOn(hosts15);
    execution5SP7CO6[0].addExecutionCondition(getHostCondition15());
    execution5SP7CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP7CO6[0].runsOn(hosts15);
    execution6SP7CO6[0].addExecutionCondition(getHostCondition15());
    execution6SP7CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts16 = Lists.newArrayList(getHost16());
    execution1SP10CO6[0].runsOn(hosts16);
    execution1SP10CO6[0].addExecutionCondition(getHostCondition16());
    execution1SP10CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP10CO6[0].runsOn(hosts16);
    execution2SP10CO6[0].addExecutionCondition(getHostCondition16());
    execution2SP10CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP10CO6[0].runsOn(hosts16);
    execution3SP10CO6[0].addExecutionCondition(getHostCondition16());
    execution3SP10CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP10CO6[0].runsOn(hosts16);
    execution4SP10CO6[0].addExecutionCondition(getHostCondition16());
    execution4SP10CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP10CO6[0].runsOn(hosts16);
    execution5SP10CO6[0].addExecutionCondition(getHostCondition16());
    execution5SP10CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP10CO6[0].runsOn(hosts16);
    execution6SP10CO6[0].addExecutionCondition(getHostCondition16());
    execution6SP10CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts17 = Lists.newArrayList(getHost17());
    execution1SP11CO6[0].runsOn(hosts17);
    execution1SP11CO6[0].addExecutionCondition(getHostCondition17());
    execution1SP11CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP11CO6[0].runsOn(hosts17);
    execution2SP11CO6[0].addExecutionCondition(getHostCondition17());
    execution2SP11CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP11CO6[0].runsOn(hosts17);
    execution3SP11CO6[0].addExecutionCondition(getHostCondition17());
    execution3SP11CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP11CO6[0].runsOn(hosts17);
    execution4SP11CO6[0].addExecutionCondition(getHostCondition17());
    execution4SP11CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP11CO6[0].runsOn(hosts17);
    execution5SP11CO6[0].addExecutionCondition(getHostCondition17());
    execution5SP11CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP11CO6[0].runsOn(hosts17);
    execution6SP11CO6[0].addExecutionCondition(getHostCondition17());
    execution6SP11CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts18 = Lists.newArrayList(getHost18());
    execution1SP2CO6[0].runsOn(hosts18);
    execution1SP2CO6[0].addExecutionCondition(getHostCondition18());
    execution1SP2CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP2CO6[0].runsOn(hosts18);
    execution2SP2CO6[0].addExecutionCondition(getHostCondition18());
    execution2SP2CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP2CO6[0].runsOn(hosts18);
    execution3SP2CO6[0].addExecutionCondition(getHostCondition18());
    execution3SP2CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP2CO6[0].runsOn(hosts18);
    execution4SP2CO6[0].addExecutionCondition(getHostCondition18());
    execution4SP2CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP2CO6[0].runsOn(hosts18);
    execution5SP2CO6[0].addExecutionCondition(getHostCondition18());
    execution5SP2CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP2CO6[0].runsOn(hosts18);
    execution6SP2CO6[0].addExecutionCondition(getHostCondition18());
    execution6SP2CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts19 = Lists.newArrayList(getHost19());
    execution1SP5CO6[0].runsOn(hosts19);
    execution1SP5CO6[0].addExecutionCondition(getHostCondition19());
    execution1SP5CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP5CO6[0].runsOn(hosts19);
    execution2SP5CO6[0].addExecutionCondition(getHostCondition19());
    execution2SP5CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP5CO6[0].runsOn(hosts19);
    execution3SP5CO6[0].addExecutionCondition(getHostCondition19());
    execution3SP5CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP5CO6[0].runsOn(hosts19);
    execution4SP5CO6[0].addExecutionCondition(getHostCondition19());
    execution4SP5CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP5CO6[0].runsOn(hosts19);
    execution5SP5CO6[0].addExecutionCondition(getHostCondition19());
    execution5SP5CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP5CO6[0].runsOn(hosts19);
    execution6SP5CO6[0].addExecutionCondition(getHostCondition19());
    execution6SP5CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts20 = Lists.newArrayList(getHost20());
    execution1SP6CO6[0].runsOn(hosts20);
    execution1SP6CO6[0].addExecutionCondition(getHostCondition20());
    execution1SP6CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP6CO6[0].runsOn(hosts20);
    execution2SP6CO6[0].addExecutionCondition(getHostCondition20());
    execution2SP6CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP6CO6[0].runsOn(hosts20);
    execution3SP6CO6[0].addExecutionCondition(getHostCondition20());
    execution3SP6CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP6CO6[0].runsOn(hosts20);
    execution4SP6CO6[0].addExecutionCondition(getHostCondition20());
    execution4SP6CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP6CO6[0].runsOn(hosts20);
    execution5SP6CO6[0].addExecutionCondition(getHostCondition20());
    execution5SP6CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP6CO6[0].runsOn(hosts20);
    execution6SP6CO6[0].addExecutionCondition(getHostCondition20());
    execution6SP6CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts21 = Lists.newArrayList(getHost21());
    execution1SP8CO6[0].runsOn(hosts21);
    execution1SP8CO6[0].addExecutionCondition(getHostCondition21());
    execution1SP8CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP8CO6[0].runsOn(hosts21);
    execution2SP8CO6[0].addExecutionCondition(getHostCondition21());
    execution2SP8CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP8CO6[0].runsOn(hosts21);
    execution3SP8CO6[0].addExecutionCondition(getHostCondition21());
    execution3SP8CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP8CO6[0].runsOn(hosts21);
    execution4SP8CO6[0].addExecutionCondition(getHostCondition21());
    execution4SP8CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP8CO6[0].runsOn(hosts21);
    execution5SP8CO6[0].addExecutionCondition(getHostCondition21());
    execution5SP8CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP8CO6[0].runsOn(hosts21);
    execution6SP8CO6[0].addExecutionCondition(getHostCondition21());
    execution6SP8CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts22 = Lists.newArrayList(getHost22());
    execution1SP9CO6[0].runsOn(hosts22);
    execution1SP9CO6[0].addExecutionCondition(getHostCondition22());
    execution1SP9CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP9CO6[0].runsOn(hosts22);
    execution2SP9CO6[0].addExecutionCondition(getHostCondition22());
    execution2SP9CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP9CO6[0].runsOn(hosts22);
    execution3SP9CO6[0].addExecutionCondition(getHostCondition22());
    execution3SP9CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP9CO6[0].runsOn(hosts22);
    execution4SP9CO6[0].addExecutionCondition(getHostCondition22());
    execution4SP9CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP9CO6[0].runsOn(hosts22);
    execution5SP9CO6[0].addExecutionCondition(getHostCondition22());
    execution5SP9CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP9CO6[0].runsOn(hosts22);
    execution6SP9CO6[0].addExecutionCondition(getHostCondition22());
    execution6SP9CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts23 = Lists.newArrayList(getHost23());
    execution1SP12CO6[0].runsOn(hosts23);
    execution1SP12CO6[0].addExecutionCondition(getHostCondition23());
    execution1SP12CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP12CO6[0].runsOn(hosts23);
    execution2SP12CO6[0].addExecutionCondition(getHostCondition23());
    execution2SP12CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP12CO6[0].runsOn(hosts23);
    execution3SP12CO6[0].addExecutionCondition(getHostCondition23());
    execution3SP12CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP12CO6[0].runsOn(hosts23);
    execution4SP12CO6[0].addExecutionCondition(getHostCondition23());
    execution4SP12CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP12CO6[0].runsOn(hosts23);
    execution5SP12CO6[0].addExecutionCondition(getHostCondition23());
    execution5SP12CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP12CO6[0].runsOn(hosts23);
    execution6SP12CO6[0].addExecutionCondition(getHostCondition23());
    execution6SP12CO6[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts24 = Lists.newArrayList(getHost24());
    execution1SP1CO12[0].runsOn(hosts24);
    execution1SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution1SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP1CO12[0].runsOn(hosts24);
    execution2SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution2SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP1CO12[0].runsOn(hosts24);
    execution3SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution3SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP1CO12[0].runsOn(hosts24);
    execution4SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution4SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP1CO12[0].runsOn(hosts24);
    execution5SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution5SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP1CO12[0].runsOn(hosts24);
    execution6SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution6SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP1CO12[0].runsOn(hosts24);
    execution7SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution7SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP1CO12[0].runsOn(hosts24);
    execution8SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution8SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP1CO12[0].runsOn(hosts24);
    execution9SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution9SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP1CO12[0].runsOn(hosts24);
    execution10SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution10SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP1CO12[0].runsOn(hosts24);
    execution11SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution11SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP1CO12[0].runsOn(hosts24);
    execution12SP1CO12[0].addExecutionCondition(getHostCondition24());
    execution12SP1CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts25 = Lists.newArrayList(getHost25());
    execution1SP2CO12[0].runsOn(hosts25);
    execution1SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution1SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP2CO12[0].runsOn(hosts25);
    execution2SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution2SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP2CO12[0].runsOn(hosts25);
    execution3SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution3SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP2CO12[0].runsOn(hosts25);
    execution4SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution4SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP2CO12[0].runsOn(hosts25);
    execution5SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution5SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP2CO12[0].runsOn(hosts25);
    execution6SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution6SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP2CO12[0].runsOn(hosts25);
    execution7SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution7SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP2CO12[0].runsOn(hosts25);
    execution8SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution8SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP2CO12[0].runsOn(hosts25);
    execution9SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution9SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP2CO12[0].runsOn(hosts25);
    execution10SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution10SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP2CO12[0].runsOn(hosts25);
    execution11SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution11SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP2CO12[0].runsOn(hosts25);
    execution12SP2CO12[0].addExecutionCondition(getHostCondition25());
    execution12SP2CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts26 = Lists.newArrayList(getHost26());
    execution1SP3CO12[0].runsOn(hosts26);
    execution1SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution1SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP3CO12[0].runsOn(hosts26);
    execution2SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution2SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP3CO12[0].runsOn(hosts26);
    execution3SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution3SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP3CO12[0].runsOn(hosts26);
    execution4SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution4SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP3CO12[0].runsOn(hosts26);
    execution5SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution5SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP3CO12[0].runsOn(hosts26);
    execution6SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution6SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP3CO12[0].runsOn(hosts26);
    execution7SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution7SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP3CO12[0].runsOn(hosts26);
    execution8SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution8SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP3CO12[0].runsOn(hosts26);
    execution9SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution9SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP3CO12[0].runsOn(hosts26);
    execution10SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution10SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP3CO12[0].runsOn(hosts26);
    execution11SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution11SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP3CO12[0].runsOn(hosts26);
    execution12SP3CO12[0].addExecutionCondition(getHostCondition26());
    execution12SP3CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts27 = Lists.newArrayList(getHost27());
    execution1SP4CO12[0].runsOn(hosts27);
    execution1SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution1SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP4CO12[0].runsOn(hosts27);
    execution2SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution2SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP4CO12[0].runsOn(hosts27);
    execution3SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution3SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP4CO12[0].runsOn(hosts27);
    execution4SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution4SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP4CO12[0].runsOn(hosts27);
    execution5SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution5SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP4CO12[0].runsOn(hosts27);
    execution6SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution6SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP4CO12[0].runsOn(hosts27);
    execution7SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution7SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP4CO12[0].runsOn(hosts27);
    execution8SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution8SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP4CO12[0].runsOn(hosts27);
    execution9SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution9SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP4CO12[0].runsOn(hosts27);
    execution10SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution10SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP4CO12[0].runsOn(hosts27);
    execution11SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution11SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP4CO12[0].runsOn(hosts27);
    execution12SP4CO12[0].addExecutionCondition(getHostCondition27());
    execution12SP4CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts28 = Lists.newArrayList(getHost28());
    execution1SP5CO12[0].runsOn(hosts28);
    execution1SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution1SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP5CO12[0].runsOn(hosts28);
    execution2SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution2SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP5CO12[0].runsOn(hosts28);
    execution3SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution3SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP5CO12[0].runsOn(hosts28);
    execution4SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution4SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP5CO12[0].runsOn(hosts28);
    execution5SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution5SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP5CO12[0].runsOn(hosts28);
    execution6SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution6SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP5CO12[0].runsOn(hosts28);
    execution7SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution7SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP5CO12[0].runsOn(hosts28);
    execution8SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution8SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP5CO12[0].runsOn(hosts28);
    execution9SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution9SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP5CO12[0].runsOn(hosts28);
    execution10SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution10SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP5CO12[0].runsOn(hosts28);
    execution11SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution11SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP5CO12[0].runsOn(hosts28);
    execution12SP5CO12[0].addExecutionCondition(getHostCondition28());
    execution12SP5CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts29 = Lists.newArrayList(getHost29());
    execution1SP6CO12[0].runsOn(hosts29);
    execution1SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution1SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP6CO12[0].runsOn(hosts29);
    execution2SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution2SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP6CO12[0].runsOn(hosts29);
    execution3SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution3SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP6CO12[0].runsOn(hosts29);
    execution4SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution4SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP6CO12[0].runsOn(hosts29);
    execution5SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution5SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP6CO12[0].runsOn(hosts29);
    execution6SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution6SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP6CO12[0].runsOn(hosts29);
    execution7SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution7SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP6CO12[0].runsOn(hosts29);
    execution8SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution8SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP6CO12[0].runsOn(hosts29);
    execution9SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution9SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP6CO12[0].runsOn(hosts29);
    execution10SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution10SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP6CO12[0].runsOn(hosts29);
    execution11SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution11SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP6CO12[0].runsOn(hosts29);
    execution12SP6CO12[0].addExecutionCondition(getHostCondition29());
    execution12SP6CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts30 = Lists.newArrayList(getHost30());
    execution1SP7CO12[0].runsOn(hosts30);
    execution1SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution1SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP7CO12[0].runsOn(hosts30);
    execution2SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution2SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP7CO12[0].runsOn(hosts30);
    execution3SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution3SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP7CO12[0].runsOn(hosts30);
    execution4SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution4SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP7CO12[0].runsOn(hosts30);
    execution5SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution5SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP7CO12[0].runsOn(hosts30);
    execution6SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution6SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP7CO12[0].runsOn(hosts30);
    execution7SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution7SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP7CO12[0].runsOn(hosts30);
    execution8SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution8SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP7CO12[0].runsOn(hosts30);
    execution9SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution9SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP7CO12[0].runsOn(hosts30);
    execution10SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution10SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP7CO12[0].runsOn(hosts30);
    execution11SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution11SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP7CO12[0].runsOn(hosts30);
    execution12SP7CO12[0].addExecutionCondition(getHostCondition30());
    execution12SP7CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts31 = Lists.newArrayList(getHost31());
    execution1SP8CO12[0].runsOn(hosts31);
    execution1SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution1SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP8CO12[0].runsOn(hosts31);
    execution2SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution2SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP8CO12[0].runsOn(hosts31);
    execution3SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution3SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP8CO12[0].runsOn(hosts31);
    execution4SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution4SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP8CO12[0].runsOn(hosts31);
    execution5SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution5SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP8CO12[0].runsOn(hosts31);
    execution6SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution6SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP8CO12[0].runsOn(hosts31);
    execution7SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution7SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP8CO12[0].runsOn(hosts31);
    execution8SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution8SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP8CO12[0].runsOn(hosts31);
    execution9SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution9SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP8CO12[0].runsOn(hosts31);
    execution10SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution10SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP8CO12[0].runsOn(hosts31);
    execution11SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution11SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP8CO12[0].runsOn(hosts31);
    execution12SP8CO12[0].addExecutionCondition(getHostCondition31());
    execution12SP8CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts32 = Lists.newArrayList(getHost32());
    execution1SP9CO12[0].runsOn(hosts32);
    execution1SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution1SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP9CO12[0].runsOn(hosts32);
    execution2SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution2SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP9CO12[0].runsOn(hosts32);
    execution3SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution3SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP9CO12[0].runsOn(hosts32);
    execution4SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution4SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP9CO12[0].runsOn(hosts32);
    execution5SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution5SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP9CO12[0].runsOn(hosts32);
    execution6SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution6SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP9CO12[0].runsOn(hosts32);
    execution7SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution7SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP9CO12[0].runsOn(hosts32);
    execution8SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution8SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP9CO12[0].runsOn(hosts32);
    execution9SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution9SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP9CO12[0].runsOn(hosts32);
    execution10SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution10SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP9CO12[0].runsOn(hosts32);
    execution11SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution11SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP9CO12[0].runsOn(hosts32);
    execution12SP9CO12[0].addExecutionCondition(getHostCondition32());
    execution12SP9CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts33 = Lists.newArrayList(getHost33());
    execution1SP10CO12[0].runsOn(hosts33);
    execution1SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution1SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP10CO12[0].runsOn(hosts33);
    execution2SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution2SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP10CO12[0].runsOn(hosts33);
    execution3SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution3SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP10CO12[0].runsOn(hosts33);
    execution4SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution4SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP10CO12[0].runsOn(hosts33);
    execution5SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution5SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP10CO12[0].runsOn(hosts33);
    execution6SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution6SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP10CO12[0].runsOn(hosts33);
    execution7SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution7SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP10CO12[0].runsOn(hosts33);
    execution8SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution8SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP10CO12[0].runsOn(hosts33);
    execution9SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution9SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP10CO12[0].runsOn(hosts33);
    execution10SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution10SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP10CO12[0].runsOn(hosts33);
    execution11SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution11SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP10CO12[0].runsOn(hosts33);
    execution12SP10CO12[0].addExecutionCondition(getHostCondition33());
    execution12SP10CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts34 = Lists.newArrayList(getHost34());
    execution1SP11CO12[0].runsOn(hosts34);
    execution1SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution1SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP11CO12[0].runsOn(hosts34);
    execution2SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution2SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP11CO12[0].runsOn(hosts34);
    execution3SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution3SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP11CO12[0].runsOn(hosts34);
    execution4SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution4SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP11CO12[0].runsOn(hosts34);
    execution5SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution5SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP11CO12[0].runsOn(hosts34);
    execution6SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution6SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP11CO12[0].runsOn(hosts34);
    execution7SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution7SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP11CO12[0].runsOn(hosts34);
    execution8SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution8SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP11CO12[0].runsOn(hosts34);
    execution9SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution9SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP11CO12[0].runsOn(hosts34);
    execution10SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution10SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP11CO12[0].runsOn(hosts34);
    execution11SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution11SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP11CO12[0].runsOn(hosts34);
    execution12SP11CO12[0].addExecutionCondition(getHostCondition34());
    execution12SP11CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    List<Host> hosts35 = Lists.newArrayList(getHost35());
    execution1SP12CO12[0].runsOn(hosts35);
    execution1SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution1SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution2SP12CO12[0].runsOn(hosts35);
    execution2SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution2SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution3SP12CO12[0].runsOn(hosts35);
    execution3SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution3SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution4SP12CO12[0].runsOn(hosts35);
    execution4SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution4SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution5SP12CO12[0].runsOn(hosts35);
    execution5SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution5SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution6SP12CO12[0].runsOn(hosts35);
    execution6SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution6SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution7SP12CO12[0].runsOn(hosts35);
    execution7SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution7SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution8SP12CO12[0].runsOn(hosts35);
    execution8SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution8SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution9SP12CO12[0].runsOn(hosts35);
    execution9SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution9SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution10SP12CO12[0].runsOn(hosts35);
    execution10SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution10SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution11SP12CO12[0].runsOn(hosts35);
    execution11SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution11SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
    execution12SP12CO12[0].runsOn(hosts35);
    execution12SP12CO12[0].addExecutionCondition(getHostCondition35());
    execution12SP12CO12[0].dependsOn($edu$icesi$amelia$validation$cts$subsystems$Directory.directory[0]);
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
  
  public Integer getBdConnection() {
    return this.bdConnection;
  }
  
  public Integer getNumCom() {
    return this.numCom;
  }
  
  public Host getHostSP1() {
    return this.hostSP1;
  }
  
  public Host getHostSP2() {
    return this.hostSP2;
  }
  
  public Host getHostSP3() {
    return this.hostSP3;
  }
  
  public Host getHostSP4() {
    return this.hostSP4;
  }
  
  public Host getHostSP5() {
    return this.hostSP5;
  }
  
  public Host getHostSP6() {
    return this.hostSP6;
  }
  
  public Host getHostSP7() {
    return this.hostSP7;
  }
  
  public Host getHostSP8() {
    return this.hostSP8;
  }
  
  public Host getHostSP9() {
    return this.hostSP9;
  }
  
  public Host getHostSP10() {
    return this.hostSP10;
  }
  
  public Host getHostSP11() {
    return this.hostSP11;
  }
  
  public Host getHostSP12() {
    return this.hostSP12;
  }
  
  private CommandDescriptor initExecution1CO10() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost0() {
    return this.hostSP1;
  }
  
  public boolean getHostCondition0() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution2CO10() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost1() {
    return this.hostSP2;
  }
  
  public boolean getHostCondition1() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution3CO10() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost2() {
    return this.hostSP3;
  }
  
  public boolean getHostCondition2() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution4CO10() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost3() {
    return this.hostSP4;
  }
  
  public boolean getHostCondition3() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution5CO10() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost4() {
    return this.hostSP5;
  }
  
  public boolean getHostCondition4() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution6CO10() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost5() {
    return this.hostSP6;
  }
  
  public boolean getHostCondition5() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution7CO10() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost6() {
    return this.hostSP7;
  }
  
  public boolean getHostCondition6() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution8CO10() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost7() {
    return this.hostSP8;
  }
  
  public boolean getHostCondition7() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution9CO10() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost8() {
    return this.hostSP9;
  }
  
  public boolean getHostCondition8() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution10CO10() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost9() {
    return this.hostSP10;
  }
  
  public boolean getHostCondition9() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution11CO10() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost10() {
    return this.hostSP11;
  }
  
  public boolean getHostCondition10() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution12CO10() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost11() {
    return this.hostSP12;
  }
  
  public boolean getHostCondition11() {
    return ((this.numCom).intValue() == 1);
  }
  
  private CommandDescriptor initExecution1SP1CO60() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP1CO60() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP1CO60() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP1CO60() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP1CO60() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP1CO60() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost12() {
    return this.hostSP1;
  }
  
  public boolean getHostCondition12() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP3CO60() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP3CO60() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP3CO60() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP3CO60() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP3CO60() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP3CO60() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost13() {
    return this.hostSP3;
  }
  
  public boolean getHostCondition13() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP4CO60() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP4CO60() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP4CO60() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP4CO60() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP4CO60() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP4CO60() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost14() {
    return this.hostSP4;
  }
  
  public boolean getHostCondition14() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP7CO60() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP7CO60() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP7CO60() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP7CO60() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP7CO60() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP7CO60() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost15() {
    return this.hostSP7;
  }
  
  public boolean getHostCondition15() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP10CO60() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP10CO60() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP10CO60() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP10CO60() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP10CO60() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP10CO60() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost16() {
    return this.hostSP10;
  }
  
  public boolean getHostCondition16() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP11CO60() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP11CO60() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP11CO60() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP11CO60() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP11CO60() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP11CO60() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost17() {
    return this.hostSP11;
  }
  
  public boolean getHostCondition17() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP2CO60() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP2CO60() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP2CO60() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP2CO60() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP2CO60() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP2CO60() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost18() {
    return this.hostSP2;
  }
  
  public boolean getHostCondition18() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP5CO60() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP5CO60() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP5CO60() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP5CO60() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP5CO60() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP5CO60() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost19() {
    return this.hostSP5;
  }
  
  public boolean getHostCondition19() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP6CO60() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP6CO60() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP6CO60() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP6CO60() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP6CO60() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP6CO60() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost20() {
    return this.hostSP6;
  }
  
  public boolean getHostCondition20() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP8CO60() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP8CO60() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP8CO60() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP8CO60() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP8CO60() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP8CO60() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost21() {
    return this.hostSP8;
  }
  
  public boolean getHostCondition21() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP9CO60() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP9CO60() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP9CO60() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP9CO60() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP9CO60() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP9CO60() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost22() {
    return this.hostSP9;
  }
  
  public boolean getHostCondition22() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP12CO60() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP12CO60() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP12CO60() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP12CO60() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP12CO60() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP12CO60() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost23() {
    return this.hostSP12;
  }
  
  public boolean getHostCondition23() {
    return ((this.numCom).intValue() == 6);
  }
  
  private CommandDescriptor initExecution1SP1CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP1CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP1CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP1CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP1CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP1CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP1CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP1CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP1CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP1CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP1CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP1CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_1"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost24() {
    return this.hostSP1;
  }
  
  public boolean getHostCondition24() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP2CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP2CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP2CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP2CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP2CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP2CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP2CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP2CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP2CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP2CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP2CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP2CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_2"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost25() {
    return this.hostSP2;
  }
  
  public boolean getHostCondition25() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP3CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP3CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP3CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP3CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP3CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP3CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP3CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP3CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP3CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP3CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP3CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP3CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_3"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost26() {
    return this.hostSP3;
  }
  
  public boolean getHostCondition26() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP4CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP4CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP4CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP4CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP4CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP4CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP4CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP4CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP4CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP4CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP4CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP4CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_4"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost27() {
    return this.hostSP4;
  }
  
  public boolean getHostCondition27() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP5CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP5CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP5CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP5CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP5CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP5CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP5CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP5CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP5CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP5CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP5CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP5CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_5"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost28() {
    return this.hostSP5;
  }
  
  public boolean getHostCondition28() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP6CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP6CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP6CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP6CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP6CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP6CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP6CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP6CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP6CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP6CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP6CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP6CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_6"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost29() {
    return this.hostSP6;
  }
  
  public boolean getHostCondition29() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP7CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP7CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP7CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP7CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP7CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP7CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP7CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP7CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP7CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP7CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP7CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP7CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_7"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost30() {
    return this.hostSP7;
  }
  
  public boolean getHostCondition30() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP8CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP8CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP8CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP8CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP8CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP8CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP8CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP8CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP8CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP8CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP8CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP8CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_8"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost31() {
    return this.hostSP8;
  }
  
  public boolean getHostCondition31() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP9CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP9CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP9CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP9CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP9CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP9CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP9CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP9CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP9CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP9CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP9CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP9CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_9"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost32() {
    return this.hostSP9;
  }
  
  public boolean getHostCondition32() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP10CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP10CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP10CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP10CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP10CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP10CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP10CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP10CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP10CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP10CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP10CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP10CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_10"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost33() {
    return this.hostSP10;
  }
  
  public boolean getHostCondition33() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP11CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP11CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP11CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP11CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP11CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP11CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP11CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP11CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP11CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP11CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP11CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP11CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_11"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost34() {
    return this.hostSP11;
  }
  
  public boolean getHostCondition34() {
    return ((this.numCom).intValue() == 12);
  }
  
  private CommandDescriptor initExecution1SP12CO120() {
    return Commands.run()
        .withComposite((("asignaParentesco_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution2SP12CO120() {
    return Commands.run()
        .withComposite((("verificacion_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution3SP12CO120() {
    return Commands.run()
        .withComposite((("actualizaSesion_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution4SP12CO120() {
    return Commands.run()
        .withComposite((("borradoIntegrante_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution5SP12CO120() {
    return Commands.run()
        .withComposite((("calificacionRiesgo_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution6SP12CO120() {
    return Commands.run()
        .withComposite((("caracteristicas_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution7SP12CO120() {
    return Commands.run()
        .withComposite((("generarEliminacion_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution8SP12CO120() {
    return Commands.run()
        .withComposite((("generarInsert_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution9SP12CO120() {
    return Commands.run()
        .withComposite((("modFamilias_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution10SP12CO120() {
    return Commands.run()
        .withComposite((("salidaIntegrantes_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution11SP12CO120() {
    return Commands.run()
        .withComposite((("sentenciaFolio_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private CommandDescriptor initExecution12SP12CO120() {
    return Commands.run()
        .withComposite((("sentenciaUpsWhere_" + this.bdConnection) + "_12"))
        .withLibpath(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("jars/xmlServerReactorRest.jar", "lib/vtd-xml.jar", "lib/org.pascani.dsl.lib-0.0.1-SNAPSHOT-dependencies.jar", "lib/new-personalized-events-with-carvajal.jar", "lib/ojdbc6.jar", "lib/javax.ws.rs-api-2.0.jar", "lib/commons-codec-1.10.jar", "lib/xdb6.jar"))).build();
  }
  
  private Host getHost35() {
    return this.hostSP12;
  }
  
  public boolean getHostCondition35() {
    return ((this.numCom).intValue() == 12);
  }
  
  public List<Host> getSpHosts() {
    return this.$edu$icesi$amelia$validation$cts$subsystems$Directory.getSpHosts();
  }
  
  public CommandDescriptor[] getAllRules() {
    return Arrays.concatAll(
      execution1CO1,
      execution2CO1,
      execution3CO1,
      execution4CO1,
      execution5CO1,
      execution6CO1,
      execution7CO1,
      execution8CO1,
      execution9CO1,
      execution10CO1,
      execution11CO1,
      execution12CO1,
      execution1SP1CO6,
      execution2SP1CO6,
      execution3SP1CO6,
      execution4SP1CO6,
      execution5SP1CO6,
      execution6SP1CO6,
      execution1SP3CO6,
      execution2SP3CO6,
      execution3SP3CO6,
      execution4SP3CO6,
      execution5SP3CO6,
      execution6SP3CO6,
      execution1SP4CO6,
      execution2SP4CO6,
      execution3SP4CO6,
      execution4SP4CO6,
      execution5SP4CO6,
      execution6SP4CO6,
      execution1SP7CO6,
      execution2SP7CO6,
      execution3SP7CO6,
      execution4SP7CO6,
      execution5SP7CO6,
      execution6SP7CO6,
      execution1SP10CO6,
      execution2SP10CO6,
      execution3SP10CO6,
      execution4SP10CO6,
      execution5SP10CO6,
      execution6SP10CO6,
      execution1SP11CO6,
      execution2SP11CO6,
      execution3SP11CO6,
      execution4SP11CO6,
      execution5SP11CO6,
      execution6SP11CO6,
      execution1SP2CO6,
      execution2SP2CO6,
      execution3SP2CO6,
      execution4SP2CO6,
      execution5SP2CO6,
      execution6SP2CO6,
      execution1SP5CO6,
      execution2SP5CO6,
      execution3SP5CO6,
      execution4SP5CO6,
      execution5SP5CO6,
      execution6SP5CO6,
      execution1SP6CO6,
      execution2SP6CO6,
      execution3SP6CO6,
      execution4SP6CO6,
      execution5SP6CO6,
      execution6SP6CO6,
      execution1SP8CO6,
      execution2SP8CO6,
      execution3SP8CO6,
      execution4SP8CO6,
      execution5SP8CO6,
      execution6SP8CO6,
      execution1SP9CO6,
      execution2SP9CO6,
      execution3SP9CO6,
      execution4SP9CO6,
      execution5SP9CO6,
      execution6SP9CO6,
      execution1SP12CO6,
      execution2SP12CO6,
      execution3SP12CO6,
      execution4SP12CO6,
      execution5SP12CO6,
      execution6SP12CO6,
      execution1SP1CO12,
      execution2SP1CO12,
      execution3SP1CO12,
      execution4SP1CO12,
      execution5SP1CO12,
      execution6SP1CO12,
      execution7SP1CO12,
      execution8SP1CO12,
      execution9SP1CO12,
      execution10SP1CO12,
      execution11SP1CO12,
      execution12SP1CO12,
      execution1SP2CO12,
      execution2SP2CO12,
      execution3SP2CO12,
      execution4SP2CO12,
      execution5SP2CO12,
      execution6SP2CO12,
      execution7SP2CO12,
      execution8SP2CO12,
      execution9SP2CO12,
      execution10SP2CO12,
      execution11SP2CO12,
      execution12SP2CO12,
      execution1SP3CO12,
      execution2SP3CO12,
      execution3SP3CO12,
      execution4SP3CO12,
      execution5SP3CO12,
      execution6SP3CO12,
      execution7SP3CO12,
      execution8SP3CO12,
      execution9SP3CO12,
      execution10SP3CO12,
      execution11SP3CO12,
      execution12SP3CO12,
      execution1SP4CO12,
      execution2SP4CO12,
      execution3SP4CO12,
      execution4SP4CO12,
      execution5SP4CO12,
      execution6SP4CO12,
      execution7SP4CO12,
      execution8SP4CO12,
      execution9SP4CO12,
      execution10SP4CO12,
      execution11SP4CO12,
      execution12SP4CO12,
      execution1SP5CO12,
      execution2SP5CO12,
      execution3SP5CO12,
      execution4SP5CO12,
      execution5SP5CO12,
      execution6SP5CO12,
      execution7SP5CO12,
      execution8SP5CO12,
      execution9SP5CO12,
      execution10SP5CO12,
      execution11SP5CO12,
      execution12SP5CO12,
      execution1SP6CO12,
      execution2SP6CO12,
      execution3SP6CO12,
      execution4SP6CO12,
      execution5SP6CO12,
      execution6SP6CO12,
      execution7SP6CO12,
      execution8SP6CO12,
      execution9SP6CO12,
      execution10SP6CO12,
      execution11SP6CO12,
      execution12SP6CO12,
      execution1SP7CO12,
      execution2SP7CO12,
      execution3SP7CO12,
      execution4SP7CO12,
      execution5SP7CO12,
      execution6SP7CO12,
      execution7SP7CO12,
      execution8SP7CO12,
      execution9SP7CO12,
      execution10SP7CO12,
      execution11SP7CO12,
      execution12SP7CO12,
      execution1SP8CO12,
      execution2SP8CO12,
      execution3SP8CO12,
      execution4SP8CO12,
      execution5SP8CO12,
      execution6SP8CO12,
      execution7SP8CO12,
      execution8SP8CO12,
      execution9SP8CO12,
      execution10SP8CO12,
      execution11SP8CO12,
      execution12SP8CO12,
      execution1SP9CO12,
      execution2SP9CO12,
      execution3SP9CO12,
      execution4SP9CO12,
      execution5SP9CO12,
      execution6SP9CO12,
      execution7SP9CO12,
      execution8SP9CO12,
      execution9SP9CO12,
      execution10SP9CO12,
      execution11SP9CO12,
      execution12SP9CO12,
      execution1SP10CO12,
      execution2SP10CO12,
      execution3SP10CO12,
      execution4SP10CO12,
      execution5SP10CO12,
      execution6SP10CO12,
      execution7SP10CO12,
      execution8SP10CO12,
      execution9SP10CO12,
      execution10SP10CO12,
      execution11SP10CO12,
      execution12SP10CO12,
      execution1SP11CO12,
      execution2SP11CO12,
      execution3SP11CO12,
      execution4SP11CO12,
      execution5SP11CO12,
      execution6SP11CO12,
      execution7SP11CO12,
      execution8SP11CO12,
      execution9SP11CO12,
      execution10SP11CO12,
      execution11SP11CO12,
      execution12SP11CO12,
      execution1SP12CO12,
      execution2SP12CO12,
      execution3SP12CO12,
      execution4SP12CO12,
      execution5SP12CO12,
      execution6SP12CO12,
      execution7SP12CO12,
      execution8SP12CO12,
      execution9SP12CO12,
      execution10SP12CO12,
      execution11SP12CO12,
      execution12SP12CO12,
      $edu$icesi$amelia$validation$cts$subsystems$Directory.getAllRules()
    );
  }
}
