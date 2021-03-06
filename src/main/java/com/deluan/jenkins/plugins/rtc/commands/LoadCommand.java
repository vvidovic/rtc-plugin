package com.deluan.jenkins.plugins.rtc.commands;

import com.deluan.jenkins.plugins.rtc.JazzConfiguration;
import hudson.util.ArgumentListBuilder;

/**
 * @author deluan
 */
public class LoadCommand extends AbstractCommand {

    public LoadCommand(JazzConfiguration configurationProvider) {
        super(configurationProvider);
    }

    public ArgumentListBuilder getArguments() {
        ArgumentListBuilder args = new ArgumentListBuilder();
        args.add("load", getConfig().getWorkspaceName());
        addLoginArgument(args);
        addRepositoryArgument(args);
        addLocalWorkspaceArgument(args);
        args.add("-f");
        return args;
    }

}
