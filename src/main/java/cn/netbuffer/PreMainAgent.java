package cn.netbuffer;

import java.lang.instrument.Instrumentation;

public class PreMainAgent {

    public static void premain(String agentArgs, Instrumentation instrumentation) {
        System.out.println("PreMainAgent agentArgs=" + agentArgs);
        System.out.println("PreMainAgent instrumentation=" + instrumentation);
    }

    public static void premain(String agentArgs) {
        System.out.println("PreMainAgent agentArgs=" + agentArgs);
    }
}
