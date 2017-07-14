This is a multi-module project that attempts to have a custom set of
error-prone rules. Hoever, there is a bootstrapping problem wherein the custom
rules can't be compiled until all of the rules exist.

Reproduce this failure with

`mvn clean package`

    [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.6.1:compile
    (default-compile) on project ep-custom: Execution default-compile of goal 
    org.apache.maven.plugins:maven-compiler-plugin:3.6.1:compile failed: Plugin 
    org.apache.maven.plugins:maven-compiler-plugin:3.6.1 or one of its dependencies could not be 
    resolved: Failure to find awesome.madrob:ep-custom:jar:0.0-SNAPSHOT in 
    https://repository.apache.org/snapshots was cached in the local repository, resolution will not 
    be reattempted until the update interval of apache.snapshots has elapsed or updates are forced 
    -> [Help 1]
