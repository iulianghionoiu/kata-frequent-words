/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.ghionoiu.frequentwords.context.output;

import java.io.Console;

/**
 *
 * @author Iulian Ghionoiu <iulian.ghionoiu@exenne.ro>
 */
public class SystemConsoleOutput implements OutputChannel {
    private Console console;

    public SystemConsoleOutput() {
        console = System.console();
    }

    @Override
    public void writeMessage(String message) {
        console.printf("%1$s\n", message);
    }
}
