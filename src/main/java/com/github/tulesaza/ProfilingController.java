package com.github.tulesaza;

public class ProfilingController implements ProfilingControllerMBean {
    /**
     * MBean server???
     */
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
