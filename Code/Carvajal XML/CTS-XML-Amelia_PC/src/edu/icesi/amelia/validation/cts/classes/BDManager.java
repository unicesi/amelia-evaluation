package edu.icesi.amelia.validation.cts.classes;

import java.io.IOException;

import org.amelia.dsl.lib.CallableTask;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;

import net.sf.expectit.matcher.Matchers;

import net.sf.expectit.Expect;
import net.sf.expectit.Result;
import net.sf.expectit.interact.Action;

public class BDManager {
	
	public static CommandDescriptor initDatabase(final String password) {
		return new CommandDescriptor.Builder()
				.withSuccessMessage("Connection to db opened!")
				.withErrorMessage("Connection to db couldn't be opened!")
				.withCallable(new CallableTask<Boolean>() {
					@Override public Boolean call(Host host, String prompt)
							throws Exception {
						boolean r = true;
						Expect session = host.ssh().expect();
//						session.interact().when(Matchers.regexp("Password:")).then(new Action<Result>() {
//							@Override public void apply(Result arg0) {
//								// lo que pasa cuando se recibe "Password:"
//							}
//						});
						//session.expect(Matchers.regexp(prompt));
						
						//7host.ssh().
						
						//System.out.println("\\\\//// " + prompt);
						
						session.send("sqlplus / as sysdba");
						session.expect(Matchers.regexp("SQL>"));
						//session.send("echo listo");
						
						//session.send("sqlplus / as sysdba");
						
						//session.interact().when(Matchers.regexp("SQL")).then(new Action<Result>() {
							//@Override public void apply(Result arg0) {
								// lo que pasa cuando se recibe "Password:"
								//System.out.println("jajajajaa");
							//}
						//});
						
						//session
						//session.send("startup");
						//session.send("exit");
						//session.send("lsnrct start");
						//session.expect(Matchers.regexp("Password:"));
						//session.send(password);
						//Result result = session.expect(Matchers.regexp(prompt));
						//if (result.getBefore().contains("Permission denied")) {
							//r = false;
						//}
						return r;
					}
				})
				.build();
	}
	
	public static CommandDescriptor restoreDatabase(final String password) {
		return new CommandDescriptor.Builder()
				.withSuccessMessage("Connection to db opened!")
				.withErrorMessage("Connection to db couldn't be opened!")
				.withCallable(new CallableTask<Boolean>() {
					@Override public Boolean call(Host host, String prompt)
							throws Exception {
						boolean r = true;
						Expect session = host.ssh().expect();
//						session.interact().when(Matchers.regexp("Password:")).then(new Action<Result>() {
//							@Override public void apply(Result arg0) {
//								// lo que pasa cuando se recibe "Password:"
//							}
//						});
						session.expect(Matchers.regexp(prompt));
						session.send("initdb");
						session.expect(Matchers.regexp("Password:"));
						session.send(password);
						Result result = session.expect(Matchers.regexp(prompt));
						if (result.getBefore().contains("Permission denied")) {
							r = false;
						}
						return r;
					}
				})
				.build();
	}

}
