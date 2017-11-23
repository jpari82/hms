#!/bin/bash

set -e +x

pushd hms
  echo "Packaging war"
  ./gradlew clean build -x test
popd

war_count=`find hms/applications/hospitalms/build/libs -type f -name *.war | wc -l`

if [ $war_count -gt 1 ]; then
  echo "More than one war found, don't know which one to deploy. Exiting"
  exit 1
fi

find hms/applications/hospitalms/build/libs -type f -name *.war -exec cp "{}" package-output/hospitalms-0.0.1-SNAPSHOT.war \;

echo "Done packaging"
exit 0