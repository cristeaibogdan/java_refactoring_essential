#!/usr/bin/env bash

MAINCLASS="com.codemanship.refactoring.legacycode.ShippingApp"

JAR=$(find target -maxdepth 1 -name "*.jar" | head -n 1)

if [ -z "$JAR" ]; then
  echo "No JAR found in target/. Run mvn package first."
  exit 1
fi

echo "Using JAR: $JAR"
echo

echo "==============================="
echo "Running order 1001"
echo "==============================="
java -cp "$JAR" "$MAINCLASS" 1001
echo

echo "==============================="
echo "Running order 1002"
echo "==============================="
java -cp "$JAR" "$MAINCLASS" 1002
echo

echo "==============================="
echo "Running order 1003"
echo "==============================="
java -cp "$JAR" "$MAINCLASS" 1003
echo