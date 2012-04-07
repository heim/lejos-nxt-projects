#! /bin/bash

set -e


currentDir="$(cd ../lib/$(dirname "$0"); pwd)"
export "NXJ_HOME=$currentDir/leJOS_NXJ"
export LEJOS_NXT_JAVA_HOME='/System/Library/Frameworks/JavaVM.framework/Versions/1.6.0/Home'
export PATH="$NXJ_HOME/bin:$PATH"
clear
nxjc *.java
