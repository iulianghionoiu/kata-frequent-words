/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.ghionoiu.frequentwords.context.input;

import java.io.Console;

/**
 *
 * @author Iulian Ghionoiu <iulian.ghionoiu@exenne.ro>
 */
public class SystemConsoleInput implements InputChannel {
    private Console console;

    public SystemConsoleInput() {
        console = System.console();
    }

    @Override
    public String readLine() {
        return console.readLine(">");
    }
}
