package co.edu.icesi.driso.matrices.classes;

import java.io.IOException;
import org.amelia.dsl.lib.CallableTask;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import net.sf.expectit.Expect;
import net.sf.expectit.matcher.Matchers;

public class SCPLogin {

	public static CommandDescriptor scpCommand(final String hostName, final String hostPassword, final String source,
			final String target) {
		return new CommandDescriptor.Builder().withSuccessMessage("Copied file!")
				.withErrorMessage("File couldn't be copied!").withCallable(new CallableTask<Boolean>() {
					@Override
					public Boolean call(Host host, String prompt) throws Exception {

						boolean r = true;

						final Expect session = host.ssh().expect();

						String scpCommand = "scp -r root@" + hostName + ":" + source + " " + target;

						session.sendLine(scpCommand);

						try {

							session.expect(Matchers.regexp("Are you sure you want to continue connecting (yes/no)?"));
							session.sendLine("yes");

						} catch (IOException e) {
						}

						String passwordRequest = "root@" + hostName + "'s password:";

						session.expect(Matchers.regexp(passwordRequest));

						session.sendLine(hostPassword);

						session.expect(Matchers.regexp(prompt));

						return r;
					}
				}).build();
	}

}
