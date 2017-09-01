/**
 * Copyright 2017 Universidad Icesi
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS
 * IN THE SOFTWARE.
 */
package co.edu.icesi.driso.matrices.classes;

import java.io.IOException;
import org.amelia.dsl.lib.CallableTask;
import org.amelia.dsl.lib.descriptors.CommandDescriptor;
import org.amelia.dsl.lib.descriptors.Host;
import net.sf.expectit.Expect;
import net.sf.expectit.matcher.Matchers;

public class SCPLogin {

	public static CommandDescriptor scpCommand(final String hostName,
	    final String hostPassword, final String source, final String target) {
		return new CommandDescriptor.Builder()
		    .withSuccessMessage("Copied file!")
			.withErrorMessage("File couldn't be copied!")
			.withCallable(new CallableTask<Object>() {
				@Override
				public Boolean call(Host host, String prompt, boolean quiet)
				    throws Exception {
					final Expect session = host.ssh().expect();
					session.sendLine(
					    String.format(
					        "scp -r root@%s:%s %s",
					        hostName,
					        source,
					        target
					    )
					);
					try {
						session.expect(
						    Matchers.regexp("Are you sure you want to continue connecting (yes/no)?")
						);
						session.sendLine("yes");
					} catch (IOException e) {
					    // Do nothing
					}
					session.expect(
					    Matchers.regexp(
					        String.format(
					            "root@%s's password:",
					            hostName
					        )
					    )
					);
					session.sendLine(hostPassword);
					session.expect(Matchers.regexp(prompt));
					return true;
				}
			}).build();
	}

}
