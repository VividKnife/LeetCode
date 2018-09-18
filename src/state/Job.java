package state;

import lombok.Data;

import java.util.Map;

@Data
public class Job {
    public static final String STEP_BUILD = "BUILD";
    public static final String STEP_TEST = "TEST";
    public static final String STEP_DEPLOY = "DEPLOY";

    private Status jobStatus;
    private Map<String, Status> steps;
}