FROM gitpod/workspace-full:2023-08-17-10-17-49

SHELL ["/bin/bash", "-c"]
RUN source "/home/gitpod/.sdkman/bin/sdkman-init.sh"  \
    && sdk install java 20.0.2-amzn < /dev/null