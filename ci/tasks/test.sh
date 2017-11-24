#!/bin/bash

set -ex

pushd hms
  echo "Fetching Dependencies"
  ./gradlew clean compile > /dev/null

  echo "Running Tests"
  ./gradlew test
popd

exit 0