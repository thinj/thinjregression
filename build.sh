#!/bin/sh

# Setup environment:
.  ../thinj/config.sh || exit 1

[ -d bin ] && rm -rf bin

mkdir bin

# Source environment:
. $DESTINATION/env.sh
 
javac -sourcepath src -d bin `find src -name "*.java" -print`  || exit 1

${CMD_PREFIX}thinj -c bin -o alltests thinj.regression.AllTests
