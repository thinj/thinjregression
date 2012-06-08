#!/bin/sh

[ -d bin ] && rm -rf bin

mkdir bin

javac -sourcepath src -d bin `find src -name "*.java" -print`  || exit 1

thinj -c bin -o alltests thinj.regression.AllTests
